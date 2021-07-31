package typings.extjs.Ext.grid

import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.grid.header.IContainer
import typings.extjs.Ext.util.IMixedCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object property {
  
  trait IGrid
    extends StObject
       with IPanel {
    
    /** [Config Option] (Object) */
    var customEditors: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Object) */
    var customRenderers: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Gets the source data object containing the property data
      * @returns Object The data object.
      */
    var getSource: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var inferTypes: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Number/String) */
    var nameColumnWidth: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (String) */
    var nameField: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Object) */
    var propertyNames: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Removes a property from the grid
      * @param prop String The name of the property to remove.
      */
    var removeProperty: js.UndefOr[js.Function1[/* prop */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of a property
      * @param prop String The name of the property to set.
      * @param value Object The value to test.
      * @param create Boolean true to create the property if it doesn't already exist.
      */
    var setProperty: js.UndefOr[
        js.Function3[
          /* prop */ js.UndefOr[String], 
          /* value */ js.UndefOr[js.Any], 
          /* create */ js.UndefOr[Boolean], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Sets the source data object containing the property data
      * @param source Object The data object.
      * @param sourceConfig Object A new object. If this argument is not passed the current configuration will be re-used. To reset the config, pass null or an empty object literal.
      */
    var setSource: js.UndefOr[
        js.Function2[/* source */ js.UndefOr[js.Any], /* sourceConfig */ js.UndefOr[js.Any], Unit]
      ] = js.undefined
    
    /** [Config Option] (Object) */
    var source: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Object) */
    var sourceConfig: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (String) */
    var valueField: js.UndefOr[String] = js.undefined
  }
  object IGrid {
    
    @scala.inline
    def apply(): IGrid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGrid]
    }
    
    @scala.inline
    implicit class IGridMutableBuilder[Self <: IGrid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomEditors(value: js.Any): Self = StObject.set(x, "customEditors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomEditorsUndefined: Self = StObject.set(x, "customEditors", js.undefined)
      
      @scala.inline
      def setCustomRenderers(value: js.Any): Self = StObject.set(x, "customRenderers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomRenderersUndefined: Self = StObject.set(x, "customRenderers", js.undefined)
      
      @scala.inline
      def setGetSource(value: () => js.Any): Self = StObject.set(x, "getSource", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSourceUndefined: Self = StObject.set(x, "getSource", js.undefined)
      
      @scala.inline
      def setInferTypes(value: Boolean): Self = StObject.set(x, "inferTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInferTypesUndefined: Self = StObject.set(x, "inferTypes", js.undefined)
      
      @scala.inline
      def setNameColumnWidth(value: js.Any): Self = StObject.set(x, "nameColumnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameColumnWidthUndefined: Self = StObject.set(x, "nameColumnWidth", js.undefined)
      
      @scala.inline
      def setNameField(value: String): Self = StObject.set(x, "nameField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameFieldUndefined: Self = StObject.set(x, "nameField", js.undefined)
      
      @scala.inline
      def setPropertyNames(value: js.Any): Self = StObject.set(x, "propertyNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyNamesUndefined: Self = StObject.set(x, "propertyNames", js.undefined)
      
      @scala.inline
      def setRemoveProperty(value: /* prop */ js.UndefOr[String] => Unit): Self = StObject.set(x, "removeProperty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemovePropertyUndefined: Self = StObject.set(x, "removeProperty", js.undefined)
      
      @scala.inline
      def setSetProperty(
        value: (/* prop */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* create */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "setProperty", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSetPropertyUndefined: Self = StObject.set(x, "setProperty", js.undefined)
      
      @scala.inline
      def setSetSource(value: (/* source */ js.UndefOr[js.Any], /* sourceConfig */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "setSource", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetSourceUndefined: Self = StObject.set(x, "setSource", js.undefined)
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceConfig(value: js.Any): Self = StObject.set(x, "sourceConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceConfigUndefined: Self = StObject.set(x, "sourceConfig", js.undefined)
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setValueField(value: String): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
    }
  }
  
  type IHeaderContainer = IContainer
  
  trait IProperty
    extends StObject
       with IModel {
    
    /** [Property] (Ext.util.MixedCollection) */
    @JSName("fields")
    var fields_IProperty: js.UndefOr[IMixedCollection] = js.undefined
  }
  object IProperty {
    
    @scala.inline
    def apply(): IProperty = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProperty]
    }
    
    @scala.inline
    implicit class IPropertyMutableBuilder[Self <: IProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: IMixedCollection): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    }
  }
  
  trait IStore
    extends StObject
       with typings.extjs.Ext.data.IStore
  object IStore {
    
    @scala.inline
    def apply(): IStore = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStore]
    }
  }
}
