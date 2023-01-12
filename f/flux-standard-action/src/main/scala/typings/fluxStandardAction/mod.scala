package typings.fluxStandardAction

import typings.fluxStandardAction.fluxStandardActionBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("flux-standard-action", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isError[Type /* <: String */, CustomError /* <: js.Error */, Meta](action: Any): /* is flux-standard-action.flux-standard-action.ErrorFluxStandardAction<Type, CustomError, Meta> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(action.asInstanceOf[js.Any]).asInstanceOf[/* is flux-standard-action.flux-standard-action.ErrorFluxStandardAction<Type, CustomError, Meta> */ Boolean]
  
  inline def isFSA[Type /* <: String */, Payload, Meta](action: Any): /* is flux-standard-action.flux-standard-action.FluxStandardAction<Type, Payload, Meta> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFSA")(action.asInstanceOf[js.Any]).asInstanceOf[/* is flux-standard-action.flux-standard-action.FluxStandardAction<Type, Payload, Meta> */ Boolean]
  
  type ErrorFSA[CustomError /* <: js.Error */, Meta, Type /* <: String */] = ErrorFluxStandardAction[Type, CustomError, Meta]
  
  type ErrorFSAAuto[Type /* <: String */, CustomError /* <: js.Error */, Meta] = ErrorFluxStandardActionAuto[Type, CustomError, Meta]
  
  type ErrorFSAWithMeta[Type /* <: String */, CustomError /* <: js.Error */, Meta] = ErrorFluxStandardActionWithMeta[Type, CustomError, Meta]
  
  type ErrorFSAWithPayload[Type /* <: String */, CustomError /* <: js.Error */, Meta] = ErrorFluxStandardActionWithPayload[Type, CustomError, Meta]
  
  type ErrorFSAWithPayloadAndMeta[Type /* <: String */, CustomError /* <: js.Error */, Meta] = ErrorFluxStandardActionWithPayloadAndMeta[Type, CustomError, Meta]
  
  trait ErrorFluxStandardAction[Type /* <: String */, CustomError /* <: js.Error */, Meta]
    extends StObject
       with FluxStandardAction[Type, CustomError, Meta] {
    
    /**
      * The required `error` property MUST be set to `true` if the action represents an error.
      */
    @JSName("error")
    var error_ErrorFluxStandardAction: `true`
  }
  object ErrorFluxStandardAction {
    
    inline def apply[Type /* <: String */, CustomError /* <: js.Error */, Meta](`type`: Type): ErrorFluxStandardAction[Type, CustomError, Meta] = {
      val __obj = js.Dynamic.literal(error = true)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorFluxStandardAction[Type, CustomError, Meta]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorFluxStandardAction[?, ?, ?], Type /* <: String */, CustomError /* <: js.Error */, Meta] (val x: Self & (ErrorFluxStandardAction[Type, CustomError, Meta])) extends AnyVal {
      
      inline def setError(value: `true`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Meta extends undefined ? flux-standard-action.flux-standard-action.ErrorFluxStandardActionWithPayload<Type, CustomError, Meta> : flux-standard-action.flux-standard-action.ErrorFluxStandardActionWithPayloadAndMeta<Type, CustomError, Meta>
    }}}
    */
  type ErrorFluxStandardActionAuto[Type /* <: String */, CustomError /* <: js.Error */, Meta] = ErrorFluxStandardActionWithPayload[Type, CustomError, Meta]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.fluxStandardAction.mod.FluxStandardAction because Already inherited
  - typings.fluxStandardAction.mod.FluxStandardActionWithMeta because var conflicts: error, meta, payload, `type`. Inlined  */ trait ErrorFluxStandardActionWithMeta[Type /* <: String */, CustomError /* <: js.Error */, Meta]
    extends StObject
       with ErrorFluxStandardAction[Type, CustomError, Meta]
  object ErrorFluxStandardActionWithMeta {
    
    inline def apply[Type /* <: String */, CustomError /* <: js.Error */, Meta](`type`: Type): ErrorFluxStandardActionWithMeta[Type, CustomError, Meta] = {
      val __obj = js.Dynamic.literal(error = true)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorFluxStandardActionWithMeta[Type, CustomError, Meta]]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.fluxStandardAction.mod.FluxStandardAction because Already inherited
  - typings.fluxStandardAction.mod.FluxStandardActionWithPayload because var conflicts: error, meta, payload, `type`. Inlined  */ trait ErrorFluxStandardActionWithPayload[Type /* <: String */, CustomError /* <: js.Error */, Meta]
    extends StObject
       with ErrorFluxStandardAction[Type, CustomError, Meta]
  object ErrorFluxStandardActionWithPayload {
    
    inline def apply[Type /* <: String */, CustomError /* <: js.Error */, Meta](`type`: Type): ErrorFluxStandardActionWithPayload[Type, CustomError, Meta] = {
      val __obj = js.Dynamic.literal(error = true)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorFluxStandardActionWithPayload[Type, CustomError, Meta]]
    }
  }
  
  type ErrorFluxStandardActionWithPayloadAndMeta[Type /* <: String */, CustomError /* <: js.Error */, Meta] = (ErrorFluxStandardActionWithPayload[Type, CustomError, Meta]) & (ErrorFluxStandardActionWithMeta[Type, CustomError, Meta])
  
  type FSA[Type /* <: String */, Payload, Meta] = FluxStandardAction[Type, Payload, Meta]
  
  type FSAAuto[Type /* <: String */, Payload, Meta] = FluxStandardActionAuto[Type, Payload, Meta]
  
  type FSAWithMeta[Type /* <: String */, Payload, Meta] = FluxStandardActionWithMeta[Type, Payload, Meta]
  
  type FSAWithPayload[Type /* <: String */, Payload, Meta] = FluxStandardActionWithPayload[Type, Payload, Meta]
  
  type FSAWithPayloadAndMeta[Type /* <: String */, Payload, Meta] = FluxStandardActionWithPayloadAndMeta[Type, Payload, Meta]
  
  trait FluxStandardAction[Type /* <: String */, Payload, Meta] extends StObject {
    
    /**
      * The optional `error` property MAY be set to true if the action represents an error.
      * An action whose `error` is true is analogous to a rejected Promise.
      * By convention, the `payload` SHOULD be an error object.
      * If `error` has any other value besides `true`, including `undefined`, the action MUST NOT be interpreted as an error.
      */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The optional `meta` property MAY be any type of value.
      * It is intended for any extra information that is not part of the payload.
      */
    var meta: js.UndefOr[Meta] = js.undefined
    
    /**
      * The optional `payload` property MAY be any type of value.
      * It represents the payload of the action.
      * Any information about the action that is not the type or status of the action should be part of the `payload` field.
      * By convention, if `error` is `true`, the `payload` SHOULD be an error object.
      * This is akin to rejecting a promise with an error object.
      */
    var payload: js.UndefOr[Payload] = js.undefined
    
    /**
      * The `type` of an action identifies to the consumer the nature of the action that has occurred.
      * Two actions with the same `type` MUST be strictly equivalent (using `===`)
      */
    var `type`: Type
  }
  object FluxStandardAction {
    
    inline def apply[Type /* <: String */, Payload, Meta](`type`: Type): FluxStandardAction[Type, Payload, Meta] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FluxStandardAction[Type, Payload, Meta]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FluxStandardAction[?, ?, ?], Type /* <: String */, Payload, Meta] (val x: Self & (FluxStandardAction[Type, Payload, Meta])) extends AnyVal {
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Payload extends undefined ? Meta extends undefined ? flux-standard-action.flux-standard-action.FluxStandardAction<Type, Payload, Meta> : flux-standard-action.flux-standard-action.FluxStandardActionWithMeta<Type, Payload, Meta> : Meta extends undefined ? flux-standard-action.flux-standard-action.FluxStandardActionWithPayload<Type, Payload, Meta> : flux-standard-action.flux-standard-action.FluxStandardActionWithPayloadAndMeta<Type, Payload, Meta>
    }}}
    */
  type FluxStandardActionAuto[Type /* <: String */, Payload, Meta] = FluxStandardAction[Type, Payload, Meta]
  
  trait FluxStandardActionWithMeta[Type /* <: String */, Payload, Meta]
    extends StObject
       with FluxStandardAction[Type, Payload, Meta] {
    
    /**
      * The required `meta` property MAY be any type of value.
      * It is intended for any extra information that is not part of the payload.
      */
    @JSName("meta")
    var meta_FluxStandardActionWithMeta: Meta
  }
  object FluxStandardActionWithMeta {
    
    inline def apply[Type /* <: String */, Payload, Meta](meta: Meta, `type`: Type): FluxStandardActionWithMeta[Type, Payload, Meta] = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FluxStandardActionWithMeta[Type, Payload, Meta]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FluxStandardActionWithMeta[?, ?, ?], Type /* <: String */, Payload, Meta] (val x: Self & (FluxStandardActionWithMeta[Type, Payload, Meta])) extends AnyVal {
      
      inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  trait FluxStandardActionWithPayload[Type /* <: String */, Payload, Meta]
    extends StObject
       with FluxStandardAction[Type, Payload, Meta] {
    
    /**
      * The required `payload` property MAY be any type of value.
      * It represents the payload of the action.
      * Any information about the action that is not the type or status of the action should be part of the `payload` field.
      * By convention, if `error` is `true`, the `payload` SHOULD be an error object.
      * This is akin to rejecting a promise with an error object.
      */
    @JSName("payload")
    var payload_FluxStandardActionWithPayload: Payload
  }
  object FluxStandardActionWithPayload {
    
    inline def apply[Type /* <: String */, Payload, Meta](payload: Payload, `type`: Type): FluxStandardActionWithPayload[Type, Payload, Meta] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FluxStandardActionWithPayload[Type, Payload, Meta]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FluxStandardActionWithPayload[?, ?, ?], Type /* <: String */, Payload, Meta] (val x: Self & (FluxStandardActionWithPayload[Type, Payload, Meta])) extends AnyVal {
      
      inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.fluxStandardAction.mod.FluxStandardAction because Already inherited
  - typings.fluxStandardAction.mod.FluxStandardActionWithMeta because var conflicts: error, meta, payload, `type`. Inlined  */ trait FluxStandardActionWithPayloadAndMeta[Type /* <: String */, Payload, Meta]
    extends StObject
       with FluxStandardActionWithPayload[Type, Payload, Meta]
  object FluxStandardActionWithPayloadAndMeta {
    
    inline def apply[Type /* <: String */, Payload, Meta](payload: Payload, `type`: Type): FluxStandardActionWithPayloadAndMeta[Type, Payload, Meta] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FluxStandardActionWithPayloadAndMeta[Type, Payload, Meta]]
    }
  }
}
