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
  var names: js.UndefOr[Any] = js.undefined
  
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
  
  inline def apply(): ISizeModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISizeModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISizeModel] (val x: Self) extends AnyVal {
    
    inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
    
    inline def setCalculated(value: Boolean): Self = StObject.set(x, "calculated", value.asInstanceOf[js.Any])
    
    inline def setCalculatedFromConfigured(value: Boolean): Self = StObject.set(x, "calculatedFromConfigured", value.asInstanceOf[js.Any])
    
    inline def setCalculatedFromConfiguredUndefined: Self = StObject.set(x, "calculatedFromConfigured", js.undefined)
    
    inline def setCalculatedFromNatural(value: Boolean): Self = StObject.set(x, "calculatedFromNatural", value.asInstanceOf[js.Any])
    
    inline def setCalculatedFromNaturalUndefined: Self = StObject.set(x, "calculatedFromNatural", js.undefined)
    
    inline def setCalculatedFromShrinkWrap(value: Boolean): Self = StObject.set(x, "calculatedFromShrinkWrap", value.asInstanceOf[js.Any])
    
    inline def setCalculatedFromShrinkWrapUndefined: Self = StObject.set(x, "calculatedFromShrinkWrap", js.undefined)
    
    inline def setCalculatedUndefined: Self = StObject.set(x, "calculated", js.undefined)
    
    inline def setConfigured(value: Boolean): Self = StObject.set(x, "configured", value.asInstanceOf[js.Any])
    
    inline def setConfiguredUndefined: Self = StObject.set(x, "configured", js.undefined)
    
    inline def setConstrainedMax(value: Boolean): Self = StObject.set(x, "constrainedMax", value.asInstanceOf[js.Any])
    
    inline def setConstrainedMaxUndefined: Self = StObject.set(x, "constrainedMax", js.undefined)
    
    inline def setConstrainedMin(value: Boolean): Self = StObject.set(x, "constrainedMin", value.asInstanceOf[js.Any])
    
    inline def setConstrainedMinUndefined: Self = StObject.set(x, "constrainedMin", js.undefined)
    
    inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNames(value: Any): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNatural(value: Boolean): Self = StObject.set(x, "natural", value.asInstanceOf[js.Any])
    
    inline def setNaturalUndefined: Self = StObject.set(x, "natural", js.undefined)
    
    inline def setOrdinal(value: Double): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    inline def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
    
    inline def setPairsByHeightOrdinal(value: Array): Self = StObject.set(x, "pairsByHeightOrdinal", value.asInstanceOf[js.Any])
    
    inline def setPairsByHeightOrdinalUndefined: Self = StObject.set(x, "pairsByHeightOrdinal", js.undefined)
    
    inline def setShrinkWrap(value: Boolean): Self = StObject.set(x, "shrinkWrap", value.asInstanceOf[js.Any])
    
    inline def setShrinkWrapUndefined: Self = StObject.set(x, "shrinkWrap", js.undefined)
  }
}
