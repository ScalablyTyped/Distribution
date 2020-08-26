package typings.dynatable.JQueryDynatable

import typings.dynatable.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordsCount extends js.Object {
  /** Insert the record count inside the page */
  def attach(): Unit = js.native
  /**
    * Generate the html markup for the record count
    *
    * @return A jQuery object containing the generated html
    */
  def create(): JQuery = js.native
  /** Create and init the records count */
  def init(): Unit = js.native
  /**
    * Check if recordCount feature is enabled
    *
    * @return A boolean if recordCount feature is enabled
    */
  def initOnLoad(): Boolean = js.native
}

object RecordsCount {
  @scala.inline
  def apply(attach: () => Unit, create: () => JQuery, init: () => Unit, initOnLoad: () => Boolean): RecordsCount = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction0(attach), create = js.Any.fromFunction0(create), init = js.Any.fromFunction0(init), initOnLoad = js.Any.fromFunction0(initOnLoad))
    __obj.asInstanceOf[RecordsCount]
  }
  @scala.inline
  implicit class RecordsCountOps[Self <: RecordsCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttach(value: () => Unit): Self = this.set("attach", js.Any.fromFunction0(value))
    @scala.inline
    def setCreate(value: () => JQuery): Self = this.set("create", js.Any.fromFunction0(value))
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    @scala.inline
    def setInitOnLoad(value: () => Boolean): Self = this.set("initOnLoad", js.Any.fromFunction0(value))
  }
  
}

