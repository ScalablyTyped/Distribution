package typings.googleCloudSpanner.mod

import org.scalablytyped.runtime.Instantiable1
import typings.googleCloudSpanner.anon.TypeofSpanner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  @JSImport("@google-cloud/spanner", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@google-cloud/spanner", "default.Spanner")
  @js.native
  def Spanner: TypeofSpanner & (Instantiable1[/* options */ js.UndefOr[SpannerOptions], typings.googleCloudSpanner.mod.Spanner]) = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@google-cloud/spanner", "default.Spanner")
  @js.native
  open class SpannerCls () extends Spanner {
    def this(options: SpannerOptions) = this()
  }
  
  inline def Spanner_=(x: TypeofSpanner & (Instantiable1[/* options */ js.UndefOr[SpannerOptions], Spanner])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Spanner")(x.asInstanceOf[js.Any])
}
