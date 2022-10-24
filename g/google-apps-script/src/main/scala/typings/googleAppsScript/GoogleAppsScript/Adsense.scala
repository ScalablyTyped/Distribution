package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Accounts.Reports.SavedCollection
import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.AccountsCollection
import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.AdclientsCollection
import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.AdunitsCollection
import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.AlertsCollection
import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.CustomchannelsCollection
import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Metadata.DimensionsCollection
import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Metadata.MetricsCollection
import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.MetadataCollection
import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.PaymentsCollection
import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.ReportsCollection
import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.SavedadstylesCollection
import typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.UrlchannelsCollection
import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.Account
import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.Accounts
import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.AdClients
import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.AdCode
import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.AdUnit
import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.AdUnits
import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.AdsenseReportsGenerateResponse
import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.Alerts
import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.CustomChannel
import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.CustomChannels
import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.Payments
import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.SavedAdStyle
import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.SavedAdStyles
import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.SavedReports
import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.UrlChannels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adsense extends StObject {
  
  var Accounts: js.UndefOr[AccountsCollection] = js.undefined
  
  var Adclients: js.UndefOr[AdclientsCollection] = js.undefined
  
  var Adunits: js.UndefOr[AdunitsCollection] = js.undefined
  
  var Alerts: js.UndefOr[AlertsCollection] = js.undefined
  
  var Customchannels: js.UndefOr[CustomchannelsCollection] = js.undefined
  
  var Metadata: js.UndefOr[MetadataCollection] = js.undefined
  
  var Payments: js.UndefOr[PaymentsCollection] = js.undefined
  
  var Reports: js.UndefOr[ReportsCollection] = js.undefined
  
  var Savedadstyles: js.UndefOr[SavedadstylesCollection] = js.undefined
  
  var Urlchannels: js.UndefOr[UrlchannelsCollection] = js.undefined
}
object Adsense {
  
