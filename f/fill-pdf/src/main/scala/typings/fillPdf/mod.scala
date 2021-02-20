package typings.fillPdf

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fill-pdf", "generateFdf")
  @js.native
  def generateFdf(data: FormData): Buffer = js.native
  
  @JSImport("fill-pdf", "generatePdf")
  @js.native
  def generatePdf(data: FormData, templatePath: String, extendArgs: js.Array[String]): Unit = js.native
  @JSImport("fill-pdf", "generatePdf")
  @js.native
  def generatePdf(
    data: FormData,
    templatePath: String,
    extendArgs: js.Array[String],
    callback: js.Function2[/* err */ Error, /* output */ Buffer, Unit]
  ): Unit = js.native
  
  type FormData = StringDictionary[String]
}
