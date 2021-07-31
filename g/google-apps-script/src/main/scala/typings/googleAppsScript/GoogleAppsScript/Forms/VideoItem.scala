package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A layout item that displays a video. Items can be accessed or created from a Form.
  *
  *     // Open a form by ID and add three new video items, using a long URL,
  *     // a short URL, and a video ID.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     form.addVideoItem()
  *         .setTitle('Video Title')
  *         .setHelpText('Video Caption')
  *         .setVideoUrl('www.youtube.com/watch?v=1234abcdxyz');
  *
  *     form.addVideoItem()
  *         .setTitle('Video Title')
  *         .setHelpText('Video Caption')
  *         .setVideoUrl('youtu.be/1234abcdxyz');
  *
  *     form.addVideoItem()
  *         .setTitle('Video Title')
  *         .setHelpText('Video Caption')
  *         .setVideoUrl('1234abcdxyz');
  */
trait VideoItem extends StObject {
  
  def duplicate(): VideoItem
  
  def getAlignment(): Alignment
  
  def getHelpText(): String
  
  def getId(): Integer
  
  def getIndex(): Integer
  
  def getTitle(): String
  
  def getType(): ItemType
  
  def getWidth(): Integer
  
  def setAlignment(alignment: Alignment): VideoItem
  
  def setHelpText(text: String): VideoItem
  
  def setTitle(title: String): VideoItem
  
  def setVideoUrl(youtubeUrl: String): VideoItem
  
  def setWidth(width: Integer): VideoItem
}
object VideoItem {
  
  @scala.inline
  def apply(
    duplicate: () => VideoItem,
    getAlignment: () => Alignment,
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getTitle: () => String,
    getType: () => ItemType,
    getWidth: () => Integer,
    setAlignment: Alignment => VideoItem,
    setHelpText: String => VideoItem,
    setTitle: String => VideoItem,
    setVideoUrl: String => VideoItem,
    setWidth: Integer => VideoItem
  ): VideoItem = {
    val __obj = js.Dynamic.literal(duplicate = js.Any.fromFunction0(duplicate), getAlignment = js.Any.fromFunction0(getAlignment), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), getWidth = js.Any.fromFunction0(getWidth), setAlignment = js.Any.fromFunction1(setAlignment), setHelpText = js.Any.fromFunction1(setHelpText), setTitle = js.Any.fromFunction1(setTitle), setVideoUrl = js.Any.fromFunction1(setVideoUrl), setWidth = js.Any.fromFunction1(setWidth))
    __obj.asInstanceOf[VideoItem]
  }
  
  @scala.inline
  implicit class VideoItemMutableBuilder[Self <: VideoItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuplicate(value: () => VideoItem): Self = StObject.set(x, "duplicate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAlignment(value: () => Alignment): Self = StObject.set(x, "getAlignment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHelpText(value: () => String): Self = StObject.set(x, "getHelpText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => Integer): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndex(value: () => Integer): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => ItemType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWidth(value: () => Integer): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAlignment(value: Alignment => VideoItem): Self = StObject.set(x, "setAlignment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHelpText(value: String => VideoItem): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitle(value: String => VideoItem): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVideoUrl(value: String => VideoItem): Self = StObject.set(x, "setVideoUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWidth(value: Integer => VideoItem): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
  }
}
