package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyframeTrack extends StObject {
  
  var DefaultInterpolation: InterpolationModes
  
  def InterpolantFactoryMethodDiscrete(result: Any): DiscreteInterpolant
  
  def InterpolantFactoryMethodLinear(result: Any): LinearInterpolant
  
  def InterpolantFactoryMethodSmooth(result: Any): CubicInterpolant
  
  var TimeBufferType: js.typedarray.Float32Array
  
  var ValueBufferType: js.typedarray.Float32Array
  
  var ValueTypeName: String
  
  def getInterpolation(): InterpolationModes
  
  def getValuesize(): Double
  
  var name: String
  
  def optimize(): KeyframeTrack
  
  def scale(timeScale: Double): KeyframeTrack
  
  def setInterpolation(interpolation: InterpolationModes): Unit
  
  def shift(timeOffset: Double): KeyframeTrack
  
  var times: js.Array[Any]
  
  def trim(startTime: Double, endTime: Double): KeyframeTrack
  
  def validate(): Boolean
  
  var values: js.Array[Any]
}
object KeyframeTrack {
  
  inline def apply(
    DefaultInterpolation: InterpolationModes,
    InterpolantFactoryMethodDiscrete: Any => DiscreteInterpolant,
    InterpolantFactoryMethodLinear: Any => LinearInterpolant,
    InterpolantFactoryMethodSmooth: Any => CubicInterpolant,
    TimeBufferType: js.typedarray.Float32Array,
    ValueBufferType: js.typedarray.Float32Array,
    ValueTypeName: String,
    getInterpolation: () => InterpolationModes,
    getValuesize: () => Double,
    name: String,
    optimize: () => KeyframeTrack,
    scale: Double => KeyframeTrack,
    setInterpolation: InterpolationModes => Unit,
    shift: Double => KeyframeTrack,
    times: js.Array[Any],
    trim: (Double, Double) => KeyframeTrack,
    validate: () => Boolean,
    values: js.Array[Any]
  ): KeyframeTrack = {
    val __obj = js.Dynamic.literal(DefaultInterpolation = DefaultInterpolation.asInstanceOf[js.Any], InterpolantFactoryMethodDiscrete = js.Any.fromFunction1(InterpolantFactoryMethodDiscrete), InterpolantFactoryMethodLinear = js.Any.fromFunction1(InterpolantFactoryMethodLinear), InterpolantFactoryMethodSmooth = js.Any.fromFunction1(InterpolantFactoryMethodSmooth), TimeBufferType = TimeBufferType.asInstanceOf[js.Any], ValueBufferType = ValueBufferType.asInstanceOf[js.Any], ValueTypeName = ValueTypeName.asInstanceOf[js.Any], getInterpolation = js.Any.fromFunction0(getInterpolation), getValuesize = js.Any.fromFunction0(getValuesize), name = name.asInstanceOf[js.Any], optimize = js.Any.fromFunction0(optimize), scale = js.Any.fromFunction1(scale), setInterpolation = js.Any.fromFunction1(setInterpolation), shift = js.Any.fromFunction1(shift), times = times.asInstanceOf[js.Any], trim = js.Any.fromFunction2(trim), validate = js.Any.fromFunction0(validate), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyframeTrack]
  }
  
  extension [Self <: KeyframeTrack](x: Self) {
    
    inline def setDefaultInterpolation(value: InterpolationModes): Self = StObject.set(x, "DefaultInterpolation", value.asInstanceOf[js.Any])
    
    inline def setGetInterpolation(value: () => InterpolationModes): Self = StObject.set(x, "getInterpolation", js.Any.fromFunction0(value))
    
    inline def setGetValuesize(value: () => Double): Self = StObject.set(x, "getValuesize", js.Any.fromFunction0(value))
    
    inline def setInterpolantFactoryMethodDiscrete(value: Any => DiscreteInterpolant): Self = StObject.set(x, "InterpolantFactoryMethodDiscrete", js.Any.fromFunction1(value))
    
    inline def setInterpolantFactoryMethodLinear(value: Any => LinearInterpolant): Self = StObject.set(x, "InterpolantFactoryMethodLinear", js.Any.fromFunction1(value))
    
    inline def setInterpolantFactoryMethodSmooth(value: Any => CubicInterpolant): Self = StObject.set(x, "InterpolantFactoryMethodSmooth", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptimize(value: () => KeyframeTrack): Self = StObject.set(x, "optimize", js.Any.fromFunction0(value))
    
    inline def setScale(value: Double => KeyframeTrack): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    inline def setSetInterpolation(value: InterpolationModes => Unit): Self = StObject.set(x, "setInterpolation", js.Any.fromFunction1(value))
    
    inline def setShift(value: Double => KeyframeTrack): Self = StObject.set(x, "shift", js.Any.fromFunction1(value))
    
    inline def setTimeBufferType(value: js.typedarray.Float32Array): Self = StObject.set(x, "TimeBufferType", value.asInstanceOf[js.Any])
    
    inline def setTimes(value: js.Array[Any]): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    inline def setTimesVarargs(value: Any*): Self = StObject.set(x, "times", js.Array(value*))
    
    inline def setTrim(value: (Double, Double) => KeyframeTrack): Self = StObject.set(x, "trim", js.Any.fromFunction2(value))
    
    inline def setValidate(value: () => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    
    inline def setValueBufferType(value: js.typedarray.Float32Array): Self = StObject.set(x, "ValueBufferType", value.asInstanceOf[js.Any])
    
    inline def setValueTypeName(value: String): Self = StObject.set(x, "ValueTypeName", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
