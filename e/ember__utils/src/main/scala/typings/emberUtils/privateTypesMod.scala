package typings.emberUtils

import typings.emberUtils.emberUtilsStrings.`null`
import typings.emberUtils.emberUtilsStrings.array
import typings.emberUtils.emberUtilsStrings.boolean
import typings.emberUtils.emberUtilsStrings.date
import typings.emberUtils.emberUtilsStrings.error
import typings.emberUtils.emberUtilsStrings.filelist
import typings.emberUtils.emberUtilsStrings.function
import typings.emberUtils.emberUtilsStrings.number
import typings.emberUtils.emberUtilsStrings.regexp
import typings.emberUtils.emberUtilsStrings.string
import typings.emberUtils.emberUtilsStrings.undefined
import typings.std.FileList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.emberUtils.emberUtilsStrings.`object`
    - typings.emberUtils.emberUtilsStrings.string
    - typings.emberUtils.emberUtilsStrings.number
    - typings.emberUtils.emberUtilsStrings.boolean
    - typings.emberUtils.emberUtilsStrings.regexp
    - typings.emberUtils.emberUtilsStrings.function
    - typings.emberUtils.emberUtilsStrings.array
    - typings.emberUtils.emberUtilsStrings.error
    - typings.emberUtils.emberUtilsStrings.filelist
    - typings.emberUtils.emberUtilsStrings.date
    - typings.emberUtils.emberUtilsStrings.`null`
    - typings.emberUtils.emberUtilsStrings.undefined
  */
  trait AllTypeNames extends StObject
  
  type KeysOfType[Type] = /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in 'string' | 'number' | 'boolean' | 'regexp' | 'function' | 'array' | 'error' | 'filelist' | 'date' | 'null' | 'undefined' ]: @ember/utils.@ember/utils/-private/types._KeysOfType<Key, Type>}['string' | 'number' | 'boolean' | 'regexp' | 'function' | 'array' | 'error' | 'filelist' | 'date' | 'null' | 'undefined'] */ js.Any
  
  trait TypeLookup extends StObject {
    
    var array: js.Array[Any]
    
    var boolean: Boolean
    
    var date: js.Date
    
    var error: js.Error
    
    var filelist: FileList
    
    var function: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFn */ Any
    
    var `null`: Null
    
    var number: Double
    
    var regexp: js.RegExp
    
    var string: String
    
    var undefined: Unit
  }
  object TypeLookup {
    
    inline def apply(
      array: js.Array[Any],
      boolean: Boolean,
      date: js.Date,
      error: js.Error,
      filelist: FileList,
      function: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFn */ Any,
      `null`: Null,
      number: Double,
      regexp: js.RegExp,
      string: String,
      undefined: Unit
    ): TypeLookup = {
      val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], filelist = filelist.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
      __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeLookup]
    }
    
    extension [Self <: TypeLookup](x: Self) {
      
      inline def setArray(value: js.Array[Any]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setArrayVarargs(value: Any*): Self = StObject.set(x, "array", js.Array(value*))
      
      inline def setBoolean(value: Boolean): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFilelist(value: FileList): Self = StObject.set(x, "filelist", value.asInstanceOf[js.Any])
      
      inline def setFunction(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFn */ Any
      ): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      inline def setNull(value: Null): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setRegexp(value: js.RegExp): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setUndefined(value: Unit): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    // Start by handling the case where `T` is no specific type, i.e. it is
  // `unknown`. In that case, it will be *one of* the type names, but which
  // one we cannot know statically.
  unknown extends T ? @ember/utils.@ember/utils/-private/types.AllTypeNames : // Otherwise, since `TypeLookup` resolves all *other* types, including
  // `null` and `undefined`, we can assume that if the type does *not* resolve
  // from `KeysOfType`, it is safe to treat it as 'object'.
  @ember/utils.@ember/utils/-private/types.KeysOfType<T> extends never ? 'object' : @ember/utils.@ember/utils/-private/types.KeysOfType<T>
    }}}
    */
  type TypeOf[T] = AllTypeNames
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    // Checks non-`const` versions, and correctly resolves those types
  // constructed via e.g. the `Number` constructor.
  @ember/utils.@ember/utils/-private/types.TypeLookup[Key] extends Type ? Key : // Checks `const` versions, e.g. handling strict function types when also
  // using a const-valued function like `const x = () => 4 as const`.
  Type extends @ember/utils.@ember/utils/-private/types.TypeLookup[Key] ? Key : never
    }}}
    */
  type _KeysOfType[Key /* <: string | number | boolean | regexp | function | array | error | filelist | date | `null` | undefined */, Type] = Key
}
