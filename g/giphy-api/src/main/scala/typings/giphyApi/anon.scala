package typings.giphyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Avatarurl extends StObject {
    
    var avatar_url: String
    
    var banner_url: String
    
    var display_name: String
    
    var profile_url: String
    
    var twitter: String
    
    var username: String
  }
  object Avatarurl {
    
    @scala.inline
    def apply(
      avatar_url: String,
      banner_url: String,
      display_name: String,
      profile_url: String,
      twitter: String,
      username: String
    ): Avatarurl = {
      val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], banner_url = banner_url.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], profile_url = profile_url.asInstanceOf[js.Any], twitter = twitter.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Avatarurl]
    }
    
    @scala.inline
    implicit class AvatarurlMutableBuilder[Self <: Avatarurl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBanner_url(value: String): Self = StObject.set(x, "banner_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_url(value: String): Self = StObject.set(x, "profile_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwitter(value: String): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined giphy-api.giphy-api.BaseImage & {  size :string} */
  trait BaseImagesizestring extends StObject {
    
    var height: String
    
    var size: String
    
    var url: String
    
    var width: String
  }
  object BaseImagesizestring {
    
    @scala.inline
    def apply(height: String, size: String, url: String, width: String): BaseImagesizestring = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseImagesizestring]
    }
    
    @scala.inline
    implicit class BaseImagesizestringMutableBuilder[Self <: BaseImagesizestring] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined giphy-api.giphy-api.BaseImage & {  size :string,   frames :string,   mp4 :string,   mp4_size :string,   webp :string,   webp_size :string} */
  trait BaseImagesizestringframes extends StObject {
    
    var frames: String
    
    var height: String
    
    var mp4: String
    
    var mp4_size: String
    
    var size: String
    
    var url: String
    
    var webp: String
    
    var webp_size: String
    
    var width: String
  }
  object BaseImagesizestringframes {
    
    @scala.inline
    def apply(
      frames: String,
      height: String,
      mp4: String,
      mp4_size: String,
      size: String,
      url: String,
      webp: String,
      webp_size: String,
      width: String
    ): BaseImagesizestringframes = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], mp4 = mp4.asInstanceOf[js.Any], mp4_size = mp4_size.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webp = webp.asInstanceOf[js.Any], webp_size = webp_size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseImagesizestringframes]
    }
    
    @scala.inline
    implicit class BaseImagesizestringframesMutableBuilder[Self <: BaseImagesizestringframes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrames(value: String): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMp4(value: String): Self = StObject.set(x, "mp4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMp4_size(value: String): Self = StObject.set(x, "mp4_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebp(value: String): Self = StObject.set(x, "webp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebp_size(value: String): Self = StObject.set(x, "webp_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined giphy-api.giphy-api.BaseImage & {  size :string,   mp4 :string,   mp4_size :string,   webp :string,   webp_size :string} */
  trait BaseImagesizestringmp4str extends StObject {
    
    var height: String
    
    var mp4: String
    
    var mp4_size: String
    
    var size: String
    
    var url: String
    
    var webp: String
    
    var webp_size: String
    
    var width: String
  }
  object BaseImagesizestringmp4str {
    
    @scala.inline
    def apply(
      height: String,
      mp4: String,
      mp4_size: String,
      size: String,
      url: String,
      webp: String,
      webp_size: String,
      width: String
    ): BaseImagesizestringmp4str = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], mp4 = mp4.asInstanceOf[js.Any], mp4_size = mp4_size.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webp = webp.asInstanceOf[js.Any], webp_size = webp_size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseImagesizestringmp4str]
    }
    
    @scala.inline
    implicit class BaseImagesizestringmp4strMutableBuilder[Self <: BaseImagesizestringmp4str] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMp4(value: String): Self = StObject.set(x, "mp4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMp4_size(value: String): Self = StObject.set(x, "mp4_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebp(value: String): Self = StObject.set(x, "webp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebp_size(value: String): Self = StObject.set(x, "webp_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined giphy-api.giphy-api.BaseImage & {  size :string,   webp :string,   webp_size :string} */
  trait BaseImagesizestringwebpst extends StObject {
    
    var height: String
    
    var size: String
    
    var url: String
    
    var webp: String
    
    var webp_size: String
    
    var width: String
  }
  object BaseImagesizestringwebpst {
    
    @scala.inline
    def apply(height: String, size: String, url: String, webp: String, webp_size: String, width: String): BaseImagesizestringwebpst = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webp = webp.asInstanceOf[js.Any], webp_size = webp_size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseImagesizestringwebpst]
    }
    
    @scala.inline
    implicit class BaseImagesizestringwebpstMutableBuilder[Self <: BaseImagesizestringwebpst] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebp(value: String): Self = StObject.set(x, "webp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebp_size(value: String): Self = StObject.set(x, "webp_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Count extends StObject {
    
    var count: Double
    
    var offset: Double
    
    var total_count: Double
  }
  object Count {
    
    @scala.inline
    def apply(count: Double, offset: Double, total_count: Double): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    @scala.inline
    implicit class CountMutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: String
    
    var mp4: String
    
    var mp4_size: String
    
    var width: String
  }
  object Height {
    
    @scala.inline
    def apply(height: String, mp4: String, mp4_size: String, width: String): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], mp4 = mp4.asInstanceOf[js.Any], mp4_size = mp4_size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMp4(value: String): Self = StObject.set(x, "mp4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMp4_size(value: String): Self = StObject.set(x, "mp4_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mp4 extends StObject {
    
    var mp4: String
  }
  object Mp4 {
    
    @scala.inline
    def apply(mp4: String): Mp4 = {
      val __obj = js.Dynamic.literal(mp4 = mp4.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mp4]
    }
    
    @scala.inline
    implicit class Mp4MutableBuilder[Self <: Mp4] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMp4(value: String): Self = StObject.set(x, "mp4", value.asInstanceOf[js.Any])
    }
  }
  
  trait Msg extends StObject {
    
    var msg: String
    
    var response_id: String
    
    var status: Double
  }
  object Msg {
    
    @scala.inline
    def apply(msg: String, response_id: String, status: Double): Msg = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], response_id = response_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Msg]
    }
    
    @scala.inline
    implicit class MsgMutableBuilder[Self <: Msg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse_id(value: String): Self = StObject.set(x, "response_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
