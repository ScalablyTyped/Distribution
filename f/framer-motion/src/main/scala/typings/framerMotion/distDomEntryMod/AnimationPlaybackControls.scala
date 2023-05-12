package typings.framerMotion.distDomEntryMod

import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
@js.native
trait AnimationPlaybackControls extends StObject {
  
  def cancel(): Unit = js.native
  
  def complete(): Unit = js.native
  
  var duration: Double = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  var speed: Double = js.native
  
  def stop(): Unit = js.native
  
  def `then`(onResolve: VoidFunction): js.Promise[Unit] = js.native
  def `then`(onResolve: VoidFunction, onReject: VoidFunction): js.Promise[Unit] = js.native
  
  var time: Double = js.native
}
