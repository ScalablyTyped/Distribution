package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.contextualIdentities` API to query and modify contextual identity, also called as containers.
  *
  * Permissions: `contextualIdentities`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object contextualIdentities {
  
  /* contextualIdentities types */
  /** Represents information about a contextual identity. */
  @js.native
  trait ContextualIdentity extends StObject {
    
    /** The color name of the contextual identity. */
    var color: String = js.native
    
    /** The color hash of the contextual identity. */
    var colorCode: String = js.native
    
    /** The cookie store ID of the contextual identity. */
    var cookieStoreId: String = js.native
    
    /** The icon name of the contextual identity. */
    var icon: String = js.native
    
    /** The icon url of the contextual identity. */
    var iconUrl: String = js.native
    
    /** The name of the contextual identity. */
    var name: String = js.native
  }
  object ContextualIdentity {
    
    @scala.inline
    def apply(
      color: String,
      colorCode: String,
      cookieStoreId: String,
      icon: String,
      iconUrl: String,
      name: String
    ): ContextualIdentity = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colorCode = colorCode.asInstanceOf[js.Any], cookieStoreId = cookieStoreId.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextualIdentity]
    }
    
    @scala.inline
    implicit class ContextualIdentityMutableBuilder[Self <: ContextualIdentity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorCode(value: String): Self = StObject.set(x, "colorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieStoreId(value: String): Self = StObject.set(x, "cookieStoreId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /** Details about the contextual identity being created. */
  @js.native
  trait CreateDetails extends StObject {
    
    /** The color of the contextual identity. */
    var color: String = js.native
    
    /** The icon of the contextual identity. */
    var icon: String = js.native
    
    /** The name of the contextual identity. */
    var name: String = js.native
  }
  object CreateDetails {
    
    @scala.inline
    def apply(color: String, icon: String, name: String): CreateDetails = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateDetails]
    }
    
    @scala.inline
    implicit class CreateDetailsMutableBuilder[Self <: CreateDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnCreatedChangeInfo extends StObject {
    
    /** Contextual identity that has been created */
    var contextualIdentity: ContextualIdentity = js.native
  }
  object OnCreatedChangeInfo {
    
    @scala.inline
    def apply(contextualIdentity: ContextualIdentity): OnCreatedChangeInfo = {
      val __obj = js.Dynamic.literal(contextualIdentity = contextualIdentity.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnCreatedChangeInfo]
    }
    
    @scala.inline
    implicit class OnCreatedChangeInfoMutableBuilder[Self <: OnCreatedChangeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContextualIdentity(value: ContextualIdentity): Self = StObject.set(x, "contextualIdentity", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnRemovedChangeInfo extends StObject {
    
    /** Contextual identity that has been removed */
    var contextualIdentity: ContextualIdentity = js.native
  }
  object OnRemovedChangeInfo {
    
    @scala.inline
    def apply(contextualIdentity: ContextualIdentity): OnRemovedChangeInfo = {
      val __obj = js.Dynamic.literal(contextualIdentity = contextualIdentity.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnRemovedChangeInfo]
    }
    
    @scala.inline
    implicit class OnRemovedChangeInfoMutableBuilder[Self <: OnRemovedChangeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContextualIdentity(value: ContextualIdentity): Self = StObject.set(x, "contextualIdentity", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnUpdatedChangeInfo extends StObject {
    
    /** Contextual identity that has been updated */
    var contextualIdentity: ContextualIdentity = js.native
  }
  object OnUpdatedChangeInfo {
    
    @scala.inline
    def apply(contextualIdentity: ContextualIdentity): OnUpdatedChangeInfo = {
      val __obj = js.Dynamic.literal(contextualIdentity = contextualIdentity.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnUpdatedChangeInfo]
    }
    
    @scala.inline
    implicit class OnUpdatedChangeInfoMutableBuilder[Self <: OnUpdatedChangeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContextualIdentity(value: ContextualIdentity): Self = StObject.set(x, "contextualIdentity", value.asInstanceOf[js.Any])
    }
  }
  
  /** Information to filter the contextual identities being retrieved. */
  @js.native
  trait QueryDetails extends StObject {
    
    /** Filters the contextual identity by name. */
    var name: js.UndefOr[String] = js.native
  }
  object QueryDetails {
    
    @scala.inline
    def apply(): QueryDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryDetails]
    }
    
    @scala.inline
    implicit class QueryDetailsMutableBuilder[Self <: QueryDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  /** Details about the contextual identity being created. */
  @js.native
  trait UpdateDetails extends StObject {
    
    /** The color of the contextual identity. */
    var color: js.UndefOr[String] = js.native
    
    /** The icon of the contextual identity. */
    var icon: js.UndefOr[String] = js.native
    
    /** The name of the contextual identity. */
    var name: js.UndefOr[String] = js.native
  }
  object UpdateDetails {
    
    @scala.inline
    def apply(): UpdateDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateDetails]
    }
    
    @scala.inline
    implicit class UpdateDetailsMutableBuilder[Self <: UpdateDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
