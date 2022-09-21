package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Captcha
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  @JSName("model")
  var model_Captcha: Model = js.native
}
object Captcha {
  
  trait Model extends StObject {
    
    /** Specifies the character set of the Captcha that will be used to generate captcha text randomly.
      */
    var characterSet: js.UndefOr[String] = js.undefined
    
    /** Specifies the error message to be displayed when the Captcha mismatch.
      */
    var customErrorMessage: js.UndefOr[String] = js.undefined
    
    /** Set the Captcha validation automatically.
      */
    var enableAutoValidation: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the case sensitivity for the characters typed in the Captcha.
      */
    var enableCaseSensitivity: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the background patterns for the Captcha.
      */
    var enablePattern: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the Captcha direction as right to left alignment.
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the background appearance for the captcha.
      */
    var hatchStyle: js.UndefOr[HatchStyle | String] = js.undefined
    
    /** Specifies the height of the Captcha.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Specifies the method with values to be mapped in the Captcha.
      */
    var mapper: js.UndefOr[String] = js.undefined
    
    /** Specifies the maximum number of characters used in the Captcha.
      */
    var maximumLength: js.UndefOr[Double] = js.undefined
    
    /** Specifies the minimum number of characters used in the Captcha.
      */
    var minimumLength: js.UndefOr[Double] = js.undefined
    
    /** Fires when captcha refresh begins.
      */
    var refreshBegin: js.UndefOr[js.Function1[/* e */ RefreshBeginEventArgs, Unit]] = js.undefined
    
    /** Fires after captcha refresh completed.
      */
    var refreshComplete: js.UndefOr[js.Function1[/* e */ RefreshCompleteEventArgs, Unit]] = js.undefined
    
    /** Fires when captcha refresh fails to load.
      */
    var refreshFailure: js.UndefOr[js.Function1[/* e */ RefreshFailureEventArgs, Unit]] = js.undefined
    
    /** Fires after captcha refresh succeeded.
      */
    var refreshSuccess: js.UndefOr[js.Function1[/* e */ RefreshSuccessEventArgs, Unit]] = js.undefined
    
    /** Specifies the method to map values to Captcha.
      */
    var requestMapper: js.UndefOr[String] = js.undefined
    
    /** Sets the Captcha with audio support, that enables to dictate the captcha text.
      */
    var showAudioButton: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the Captcha with a refresh button.
      */
    var showRefreshButton: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the target button of the Captcha to validate the entered text and captcha text.
      */
    var targetButton: js.UndefOr[String] = js.undefined
    
    /** Specifies the target input element that will verify the Captcha.
      */
    var targetInput: js.UndefOr[String] = js.undefined
    
    /** Specifies the width of the Captcha.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.Captcha.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Captcha.Model]
    }
    
    extension [Self <: typings.ejWebAll.ej.Captcha.Model](x: Self) {
      
      inline def setCharacterSet(value: String): Self = StObject.set(x, "characterSet", value.asInstanceOf[js.Any])
      
      inline def setCharacterSetUndefined: Self = StObject.set(x, "characterSet", js.undefined)
      
      inline def setCustomErrorMessage(value: String): Self = StObject.set(x, "customErrorMessage", value.asInstanceOf[js.Any])
      
      inline def setCustomErrorMessageUndefined: Self = StObject.set(x, "customErrorMessage", js.undefined)
      
      inline def setEnableAutoValidation(value: Boolean): Self = StObject.set(x, "enableAutoValidation", value.asInstanceOf[js.Any])
      
      inline def setEnableAutoValidationUndefined: Self = StObject.set(x, "enableAutoValidation", js.undefined)
      
      inline def setEnableCaseSensitivity(value: Boolean): Self = StObject.set(x, "enableCaseSensitivity", value.asInstanceOf[js.Any])
      
      inline def setEnableCaseSensitivityUndefined: Self = StObject.set(x, "enableCaseSensitivity", js.undefined)
      
      inline def setEnablePattern(value: Boolean): Self = StObject.set(x, "enablePattern", value.asInstanceOf[js.Any])
      
      inline def setEnablePatternUndefined: Self = StObject.set(x, "enablePattern", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setHatchStyle(value: HatchStyle | String): Self = StObject.set(x, "hatchStyle", value.asInstanceOf[js.Any])
      
      inline def setHatchStyleUndefined: Self = StObject.set(x, "hatchStyle", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMapper(value: String): Self = StObject.set(x, "mapper", value.asInstanceOf[js.Any])
      
      inline def setMapperUndefined: Self = StObject.set(x, "mapper", js.undefined)
      
      inline def setMaximumLength(value: Double): Self = StObject.set(x, "maximumLength", value.asInstanceOf[js.Any])
      
      inline def setMaximumLengthUndefined: Self = StObject.set(x, "maximumLength", js.undefined)
      
      inline def setMinimumLength(value: Double): Self = StObject.set(x, "minimumLength", value.asInstanceOf[js.Any])
      
      inline def setMinimumLengthUndefined: Self = StObject.set(x, "minimumLength", js.undefined)
      
      inline def setRefreshBegin(value: /* e */ RefreshBeginEventArgs => Unit): Self = StObject.set(x, "refreshBegin", js.Any.fromFunction1(value))
      
