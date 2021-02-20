package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Captcha extends Widget_ {
  
  var defaults: Model = js.native
  
  @JSName("model")
  var model_Captcha: Model = js.native
}
object Captcha {
  
  @js.native
  trait Model extends StObject {
    
    /** Specifies the character set of the Captcha that will be used to generate captcha text randomly.
      */
    var characterSet: js.UndefOr[String] = js.native
    
    /** Specifies the error message to be displayed when the Captcha mismatch.
      */
    var customErrorMessage: js.UndefOr[String] = js.native
    
    /** Set the Captcha validation automatically.
      */
    var enableAutoValidation: js.UndefOr[Boolean] = js.native
    
    /** Specifies the case sensitivity for the characters typed in the Captcha.
      */
    var enableCaseSensitivity: js.UndefOr[Boolean] = js.native
    
    /** Specifies the background patterns for the Captcha.
      */
    var enablePattern: js.UndefOr[Boolean] = js.native
    
    /** Sets the Captcha direction as right to left alignment.
      */
    var enableRTL: js.UndefOr[Boolean] = js.native
    
    /** Specifies the background appearance for the captcha.
      */
    var hatchStyle: js.UndefOr[HatchStyle | String] = js.native
    
    /** Specifies the height of the Captcha.
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Specifies the method with values to be mapped in the Captcha.
      */
    var mapper: js.UndefOr[String] = js.native
    
    /** Specifies the maximum number of characters used in the Captcha.
      */
    var maximumLength: js.UndefOr[Double] = js.native
    
    /** Specifies the minimum number of characters used in the Captcha.
      */
    var minimumLength: js.UndefOr[Double] = js.native
    
    /** Fires when captcha refresh begins.
      */
    var refreshBegin: js.UndefOr[js.Function1[/* e */ RefreshBeginEventArgs, Unit]] = js.native
    
    /** Fires after captcha refresh completed.
      */
    var refreshComplete: js.UndefOr[js.Function1[/* e */ RefreshCompleteEventArgs, Unit]] = js.native
    
    /** Fires when captcha refresh fails to load.
      */
    var refreshFailure: js.UndefOr[js.Function1[/* e */ RefreshFailureEventArgs, Unit]] = js.native
    
    /** Fires after captcha refresh succeeded.
      */
    var refreshSuccess: js.UndefOr[js.Function1[/* e */ RefreshSuccessEventArgs, Unit]] = js.native
    
    /** Specifies the method to map values to Captcha.
      */
    var requestMapper: js.UndefOr[String] = js.native
    
    /** Sets the Captcha with audio support, that enables to dictate the captcha text.
      */
    var showAudioButton: js.UndefOr[Boolean] = js.native
    
    /** Sets the Captcha with a refresh button.
      */
    var showRefreshButton: js.UndefOr[Boolean] = js.native
    
    /** Specifies the target button of the Captcha to validate the entered text and captcha text.
      */
    var targetButton: js.UndefOr[String] = js.native
    
    /** Specifies the target input element that will verify the Captcha.
      */
    var targetInput: js.UndefOr[String] = js.native
    
