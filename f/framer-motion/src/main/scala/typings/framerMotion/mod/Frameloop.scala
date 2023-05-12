package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in framer-motion.framer-motion.StepId ]: framer-motion.framer-motion.Schedule} */
trait Frameloop extends StObject {
  
  var postRender: Schedule
  
  var preRender: Schedule
  
  var read: Schedule
  
  var render: Schedule
  
  var update: Schedule
}
object Frameloop {
  
  inline def apply(
    postRender: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process,
    preRender: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process,
    read: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process,
    render: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process,
    update: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process
  ): Frameloop = {
    val __obj = js.Dynamic.literal(postRender = js.Any.fromFunction3(postRender), preRender = js.Any.fromFunction3(preRender), read = js.Any.fromFunction3(read), render = js.Any.fromFunction3(render), update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[Frameloop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Frameloop] (val x: Self) extends AnyVal {
    
    inline def setPostRender(
      value: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process
    ): Self = StObject.set(x, "postRender", js.Any.fromFunction3(value))
    
    inline def setPreRender(
      value: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process
    ): Self = StObject.set(x, "preRender", js.Any.fromFunction3(value))
    
    inline def setRead(
      value: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process
    ): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
    
    inline def setRender(
      value: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process
    ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
    
    inline def setUpdate(
      value: (/* process */ Process, /* keepAlive */ js.UndefOr[Boolean], /* immediate */ js.UndefOr[Boolean]) => Process
    ): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
  }
}
