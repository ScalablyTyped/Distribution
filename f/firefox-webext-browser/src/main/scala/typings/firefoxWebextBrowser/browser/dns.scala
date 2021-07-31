package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Asynchronous DNS API
  *
  * Permissions: `dns`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object dns {
  
  /* dns types */
  /** An object encapsulating a DNS Record. */
  trait DNSRecord extends StObject {
    
    var addresses: js.Array[String]
    
    /**
      * The canonical hostname for this record. this value is empty if the record was not fetched with the 'canonical_name' flag.
      */
    var canonicalName: js.UndefOr[String] = js.undefined
    
    /** Record retreived with TRR. */
    var isTRR: String
  }
  object DNSRecord {
    
    @scala.inline
    def apply(addresses: js.Array[String], isTRR: String): DNSRecord = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], isTRR = isTRR.asInstanceOf[js.Any])
      __obj.asInstanceOf[DNSRecord]
    }
    
    @scala.inline
    implicit class DNSRecordMutableBuilder[Self <: DNSRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value :_*))
      
      @scala.inline
      def setCanonicalName(value: String): Self = StObject.set(x, "canonicalName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanonicalNameUndefined: Self = StObject.set(x, "canonicalName", js.undefined)
      
      @scala.inline
      def setIsTRR(value: String): Self = StObject.set(x, "isTRR", value.asInstanceOf[js.Any])
    }
  }
  
  type ResolveFlags = js.Array[_ResolveFlags]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_name_collisions
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bypass_cache
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.canonical_name
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_ipv4
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_ipv6
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_trr
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.offline
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.priority_low
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.priority_medium
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.speculate
  */
  trait _ResolveFlags extends StObject
  object _ResolveFlags {
    
    @scala.inline
    def allow_name_collisions: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_name_collisions = "allow_name_collisions".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_name_collisions]
    
    @scala.inline
    def bypass_cache: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bypass_cache = "bypass_cache".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bypass_cache]
    
    @scala.inline
    def canonical_name: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.canonical_name = "canonical_name".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.canonical_name]
    
    @scala.inline
    def disable_ipv4: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_ipv4 = "disable_ipv4".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_ipv4]
    
    @scala.inline
    def disable_ipv6: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_ipv6 = "disable_ipv6".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_ipv6]
    
    @scala.inline
    def disable_trr: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_trr = "disable_trr".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_trr]
    
    @scala.inline
    def offline: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.offline = "offline".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.offline]
    
    @scala.inline
    def priority_low: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.priority_low = "priority_low".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.priority_low]
    
    @scala.inline
    def priority_medium: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.priority_medium = "priority_medium".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.priority_medium]
    
    @scala.inline
    def speculate: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.speculate = "speculate".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.speculate]
  }
}
