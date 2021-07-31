package typings.extjs.Ext.layout

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISizeModel
  extends StObject
     with IBase {
  
  /** [Property] (Boolean) */
  var auto: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var calculated: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var calculatedFromConfigured: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var calculatedFromNatural: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var calculatedFromShrinkWrap: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var configured: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var constrainedMax: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var constrainedMin: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var fixed: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (String) */
  var name: js.UndefOr[String] = js.undefined
  
  /** [Property] (Object) */
  var names: js.UndefOr[js.Any] = js.undefined
  
  /** [Property] (Boolean) */
  var natural: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Number) */
  var ordinal: js.UndefOr[Double] = js.undefined
  
  /** [Property] (Object[]) */
  var pairsByHeightOrdinal: js.UndefOr[Array] = js.undefined
  
  /** [Property] (Boolean) */
  var shrinkWrap: js.UndefOr[Boolean] = js.undefined
}
object ISizeModel {
  
  @scala.inline
  def apply(): ISizeModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISizeModel]
  }
  
  @scala.inline
  implicit class ISizeModelMutableBuilder[Self <: ISizeModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
    
    @scala.inline
    def setCalculated(value: Boolean): Self = StObject.set(x, "calculated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculatedFromConfigured(value: Boolean): Self = StObject.set(x, "calculatedFromConfigured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculatedFromConfiguredUndefined: Self = StObject.set(x, "calculatedFromConfigured", js.undefined)
    
    @scala.inline
    def setCalculatedFromNatural(value: Boolean): Self = StObject.set(x, "calculatedFromNatural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculatedFromNaturalUndefined: Self = StObject.set(x, "calculatedFromNatural", js.undefined)
    
    @scala.inline
    def setCalculatedFromShrinkWrap(value: Boolean): Self = StObject.set(x, "calculatedFromShrinkWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculatedFromShrinkWrapUndefined: Self = StObject.set(x, "calculatedFromShrinkWrap", js.undefined)
    
    @scala.inline
    def setCalculatedUndefined: Self = StObject.set(x, "calculated", js.undefined)
    
    @scala.inline
    def setConfigured(value: Boolean): Self = StObject.set(x, "configured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguredUndefined: Self = StObject.set(x, "configured", js.undefined)
    
    @scala.inline
    def setConstrainedMax(value: Boolean): Self = StObject.set(x, "constrainedMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainedMaxUndefined: Self = StObject.set(x, "constrainedMax", js.undefined)
    
    @scala.inline
    def setConstrainedMin(value: Boolean): Self = StObject.set(x, "constrainedMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainedMinUndefined: Self = StObject.set(x, "constrainedMin", js.undefined)
    
    @scala.inline
    def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNames(value: js.Any): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    @scala.inline
    def setNatural(value: Boolean): Self = StObject.set(x, "natural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNaturalUndefined: Self = StObject.set(x, "natural", js.undefined)
    
    @scala.inline
    def setOrdinal(value: Double): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
    
    @scala.inline
    def setPairsByHeightOrdinal(value: Array): Self = StObject.set(x, "pairsByHeightOrdinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPairsByHeightOrdinalUndefined: Self = StObject.set(x, "pairsByHeightOrdinal", js.undefined)
    
    @scala.inline
    def setShrinkWrap(value: Boolean): Self = StObject.set(x, "shrinkWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShrinkWrapUndefined: Self = StObject.set(x, "shrinkWrap", js.undefined)
  }
}
