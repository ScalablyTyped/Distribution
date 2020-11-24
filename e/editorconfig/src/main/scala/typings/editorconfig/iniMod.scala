package typings.editorconfig

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("editorconfig/src/lib/ini", JSImport.Namespace)
@js.native
object iniMod extends js.Object {
  
  def parse(file: String): js.Promise[js.Array[js.Tuple2[String | Null, SectionBody]]] = js.native
  def parse(file: Double): js.Promise[js.Array[js.Tuple2[String | Null, SectionBody]]] = js.native
  def parse(file: Buffer): js.Promise[js.Array[js.Tuple2[String | Null, SectionBody]]] = js.native
  def parse(file: URL_): js.Promise[js.Array[js.Tuple2[String | Null, SectionBody]]] = js.native
  
  def parseString(data: String): ParseStringResult = js.native
  
  def parseSync(file: String): js.Array[js.Tuple2[String | Null, SectionBody]] = js.native
  def parseSync(file: Double): js.Array[js.Tuple2[String | Null, SectionBody]] = js.native
  def parseSync(file: Buffer): js.Array[js.Tuple2[String | Null, SectionBody]] = js.native
  def parseSync(file: URL_): js.Array[js.Tuple2[String | Null, SectionBody]] = js.native
  
  type ParseStringResult = js.Array[js.Tuple2[SectionName, SectionBody]]
  
  type SectionBody = StringDictionary[String]
  
  type SectionName = String | Null
}
