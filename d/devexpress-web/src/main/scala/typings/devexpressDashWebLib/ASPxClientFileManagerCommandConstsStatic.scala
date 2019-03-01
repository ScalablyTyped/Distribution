package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientFileManagerCommandConstsStatic extends js.Object {
  /**
    * The name of a command that is executed when an end-user copies an item.
    */
  var Copy: java.lang.String
  /**
    * The name of a command that is executed when an end-user creates a folder.
    */
  var Create: java.lang.String
  /**
    * The name of a command that is executed when an end-user deletes an item.
    */
  var Delete: java.lang.String
  /**
    * The name of a command that is executed when an end-user downloads an item.
    */
  var Download: java.lang.String
  /**
    * The name of a command that is executed when an end-user moves an item.
    */
  var Move: java.lang.String
  /**
    * The name of a command that is executed when an end-user opens an item.
    */
  var Open: java.lang.String
  /**
    * The name of a command that is executed when an end-user renames an item.
    */
  var Rename: java.lang.String
  /**
    * The name of a command that is executed when an end-user uploads a file.
    */
  var Upload: java.lang.String
}

object ASPxClientFileManagerCommandConstsStatic {
  @scala.inline
  def apply(
    Copy: java.lang.String,
    Create: java.lang.String,
    Delete: java.lang.String,
    Download: java.lang.String,
    Move: java.lang.String,
    Open: java.lang.String,
    Rename: java.lang.String,
    Upload: java.lang.String
  ): ASPxClientFileManagerCommandConstsStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Copy")(Copy)
    __obj.updateDynamic("Create")(Create)
    __obj.updateDynamic("Delete")(Delete)
    __obj.updateDynamic("Download")(Download)
    __obj.updateDynamic("Move")(Move)
    __obj.updateDynamic("Open")(Open)
    __obj.updateDynamic("Rename")(Rename)
    __obj.updateDynamic("Upload")(Upload)
    __obj.asInstanceOf[ASPxClientFileManagerCommandConstsStatic]
  }
}

