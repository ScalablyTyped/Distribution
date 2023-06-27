package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioButton
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** To disable the RadioButton
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** To enable the RadioButton
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  @JSName("model")
  var model_RadioButton: Model = js.native
}
object RadioButton {
  
  trait BeforeChangeEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns true if element is checked, otherwise returns false
      */
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    /** returns true if change event triggered by interaction, otherwise returns false
      */
    var isInteraction: js.UndefOr[Boolean] = js.undefined
    
    /** returns the RadioButton model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeChangeEventArgs {
    
    inline def apply(): BeforeChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeChangeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeChangeEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      inline def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
      
      inline def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ChangeEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns true if element is checked, otherwise returns false
      */
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    /** returns true if change event triggered by interaction, otherwise returns false
      */
    var isInteraction: js.UndefOr[Boolean] = js.undefined
    
    /** returns the RadioButton model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ChangeEventArgs {
    
    inline def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      inline def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
      
      inline def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the RadioButton model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateEventArgs {
    
    inline def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the RadioButton model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    inline def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Fires before the RadioButton is going to changed its state successfully
      */
    var beforeChange: js.UndefOr[js.Function1[/* e */ BeforeChangeEventArgs, Unit]] = js.undefined
    
    /** Fires when the RadioButton state is changed successfully
      */
    var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
    
    /** Specifies the check attribute of the Radio Button.
      * @default {false}
      */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /** Fires when the RadioButton created successfully
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Specify the CSS class to RadioButton to achieve custom theme.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Fires when the RadioButton destroyed successfully
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Specifies the enablePersistence property for RadioButton while initialization. The enablePersistence API save current model value to browser cookies for state maintains. While
      * refreshing the radio button control page the model value apply from browser cookies.
      * @default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.undefined
    
    /** Specify the Right to Left direction to RadioButton
      * @default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the RadioButton control state.
      * @default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the HTML Attributes of the Checkbox
      * @default {{}}
      */
    var htmlAttributes: js.UndefOr[Any] = js.undefined
    
    /** Specifies the id attribute for the Radio Button while initialization.
      * @default {null}
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** Specify the idPrefix value to be added before the current id of the RadioButton.
      * @default {ej}
      */
    var idPrefix: js.UndefOr[String] = js.undefined
    
    /** Specifies the name attribute for the Radio Button while initialization.
      * @default {Sets id as name if it is null}
      */
    var name: js.UndefOr[String] = js.undefined
    
    /** Specifies the size of the RadioButton.
      * @default {small}
      */
    var size: js.UndefOr[RadioButtonSize | String] = js.undefined
    
    /** Specifies the text content for RadioButton.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Set the jQuery validation error message in radio button.
      * @default {null}
      */
    var validationMessage: js.UndefOr[Any] = js.undefined
    
    /** Set the jQuery validation rules in radio button.
      * @default {null}
      */
    var validationRules: js.UndefOr[Any] = js.undefined
    
    /** Specifies the value attribute of the Radio Button.
      * @default {null}
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.RadioButton.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.RadioButton.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.RadioButton.Model] (val x: Self) extends AnyVal {
      
      inline def setBeforeChange(value: /* e */ BeforeChangeEventArgs => Unit): Self = StObject.set(x, "beforeChange", js.Any.fromFunction1(value))
      
      inline def setBeforeChangeUndefined: Self = StObject.set(x, "beforeChange", js.undefined)
      
      inline def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      inline def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHtmlAttributes(value: Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdPrefix(value: String): Self = StObject.set(x, "idPrefix", value.asInstanceOf[js.Any])
      
      inline def setIdPrefixUndefined: Self = StObject.set(x, "idPrefix", js.undefined)
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSize(value: RadioButtonSize | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setValidationMessage(value: Any): Self = StObject.set(x, "validationMessage", value.asInstanceOf[js.Any])
      
      inline def setValidationMessageUndefined: Self = StObject.set(x, "validationMessage", js.undefined)
      
      inline def setValidationRules(value: Any): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
      
      inline def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
