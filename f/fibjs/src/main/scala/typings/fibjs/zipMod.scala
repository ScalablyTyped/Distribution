package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief zip 格式文件压缩解压模块
  * @detail 使用方法：,```JavaScript,var zip = require('zip');,```
  */
object zipMod {
  
  @JSImport("zip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("zip", "ZIP_DEFLATED")
  @js.native
  val ZIP_DEFLATED: /* 1 */ Double = js.native
  
  @JSImport("zip", "ZIP_STORED")
  @js.native
  val ZIP_STORED: /* 0 */ Double = js.native
  
  @scala.inline
  def isZipFile(filename: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isZipFile")(filename.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def open(data: ClassBuffer): ClassZipFile = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(data.asInstanceOf[js.Any]).asInstanceOf[ClassZipFile]
  @scala.inline
  def open(data: ClassBuffer, mod: String): ClassZipFile = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(data.asInstanceOf[js.Any], mod.asInstanceOf[js.Any])).asInstanceOf[ClassZipFile]
  @scala.inline
  def open(data: ClassBuffer, mod: String, compress_type: Double): ClassZipFile = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(data.asInstanceOf[js.Any], mod.asInstanceOf[js.Any], compress_type.asInstanceOf[js.Any])).asInstanceOf[ClassZipFile]
  @scala.inline
  def open(data: ClassBuffer, mod: Unit, compress_type: Double): ClassZipFile = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(data.asInstanceOf[js.Any], mod.asInstanceOf[js.Any], compress_type.asInstanceOf[js.Any])).asInstanceOf[ClassZipFile]
  @scala.inline
  def open(path: String): ClassZipFile = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any]).asInstanceOf[ClassZipFile]
  @scala.inline
  def open(path: String, mod: String): ClassZipFile = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], mod.asInstanceOf[js.Any])).asInstanceOf[ClassZipFile]
  @scala.inline
  def open(path: String, mod: String, compress_type: Double): ClassZipFile = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], mod.asInstanceOf[js.Any], compress_type.asInstanceOf[js.Any])).asInstanceOf[ClassZipFile]
  @scala.inline
  def open(path: String, mod: Unit, compress_type: Double): ClassZipFile = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], mod.asInstanceOf[js.Any], compress_type.asInstanceOf[js.Any])).asInstanceOf[ClassZipFile]
  @scala.inline
  def open(strm: ClassSeekableStream): ClassZipFile = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(strm.asInstanceOf[js.Any]).asInstanceOf[ClassZipFile]
  @scala.inline
  def open(strm: ClassSeekableStream, mod: String): ClassZipFile = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(strm.asInstanceOf[js.Any], mod.asInstanceOf[js.Any])).asInstanceOf[ClassZipFile]
  @scala.inline
  def open(strm: ClassSeekableStream, mod: String, compress_type: Double): ClassZipFile = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(strm.asInstanceOf[js.Any], mod.asInstanceOf[js.Any], compress_type.asInstanceOf[js.Any])).asInstanceOf[ClassZipFile]
  @scala.inline
  def open(strm: ClassSeekableStream, mod: Unit, compress_type: Double): ClassZipFile = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(strm.asInstanceOf[js.Any], mod.asInstanceOf[js.Any], compress_type.asInstanceOf[js.Any])).asInstanceOf[ClassZipFile]
}
