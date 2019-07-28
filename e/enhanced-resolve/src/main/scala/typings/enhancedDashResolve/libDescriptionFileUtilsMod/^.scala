package typings.enhancedDashResolve.libDescriptionFileUtilsMod

import typings.enhancedDashResolve.libConcordMod.Dictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve/lib/DescriptionFileUtils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cdUp(directory: String): String | Null = js.native
  def getField(content: Null, field: String): js.Any = js.native
  def getField(content: Dictionary[_], field: String): js.Any = js.native
  def loadDescriptionFile(
    resolver: typings.enhancedDashResolve.libResolverMod.^,
    directory: String,
    filenames: js.Array[String],
    callback: js.Function2[
      /* err */ js.UndefOr[Error | Null], 
      /* result */ js.UndefOr[LoadDescriptionFileResult], 
      _
    ]
  ): Unit = js.native
}

