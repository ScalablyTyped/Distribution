package typings.fsExtra.mod

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.BaseEncodingOptions
import typings.node.fsMod.BufferEncodingOption
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object realpathSync {
  
  @scala.inline
  def apply(path: PathLike): String = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(path: PathLike, options: String): String | Buffer = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  @scala.inline
  def apply(path: PathLike, options: BufferEncoding): String = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(path: PathLike, options: BaseEncodingOptions): String = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(path: PathLike, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @JSImport("fs-extra", "realpathSync")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def native(path: PathLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def native(path: PathLike, options: String): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
  @scala.inline
  def native(path: PathLike, options: BufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def native(path: PathLike, options: BaseEncodingOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def native(path: PathLike, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def native_Union(path: PathLike): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
  @scala.inline
  def native_Union(path: PathLike, options: BaseEncodingOptions): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
}
