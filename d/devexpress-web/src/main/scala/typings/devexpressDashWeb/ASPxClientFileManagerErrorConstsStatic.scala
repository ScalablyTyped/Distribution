package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientFileManagerErrorConstsStatic extends js.Object {
  /**
    * Access is denied.    Return Value: 2
    */
  var AccessDenied: Double
  /**
    * The specified file/folder already exists.    Return Value: 10
    */
  var AlreadyExists: Double
  /**
    * The operation was canceled.    Return Value: 6
    */
  var CanceledOperation: Double
  /**
    * The file/folder name is empty.    Return Value: 5
    */
  var EmptyName: Double
  /**
    * The specified file is not found.    Return Value: 0
    */
  var FileNotFound: Double
  /**
    * The specified folder is not found.    Return Value: 1
    */
  var FolderNotFound: Double
  /**
    * The specified name contains invalid characters.    Return Value: 7
    */
  var InvalidSymbols: Double
  /**
    * Unspecified error occurs.    Return Value: 4
    */
  var Unspecified: Double
  /**
    * Unspecified IO error occurs.    Return Value: 3
    */
  var UnspecifiedIO: Double
  /**
    * The file/folder is being used by another process.    Return Value: 9
    */
  var UsedByAnotherProcess: Double
  /**
    * The specified file extension is not allowed.    Return Value: 8
    */
  var WrongExtension: Double
}

object ASPxClientFileManagerErrorConstsStatic {
  @scala.inline
  def apply(
    AccessDenied: Double,
    AlreadyExists: Double,
    CanceledOperation: Double,
    EmptyName: Double,
    FileNotFound: Double,
    FolderNotFound: Double,
    InvalidSymbols: Double,
    Unspecified: Double,
    UnspecifiedIO: Double,
    UsedByAnotherProcess: Double,
    WrongExtension: Double
  ): ASPxClientFileManagerErrorConstsStatic = {
    val __obj = js.Dynamic.literal(AccessDenied = AccessDenied, AlreadyExists = AlreadyExists, CanceledOperation = CanceledOperation, EmptyName = EmptyName, FileNotFound = FileNotFound, FolderNotFound = FolderNotFound, InvalidSymbols = InvalidSymbols, Unspecified = Unspecified, UnspecifiedIO = UnspecifiedIO, UsedByAnotherProcess = UsedByAnotherProcess, WrongExtension = WrongExtension)
  
    __obj.asInstanceOf[ASPxClientFileManagerErrorConstsStatic]
  }
}

