package typings.dojo.dojo._base.kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.data.html
  *
  *
  */
trait data extends js.Object {
  /**
    *
    */
  var api: js.Object
  /**
    *
    */
  var util: js.Object
  /**
    *
    */
  def ItemFileReadStore(): Unit
  /**
    *
    */
  def ItemFileWriteStore(): Unit
  /**
    *
    */
  def ObjectStore(): Unit
}

object data {
  @scala.inline
  def apply(
    ItemFileReadStore: () => Unit,
    ItemFileWriteStore: () => Unit,
    ObjectStore: () => Unit,
    api: js.Object,
    util: js.Object
  ): data = {
    val __obj = js.Dynamic.literal(ItemFileReadStore = js.Any.fromFunction0(ItemFileReadStore), ItemFileWriteStore = js.Any.fromFunction0(ItemFileWriteStore), ObjectStore = js.Any.fromFunction0(ObjectStore), api = api, util = util)
  
    __obj.asInstanceOf[data]
  }
}