      inline def setRefreshBeginUndefined: Self = StObject.set(x, "refreshBegin", js.undefined)
      
      inline def setRefreshComplete(value: /* e */ RefreshCompleteEventArgs => Unit): Self = StObject.set(x, "refreshComplete", js.Any.fromFunction1(value))
      
      inline def setRefreshCompleteUndefined: Self = StObject.set(x, "refreshComplete", js.undefined)
      
      inline def setRefreshFailure(value: /* e */ RefreshFailureEventArgs => Unit): Self = StObject.set(x, "refreshFailure", js.Any.fromFunction1(value))
      
      inline def setRefreshFailureUndefined: Self = StObject.set(x, "refreshFailure", js.undefined)
      
      inline def setRefreshSuccess(value: /* e */ RefreshSuccessEventArgs => Unit): Self = StObject.set(x, "refreshSuccess", js.Any.fromFunction1(value))
      
      inline def setRefreshSuccessUndefined: Self = StObject.set(x, "refreshSuccess", js.undefined)
      
      inline def setRequestMapper(value: String): Self = StObject.set(x, "requestMapper", value.asInstanceOf[js.Any])
      
      inline def setRequestMapperUndefined: Self = StObject.set(x, "requestMapper", js.undefined)
      
      inline def setShowAudioButton(value: Boolean): Self = StObject.set(x, "showAudioButton", value.asInstanceOf[js.Any])
      
      inline def setShowAudioButtonUndefined: Self = StObject.set(x, "showAudioButton", js.undefined)
      
      inline def setShowRefreshButton(value: Boolean): Self = StObject.set(x, "showRefreshButton", value.asInstanceOf[js.Any])
      
      inline def setShowRefreshButtonUndefined: Self = StObject.set(x, "showRefreshButton", js.undefined)
      
      inline def setTargetButton(value: String): Self = StObject.set(x, "targetButton", value.asInstanceOf[js.Any])
      
      inline def setTargetButtonUndefined: Self = StObject.set(x, "targetButton", js.undefined)
      
      inline def setTargetInput(value: String): Self = StObject.set(x, "targetInput", value.asInstanceOf[js.Any])
      
      inline def setTargetInputUndefined: Self = StObject.set(x, "targetInput", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait RefreshBeginEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the Captcha model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RefreshBeginEventArgs {
    
    inline def apply(): RefreshBeginEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefreshBeginEventArgs]
    }
    
    extension [Self <: RefreshBeginEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RefreshCompleteEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the Captcha model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RefreshCompleteEventArgs {
    
    inline def apply(): RefreshCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefreshCompleteEventArgs]
    }
    
    extension [Self <: RefreshCompleteEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RefreshFailureEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the Captcha model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RefreshFailureEventArgs {
    
    inline def apply(): RefreshFailureEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefreshFailureEventArgs]
    }
    
    extension [Self <: RefreshFailureEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RefreshSuccessEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the Captcha model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RefreshSuccessEventArgs {
    
    inline def apply(): RefreshSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefreshSuccessEventArgs]
    }
    
    extension [Self <: RefreshSuccessEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
