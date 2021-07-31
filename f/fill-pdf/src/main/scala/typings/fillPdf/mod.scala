package typings.fillPdf

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fill-pdf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def generateFdf(data: FormData): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("generateFdf")(data.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def generatePdf(data: FormData, templatePath: String, extendArgs: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePdf")(data.asInstanceOf[js.Any], templatePath.asInstanceOf[js.Any], extendArgs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generatePdf(
    data: FormData,
    templatePath: String,
    extendArgs: js.Array[String],
    callback: js.Function2[/* err */ Error, /* output */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePdf")(data.asInstanceOf[js.Any], templatePath.asInstanceOf[js.Any], extendArgs.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type FormData = StringDictionary[String]
}
