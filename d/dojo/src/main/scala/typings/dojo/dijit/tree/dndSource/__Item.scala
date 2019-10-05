package typings.dojo.dijit.tree.dndSource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/tree/dndSource.__Item.html
  *
  * New item to be added to the Tree, like:
  * 
  */
trait __Item extends js.Object {
  /**
    * 
    */
  var id: js.Object
  /**
    * 
    */
  var name: String
}

object __Item {
  @scala.inline
  def apply(id: js.Object, name: String): __Item = {
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[__Item]
  }
}

