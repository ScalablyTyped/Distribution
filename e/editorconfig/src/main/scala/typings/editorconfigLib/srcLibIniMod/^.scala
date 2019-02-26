package typings
package editorconfigLib.srcLibIniMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("editorconfig/src/lib/ini", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(file: java.lang.String): js.Promise[
    js.Array[
      js.Tuple2[java.lang.String | scala.Null, editorconfigLib.srcLibIniMod.SectionBody]
    ]
  ] = js.native
  def parse(file: nodeLib.Buffer): js.Promise[
    js.Array[
      js.Tuple2[java.lang.String | scala.Null, editorconfigLib.srcLibIniMod.SectionBody]
    ]
  ] = js.native
  def parse(file: nodeLib.urlMod.URL): js.Promise[
    js.Array[
      js.Tuple2[java.lang.String | scala.Null, editorconfigLib.srcLibIniMod.SectionBody]
    ]
  ] = js.native
  def parse(file: scala.Double): js.Promise[
    js.Array[
      js.Tuple2[java.lang.String | scala.Null, editorconfigLib.srcLibIniMod.SectionBody]
    ]
  ] = js.native
  def parseString(data: java.lang.String): editorconfigLib.srcLibIniMod.ParseStringResult = js.native
  def parseSync(file: java.lang.String): js.Array[
    js.Tuple2[java.lang.String | scala.Null, editorconfigLib.srcLibIniMod.SectionBody]
  ] = js.native
  def parseSync(file: nodeLib.Buffer): js.Array[
    js.Tuple2[java.lang.String | scala.Null, editorconfigLib.srcLibIniMod.SectionBody]
  ] = js.native
  def parseSync(file: nodeLib.urlMod.URL): js.Array[
    js.Tuple2[java.lang.String | scala.Null, editorconfigLib.srcLibIniMod.SectionBody]
  ] = js.native
  def parseSync(file: scala.Double): js.Array[
    js.Tuple2[java.lang.String | scala.Null, editorconfigLib.srcLibIniMod.SectionBody]
  ] = js.native
}

