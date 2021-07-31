package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorSuggestionsAvailability extends StObject {
  
  /**
    * This value indicates whether video editing suggestions, which might improve video quality or the playback experience, are available for the video. You can retrieve these suggestions by requesting the suggestions part in your videos.list() request.
    */
  var editorSuggestionsAvailability: String
  
  /**
    * The reason that YouTube failed to process the video. This property will only have a value if the processingStatus propertys value is failed.
    */
  var fileDetailsAvailability: String
  
  var processingFailureReason: String
  
  /**
    * This value indicates whether file details are available for the uploaded video. You can retrieve a videos file details by requesting the fileDetails part in your videos.list() request.
    */
  var processingIssuesAvailability: String
  
  /**
    * The processingProgress object contains information about the progress YouTube has made in processing the video. The values are really only relevant if the videos processing status is processing.
    */
  var processingProgress: PartsProcessed
  
  /**
    * The videos processing status. This value indicates whether YouTube was able to process the video or if the video is still being processed.
    */
  var processingStatus: String
  
  /**
    * This value indicates whether keyword (tag) suggestions are available for the video. Tags can be added to a videos metadata to make it easier for other users to find the video. You can retrieve these suggestions by requesting the suggestions part in your videos.list() request.
    */
  var tagSuggestionsAvailability: String
  
  /**
    * This value indicates whether thumbnail images have been generated for the video.
    */
  var thumbnailsAvailability: String
}
object EditorSuggestionsAvailability {
  
  @scala.inline
  def apply(
    editorSuggestionsAvailability: String,
    fileDetailsAvailability: String,
    processingFailureReason: String,
    processingIssuesAvailability: String,
    processingProgress: PartsProcessed,
    processingStatus: String,
    tagSuggestionsAvailability: String,
    thumbnailsAvailability: String
  ): EditorSuggestionsAvailability = {
    val __obj = js.Dynamic.literal(editorSuggestionsAvailability = editorSuggestionsAvailability.asInstanceOf[js.Any], fileDetailsAvailability = fileDetailsAvailability.asInstanceOf[js.Any], processingFailureReason = processingFailureReason.asInstanceOf[js.Any], processingIssuesAvailability = processingIssuesAvailability.asInstanceOf[js.Any], processingProgress = processingProgress.asInstanceOf[js.Any], processingStatus = processingStatus.asInstanceOf[js.Any], tagSuggestionsAvailability = tagSuggestionsAvailability.asInstanceOf[js.Any], thumbnailsAvailability = thumbnailsAvailability.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorSuggestionsAvailability]
  }
  
  @scala.inline
  implicit class EditorSuggestionsAvailabilityMutableBuilder[Self <: EditorSuggestionsAvailability] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEditorSuggestionsAvailability(value: String): Self = StObject.set(x, "editorSuggestionsAvailability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileDetailsAvailability(value: String): Self = StObject.set(x, "fileDetailsAvailability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingFailureReason(value: String): Self = StObject.set(x, "processingFailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingIssuesAvailability(value: String): Self = StObject.set(x, "processingIssuesAvailability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingProgress(value: PartsProcessed): Self = StObject.set(x, "processingProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingStatus(value: String): Self = StObject.set(x, "processingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSuggestionsAvailability(value: String): Self = StObject.set(x, "tagSuggestionsAvailability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailsAvailability(value: String): Self = StObject.set(x, "thumbnailsAvailability", value.asInstanceOf[js.Any])
  }
}
