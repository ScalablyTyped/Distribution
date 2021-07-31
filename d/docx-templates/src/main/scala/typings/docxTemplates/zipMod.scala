package typings.docxTemplates

import typings.jszip.mod.JSZip
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zipMod {
  
  @JSImport("docx-templates/lib/zip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def zipGetText(zip: JSZip, filename: String): js.Promise[String] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("zipGetText")(zip.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String] | Null]
  
  @scala.inline
  def zipLoad(inputFile: ArrayBuffer): js.Promise[JSZip] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipLoad")(inputFile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JSZip]]
  
  @scala.inline
  def zipSave(zip: JSZip): js.Promise[Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipSave")(zip.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Uint8Array]]
  
  @scala.inline
  def zipSetBase64(zip: JSZip, filename: String, data: String): JSZip = (^.asInstanceOf[js.Dynamic].applyDynamic("zipSetBase64")(zip.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[JSZip]
  
  @scala.inline
  def zipSetBinary(zip: JSZip, filename: String, data: ArrayBuffer): JSZip = (^.asInstanceOf[js.Dynamic].applyDynamic("zipSetBinary")(zip.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[JSZip]
  
  @scala.inline
  def zipSetText(zip: JSZip, filename: String, data: String): JSZip = (^.asInstanceOf[js.Dynamic].applyDynamic("zipSetText")(zip.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[JSZip]
}
