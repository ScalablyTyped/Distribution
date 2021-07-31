package typings.editorconfig

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iniMod {
  
  @JSImport("editorconfig/src/lib/ini", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parse(file: String): js.Promise[js.Array[js.Tuple2[String | Null, SectionBody]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Tuple2[String | Null, SectionBody]]]]
  @scala.inline
  def parse(file: Double): js.Promise[js.Array[js.Tuple2[String | Null, SectionBody]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Tuple2[String | Null, SectionBody]]]]
  @scala.inline
  def parse(file: Buffer): js.Promise[js.Array[js.Tuple2[String | Null, SectionBody]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Tuple2[String | Null, SectionBody]]]]
  @scala.inline
  def parse(file: URL_): js.Promise[js.Array[js.Tuple2[String | Null, SectionBody]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Tuple2[String | Null, SectionBody]]]]
  
  @scala.inline
  def parseString(data: String): ParseStringResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(data.asInstanceOf[js.Any]).asInstanceOf[ParseStringResult]
  
  @scala.inline
  def parseSync(file: String): js.Array[js.Tuple2[String | Null, SectionBody]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(file.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[String | Null, SectionBody]]]
  @scala.inline
  def parseSync(file: Double): js.Array[js.Tuple2[String | Null, SectionBody]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(file.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[String | Null, SectionBody]]]
  @scala.inline
  def parseSync(file: Buffer): js.Array[js.Tuple2[String | Null, SectionBody]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(file.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[String | Null, SectionBody]]]
  @scala.inline
  def parseSync(file: URL_): js.Array[js.Tuple2[String | Null, SectionBody]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(file.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[String | Null, SectionBody]]]
  
  type ParseStringResult = js.Array[js.Tuple2[SectionName, SectionBody]]
  
  type SectionBody = StringDictionary[String]
  
  type SectionName = String | Null
}