  inline def apply(): Adsense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Adsense]
  }
  
  object Collection {
    
    object Accounts {
      
      @js.native
      trait AdclientsCollection extends StObject {
        
        // Get Auto ad code for a given ad client.
        def getAdCode(accountId: String, adClientId: String): AdCode = js.native
        
        // List all ad clients in the specified account.
        def list(accountId: String): AdClients = js.native
        // List all ad clients in the specified account.
        def list(accountId: String, optionalArgs: js.Object): AdClients = js.native
      }
      
      object Adunits {
        
        @js.native
        trait CustomchannelsCollection extends StObject {
          
          // List all custom channels which the specified ad unit belongs to.
          def list(accountId: String, adClientId: String, adUnitId: String): CustomChannels = js.native
          // List all custom channels which the specified ad unit belongs to.
          def list(accountId: String, adClientId: String, adUnitId: String, optionalArgs: js.Object): CustomChannels = js.native
        }
      }
      
      @js.native
      trait AdunitsCollection extends StObject {
        
        var Customchannels: js.UndefOr[
                typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Accounts.Adunits.CustomchannelsCollection
              ] = js.native
        
        // Gets the specified ad unit in the specified ad client for the specified account.
        def get(accountId: String, adClientId: String, adUnitId: String): AdUnit = js.native
        
        // Get ad code for the specified ad unit.
        def getAdCode(accountId: String, adClientId: String, adUnitId: String): AdCode = js.native
        
        // List all ad units in the specified ad client for the specified account.
        def list(accountId: String, adClientId: String): AdUnits = js.native
        // List all ad units in the specified ad client for the specified account.
        def list(accountId: String, adClientId: String, optionalArgs: js.Object): AdUnits = js.native
      }
      
      @js.native
      trait AlertsCollection extends StObject {
        
        // List the alerts for the specified AdSense account.
        def list(accountId: String): Alerts = js.native
        // List the alerts for the specified AdSense account.
        def list(accountId: String, optionalArgs: js.Object): Alerts = js.native
        
        // Dismiss (delete) the specified alert from the specified publisher AdSense account.
        def remove(accountId: String, alertId: String): Unit = js.native
      }
      
      object Customchannels {
        
        @js.native
        trait AdunitsCollection extends StObject {
          
          // List all ad units in the specified custom channel.
          def list(accountId: String, adClientId: String, customChannelId: String): AdUnits = js.native
          // List all ad units in the specified custom channel.
          def list(accountId: String, adClientId: String, customChannelId: String, optionalArgs: js.Object): AdUnits = js.native
        }
      }
      
      @js.native
      trait CustomchannelsCollection extends StObject {
        
        var Adunits: js.UndefOr[
                typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Accounts.Customchannels.AdunitsCollection
              ] = js.native
        
        // Get the specified custom channel from the specified ad client for the specified account.
        def get(accountId: String, adClientId: String, customChannelId: String): CustomChannel = js.native
        
        // List all custom channels in the specified ad client for the specified account.
        def list(accountId: String, adClientId: String): CustomChannels = js.native
        // List all custom channels in the specified ad client for the specified account.
        def list(accountId: String, adClientId: String, optionalArgs: js.Object): CustomChannels = js.native
      }
      
      trait PaymentsCollection extends StObject {
        
        // List the payments for the specified AdSense account.
        def list(accountId: String): Payments
      }
      object PaymentsCollection {
        
        inline def apply(list: String => Payments): typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Accounts.PaymentsCollection = {
          val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
          __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Accounts.PaymentsCollection]
        }
        
        extension [Self <: typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Accounts.PaymentsCollection](x: Self) {
          
          inline def setList(value: String => Payments): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
        }
      }
      
      object Reports {
        
        @js.native
        trait SavedCollection extends StObject {
          
          // Generate an AdSense report based on the saved report ID sent in the query parameters.
          def generate(accountId: String, savedReportId: String): AdsenseReportsGenerateResponse = js.native
          // Generate an AdSense report based on the saved report ID sent in the query parameters.
          def generate(accountId: String, savedReportId: String, optionalArgs: js.Object): AdsenseReportsGenerateResponse = js.native
          
          // List all saved reports in the specified AdSense account.
          def list(accountId: String): SavedReports = js.native
          // List all saved reports in the specified AdSense account.
          def list(accountId: String, optionalArgs: js.Object): SavedReports = js.native
        }
      }
      
      @js.native
      trait ReportsCollection extends StObject {
        
        var Saved: js.UndefOr[SavedCollection] = js.native
        
        // Generate an AdSense report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format specify "alt=csv" as a query parameter.
        def generate(accountId: String, startDate: String, endDate: String): AdsenseReportsGenerateResponse = js.native
        // Generate an AdSense report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format specify "alt=csv" as a query parameter.
        def generate(accountId: String, startDate: String, endDate: String, optionalArgs: js.Object): AdsenseReportsGenerateResponse = js.native
      }
      
      @js.native
      trait SavedadstylesCollection extends StObject {
        
        // List a specific saved ad style for the specified account.
        def get(accountId: String, savedAdStyleId: String): SavedAdStyle = js.native
        
        // List all saved ad styles in the specified account.
        def list(accountId: String): SavedAdStyles = js.native
        // List all saved ad styles in the specified account.
        def list(accountId: String, optionalArgs: js.Object): SavedAdStyles = js.native
      }
      
      @js.native
      trait UrlchannelsCollection extends StObject {
        
        // List all URL channels in the specified ad client for the specified account.
        def list(accountId: String, adClientId: String): UrlChannels = js.native
        // List all URL channels in the specified ad client for the specified account.
        def list(accountId: String, adClientId: String, optionalArgs: js.Object): UrlChannels = js.native
      }
    }
    
    @js.native
    trait AccountsCollection extends StObject {
      
      var Adclients: js.UndefOr[
            typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Accounts.AdclientsCollection
          ] = js.native
      
      var Adunits: js.UndefOr[
            typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Accounts.AdunitsCollection
          ] = js.native
      
      var Alerts: js.UndefOr[
            typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Accounts.AlertsCollection
          ] = js.native
      
      var Customchannels: js.UndefOr[
            typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Accounts.CustomchannelsCollection
          ] = js.native
      
      var Payments: js.UndefOr[
            typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Accounts.PaymentsCollection
          ] = js.native
      
      var Reports: js.UndefOr[
            typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Accounts.ReportsCollection
          ] = js.native
      
      var Savedadstyles: js.UndefOr[
            typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Accounts.SavedadstylesCollection
          ] = js.native
      
      var Urlchannels: js.UndefOr[
            typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Accounts.UrlchannelsCollection
          ] = js.native
      
      // Get information about the selected AdSense account.
      def get(accountId: String): Account = js.native
      // Get information about the selected AdSense account.
      def get(accountId: String, optionalArgs: js.Object): Account = js.native
      
      // List all accounts available to this AdSense account.
      def list(): Accounts = js.native
      // List all accounts available to this AdSense account.
      def list(optionalArgs: js.Object): Accounts = js.native
    }
    
    @js.native
    trait AdclientsCollection extends StObject {
      
      // List all ad clients in this AdSense account.
      def list(): AdClients = js.native
      // List all ad clients in this AdSense account.
      def list(optionalArgs: js.Object): AdClients = js.native
    }
    
    object Adunits {
      
      @js.native
      trait CustomchannelsCollection extends StObject {
        
        // List all custom channels which the specified ad unit belongs to.
        def list(adClientId: String, adUnitId: String): CustomChannels = js.native
        // List all custom channels which the specified ad unit belongs to.
        def list(adClientId: String, adUnitId: String, optionalArgs: js.Object): CustomChannels = js.native
      }
    }
    
    @js.native
    trait AdunitsCollection extends StObject {
      
      var Customchannels: js.UndefOr[
            typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Adunits.CustomchannelsCollection
          ] = js.native
      
      // Gets the specified ad unit in the specified ad client.
      def get(adClientId: String, adUnitId: String): AdUnit = js.native
      
      // Get ad code for the specified ad unit.
      def getAdCode(adClientId: String, adUnitId: String): AdCode = js.native
      
      // List all ad units in the specified ad client for this AdSense account.
      def list(adClientId: String): AdUnits = js.native
      // List all ad units in the specified ad client for this AdSense account.
      def list(adClientId: String, optionalArgs: js.Object): AdUnits = js.native
    }
    
    @js.native
    trait AlertsCollection extends StObject {
      
      // List the alerts for this AdSense account.
      def list(): Alerts = js.native
      // List the alerts for this AdSense account.
      def list(optionalArgs: js.Object): Alerts = js.native
      
      // Dismiss (delete) the specified alert from the publisher's AdSense account.
      def remove(alertId: String): Unit = js.native
    }
    
    object Customchannels {
      
      @js.native
      trait AdunitsCollection extends StObject {
        
        // List all ad units in the specified custom channel.
        def list(adClientId: String, customChannelId: String): AdUnits = js.native
        // List all ad units in the specified custom channel.
        def list(adClientId: String, customChannelId: String, optionalArgs: js.Object): AdUnits = js.native
      }
    }
    
    @js.native
    trait CustomchannelsCollection extends StObject {
      
      var Adunits: js.UndefOr[
            typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Customchannels.AdunitsCollection
          ] = js.native
      
      // Get the specified custom channel from the specified ad client.
      def get(adClientId: String, customChannelId: String): CustomChannel = js.native
      
      // List all custom channels in the specified ad client for this AdSense account.
      def list(adClientId: String): CustomChannels = js.native
      // List all custom channels in the specified ad client for this AdSense account.
      def list(adClientId: String, optionalArgs: js.Object): CustomChannels = js.native
    }
    
    object Metadata {
      
      trait DimensionsCollection extends StObject {
        
        // List the metadata for the dimensions available to this AdSense account.
        def list(): typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.Metadata
      }
      object DimensionsCollection {
        
        inline def apply(list: () => typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.Metadata): DimensionsCollection = {
          val __obj = js.Dynamic.literal(list = js.Any.fromFunction0(list))
          __obj.asInstanceOf[DimensionsCollection]
        }
        
        extension [Self <: DimensionsCollection](x: Self) {
          
          inline def setList(value: () => typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.Metadata): Self = StObject.set(x, "list", js.Any.fromFunction0(value))
        }
      }
      
      trait MetricsCollection extends StObject {
        
        // List the metadata for the metrics available to this AdSense account.
        def list(): typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.Metadata
      }
      object MetricsCollection {
        
        inline def apply(list: () => typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.Metadata): MetricsCollection = {
          val __obj = js.Dynamic.literal(list = js.Any.fromFunction0(list))
          __obj.asInstanceOf[MetricsCollection]
        }
        
        extension [Self <: MetricsCollection](x: Self) {
          
          inline def setList(value: () => typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.Metadata): Self = StObject.set(x, "list", js.Any.fromFunction0(value))
        }
      }
    }
    
    trait MetadataCollection extends StObject {
      
      var Dimensions: js.UndefOr[DimensionsCollection] = js.undefined
      
      var Metrics: js.UndefOr[MetricsCollection] = js.undefined
    }
    object MetadataCollection {
      
      inline def apply(): MetadataCollection = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MetadataCollection]
      }
      
      extension [Self <: MetadataCollection](x: Self) {
        
        inline def setDimensions(value: DimensionsCollection): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
        
        inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
        
        inline def setMetrics(value: MetricsCollection): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
        
        inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
      }
    }
    
    trait PaymentsCollection extends StObject {
      
      // List the payments for this AdSense account.
      def list(): Payments
    }
    object PaymentsCollection {
      
      inline def apply(list: () => Payments): PaymentsCollection = {
        val __obj = js.Dynamic.literal(list = js.Any.fromFunction0(list))
        __obj.asInstanceOf[PaymentsCollection]
      }
      
      extension [Self <: PaymentsCollection](x: Self) {
        
        inline def setList(value: () => Payments): Self = StObject.set(x, "list", js.Any.fromFunction0(value))
      }
    }
    
    object Reports {
      
      @js.native
      trait SavedCollection extends StObject {
        
        // Generate an AdSense report based on the saved report ID sent in the query parameters.
        def generate(savedReportId: String): AdsenseReportsGenerateResponse = js.native
        // Generate an AdSense report based on the saved report ID sent in the query parameters.
        def generate(savedReportId: String, optionalArgs: js.Object): AdsenseReportsGenerateResponse = js.native
        
        // List all saved reports in this AdSense account.
        def list(): SavedReports = js.native
        // List all saved reports in this AdSense account.
        def list(optionalArgs: js.Object): SavedReports = js.native
      }
    }
    
    @js.native
    trait ReportsCollection extends StObject {
      
      var Saved: js.UndefOr[
            typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Reports.SavedCollection
          ] = js.native
      
      // Generate an AdSense report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format specify "alt=csv" as a query parameter.
      def generate(startDate: String, endDate: String): AdsenseReportsGenerateResponse = js.native
      // Generate an AdSense report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format specify "alt=csv" as a query parameter.
      def generate(startDate: String, endDate: String, optionalArgs: js.Object): AdsenseReportsGenerateResponse = js.native
    }
    
    @js.native
    trait SavedadstylesCollection extends StObject {
      
      // Get a specific saved ad style from the user's account.
      def get(savedAdStyleId: String): SavedAdStyle = js.native
      
      // List all saved ad styles in the user's account.
      def list(): SavedAdStyles = js.native
      // List all saved ad styles in the user's account.
      def list(optionalArgs: js.Object): SavedAdStyles = js.native
    }
    
    @js.native
    trait UrlchannelsCollection extends StObject {
      
      // List all URL channels in the specified ad client for this AdSense account.
      def list(adClientId: String): UrlChannels = js.native
      // List all URL channels in the specified ad client for this AdSense account.
      def list(adClientId: String, optionalArgs: js.Object): UrlChannels = js.native
    }
  }
  
  extension [Self <: Adsense](x: Self) {
    
    inline def setAccounts(value: AccountsCollection): Self = StObject.set(x, "Accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "Accounts", js.undefined)
    
    inline def setAdclients(value: AdclientsCollection): Self = StObject.set(x, "Adclients", value.asInstanceOf[js.Any])
    
    inline def setAdclientsUndefined: Self = StObject.set(x, "Adclients", js.undefined)
    
    inline def setAdunits(value: AdunitsCollection): Self = StObject.set(x, "Adunits", value.asInstanceOf[js.Any])
    
    inline def setAdunitsUndefined: Self = StObject.set(x, "Adunits", js.undefined)
    
    inline def setAlerts(value: AlertsCollection): Self = StObject.set(x, "Alerts", value.asInstanceOf[js.Any])
    
    inline def setAlertsUndefined: Self = StObject.set(x, "Alerts", js.undefined)
    
    inline def setCustomchannels(value: CustomchannelsCollection): Self = StObject.set(x, "Customchannels", value.asInstanceOf[js.Any])
    
    inline def setCustomchannelsUndefined: Self = StObject.set(x, "Customchannels", js.undefined)
    
    inline def setMetadata(value: MetadataCollection): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setPayments(value: PaymentsCollection): Self = StObject.set(x, "Payments", value.asInstanceOf[js.Any])
    
    inline def setPaymentsUndefined: Self = StObject.set(x, "Payments", js.undefined)
    
    inline def setReports(value: ReportsCollection): Self = StObject.set(x, "Reports", value.asInstanceOf[js.Any])
    
    inline def setReportsUndefined: Self = StObject.set(x, "Reports", js.undefined)
    
    inline def setSavedadstyles(value: SavedadstylesCollection): Self = StObject.set(x, "Savedadstyles", value.asInstanceOf[js.Any])
    
    inline def setSavedadstylesUndefined: Self = StObject.set(x, "Savedadstyles", js.undefined)
    
    inline def setUrlchannels(value: UrlchannelsCollection): Self = StObject.set(x, "Urlchannels", value.asInstanceOf[js.Any])
    
    inline def setUrlchannelsUndefined: Self = StObject.set(x, "Urlchannels", js.undefined)
  }
  
  object Schema {
    
    trait Account extends StObject {
      
      var creation_time: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var premium: js.UndefOr[Boolean] = js.undefined
      
      var subAccounts: js.UndefOr[js.Array[Account]] = js.undefined
      
      var timezone: js.UndefOr[String] = js.undefined
    }
    object Account {
      
      inline def apply(): Account = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Account]
      }
      
      extension [Self <: Account](x: Self) {
        
        inline def setCreation_time(value: String): Self = StObject.set(x, "creation_time", value.asInstanceOf[js.Any])
        
        inline def setCreation_timeUndefined: Self = StObject.set(x, "creation_time", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPremium(value: Boolean): Self = StObject.set(x, "premium", value.asInstanceOf[js.Any])
        
        inline def setPremiumUndefined: Self = StObject.set(x, "premium", js.undefined)
        
        inline def setSubAccounts(value: js.Array[Account]): Self = StObject.set(x, "subAccounts", value.asInstanceOf[js.Any])
        
        inline def setSubAccountsUndefined: Self = StObject.set(x, "subAccounts", js.undefined)
        
        inline def setSubAccountsVarargs(value: Account*): Self = StObject.set(x, "subAccounts", js.Array(value*))
        
        inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
        
        inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
      }
    }
    
    trait Accounts extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[Account]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object Accounts {
      
      inline def apply(): Accounts = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Accounts]
      }
      
      extension [Self <: Accounts](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[Account]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Account*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait AdClient extends StObject {
      
      var arcOptIn: js.UndefOr[Boolean] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var productCode: js.UndefOr[String] = js.undefined
      
      var supportsReporting: js.UndefOr[Boolean] = js.undefined
    }
    object AdClient {
      
      inline def apply(): AdClient = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AdClient]
      }
      
      extension [Self <: AdClient](x: Self) {
        
        inline def setArcOptIn(value: Boolean): Self = StObject.set(x, "arcOptIn", value.asInstanceOf[js.Any])
        
        inline def setArcOptInUndefined: Self = StObject.set(x, "arcOptIn", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setProductCode(value: String): Self = StObject.set(x, "productCode", value.asInstanceOf[js.Any])
        
        inline def setProductCodeUndefined: Self = StObject.set(x, "productCode", js.undefined)
        
        inline def setSupportsReporting(value: Boolean): Self = StObject.set(x, "supportsReporting", value.asInstanceOf[js.Any])
        
        inline def setSupportsReportingUndefined: Self = StObject.set(x, "supportsReporting", js.undefined)
      }
    }
    
    trait AdClients extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[AdClient]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object AdClients {
      
      inline def apply(): AdClients = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AdClients]
      }
      
      extension [Self <: AdClients](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[AdClient]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: AdClient*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait AdCode extends StObject {
      
      var adCode: js.UndefOr[String] = js.undefined
      
      var ampBody: js.UndefOr[String] = js.undefined
      
      var ampHead: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
    }
    object AdCode {
      
      inline def apply(): AdCode = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AdCode]
      }
      
      extension [Self <: AdCode](x: Self) {
        
        inline def setAdCode(value: String): Self = StObject.set(x, "adCode", value.asInstanceOf[js.Any])
        
        inline def setAdCodeUndefined: Self = StObject.set(x, "adCode", js.undefined)
        
        inline def setAmpBody(value: String): Self = StObject.set(x, "ampBody", value.asInstanceOf[js.Any])
        
        inline def setAmpBodyUndefined: Self = StObject.set(x, "ampBody", js.undefined)
        
        inline def setAmpHead(value: String): Self = StObject.set(x, "ampHead", value.asInstanceOf[js.Any])
        
        inline def setAmpHeadUndefined: Self = StObject.set(x, "ampHead", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    trait AdStyle extends StObject {
      
      var colors: js.UndefOr[AdStyleColors] = js.undefined
      
      var corners: js.UndefOr[String] = js.undefined
      
      var font: js.UndefOr[AdStyleFont] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
    }
    object AdStyle {
      
      inline def apply(): AdStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AdStyle]
      }
      
      extension [Self <: AdStyle](x: Self) {
        
        inline def setColors(value: AdStyleColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
        
        inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
        
        inline def setCorners(value: String): Self = StObject.set(x, "corners", value.asInstanceOf[js.Any])
        
        inline def setCornersUndefined: Self = StObject.set(x, "corners", js.undefined)
        
        inline def setFont(value: AdStyleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
        
        inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    trait AdStyleColors extends StObject {
      
      var background: js.UndefOr[String] = js.undefined
      
      var border: js.UndefOr[String] = js.undefined
      
      var text: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var url: js.UndefOr[String] = js.undefined
    }
    object AdStyleColors {
      
      inline def apply(): AdStyleColors = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AdStyleColors]
      }
      
      extension [Self <: AdStyleColors](x: Self) {
        
        inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
        
        inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
        
        inline def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
        
        inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    trait AdStyleFont extends StObject {
      
      var family: js.UndefOr[String] = js.undefined
      
      var size: js.UndefOr[String] = js.undefined
    }
    object AdStyleFont {
      
      inline def apply(): AdStyleFont = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AdStyleFont]
      }
      
      extension [Self <: AdStyleFont](x: Self) {
        
        inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
        
        inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
        
        inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      }
    }
    
    trait AdUnit extends StObject {
      
      var code: js.UndefOr[String] = js.undefined
      
      var contentAdsSettings: js.UndefOr[AdUnitContentAdsSettings] = js.undefined
      
      var customStyle: js.UndefOr[AdStyle] = js.undefined
      
      var feedAdsSettings: js.UndefOr[AdUnitFeedAdsSettings] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var mobileContentAdsSettings: js.UndefOr[AdUnitMobileContentAdsSettings] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var savedStyleId: js.UndefOr[String] = js.undefined
      
      var status: js.UndefOr[String] = js.undefined
    }
    object AdUnit {
      
      inline def apply(): AdUnit = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AdUnit]
      }
      
      extension [Self <: AdUnit](x: Self) {
        
        inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
        
        inline def setContentAdsSettings(value: AdUnitContentAdsSettings): Self = StObject.set(x, "contentAdsSettings", value.asInstanceOf[js.Any])
        
        inline def setContentAdsSettingsUndefined: Self = StObject.set(x, "contentAdsSettings", js.undefined)
        
        inline def setCustomStyle(value: AdStyle): Self = StObject.set(x, "customStyle", value.asInstanceOf[js.Any])
        
        inline def setCustomStyleUndefined: Self = StObject.set(x, "customStyle", js.undefined)
        
        inline def setFeedAdsSettings(value: AdUnitFeedAdsSettings): Self = StObject.set(x, "feedAdsSettings", value.asInstanceOf[js.Any])
        
        inline def setFeedAdsSettingsUndefined: Self = StObject.set(x, "feedAdsSettings", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setMobileContentAdsSettings(value: AdUnitMobileContentAdsSettings): Self = StObject.set(x, "mobileContentAdsSettings", value.asInstanceOf[js.Any])
        
        inline def setMobileContentAdsSettingsUndefined: Self = StObject.set(x, "mobileContentAdsSettings", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setSavedStyleId(value: String): Self = StObject.set(x, "savedStyleId", value.asInstanceOf[js.Any])
        
        inline def setSavedStyleIdUndefined: Self = StObject.set(x, "savedStyleId", js.undefined)
        
        inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    trait AdUnitContentAdsSettings extends StObject {
      
      var backupOption: js.UndefOr[AdUnitContentAdsSettingsBackupOption] = js.undefined
      
      var size: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object AdUnitContentAdsSettings {
      
      inline def apply(): AdUnitContentAdsSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AdUnitContentAdsSettings]
      }
      
      extension [Self <: AdUnitContentAdsSettings](x: Self) {
        
        inline def setBackupOption(value: AdUnitContentAdsSettingsBackupOption): Self = StObject.set(x, "backupOption", value.asInstanceOf[js.Any])
        
        inline def setBackupOptionUndefined: Self = StObject.set(x, "backupOption", js.undefined)
        
        inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait AdUnitContentAdsSettingsBackupOption extends StObject {
      
      var color: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var url: js.UndefOr[String] = js.undefined
    }
    object AdUnitContentAdsSettingsBackupOption {
      
      inline def apply(): AdUnitContentAdsSettingsBackupOption = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AdUnitContentAdsSettingsBackupOption]
      }
      
      extension [Self <: AdUnitContentAdsSettingsBackupOption](x: Self) {
        
        inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    trait AdUnitFeedAdsSettings extends StObject {
      
      var adPosition: js.UndefOr[String] = js.undefined
      
      var frequency: js.UndefOr[Double] = js.undefined
      
      var minimumWordCount: js.UndefOr[Double] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object AdUnitFeedAdsSettings {
      
      inline def apply(): AdUnitFeedAdsSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AdUnitFeedAdsSettings]
      }
      
      extension [Self <: AdUnitFeedAdsSettings](x: Self) {
        
        inline def setAdPosition(value: String): Self = StObject.set(x, "adPosition", value.asInstanceOf[js.Any])
        
        inline def setAdPositionUndefined: Self = StObject.set(x, "adPosition", js.undefined)
        
        inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
        
        inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
        
        inline def setMinimumWordCount(value: Double): Self = StObject.set(x, "minimumWordCount", value.asInstanceOf[js.Any])
        
        inline def setMinimumWordCountUndefined: Self = StObject.set(x, "minimumWordCount", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait AdUnitMobileContentAdsSettings extends StObject {
      
      var markupLanguage: js.UndefOr[String] = js.undefined
      
      var scriptingLanguage: js.UndefOr[String] = js.undefined
      
      var size: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object AdUnitMobileContentAdsSettings {
      
      inline def apply(): AdUnitMobileContentAdsSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AdUnitMobileContentAdsSettings]
      }
      
      extension [Self <: AdUnitMobileContentAdsSettings](x: Self) {
        
        inline def setMarkupLanguage(value: String): Self = StObject.set(x, "markupLanguage", value.asInstanceOf[js.Any])
        
        inline def setMarkupLanguageUndefined: Self = StObject.set(x, "markupLanguage", js.undefined)
        
        inline def setScriptingLanguage(value: String): Self = StObject.set(x, "scriptingLanguage", value.asInstanceOf[js.Any])
        
        inline def setScriptingLanguageUndefined: Self = StObject.set(x, "scriptingLanguage", js.undefined)
        
        inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait AdUnits extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[AdUnit]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object AdUnits {
      
      inline def apply(): AdUnits = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AdUnits]
      }
      
      extension [Self <: AdUnits](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[AdUnit]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: AdUnit*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait AdsenseReportsGenerateResponse extends StObject {
      
      var averages: js.UndefOr[js.Array[String]] = js.undefined
      
      var endDate: js.UndefOr[String] = js.undefined
      
      var headers: js.UndefOr[js.Array[AdsenseReportsGenerateResponseHeaders]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var rows: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
      
      var startDate: js.UndefOr[String] = js.undefined
      
      var totalMatchedRows: js.UndefOr[String] = js.undefined
      
      var totals: js.UndefOr[js.Array[String]] = js.undefined
      
      var warnings: js.UndefOr[js.Array[String]] = js.undefined
    }
    object AdsenseReportsGenerateResponse {
      
      inline def apply(): AdsenseReportsGenerateResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AdsenseReportsGenerateResponse]
      }
      
      extension [Self <: AdsenseReportsGenerateResponse](x: Self) {
        
        inline def setAverages(value: js.Array[String]): Self = StObject.set(x, "averages", value.asInstanceOf[js.Any])
        
        inline def setAveragesUndefined: Self = StObject.set(x, "averages", js.undefined)
        
        inline def setAveragesVarargs(value: String*): Self = StObject.set(x, "averages", js.Array(value*))
        
        inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
        
        inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
        
        inline def setHeaders(value: js.Array[AdsenseReportsGenerateResponseHeaders]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        inline def setHeadersVarargs(value: AdsenseReportsGenerateResponseHeaders*): Self = StObject.set(x, "headers", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setRows(value: js.Array[js.Array[String]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        inline def setRowsVarargs(value: js.Array[String]*): Self = StObject.set(x, "rows", js.Array(value*))
        
        inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
        
        inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
        
        inline def setTotalMatchedRows(value: String): Self = StObject.set(x, "totalMatchedRows", value.asInstanceOf[js.Any])
        
        inline def setTotalMatchedRowsUndefined: Self = StObject.set(x, "totalMatchedRows", js.undefined)
        
        inline def setTotals(value: js.Array[String]): Self = StObject.set(x, "totals", value.asInstanceOf[js.Any])
        
        inline def setTotalsUndefined: Self = StObject.set(x, "totals", js.undefined)
        
        inline def setTotalsVarargs(value: String*): Self = StObject.set(x, "totals", js.Array(value*))
        
        inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
        
        inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
        
        inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
      }
    }
    
    trait AdsenseReportsGenerateResponseHeaders extends StObject {
      
      var currency: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object AdsenseReportsGenerateResponseHeaders {
      
      inline def apply(): AdsenseReportsGenerateResponseHeaders = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AdsenseReportsGenerateResponseHeaders]
      }
      
      extension [Self <: AdsenseReportsGenerateResponseHeaders](x: Self) {
        
        inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait Alert extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
      
      var isDismissible: js.UndefOr[Boolean] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var message: js.UndefOr[String] = js.undefined
      
      var severity: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Alert {
      
      inline def apply(): Alert = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Alert]
      }
      
      extension [Self <: Alert](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setIsDismissible(value: Boolean): Self = StObject.set(x, "isDismissible", value.asInstanceOf[js.Any])
        
        inline def setIsDismissibleUndefined: Self = StObject.set(x, "isDismissible", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
        
        inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
        
        inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait Alerts extends StObject {
      
      var items: js.UndefOr[js.Array[Alert]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
    }
    object Alerts {
      
      inline def apply(): Alerts = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Alerts]
      }
      
      extension [Self <: Alerts](x: Self) {
        
        inline def setItems(value: js.Array[Alert]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Alert*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    trait CustomChannel extends StObject {
      
      var code: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var targetingInfo: js.UndefOr[CustomChannelTargetingInfo] = js.undefined
    }
    object CustomChannel {
      
      inline def apply(): CustomChannel = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CustomChannel]
      }
      
      extension [Self <: CustomChannel](x: Self) {
        
        inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setTargetingInfo(value: CustomChannelTargetingInfo): Self = StObject.set(x, "targetingInfo", value.asInstanceOf[js.Any])
        
        inline def setTargetingInfoUndefined: Self = StObject.set(x, "targetingInfo", js.undefined)
      }
    }
    
    trait CustomChannelTargetingInfo extends StObject {
      
      var adsAppearOn: js.UndefOr[String] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var location: js.UndefOr[String] = js.undefined
      
      var siteLanguage: js.UndefOr[String] = js.undefined
    }
    object CustomChannelTargetingInfo {
      
      inline def apply(): CustomChannelTargetingInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CustomChannelTargetingInfo]
      }
      
      extension [Self <: CustomChannelTargetingInfo](x: Self) {
        
        inline def setAdsAppearOn(value: String): Self = StObject.set(x, "adsAppearOn", value.asInstanceOf[js.Any])
        
        inline def setAdsAppearOnUndefined: Self = StObject.set(x, "adsAppearOn", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setSiteLanguage(value: String): Self = StObject.set(x, "siteLanguage", value.asInstanceOf[js.Any])
        
        inline def setSiteLanguageUndefined: Self = StObject.set(x, "siteLanguage", js.undefined)
      }
    }
    
    trait CustomChannels extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[CustomChannel]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object CustomChannels {
      
      inline def apply(): CustomChannels = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CustomChannels]
      }
      
      extension [Self <: CustomChannels](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[CustomChannel]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: CustomChannel*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait Metadata extends StObject {
      
      var items: js.UndefOr[js.Array[ReportingMetadataEntry]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
    }
    object Metadata {
      
      inline def apply(): Metadata = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Metadata]
      }
      
      extension [Self <: Metadata](x: Self) {
        
        inline def setItems(value: js.Array[ReportingMetadataEntry]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: ReportingMetadataEntry*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    trait Payment extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var paymentAmount: js.UndefOr[String] = js.undefined
      
      var paymentAmountCurrencyCode: js.UndefOr[String] = js.undefined
      
      var paymentDate: js.UndefOr[String] = js.undefined
    }
    object Payment {
      
      inline def apply(): Payment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Payment]
      }
      
      extension [Self <: Payment](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setPaymentAmount(value: String): Self = StObject.set(x, "paymentAmount", value.asInstanceOf[js.Any])
        
        inline def setPaymentAmountCurrencyCode(value: String): Self = StObject.set(x, "paymentAmountCurrencyCode", value.asInstanceOf[js.Any])
        
        inline def setPaymentAmountCurrencyCodeUndefined: Self = StObject.set(x, "paymentAmountCurrencyCode", js.undefined)
        
        inline def setPaymentAmountUndefined: Self = StObject.set(x, "paymentAmount", js.undefined)
        
        inline def setPaymentDate(value: String): Self = StObject.set(x, "paymentDate", value.asInstanceOf[js.Any])
        
        inline def setPaymentDateUndefined: Self = StObject.set(x, "paymentDate", js.undefined)
      }
    }
    
    trait Payments extends StObject {
      
      var items: js.UndefOr[js.Array[Payment]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
    }
    object Payments {
      
      inline def apply(): Payments = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Payments]
      }
      
      extension [Self <: Payments](x: Self) {
        
        inline def setItems(value: js.Array[Payment]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Payment*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    trait ReportingMetadataEntry extends StObject {
      
      var compatibleDimensions: js.UndefOr[js.Array[String]] = js.undefined
      
      var compatibleMetrics: js.UndefOr[js.Array[String]] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var requiredDimensions: js.UndefOr[js.Array[String]] = js.undefined
      
      var requiredMetrics: js.UndefOr[js.Array[String]] = js.undefined
      
      var supportedProducts: js.UndefOr[js.Array[String]] = js.undefined
    }
    object ReportingMetadataEntry {
      
      inline def apply(): ReportingMetadataEntry = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReportingMetadataEntry]
      }
      
      extension [Self <: ReportingMetadataEntry](x: Self) {
        
        inline def setCompatibleDimensions(value: js.Array[String]): Self = StObject.set(x, "compatibleDimensions", value.asInstanceOf[js.Any])
        
        inline def setCompatibleDimensionsUndefined: Self = StObject.set(x, "compatibleDimensions", js.undefined)
        
        inline def setCompatibleDimensionsVarargs(value: String*): Self = StObject.set(x, "compatibleDimensions", js.Array(value*))
        
        inline def setCompatibleMetrics(value: js.Array[String]): Self = StObject.set(x, "compatibleMetrics", value.asInstanceOf[js.Any])
        
        inline def setCompatibleMetricsUndefined: Self = StObject.set(x, "compatibleMetrics", js.undefined)
        
        inline def setCompatibleMetricsVarargs(value: String*): Self = StObject.set(x, "compatibleMetrics", js.Array(value*))
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setRequiredDimensions(value: js.Array[String]): Self = StObject.set(x, "requiredDimensions", value.asInstanceOf[js.Any])
        
        inline def setRequiredDimensionsUndefined: Self = StObject.set(x, "requiredDimensions", js.undefined)
        
        inline def setRequiredDimensionsVarargs(value: String*): Self = StObject.set(x, "requiredDimensions", js.Array(value*))
        
        inline def setRequiredMetrics(value: js.Array[String]): Self = StObject.set(x, "requiredMetrics", value.asInstanceOf[js.Any])
        
        inline def setRequiredMetricsUndefined: Self = StObject.set(x, "requiredMetrics", js.undefined)
        
        inline def setRequiredMetricsVarargs(value: String*): Self = StObject.set(x, "requiredMetrics", js.Array(value*))
        
        inline def setSupportedProducts(value: js.Array[String]): Self = StObject.set(x, "supportedProducts", value.asInstanceOf[js.Any])
        
        inline def setSupportedProductsUndefined: Self = StObject.set(x, "supportedProducts", js.undefined)
        
        inline def setSupportedProductsVarargs(value: String*): Self = StObject.set(x, "supportedProducts", js.Array(value*))
      }
    }
    
    trait SavedAdStyle extends StObject {
      
      var adStyle: js.UndefOr[AdStyle] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
    }
    object SavedAdStyle {
      
      inline def apply(): SavedAdStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SavedAdStyle]
      }
      
      extension [Self <: SavedAdStyle](x: Self) {
        
        inline def setAdStyle(value: AdStyle): Self = StObject.set(x, "adStyle", value.asInstanceOf[js.Any])
        
        inline def setAdStyleUndefined: Self = StObject.set(x, "adStyle", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait SavedAdStyles extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[SavedAdStyle]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object SavedAdStyles {
      
      inline def apply(): SavedAdStyles = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SavedAdStyles]
      }
      
      extension [Self <: SavedAdStyles](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[SavedAdStyle]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: SavedAdStyle*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait SavedReport extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
    }
    object SavedReport {
      
      inline def apply(): SavedReport = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SavedReport]
      }
      
      extension [Self <: SavedReport](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait SavedReports extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[SavedReport]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object SavedReports {
      
      inline def apply(): SavedReports = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SavedReports]
      }
      
      extension [Self <: SavedReports](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[SavedReport]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: SavedReport*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait UrlChannel extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var urlPattern: js.UndefOr[String] = js.undefined
    }
    object UrlChannel {
      
      inline def apply(): UrlChannel = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UrlChannel]
      }
      
      extension [Self <: UrlChannel](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setUrlPattern(value: String): Self = StObject.set(x, "urlPattern", value.asInstanceOf[js.Any])
        
        inline def setUrlPatternUndefined: Self = StObject.set(x, "urlPattern", js.undefined)
      }
    }
    
    trait UrlChannels extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[UrlChannel]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object UrlChannels {
      
      inline def apply(): UrlChannels = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UrlChannels]
      }
      
      extension [Self <: UrlChannels](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[UrlChannel]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: UrlChannel*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
  }
}
