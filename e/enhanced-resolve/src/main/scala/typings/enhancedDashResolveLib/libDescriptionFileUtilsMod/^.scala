package typings
package enhancedDashResolveLib.libDescriptionFileUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve/lib/DescriptionFileUtils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cdUp(directory: java.lang.String): java.lang.String | scala.Null = js.native
  def getField(content: enhancedDashResolveLib.libConcordMod.Dictionary[_], field: java.lang.String): js.Any = js.native
  def getField(content: scala.Null, field: java.lang.String): js.Any = js.native
  def loadDescriptionFile(
    resolver: enhancedDashResolveLib.libResolverMod.namespaced,
    directory: java.lang.String,
    filenames: js.Array[java.lang.String],
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error | scala.Null], 
      /* result */ js.UndefOr[enhancedDashResolveLib.libDescriptionFileUtilsMod.LoadDescriptionFileResult], 
      _
    ]
  ): scala.Unit = js.native
}

