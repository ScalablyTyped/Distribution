package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientFileManagerErrorConstsStatic extends js.Object {
  /**
    * Access is denied.    Return Value: 2
    */
  var AccessDenied: scala.Double
  /**
    * The specified file/folder already exists.    Return Value: 10
    */
  var AlreadyExists: scala.Double
  /**
    * The operation was canceled.    Return Value: 6
    */
  var CanceledOperation: scala.Double
  /**
    * The file/folder name is empty.    Return Value: 5
    */
  var EmptyName: scala.Double
  /**
    * The specified file is not found.    Return Value: 0
    */
  var FileNotFound: scala.Double
  /**
    * The specified folder is not found.    Return Value: 1
    */
  var FolderNotFound: scala.Double
  /**
    * The specified name contains invalid characters.    Return Value: 7
    */
  var InvalidSymbols: scala.Double
  /**
    * Unspecified error occurs.    Return Value: 4
    */
  var Unspecified: scala.Double
  /**
    * Unspecified IO error occurs.    Return Value: 3
    */
  var UnspecifiedIO: scala.Double
  /**
    * The file/folder is being used by another process.    Return Value: 9
    */
  var UsedByAnotherProcess: scala.Double
  /**
    * The specified file extension is not allowed.    Return Value: 8
    */
  var WrongExtension: scala.Double
}

object ASPxClientFileManagerErrorConstsStatic {
  @scala.inline
  def apply(
    AccessDenied: scala.Double,
    AlreadyExists: scala.Double,
    CanceledOperation: scala.Double,
    EmptyName: scala.Double,
    FileNotFound: scala.Double,
    FolderNotFound: scala.Double,
    InvalidSymbols: scala.Double,
    Unspecified: scala.Double,
    UnspecifiedIO: scala.Double,
    UsedByAnotherProcess: scala.Double,
    WrongExtension: scala.Double
  ): ASPxClientFileManagerErrorConstsStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccessDenied")(AccessDenied)
    __obj.updateDynamic("AlreadyExists")(AlreadyExists)
    __obj.updateDynamic("CanceledOperation")(CanceledOperation)
    __obj.updateDynamic("EmptyName")(EmptyName)
    __obj.updateDynamic("FileNotFound")(FileNotFound)
    __obj.updateDynamic("FolderNotFound")(FolderNotFound)
    __obj.updateDynamic("InvalidSymbols")(InvalidSymbols)
    __obj.updateDynamic("Unspecified")(Unspecified)
    __obj.updateDynamic("UnspecifiedIO")(UnspecifiedIO)
    __obj.updateDynamic("UsedByAnotherProcess")(UsedByAnotherProcess)
    __obj.updateDynamic("WrongExtension")(WrongExtension)
    __obj.asInstanceOf[ASPxClientFileManagerErrorConstsStatic]
  }
}

