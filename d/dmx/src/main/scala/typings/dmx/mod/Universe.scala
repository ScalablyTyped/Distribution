package typings.dmx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventEmitter * / any */ @js.native
trait Universe extends StObject {
  
  def close(callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  
  def get(i: Double): Double = js.native
  
  def start(): Unit = js.native
  
  def stop(): Unit = js.native
  
  def update(channels: ChannelMap): Unit = js.native
  def update(channels: ChannelMap, extraData: UpdateEventExtraData): Unit = js.native
  
  def updateAll(value: Double): Unit = js.native
}