    /** Specifies the width of the Captcha.
      */
    var width: js.UndefOr[Double] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.Captcha.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Captcha.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.Captcha.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharacterSet(value: String): Self = StObject.set(x, "characterSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterSetUndefined: Self = StObject.set(x, "characterSet", js.undefined)
      
      @scala.inline
      def setCustomErrorMessage(value: String): Self = StObject.set(x, "customErrorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomErrorMessageUndefined: Self = StObject.set(x, "customErrorMessage", js.undefined)
      
      @scala.inline
      def setEnableAutoValidation(value: Boolean): Self = StObject.set(x, "enableAutoValidation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAutoValidationUndefined: Self = StObject.set(x, "enableAutoValidation", js.undefined)
      
      @scala.inline
      def setEnableCaseSensitivity(value: Boolean): Self = StObject.set(x, "enableCaseSensitivity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCaseSensitivityUndefined: Self = StObject.set(x, "enableCaseSensitivity", js.undefined)
      
      @scala.inline
      def setEnablePattern(value: Boolean): Self = StObject.set(x, "enablePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePatternUndefined: Self = StObject.set(x, "enablePattern", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setHatchStyle(value: HatchStyle | String): Self = StObject.set(x, "hatchStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHatchStyleUndefined: Self = StObject.set(x, "hatchStyle", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setMapper(value: String): Self = StObject.set(x, "mapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapperUndefined: Self = StObject.set(x, "mapper", js.undefined)
      
      @scala.inline
      def setMaximumLength(value: Double): Self = StObject.set(x, "maximumLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumLengthUndefined: Self = StObject.set(x, "maximumLength", js.undefined)
      
      @scala.inline
      def setMinimumLength(value: Double): Self = StObject.set(x, "minimumLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumLengthUndefined: Self = StObject.set(x, "minimumLength", js.undefined)
      
      @scala.inline
      def setRefreshBegin(value: /* e */ RefreshBeginEventArgs => Unit): Self = StObject.set(x, "refreshBegin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefreshBeginUndefined: Self = StObject.set(x, "refreshBegin", js.undefined)
      
      @scala.inline
      def setRefreshComplete(value: /* e */ RefreshCompleteEventArgs => Unit): Self = StObject.set(x, "refreshComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefreshCompleteUndefined: Self = StObject.set(x, "refreshComplete", js.undefined)
      
      @scala.inline
      def setRefreshFailure(value: /* e */ RefreshFailureEventArgs => Unit): Self = StObject.set(x, "refreshFailure", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefreshFailureUndefined: Self = StObject.set(x, "refreshFailure", js.undefined)
      
      @scala.inline
      def setRefreshSuccess(value: /* e */ RefreshSuccessEventArgs => Unit): Self = StObject.set(x, "refreshSuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefreshSuccessUndefined: Self = StObject.set(x, "refreshSuccess", js.undefined)
      
      @scala.inline
      def setRequestMapper(value: String): Self = StObject.set(x, "requestMapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestMapperUndefined: Self = StObject.set(x, "requestMapper", js.undefined)
      
      @scala.inline
      def setShowAudioButton(value: Boolean): Self = StObject.set(x, "showAudioButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAudioButtonUndefined: Self = StObject.set(x, "showAudioButton", js.undefined)
      
      @scala.inline
      def setShowRefreshButton(value: Boolean): Self = StObject.set(x, "showRefreshButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRefreshButtonUndefined: Self = StObject.set(x, "showRefreshButton", js.undefined)
      
      @scala.inline
      def setTargetButton(value: String): Self = StObject.set(x, "targetButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetButtonUndefined: Self = StObject.set(x, "targetButton", js.undefined)
      
      @scala.inline
      def setTargetInput(value: String): Self = StObject.set(x, "targetInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetInputUndefined: Self = StObject.set(x, "targetInput", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait RefreshBeginEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the Captcha model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object RefreshBeginEventArgs {
    
    @scala.inline
    def apply(): RefreshBeginEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefreshBeginEventArgs]
    }
    
    @scala.inline
    implicit class RefreshBeginEventArgsMutableBuilder[Self <: RefreshBeginEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait RefreshCompleteEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the Captcha model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object RefreshCompleteEventArgs {
    
    @scala.inline
    def apply(): RefreshCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefreshCompleteEventArgs]
    }
    
    @scala.inline
    implicit class RefreshCompleteEventArgsMutableBuilder[Self <: RefreshCompleteEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait RefreshFailureEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the Captcha model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object RefreshFailureEventArgs {
    
    @scala.inline
    def apply(): RefreshFailureEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefreshFailureEventArgs]
    }
    
    @scala.inline
    implicit class RefreshFailureEventArgsMutableBuilder[Self <: RefreshFailureEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait RefreshSuccessEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the Captcha model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object RefreshSuccessEventArgs {
    
    @scala.inline
    def apply(): RefreshSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefreshSuccessEventArgs]
    }
    
    @scala.inline
    implicit class RefreshSuccessEventArgsMutableBuilder[Self <: RefreshSuccessEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
