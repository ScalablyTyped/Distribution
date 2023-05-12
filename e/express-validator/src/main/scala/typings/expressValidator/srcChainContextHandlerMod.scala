package typings.expressValidator

import typings.expressValidator.anon.CheckFalsy
import typings.expressValidator.expressValidatorBooleans.`false`
import typings.expressValidator.expressValidatorStrings.chain
import typings.expressValidator.expressValidatorStrings.request
import typings.expressValidator.srcBaseMod.CustomValidator
import typings.expressValidator.srcChainContextRunnerMod.ContextRunner
import typings.expressValidator.srcContextMod.Optional
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcChainContextHandlerMod {
  
  trait BailOptions extends StObject {
    
    /**
      * Defines the level at which to stop running further validations:
      * - When set to `chain`, further validations won't be run for this validation chain if there
      *   are any errors.
      * - When set to `request`, no further validations on the same request will be run either if
      *   there are any errors.
      *
      * @default 'chain'
      */
    var level: js.UndefOr[chain | request] = js.undefined
  }
  object BailOptions {
    
    inline def apply(): BailOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BailOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BailOptions] (val x: Self) extends AnyVal {
      
      inline def setLevel(value: chain | request): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    }
  }
  
  @js.native
  trait ContextHandler[Chain] extends StObject {
    
    /**
      * Stops running validations if any of the previous ones have failed.
      *
      * Useful to prevent a custom validator that touches a database or external API from running when
      * you know it will fail.
      *
      * May be used multiple times in the same validation chain if desired.
      *
      * @example
      *  check('username')
      *    .isEmail()
      *    // If not an email, stop here
      *    .bail()
      *    .custom(checkDenylistDomain)
      *    // If domain is not allowed, don't go check if it already exists
      *    .bail()
      *    .custom(checkEmailExists)
      *
      * @returns the current validation chain
      */
    def bail(): Chain = js.native
    def bail(opts: BailOptions): Chain = js.native
    
    /**
      * Adds a condition on whether the validation should continue on a field or not.
      * @param condition may be either
      *  - a custom validator-like function, which must truthy or a promise that resolves to continue
      *    validation. If the return value is falsy, a promise that rejects, or if it throws, validation
      *    will stop.
      * - a validation chain which if it would produce errors, the validation chain stops.
      * @example
      *  check('newPassword')
      *    // Only validate if the old password has been provided
      *    .if((value, { req }) => req.body.oldPassword)
      *    // Or, use it with a a validation chain
      *    .if(body('oldPassword').notEmpty())
      * @returns the current validation chain
      */
    def `if`(condition: CustomValidator): Chain = js.native
    def `if`(condition: ContextRunner): Chain = js.native
    
    /**
      * Marks the field(s) of the validation chain as optional.
      * By default, only fields with an `undefined` value are considered optional and will be ignored
      * when validating.
      *
      * @param options an object of options to customize the behavior of optional.
      * @returns the current validation chain
      */
    def optional(): Chain = js.native
    def optional(options: Boolean): Chain = js.native
    def optional(options: CheckFalsy): Chain = js.native
  }
  
  trait OptionalOptions extends StObject {
    
    /**
      * Whether a field whose value is falsy (that is, `0`, `false`, `null`, `undefined` or an empty
      * string) is to be considered optional.
      * @default false
      * @deprecated  Use `values` instead.
      */
    var checkFalsy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether a field whose value is `null` or `undefined` is to be considered optional.
      * @default false
      * @deprecated  Use `values` instead.
      */
    var nullable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines which kind of value makes a field optional.
      *
      * - `undefined`: only `undefined` values; equivalent to `value === undefined`
      * - `null`: only `undefined` and `null` values; equivalent to `value == null`
      * - `falsy`: all falsy values; equivalent to `!value`
      *
      * @default 'undefined'
      */
    var values: js.UndefOr[Exclude[Optional, `false`]] = js.undefined
  }
  object OptionalOptions {
    
    inline def apply(): OptionalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionalOptions] (val x: Self) extends AnyVal {
      
      inline def setCheckFalsy(value: Boolean): Self = StObject.set(x, "checkFalsy", value.asInstanceOf[js.Any])
      
      inline def setCheckFalsyUndefined: Self = StObject.set(x, "checkFalsy", js.undefined)
      
      inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
      
      inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
      
      inline def setValues(value: Exclude[Optional, `false`]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
}
