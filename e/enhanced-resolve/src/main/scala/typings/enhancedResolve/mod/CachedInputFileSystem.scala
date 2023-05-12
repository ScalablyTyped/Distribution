package typings.enhancedResolve.mod

import typings.enhancedResolve.anon.FnCall
import typings.enhancedResolve.anon.FnCallArg0Arg1Arg2
import typings.enhancedResolve.enhancedResolveStrings.`ucs-2`
import typings.enhancedResolve.enhancedResolveStrings.`utf-8`
import typings.enhancedResolve.enhancedResolveStrings.ascii
import typings.enhancedResolve.enhancedResolveStrings.base64
import typings.enhancedResolve.enhancedResolveStrings.binary
import typings.enhancedResolve.enhancedResolveStrings.buffer
import typings.enhancedResolve.enhancedResolveStrings.hex
import typings.enhancedResolve.enhancedResolveStrings.latin1
import typings.enhancedResolve.enhancedResolveStrings.ucs2
import typings.enhancedResolve.enhancedResolveStrings.utf16le
import typings.enhancedResolve.enhancedResolveStrings.utf8
import typings.node.NodeJS.ErrnoException
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("enhanced-resolve", "CachedInputFileSystem")
@js.native
open class CachedInputFileSystem () extends StObject {
  def this(fileSystem: Any) = this()
  def this(fileSystem: Any, duration: Any) = this()
  def this(fileSystem: Unit, duration: Any) = this()
  
  var fileSystem: Any = js.native
  
  var lstat: js.UndefOr[FnCall] = js.native
  
  var lstatSync: js.UndefOr[
    js.Function2[/* arg0 */ String, /* arg1 */ js.UndefOr[js.Object], FileSystemStats]
  ] = js.native
  
  def purge(): Unit = js.native
  def purge(what: Any): Unit = js.native
  
  def readFile(arg0: String, arg1: js.Object, arg2: FileSystemCallback[String | Buffer]): Unit = js.native
  def readFile(arg0: String, arg1: FileSystemCallback[String | Buffer]): Unit = js.native
  
  def readFileSync(arg0: String): String | Buffer = js.native
  def readFileSync(arg0: String, arg1: js.Object): String | Buffer = js.native
  
  var readJson: js.UndefOr[FnCallArg0Arg1Arg2] = js.native
  
  var readJsonSync: js.UndefOr[js.Function2[/* arg0 */ String, /* arg1 */ js.UndefOr[js.Object], js.Object]] = js.native
  
  def readdir(arg0: String): Unit = js.native
  def readdir(
    arg0: String,
    arg1: ascii | utf8 | `utf-8` | utf16le | ucs2 | `ucs-2` | base64 | latin1 | binary | hex | buffer
  ): Unit = js.native
  def readdir(
    arg0: String,
    arg1: ascii | utf8 | `utf-8` | utf16le | ucs2 | `ucs-2` | base64 | latin1 | binary | hex | buffer,
    arg2: js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[js.Array[Any | Buffer | String]], 
      Unit
    ]
  ): Unit = js.native
  def readdir(
    arg0: String,
    arg1: js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[js.Array[Any | Buffer | String]], 
      Unit
    ]
  ): Unit = js.native
  def readdir(
    arg0: String,
    arg1: js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[js.Array[Any | Buffer | String]], 
      Unit
    ],
    arg2: js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[js.Array[Any | Buffer | String]], 
      Unit
    ]
  ): Unit = js.native
  def readdir(
    arg0: String,
    arg1: Null,
    arg2: js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[js.Array[Any | Buffer | String]], 
      Unit
    ]
  ): Unit = js.native
  def readdir(
    arg0: String,
    arg1: Unit,
    arg2: js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[js.Array[Any | Buffer | String]], 
      Unit
    ]
  ): Unit = js.native
  def readdir(arg0: String, arg1: ReaddirOptions): Unit = js.native
  def readdir(
    arg0: String,
    arg1: ReaddirOptions,
    arg2: js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[js.Array[Any | Buffer | String]], 
      Unit
    ]
  ): Unit = js.native
  
  def readdirSync(arg0: String): js.Array[Buffer | FileSystemDirent | String] = js.native
  def readdirSync(arg0: String, arg1: js.Object): js.Array[Buffer | FileSystemDirent | String] = js.native
  
  def readlink(arg0: String, arg1: js.Object, arg2: FileSystemCallback[String | Buffer]): Unit = js.native
  def readlink(arg0: String, arg1: FileSystemCallback[String | Buffer]): Unit = js.native
  
  def readlinkSync(arg0: String): String | Buffer = js.native
  def readlinkSync(arg0: String, arg1: js.Object): String | Buffer = js.native
  
  def stat(arg0: String, arg1: js.Object, arg2: FileSystemCallback[String | Buffer]): Unit = js.native
  def stat(arg0: String, arg1: FileSystemCallback[FileSystemStats]): Unit = js.native
  
  def statSync(arg0: String): FileSystemStats = js.native
  def statSync(arg0: String, arg1: js.Object): FileSystemStats = js.native
}
