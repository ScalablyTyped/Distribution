package typings.googleAdwordsScripts

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageBuilder[Media] extends AdWordsBuilder[Media] {
  
  def withData(data: Blob): ImageBuilder[Media] = js.native
  
  def withName(name: String): ImageBuilder[Media] = js.native
}
object ImageBuilder {
  
  @scala.inline
  def apply[Media](
    build: () => AdWordsOperation[Media],
    withData: Blob => ImageBuilder[Media],
    withName: String => ImageBuilder[Media]
  ): ImageBuilder[Media] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withData = js.Any.fromFunction1(withData), withName = js.Any.fromFunction1(withName))
    __obj.asInstanceOf[ImageBuilder[Media]]
  }
  
  @scala.inline
  implicit class ImageBuilderMutableBuilder[Self <: ImageBuilder[_], Media] (val x: Self with ImageBuilder[Media]) extends AnyVal {
    
    @scala.inline
    def setWithData(value: Blob => ImageBuilder[Media]): Self = StObject.set(x, "withData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithName(value: String => ImageBuilder[Media]): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
  }
}
