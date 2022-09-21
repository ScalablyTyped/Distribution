package typings.docxTemplates

import typings.jszip.mod.JSZip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zipMod {
  
  @JSImport("docx-templates/lib/zip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def zipGetText(zip: JSZip, filename: String): js.Promise[String] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("zipGetText")(zip.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String] | Null]
  
  inline def zipLoad(inputFile: js.typedarray.ArrayBuffer): js.Promise[JSZip] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipLoad")(inputFile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JSZip]]
  
  inline def zipSave(zip: JSZip): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipSave")(zip.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def zipSetBase64(zip: JSZip, filename: String, data: String): JSZip = (^.asInstanceOf[js.Dynamic].applyDynamic("zipSetBase64")(zip.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[JSZip]
  
  inline def zipSetBinary(zip: JSZip, filename: String, data: js.typedarray.ArrayBuffer): JSZip = (^.asInstanceOf[js.Dynamic].applyDynamic("zipSetBinary")(zip.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[JSZip]
  
  inline def zipSetText(zip: JSZip, filename: String, data: String): JSZip = (^.asInstanceOf[js.Dynamic].applyDynamic("zipSetText")(zip.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[JSZip]
}
