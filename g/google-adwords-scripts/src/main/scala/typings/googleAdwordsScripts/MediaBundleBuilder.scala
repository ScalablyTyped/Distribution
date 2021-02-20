package typings.googleAdwordsScripts

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaBundleBuilder[Media] extends AdWordsBuilder[Media] {
  
  def withData(data: Blob): MediaBundleBuilder[Media] = js.native
  
  def withName(name: String): MediaBundleBuilder[Media] = js.native
}
object MediaBundleBuilder {
  
  @scala.inline
  def apply[Media](
    build: () => AdWordsOperation[Media],
    withData: Blob => MediaBundleBuilder[Media],
    withName: String => MediaBundleBuilder[Media]
  ): MediaBundleBuilder[Media] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withData = js.Any.fromFunction1(withData), withName = js.Any.fromFunction1(withName))
    __obj.asInstanceOf[MediaBundleBuilder[Media]]
  }
  
  @scala.inline
  implicit class MediaBundleBuilderMutableBuilder[Self <: MediaBundleBuilder[_], Media] (val x: Self with MediaBundleBuilder[Media]) extends AnyVal {
    
    @scala.inline
    def setWithData(value: Blob => MediaBundleBuilder[Media]): Self = StObject.set(x, "withData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithName(value: String => MediaBundleBuilder[Media]): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
  }
}
