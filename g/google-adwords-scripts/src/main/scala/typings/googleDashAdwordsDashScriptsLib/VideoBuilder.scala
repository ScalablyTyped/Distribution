package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoBuilder[Media] extends AdWordsBuilder[Media] {
  def withYouTubeVideoId(youTubeVideoId: java.lang.String): VideoBuilder[Media]
}

object VideoBuilder {
  @scala.inline
  def apply[Media](build: () => AdWordsOperation[Media], withYouTubeVideoId: java.lang.String => VideoBuilder[Media]): VideoBuilder[Media] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withYouTubeVideoId = js.Any.fromFunction1(withYouTubeVideoId))
  
    __obj.asInstanceOf[VideoBuilder[Media]]
  }
}

