package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("framer-motion", "FlatTree")
@js.native
open class FlatTree () extends StObject {
  
  def add(child: WithDepth): Unit = js.native
  
  /* private */ var children: Any = js.native
  
  def forEach(callback: js.Function1[/* child */ WithDepth, Unit]): Unit = js.native
  
  /* private */ var isDirty: Any = js.native
  
  def remove(child: WithDepth): Unit = js.native
}
