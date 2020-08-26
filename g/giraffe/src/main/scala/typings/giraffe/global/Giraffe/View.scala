package typings.giraffe.global.Giraffe

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Giraffe.View")
@js.native
class View[TModel /* <: typings.giraffe.Giraffe.Model */] ()
  extends typings.giraffe.Giraffe.View[TModel]

/* static members */
@JSGlobal("Giraffe.View")
@js.native
object View extends js.Object {
  def detachByElement(el: js.Any): typings.giraffe.Giraffe.View[typings.giraffe.Giraffe.Model] = js.native
  def detachByElement(el: js.Any, preserve: Boolean): typings.giraffe.Giraffe.View[typings.giraffe.Giraffe.Model] = js.native
  def getByCid(cid: String): typings.giraffe.Giraffe.View[typings.giraffe.Giraffe.Model] = js.native
  def getClosestView[TModel](el: js.Any): typings.giraffe.Giraffe.View[typings.giraffe.Giraffe.Model] = js.native
  def removeDocumentEvents(): js.Any = js.native
  def removeDocumentEvents(prefix: String): js.Any = js.native
  def setDocumentEventPrefix(): js.Any = js.native
  def setDocumentEventPrefix(prefix: String): js.Any = js.native
  def setDocumentEvents(events: js.Array[String]): js.Array[String] = js.native
  def setDocumentEvents(events: js.Array[String], prefix: String): js.Array[String] = js.native
  def setTemplateStrategy(strategy: js.Any): js.Any = js.native
  def setTemplateStrategy(strategy: js.Any, instance: js.Any): js.Any = js.native
  @JSName("to$El")
  def to$El(el: js.Any): JQuery[HTMLElement] = js.native
  @JSName("to$El")
  def to$El(el: js.Any, parent: js.UndefOr[scala.Nothing], allowParentMatch: Boolean): JQuery[HTMLElement] = js.native
  @JSName("to$El")
  def to$El(el: js.Any, parent: js.Any): JQuery[HTMLElement] = js.native
  @JSName("to$El")
  def to$El(el: js.Any, parent: js.Any, allowParentMatch: Boolean): JQuery[HTMLElement] = js.native
}

