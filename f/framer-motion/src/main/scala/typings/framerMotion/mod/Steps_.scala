package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in framer-motion.framer-motion.StepId ]: framer-motion.framer-motion.Step} */
trait Steps_ extends StObject {
  
  var postRender: Step
  
  var preRender: Step
  
  var read: Step
  
  var render: Step
  
  var update: Step
}
object Steps_ {
  
  inline def apply(postRender: Step, preRender: Step, read: Step, render: Step, update: Step): Steps_ = {
    val __obj = js.Dynamic.literal(postRender = postRender.asInstanceOf[js.Any], preRender = preRender.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Steps_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Steps_] (val x: Self) extends AnyVal {
    
    inline def setPostRender(value: Step): Self = StObject.set(x, "postRender", value.asInstanceOf[js.Any])
    
    inline def setPreRender(value: Step): Self = StObject.set(x, "preRender", value.asInstanceOf[js.Any])
    
    inline def setRead(value: Step): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setRender(value: Step): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: Step): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
  }
}
