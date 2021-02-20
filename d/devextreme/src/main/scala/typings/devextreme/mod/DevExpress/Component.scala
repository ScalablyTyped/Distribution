package typings.devextreme.mod.DevExpress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component extends StObject {
  
  /**
    * [descr:Component.beginUpdate()]
    */
  def beginUpdate(): Unit = js.native
  
  /**
    * [descr:Component.endUpdate()]
    */
  def endUpdate(): Unit = js.native
  
  /**
    * [descr:Component.instance()]
    */
  def instance(): this.type = js.native
  
  /**
    * [descr:Component.off(eventName)]
    */
  def off(eventName: String): this.type = js.native
  /**
    * [descr:Component.off(eventName, eventHandler)]
    */
  def off(eventName: String, eventHandler: js.Function): this.type = js.native
  
  /**
    * [descr:Component.on(eventName, eventHandler)]
    */
  def on(eventName: String, eventHandler: js.Function): this.type = js.native
  /**
    * [descr:Component.on(events)]
    */
  def on(events: js.Any): this.type = js.native
  
  /**
    * [descr:Component.option()]
    */
  def option(): js.Any = js.native
  /**
    * [descr:Component.option(optionName)]
    */
  def option(optionName: String): js.Any = js.native
  /**
    * [descr:Component.option(optionName, optionValue)]
    */
  def option(optionName: String, optionValue: js.Any): Unit = js.native
  /**
    * [descr:Component.option(options)]
    */
  def option(options: js.Any): Unit = js.native
  
  /**
    * [descr:Component.resetOption(optionName)]
    */
  def resetOption(optionName: String): Unit = js.native
}
