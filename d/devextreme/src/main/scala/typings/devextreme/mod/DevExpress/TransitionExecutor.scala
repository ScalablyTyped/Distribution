package typings.devextreme.mod.DevExpress

import typings.devextreme.mod.global.JQuery
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionExecutor extends StObject {
  
  def enter(elements: JQuery, animation: String): Unit = js.native
  /**
    * [descr:TransitionExecutor.enter(elements, animation)]
    */
  def enter(elements: JQuery, animation: animationConfig): Unit = js.native
  
  def leave(elements: JQuery, animation: String): Unit = js.native
  /**
    * [descr:TransitionExecutor.leave(elements, animation)]
    */
  def leave(elements: JQuery, animation: animationConfig): Unit = js.native
  
  /**
    * [descr:TransitionExecutor.reset()]
    */
  def reset(): Unit = js.native
  
  /**
    * [descr:TransitionExecutor.start()]
    */
  def start(): Promise[Unit] & JQueryPromise[Unit] = js.native
  
  /**
    * [descr:TransitionExecutor.stop()]
    */
  def stop(): Unit = js.native
}
