package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientFileManagerCommandConstsStatic extends js.Object {
  /**
    * The name of a command that is executed when an end-user copies an item.
    */
  var Copy: String
  /**
    * The name of a command that is executed when an end-user creates a folder.
    */
  var Create: String
  /**
    * The name of a command that is executed when an end-user deletes an item.
    */
  var Delete: String
  /**
    * The name of a command that is executed when an end-user downloads an item.
    */
  var Download: String
  /**
    * The name of a command that is executed when an end-user moves an item.
    */
  var Move: String
  /**
    * The name of a command that is executed when an end-user opens an item.
    */
  var Open: String
  /**
    * The name of a command that is executed when an end-user renames an item.
    */
  var Rename: String
  /**
    * The name of a command that is executed when an end-user uploads a file.
    */
  var Upload: String
}

object ASPxClientFileManagerCommandConstsStatic {
  @scala.inline
  def apply(
    Copy: String,
    Create: String,
    Delete: String,
    Download: String,
    Move: String,
    Open: String,
    Rename: String,
    Upload: String
  ): ASPxClientFileManagerCommandConstsStatic = {
    val __obj = js.Dynamic.literal(Copy = Copy, Create = Create, Delete = Delete, Download = Download, Move = Move, Open = Open, Rename = Rename, Upload = Upload)
  
    __obj.asInstanceOf[ASPxClientFileManagerCommandConstsStatic]
  }
}

