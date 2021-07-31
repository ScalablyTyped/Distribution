package typings.fluxStandardAction

import typings.fluxStandardAction.fluxStandardActionBooleans.`true`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("flux-standard-action", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isError[Type /* <: String */, CustomError /* <: Error */, Meta](action: js.Any): /* is flux-standard-action.flux-standard-action.ErrorFluxStandardAction<Type, CustomError, Meta> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(action.asInstanceOf[js.Any]).asInstanceOf[/* is flux-standard-action.flux-standard-action.ErrorFluxStandardAction<Type, CustomError, Meta> */ Boolean]
  
  @scala.inline
  def isFSA[Type /* <: String */, Payload, Meta](action: js.Any): /* is flux-standard-action.flux-standard-action.FluxStandardAction<Type, Payload, Meta> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFSA")(action.asInstanceOf[js.Any]).asInstanceOf[/* is flux-standard-action.flux-standard-action.FluxStandardAction<Type, Payload, Meta> */ Boolean]
  
  type ErrorFSA[CustomError /* <: Error */, Meta, Type /* <: String */] = ErrorFluxStandardAction[Type, CustomError, Meta]
  
  type ErrorFSAAuto[Type /* <: String */, CustomError /* <: Error */, Meta] = ErrorFluxStandardActionAuto[Type, CustomError, Meta]
  
  type ErrorFSAWithMeta[Type /* <: String */, CustomError /* <: Error */, Meta] = ErrorFluxStandardActionWithMeta[Type, CustomError, Meta]
  
  type ErrorFSAWithPayload[Type /* <: String */, CustomError /* <: Error */, Meta] = ErrorFluxStandardActionWithPayload[Type, CustomError, Meta]
  
  type ErrorFSAWithPayloadAndMeta[Type /* <: String */, CustomError /* <: Error */, Meta] = ErrorFluxStandardActionWithPayloadAndMeta[Type, CustomError, Meta]
  
  trait ErrorFluxStandardAction[Type /* <: String */, CustomError /* <: Error */, Meta]
    extends StObject
       with FluxStandardAction[Type, CustomError, Meta] {
    
    /**
      * The required `error` property MUST be set to `true` if the action represents an error.
      */
    @JSName("error")
    var error_ErrorFluxStandardAction: `true`
  }
  object ErrorFluxStandardAction {
    
    @scala.inline
    def apply[Type /* <: String */, CustomError /* <: Error */, Meta](`type`: Type): ErrorFluxStandardAction[Type, CustomError, Meta] = {
      val __obj = js.Dynamic.literal(error = true)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorFluxStandardAction[Type, CustomError, Meta]]
    }
    
    @scala.inline
    implicit class ErrorFluxStandardActionMutableBuilder[Self <: ErrorFluxStandardAction[?, ?, ?], Type /* <: String */, CustomError /* <: Error */, Meta] (val x: Self & (ErrorFluxStandardAction[Type, CustomError, Meta])) extends AnyVal {
      
      @scala.inline
      def setError(value: `true`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  type ErrorFluxStandardActionAuto[Type /* <: String */, CustomError /* <: Error */, Meta] = (ErrorFluxStandardActionWithPayloadAndMeta[Type, CustomError, Meta]) | (ErrorFluxStandardActionWithPayload[Type, CustomError, Meta])
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.fluxStandardAction.mod.FluxStandardActionAuto because Already inherited
  - typings.fluxStandardAction.mod.FluxStandardAction because Already inherited
  - typings.fluxStandardAction.mod.FluxStandardActionWithMeta because var conflicts: error, meta, payload, `type`. Inlined  */ trait ErrorFluxStandardActionWithMeta[Type /* <: String */, CustomError /* <: Error */, Meta]
    extends StObject
       with ErrorFluxStandardAction[Type, CustomError, Meta]
  object ErrorFluxStandardActionWithMeta {
    
    @scala.inline
    def apply[Type /* <: String */, CustomError /* <: Error */, Meta](`type`: Type): ErrorFluxStandardActionWithMeta[Type, CustomError, Meta] = {
      val __obj = js.Dynamic.literal(error = true)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorFluxStandardActionWithMeta[Type, CustomError, Meta]]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.fluxStandardAction.mod.FluxStandardActionAuto because Already inherited
  - typings.fluxStandardAction.mod.FluxStandardAction because Already inherited
  - typings.fluxStandardAction.mod.FluxStandardActionWithPayload because var conflicts: error, meta, payload, `type`. Inlined  */ trait ErrorFluxStandardActionWithPayload[Type /* <: String */, CustomError /* <: Error */, Meta]
    extends StObject
       with ErrorFluxStandardAction[Type, CustomError, Meta]
  object ErrorFluxStandardActionWithPayload {
    
    @scala.inline
    def apply[Type /* <: String */, CustomError /* <: Error */, Meta](`type`: Type): ErrorFluxStandardActionWithPayload[Type, CustomError, Meta] = {
      val __obj = js.Dynamic.literal(error = true)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorFluxStandardActionWithPayload[Type, CustomError, Meta]]
    }
  }
  
  type ErrorFluxStandardActionWithPayloadAndMeta[Type /* <: String */, CustomError /* <: Error */, Meta] = (ErrorFluxStandardActionWithPayload[Type, CustomError, Meta]) & (ErrorFluxStandardActionWithMeta[Type, CustomError, Meta])
  
  type FSA[Type /* <: String */, Payload, Meta] = FluxStandardAction[Type, Payload, Meta]
  
  type FSAAuto[Type /* <: String */, Payload, Meta] = FluxStandardActionAuto[Type, Payload, Meta]
  
  type FSAWithMeta[Type /* <: String */, Payload, Meta] = FluxStandardActionWithMeta[Type, Payload, Meta]
  
  type FSAWithPayload[Type /* <: String */, Payload, Meta] = FluxStandardActionWithPayload[Type, Payload, Meta]
  
  type FSAWithPayloadAndMeta[Type /* <: String */, Payload, Meta] = FluxStandardActionWithPayloadAndMeta[Type, Payload, Meta]
  
  trait FluxStandardAction[Type /* <: String */, Payload, Meta]
    extends StObject
       with FluxStandardActionAuto[Type, Payload, Meta] {
    
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
    
    @scala.inline
    def apply[Type /* <: String */, Payload, Meta](`type`: Type): FluxStandardAction[Type, Payload, Meta] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FluxStandardAction[Type, Payload, Meta]]
    }
    
    @scala.inline
    implicit class FluxStandardActionMutableBuilder[Self <: FluxStandardAction[?, ?, ?], Type /* <: String */, Payload, Meta] (val x: Self & (FluxStandardAction[Type, Payload, Meta])) extends AnyVal {
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fluxStandardAction.mod.FluxStandardActionWithPayloadAndMeta[Type, Payload, Meta]
    - typings.fluxStandardAction.mod.FluxStandardActionWithPayload[Type, Payload, Meta]
    - typings.fluxStandardAction.mod.FluxStandardActionWithMeta[Type, Payload, Meta]
    - typings.fluxStandardAction.mod.FluxStandardAction[Type, Payload, Meta]
  */
  trait FluxStandardActionAuto[Type /* <: String */, Payload, Meta] extends StObject
  object FluxStandardActionAuto {
    
    @scala.inline
    def FluxStandardAction[Type /* <: String */, Payload, Meta](`type`: Type): typings.fluxStandardAction.mod.FluxStandardAction[Type, Payload, Meta] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fluxStandardAction.mod.FluxStandardAction[Type, Payload, Meta]]
    }
    
    @scala.inline
    def FluxStandardActionWithMeta[Type /* <: String */, Payload, Meta](meta: Meta, `type`: Type): typings.fluxStandardAction.mod.FluxStandardActionWithMeta[Type, Payload, Meta] = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fluxStandardAction.mod.FluxStandardActionWithMeta[Type, Payload, Meta]]
    }
    
    @scala.inline
    def FluxStandardActionWithPayload[Type /* <: String */, Payload, Meta](payload: Payload, `type`: Type): typings.fluxStandardAction.mod.FluxStandardActionWithPayload[Type, Payload, Meta] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fluxStandardAction.mod.FluxStandardActionWithPayload[Type, Payload, Meta]]
    }
    
    @scala.inline
    def FluxStandardActionWithPayloadAndMeta[Type /* <: String */, Payload, Meta](payload: Payload, `type`: Type): typings.fluxStandardAction.mod.FluxStandardActionWithPayloadAndMeta[Type, Payload, Meta] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fluxStandardAction.mod.FluxStandardActionWithPayloadAndMeta[Type, Payload, Meta]]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.fluxStandardAction.mod.FluxStandardActionAuto because Already inherited */ trait FluxStandardActionWithMeta[Type /* <: String */, Payload, Meta]
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
    
    @scala.inline
    def apply[Type /* <: String */, Payload, Meta](meta: Meta, `type`: Type): FluxStandardActionWithMeta[Type, Payload, Meta] = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FluxStandardActionWithMeta[Type, Payload, Meta]]
    }
    
    @scala.inline
    implicit class FluxStandardActionWithMetaMutableBuilder[Self <: FluxStandardActionWithMeta[?, ?, ?], Type /* <: String */, Payload, Meta] (val x: Self & (FluxStandardActionWithMeta[Type, Payload, Meta])) extends AnyVal {
      
      @scala.inline
      def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.fluxStandardAction.mod.FluxStandardActionAuto because Already inherited */ trait FluxStandardActionWithPayload[Type /* <: String */, Payload, Meta]
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
    
    @scala.inline
    def apply[Type /* <: String */, Payload, Meta](payload: Payload, `type`: Type): FluxStandardActionWithPayload[Type, Payload, Meta] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FluxStandardActionWithPayload[Type, Payload, Meta]]
    }
    
    @scala.inline
    implicit class FluxStandardActionWithPayloadMutableBuilder[Self <: FluxStandardActionWithPayload[?, ?, ?], Type /* <: String */, Payload, Meta] (val x: Self & (FluxStandardActionWithPayload[Type, Payload, Meta])) extends AnyVal {
      
      @scala.inline
      def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.fluxStandardAction.mod.FluxStandardActionAuto because Already inherited
  - typings.fluxStandardAction.mod.FluxStandardAction because Already inherited
  - typings.fluxStandardAction.mod.FluxStandardActionAuto because Already inherited
  - typings.fluxStandardAction.mod.FluxStandardActionWithMeta because var conflicts: error, meta, payload, `type`. Inlined  */ trait FluxStandardActionWithPayloadAndMeta[Type /* <: String */, Payload, Meta]
    extends StObject
       with FluxStandardActionWithPayload[Type, Payload, Meta]
  object FluxStandardActionWithPayloadAndMeta {
    
    @scala.inline
    def apply[Type /* <: String */, Payload, Meta](payload: Payload, `type`: Type): FluxStandardActionWithPayloadAndMeta[Type, Payload, Meta] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FluxStandardActionWithPayloadAndMeta[Type, Payload, Meta]]
    }
  }
}
