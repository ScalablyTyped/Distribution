package typings.enhancedResolve.mod

import typings.enhancedResolve.anon.FnCall
import typings.enhancedResolve.anon.FnCallArg0Arg1Arg2
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystem extends StObject {
  
  var lstat: js.UndefOr[FnCall] = js.native
  
  def readFile(arg0: String, arg1: js.Object, arg2: FileSystemCallback[String | Buffer]): Unit = js.native
  def readFile(arg0: String, arg1: FileSystemCallback[String | Buffer]): Unit = js.native
  
  var readJson: js.UndefOr[FnCallArg0Arg1Arg2] = js.native
  
  def readdir(
    arg0: String,
    arg1: js.Object,
    arg2: FileSystemCallback[js.Array[Buffer | FileSystemDirent | String]]
  ): Unit = js.native
  def readdir(arg0: String, arg1: FileSystemCallback[js.Array[Buffer | FileSystemDirent | String]]): Unit = js.native
  
  def readlink(arg0: String, arg1: js.Object, arg2: FileSystemCallback[String | Buffer]): Unit = js.native
  def readlink(arg0: String, arg1: FileSystemCallback[String | Buffer]): Unit = js.native
  
  def stat(arg0: String, arg1: js.Object, arg2: FileSystemCallback[String | Buffer]): Unit = js.native
  def stat(arg0: String, arg1: FileSystemCallback[FileSystemStats]): Unit = js.native
}
