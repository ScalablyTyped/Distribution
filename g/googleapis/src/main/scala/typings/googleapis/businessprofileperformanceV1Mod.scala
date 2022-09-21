package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.googleapisCommon.mod.BaseExternalAccountClient
import typings.googleapisCommon.mod.Compute
import typings.googleapisCommon.mod.GoogleAuth
import typings.googleapisCommon.mod.JWT
import typings.googleapisCommon.mod.OAuth2Client
import typings.googleapisCommon.mod.UserRefreshClient
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object businessprofileperformanceV1Mod {
  
  object businessprofileperformanceV1 {
    
    @JSImport("googleapis/build/src/apis/businessprofileperformance/v1", "businessprofileperformance_v1.Businessprofileperformance")
    @js.native
    open class Businessprofileperformance protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var locations: ResourceLocations = js.native
    }
    
    @JSImport("googleapis/build/src/apis/businessprofileperformance/v1", "businessprofileperformance_v1.Resource$Locations")
    @js.native
    open class ResourceLocations protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def getDailyMetricsTimeSeries(): GaxiosPromise[SchemaGetDailyMetricsTimeSeriesResponse] = js.native
      def getDailyMetricsTimeSeries(callback: BodyResponseCallback[SchemaGetDailyMetricsTimeSeriesResponse]): Unit = js.native
      def getDailyMetricsTimeSeries(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetDailyMetricsTimeSeriesResponse] = js.native
      def getDailyMetricsTimeSeries(params: ParamsResourceLocationsGetdailymetricstimeseries): GaxiosPromise[SchemaGetDailyMetricsTimeSeriesResponse] = js.native
      def getDailyMetricsTimeSeries(
        params: ParamsResourceLocationsGetdailymetricstimeseries,
        callback: BodyResponseCallback[SchemaGetDailyMetricsTimeSeriesResponse]
      ): Unit = js.native
      def getDailyMetricsTimeSeries(
        params: ParamsResourceLocationsGetdailymetricstimeseries,
        options: BodyResponseCallback[Readable | SchemaGetDailyMetricsTimeSeriesResponse],
        callback: BodyResponseCallback[Readable | SchemaGetDailyMetricsTimeSeriesResponse]
      ): Unit = js.native
      def getDailyMetricsTimeSeries(params: ParamsResourceLocationsGetdailymetricstimeseries, options: MethodOptions): GaxiosPromise[SchemaGetDailyMetricsTimeSeriesResponse] = js.native
      def getDailyMetricsTimeSeries(
        params: ParamsResourceLocationsGetdailymetricstimeseries,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGetDailyMetricsTimeSeriesResponse]
      ): Unit = js.native
      /**
        *  Returns the values for each date from a given time range that are associated with the specific daily metric. Example request: `GET https://businessprofileperformance.googleapis.com/v1/locations/12345:getDailyMetricsTimeSeries?dailyMetric=WEBSITE_CLICKS&daily_range.start_date.year=2022&daily_range.start_date.month=1&daily_range.start_date.day=1&daily_range.end_date.year=2022&daily_range.end_date.month=3&daily_range.end_date.day=31`
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/businessprofileperformance.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const businessprofileperformance = google.businessprofileperformance('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res =
        *     await businessprofileperformance.locations.getDailyMetricsTimeSeries({
        *       // Required. The metric to retrieve time series.
        *       dailyMetric: 'placeholder-value',
        *       // Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
        *       'dailyRange.endDate.day': 'placeholder-value',
        *       // Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
        *       'dailyRange.endDate.month': 'placeholder-value',
        *       // Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
        *       'dailyRange.endDate.year': 'placeholder-value',
        *       // Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
        *       'dailyRange.startDate.day': 'placeholder-value',
        *       // Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
        *       'dailyRange.startDate.month': 'placeholder-value',
        *       // Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
        *       'dailyRange.startDate.year': 'placeholder-value',
        *       // Represents the day of the week. Eg: MONDAY.
        *       'dailySubEntityType.dayOfWeek': 'placeholder-value',
        *       // Hours of day in 24 hour format. Should be from 0 to 23. An API may choose to allow the value "24:00:00" for scenarios like business closing time.
        *       'dailySubEntityType.timeOfDay.hours': 'placeholder-value',
        *       // Minutes of hour of day. Must be from 0 to 59.
        *       'dailySubEntityType.timeOfDay.minutes': 'placeholder-value',
        *       // Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
        *       'dailySubEntityType.timeOfDay.nanos': 'placeholder-value',
        *       // Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if it allows leap-seconds.
        *       'dailySubEntityType.timeOfDay.seconds': 'placeholder-value',
        *       // Required. The location for which the time series should be fetched. Format: locations/{location_id\} where location_id is an unobfuscated listing id.
        *       name: 'locations/my-location',
        *     });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "timeSeries": {}
        *   // }
        * }
        *
        * main().catch(e => {
        *   console.error(e);
        *   throw e;
        * });
        *
        * ```
        *
        * @param params - Parameters for request
        * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param callback - Optional callback that handles the response.
        * @returns A promise if used with async/await, or void if used with a callback.
        */
      def getDailyMetricsTimeSeries(params: ParamsResourceLocationsGetdailymetricstimeseries, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def getDailyMetricsTimeSeries(
        params: ParamsResourceLocationsGetdailymetricstimeseries,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      var searchkeywords: ResourceLocationsSearchkeywords = js.native
    }
    
    @JSImport("googleapis/build/src/apis/businessprofileperformance/v1", "businessprofileperformance_v1.Resource$Locations$Searchkeywords")
    @js.native
    open class ResourceLocationsSearchkeywords protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      var impressions: ResourceLocationsSearchkeywordsImpressions = js.native
    }
    
    @JSImport("googleapis/build/src/apis/businessprofileperformance/v1", "businessprofileperformance_v1.Resource$Locations$Searchkeywords$Impressions")
    @js.native
    open class ResourceLocationsSearchkeywordsImpressions protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      var monthly: ResourceLocationsSearchkeywordsImpressionsMonthly = js.native
    }
    
    @JSImport("googleapis/build/src/apis/businessprofileperformance/v1", "businessprofileperformance_v1.Resource$Locations$Searchkeywords$Impressions$Monthly")
    @js.native
    open class ResourceLocationsSearchkeywordsImpressionsMonthly protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def list(): GaxiosPromise[SchemaListSearchKeywordImpressionsMonthlyResponse] = js.native
      def list(callback: BodyResponseCallback[SchemaListSearchKeywordImpressionsMonthlyResponse]): Unit = js.native
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSearchKeywordImpressionsMonthlyResponse] = js.native
      def list(params: ParamsResourceLocationsSearchkeywordsImpressionsMonthlyList): GaxiosPromise[SchemaListSearchKeywordImpressionsMonthlyResponse] = js.native
      def list(
        params: ParamsResourceLocationsSearchkeywordsImpressionsMonthlyList,
        callback: BodyResponseCallback[SchemaListSearchKeywordImpressionsMonthlyResponse]
      ): Unit = js.native
      def list(
        params: ParamsResourceLocationsSearchkeywordsImpressionsMonthlyList,
        options: BodyResponseCallback[Readable | SchemaListSearchKeywordImpressionsMonthlyResponse],
        callback: BodyResponseCallback[Readable | SchemaListSearchKeywordImpressionsMonthlyResponse]
      ): Unit = js.native
      def list(params: ParamsResourceLocationsSearchkeywordsImpressionsMonthlyList, options: MethodOptions): GaxiosPromise[SchemaListSearchKeywordImpressionsMonthlyResponse] = js.native
      def list(
        params: ParamsResourceLocationsSearchkeywordsImpressionsMonthlyList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaListSearchKeywordImpressionsMonthlyResponse]
      ): Unit = js.native
      /**
        * Returns the search keywords used to find a business in search or maps. Each search keyword is accompanied by impressions which are aggregated on a monthly basis. Example request: `GET https://businessprofileperformance.googleapis.com/v1/locations/12345/searchkeywords/impressions/monthly?monthly_range.start_month.year=2022&monthly_range.start_month.month=1&monthly_range.end_month.year=2022&monthly_range.end_month.month=3`
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/businessprofileperformance.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const businessprofileperformance = google.businessprofileperformance('v1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: [],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res =
        *     await businessprofileperformance.locations.searchkeywords.impressions.monthly.list(
        *       {
        *         // Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
        *         'monthlyRange.endMonth.day': 'placeholder-value',
        *         // Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
        *         'monthlyRange.endMonth.month': 'placeholder-value',
        *         // Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
        *         'monthlyRange.endMonth.year': 'placeholder-value',
        *         // Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
        *         'monthlyRange.startMonth.day': 'placeholder-value',
        *         // Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
        *         'monthlyRange.startMonth.month': 'placeholder-value',
        *         // Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
        *         'monthlyRange.startMonth.year': 'placeholder-value',
        *         // Optional. The number of results requested. The default page size is 100. Page size can be set to a maximum of 100.
        *         pageSize: 'placeholder-value',
        *         // Optional. A token indicating the next paginated result to be returned.
        *         pageToken: 'placeholder-value',
        *         // Required. The location for which the time series should be fetched. Format: locations/{location_id\} where location_id is an unobfuscated listing id.
        *         parent: 'locations/my-location',
        *       }
        *     );
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "nextPageToken": "my_nextPageToken",
        *   //   "searchKeywordsCounts": []
        *   // }
        * }
        *
        * main().catch(e => {
        *   console.error(e);
        *   throw e;
        * });
        *
        * ```
        *
        * @param params - Parameters for request
        * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param callback - Optional callback that handles the response.
        * @returns A promise if used with async/await, or void if used with a callback.
        */
      def list(params: ParamsResourceLocationsSearchkeywordsImpressionsMonthlyList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def list(
        params: ParamsResourceLocationsSearchkeywordsImpressionsMonthlyList,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v1
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v1")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourceLocationsGetdailymetricstimeseries
      extends StObject
         with StandardParameters {
      
      /**
        * Required. The metric to retrieve time series.
        */
      var dailyMetric: js.UndefOr[String] = js.undefined
      
      /**
        * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
        */
      @JSName("dailyRange.endDate.day")
      var dailyRangeDotendDateDotday: js.UndefOr[Double] = js.undefined
      
      /**
        * Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
        */
      @JSName("dailyRange.endDate.month")
      var dailyRangeDotendDateDotmonth: js.UndefOr[Double] = js.undefined
      
      /**
        * Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
        */
      @JSName("dailyRange.endDate.year")
      var dailyRangeDotendDateDotyear: js.UndefOr[Double] = js.undefined
      
      /**
        * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
        */
      @JSName("dailyRange.startDate.day")
      var dailyRangeDotstartDateDotday: js.UndefOr[Double] = js.undefined
      
      /**
        * Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
        */
      @JSName("dailyRange.startDate.month")
      var dailyRangeDotstartDateDotmonth: js.UndefOr[Double] = js.undefined
      
      /**
        * Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
        */
      @JSName("dailyRange.startDate.year")
      var dailyRangeDotstartDateDotyear: js.UndefOr[Double] = js.undefined
      
      /**
        * Represents the day of the week. Eg: MONDAY.
        */
      @JSName("dailySubEntityType.dayOfWeek")
      var dailySubEntityTypeDotdayOfWeek: js.UndefOr[String] = js.undefined
      
      /**
        * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose to allow the value "24:00:00" for scenarios like business closing time.
        */
      @JSName("dailySubEntityType.timeOfDay.hours")
      var dailySubEntityTypeDottimeOfDayDothours: js.UndefOr[Double] = js.undefined
      
      /**
        * Minutes of hour of day. Must be from 0 to 59.
        */
      @JSName("dailySubEntityType.timeOfDay.minutes")
      var dailySubEntityTypeDottimeOfDayDotminutes: js.UndefOr[Double] = js.undefined
      
      /**
        * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
        */
      @JSName("dailySubEntityType.timeOfDay.nanos")
      var dailySubEntityTypeDottimeOfDayDotnanos: js.UndefOr[Double] = js.undefined
      
      /**
        * Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if it allows leap-seconds.
        */
      @JSName("dailySubEntityType.timeOfDay.seconds")
      var dailySubEntityTypeDottimeOfDayDotseconds: js.UndefOr[Double] = js.undefined
      
      /**
        * Required. The location for which the time series should be fetched. Format: locations/{location_id\} where location_id is an unobfuscated listing id.
        */
      var name: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceLocationsGetdailymetricstimeseries {
      
      inline def apply(): ParamsResourceLocationsGetdailymetricstimeseries = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLocationsGetdailymetricstimeseries]
      }
      
      extension [Self <: ParamsResourceLocationsGetdailymetricstimeseries](x: Self) {
        
        inline def setDailyMetric(value: String): Self = StObject.set(x, "dailyMetric", value.asInstanceOf[js.Any])
        
        inline def setDailyMetricUndefined: Self = StObject.set(x, "dailyMetric", js.undefined)
        
        inline def setDailyRangeDotendDateDotday(value: Double): Self = StObject.set(x, "dailyRange.endDate.day", value.asInstanceOf[js.Any])
        
        inline def setDailyRangeDotendDateDotdayUndefined: Self = StObject.set(x, "dailyRange.endDate.day", js.undefined)
        
        inline def setDailyRangeDotendDateDotmonth(value: Double): Self = StObject.set(x, "dailyRange.endDate.month", value.asInstanceOf[js.Any])
        
        inline def setDailyRangeDotendDateDotmonthUndefined: Self = StObject.set(x, "dailyRange.endDate.month", js.undefined)
        
        inline def setDailyRangeDotendDateDotyear(value: Double): Self = StObject.set(x, "dailyRange.endDate.year", value.asInstanceOf[js.Any])
        
        inline def setDailyRangeDotendDateDotyearUndefined: Self = StObject.set(x, "dailyRange.endDate.year", js.undefined)
        
        inline def setDailyRangeDotstartDateDotday(value: Double): Self = StObject.set(x, "dailyRange.startDate.day", value.asInstanceOf[js.Any])
        
        inline def setDailyRangeDotstartDateDotdayUndefined: Self = StObject.set(x, "dailyRange.startDate.day", js.undefined)
        
        inline def setDailyRangeDotstartDateDotmonth(value: Double): Self = StObject.set(x, "dailyRange.startDate.month", value.asInstanceOf[js.Any])
        
        inline def setDailyRangeDotstartDateDotmonthUndefined: Self = StObject.set(x, "dailyRange.startDate.month", js.undefined)
        
        inline def setDailyRangeDotstartDateDotyear(value: Double): Self = StObject.set(x, "dailyRange.startDate.year", value.asInstanceOf[js.Any])
        
        inline def setDailyRangeDotstartDateDotyearUndefined: Self = StObject.set(x, "dailyRange.startDate.year", js.undefined)
        
        inline def setDailySubEntityTypeDotdayOfWeek(value: String): Self = StObject.set(x, "dailySubEntityType.dayOfWeek", value.asInstanceOf[js.Any])
        
        inline def setDailySubEntityTypeDotdayOfWeekUndefined: Self = StObject.set(x, "dailySubEntityType.dayOfWeek", js.undefined)
        
        inline def setDailySubEntityTypeDottimeOfDayDothours(value: Double): Self = StObject.set(x, "dailySubEntityType.timeOfDay.hours", value.asInstanceOf[js.Any])
        
        inline def setDailySubEntityTypeDottimeOfDayDothoursUndefined: Self = StObject.set(x, "dailySubEntityType.timeOfDay.hours", js.undefined)
        
        inline def setDailySubEntityTypeDottimeOfDayDotminutes(value: Double): Self = StObject.set(x, "dailySubEntityType.timeOfDay.minutes", value.asInstanceOf[js.Any])
        
        inline def setDailySubEntityTypeDottimeOfDayDotminutesUndefined: Self = StObject.set(x, "dailySubEntityType.timeOfDay.minutes", js.undefined)
        
        inline def setDailySubEntityTypeDottimeOfDayDotnanos(value: Double): Self = StObject.set(x, "dailySubEntityType.timeOfDay.nanos", value.asInstanceOf[js.Any])
        
        inline def setDailySubEntityTypeDottimeOfDayDotnanosUndefined: Self = StObject.set(x, "dailySubEntityType.timeOfDay.nanos", js.undefined)
        
        inline def setDailySubEntityTypeDottimeOfDayDotseconds(value: Double): Self = StObject.set(x, "dailySubEntityType.timeOfDay.seconds", value.asInstanceOf[js.Any])
        
        inline def setDailySubEntityTypeDottimeOfDayDotsecondsUndefined: Self = StObject.set(x, "dailySubEntityType.timeOfDay.seconds", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait ParamsResourceLocationsSearchkeywordsImpressionsMonthlyList
      extends StObject
         with StandardParameters {
      
      /**
        * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
        */
      @JSName("monthlyRange.endMonth.day")
      var monthlyRangeDotendMonthDotday: js.UndefOr[Double] = js.undefined
      
      /**
        * Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
        */
      @JSName("monthlyRange.endMonth.month")
      var monthlyRangeDotendMonthDotmonth: js.UndefOr[Double] = js.undefined
      
      /**
        * Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
        */
      @JSName("monthlyRange.endMonth.year")
      var monthlyRangeDotendMonthDotyear: js.UndefOr[Double] = js.undefined
      
      /**
        * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
        */
      @JSName("monthlyRange.startMonth.day")
      var monthlyRangeDotstartMonthDotday: js.UndefOr[Double] = js.undefined
      
      /**
        * Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
        */
      @JSName("monthlyRange.startMonth.month")
      var monthlyRangeDotstartMonthDotmonth: js.UndefOr[Double] = js.undefined
      
      /**
        * Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
        */
      @JSName("monthlyRange.startMonth.year")
      var monthlyRangeDotstartMonthDotyear: js.UndefOr[Double] = js.undefined
      
      /**
        * Optional. The number of results requested. The default page size is 100. Page size can be set to a maximum of 100.
        */
      var pageSize: js.UndefOr[Double] = js.undefined
      
      /**
        * Optional. A token indicating the next paginated result to be returned.
        */
      var pageToken: js.UndefOr[String] = js.undefined
      
      /**
        * Required. The location for which the time series should be fetched. Format: locations/{location_id\} where location_id is an unobfuscated listing id.
        */
      var parent: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceLocationsSearchkeywordsImpressionsMonthlyList {
      
      inline def apply(): ParamsResourceLocationsSearchkeywordsImpressionsMonthlyList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceLocationsSearchkeywordsImpressionsMonthlyList]
      }
      
      extension [Self <: ParamsResourceLocationsSearchkeywordsImpressionsMonthlyList](x: Self) {
        
        inline def setMonthlyRangeDotendMonthDotday(value: Double): Self = StObject.set(x, "monthlyRange.endMonth.day", value.asInstanceOf[js.Any])
        
        inline def setMonthlyRangeDotendMonthDotdayUndefined: Self = StObject.set(x, "monthlyRange.endMonth.day", js.undefined)
        
        inline def setMonthlyRangeDotendMonthDotmonth(value: Double): Self = StObject.set(x, "monthlyRange.endMonth.month", value.asInstanceOf[js.Any])
        
        inline def setMonthlyRangeDotendMonthDotmonthUndefined: Self = StObject.set(x, "monthlyRange.endMonth.month", js.undefined)
        
        inline def setMonthlyRangeDotendMonthDotyear(value: Double): Self = StObject.set(x, "monthlyRange.endMonth.year", value.asInstanceOf[js.Any])
        
        inline def setMonthlyRangeDotendMonthDotyearUndefined: Self = StObject.set(x, "monthlyRange.endMonth.year", js.undefined)
        
        inline def setMonthlyRangeDotstartMonthDotday(value: Double): Self = StObject.set(x, "monthlyRange.startMonth.day", value.asInstanceOf[js.Any])
        
        inline def setMonthlyRangeDotstartMonthDotdayUndefined: Self = StObject.set(x, "monthlyRange.startMonth.day", js.undefined)
        
        inline def setMonthlyRangeDotstartMonthDotmonth(value: Double): Self = StObject.set(x, "monthlyRange.startMonth.month", value.asInstanceOf[js.Any])
        
        inline def setMonthlyRangeDotstartMonthDotmonthUndefined: Self = StObject.set(x, "monthlyRange.startMonth.month", js.undefined)
        
        inline def setMonthlyRangeDotstartMonthDotyear(value: Double): Self = StObject.set(x, "monthlyRange.startMonth.year", value.asInstanceOf[js.Any])
        
        inline def setMonthlyRangeDotstartMonthDotyearUndefined: Self = StObject.set(x, "monthlyRange.startMonth.year", js.undefined)
        
        inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      }
    }
    
    trait SchemaDate extends StObject {
      
      /**
        * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
        */
      var day: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
        */
      var month: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
        */
      var year: js.UndefOr[Double | Null] = js.undefined
    }
    object SchemaDate {
      
      inline def apply(): SchemaDate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaDate]
      }
      
      extension [Self <: SchemaDate](x: Self) {
        
        inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
        
        inline def setDayNull: Self = StObject.set(x, "day", null)
        
        inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
        
        inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
        
        inline def setMonthNull: Self = StObject.set(x, "month", null)
        
        inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
        
        inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
        
        inline def setYearNull: Self = StObject.set(x, "year", null)
        
        inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
      }
    }
    
    trait SchemaDatedValue extends StObject {
      
      /**
        * The date that the datapoint corresponds to. This represents a month value if the day field is not set.
        */
      var date: js.UndefOr[SchemaDate] = js.undefined
      
      /**
        * The value of the datapoint.
        */
      var value: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaDatedValue {
      
      inline def apply(): SchemaDatedValue = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaDatedValue]
      }
      
      extension [Self <: SchemaDatedValue](x: Self) {
        
        inline def setDate(value: SchemaDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
        
        inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueNull: Self = StObject.set(x, "value", null)
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait SchemaGetDailyMetricsTimeSeriesResponse extends StObject {
      
      /**
        * The daily time series.
        */
      var timeSeries: js.UndefOr[SchemaTimeSeries] = js.undefined
    }
    object SchemaGetDailyMetricsTimeSeriesResponse {
      
      inline def apply(): SchemaGetDailyMetricsTimeSeriesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGetDailyMetricsTimeSeriesResponse]
      }
      
      extension [Self <: SchemaGetDailyMetricsTimeSeriesResponse](x: Self) {
        
        inline def setTimeSeries(value: SchemaTimeSeries): Self = StObject.set(x, "timeSeries", value.asInstanceOf[js.Any])
        
        inline def setTimeSeriesUndefined: Self = StObject.set(x, "timeSeries", js.undefined)
      }
    }
    
    trait SchemaInsightsValue extends StObject {
      
      /**
        * Represents the threshold below which the actual value falls.
        */
      var threshold: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Represents the actual value.
        */
      var value: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaInsightsValue {
      
      inline def apply(): SchemaInsightsValue = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaInsightsValue]
      }
      
      extension [Self <: SchemaInsightsValue](x: Self) {
        
        inline def setThreshold(value: String): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
        
        inline def setThresholdNull: Self = StObject.set(x, "threshold", null)
        
        inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueNull: Self = StObject.set(x, "value", null)
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait SchemaListSearchKeywordImpressionsMonthlyResponse extends StObject {
      
      /**
        * A token indicating the last paginated result returned. This can be used by succeeding requests to get the next "page" of keywords. It will only be present when there are more results to be returned.
        */
      var nextPageToken: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Search terms which have been used to find a business.
        */
      var searchKeywordsCounts: js.UndefOr[js.Array[SchemaSearchKeywordCount]] = js.undefined
    }
    object SchemaListSearchKeywordImpressionsMonthlyResponse {
      
      inline def apply(): SchemaListSearchKeywordImpressionsMonthlyResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaListSearchKeywordImpressionsMonthlyResponse]
      }
      
      extension [Self <: SchemaListSearchKeywordImpressionsMonthlyResponse](x: Self) {
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setSearchKeywordsCounts(value: js.Array[SchemaSearchKeywordCount]): Self = StObject.set(x, "searchKeywordsCounts", value.asInstanceOf[js.Any])
        
        inline def setSearchKeywordsCountsUndefined: Self = StObject.set(x, "searchKeywordsCounts", js.undefined)
        
        inline def setSearchKeywordsCountsVarargs(value: SchemaSearchKeywordCount*): Self = StObject.set(x, "searchKeywordsCounts", js.Array(value*))
      }
    }
    
    trait SchemaSearchKeywordCount extends StObject {
      
      /**
        * One of either: 1) The sum of the number of unique users that used the keyword in a month, aggregated for each month requested. 2) A threshold that indicates that the actual value is below this threshold.
        */
      var insightsValue: js.UndefOr[SchemaInsightsValue] = js.undefined
      
      /**
        * The lower-cased string that the user entered.
        */
      var searchKeyword: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaSearchKeywordCount {
      
      inline def apply(): SchemaSearchKeywordCount = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaSearchKeywordCount]
      }
      
      extension [Self <: SchemaSearchKeywordCount](x: Self) {
        
        inline def setInsightsValue(value: SchemaInsightsValue): Self = StObject.set(x, "insightsValue", value.asInstanceOf[js.Any])
        
        inline def setInsightsValueUndefined: Self = StObject.set(x, "insightsValue", js.undefined)
        
        inline def setSearchKeyword(value: String): Self = StObject.set(x, "searchKeyword", value.asInstanceOf[js.Any])
        
        inline def setSearchKeywordNull: Self = StObject.set(x, "searchKeyword", null)
        
        inline def setSearchKeywordUndefined: Self = StObject.set(x, "searchKeyword", js.undefined)
      }
    }
    
    trait SchemaTimeSeries extends StObject {
      
      /**
        * List of datapoints in the timeseries, where each datapoint is a date-value pair.
        */
      var datedValues: js.UndefOr[js.Array[SchemaDatedValue]] = js.undefined
    }
    object SchemaTimeSeries {
      
      inline def apply(): SchemaTimeSeries = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaTimeSeries]
      }
      
      extension [Self <: SchemaTimeSeries](x: Self) {
        
        inline def setDatedValues(value: js.Array[SchemaDatedValue]): Self = StObject.set(x, "datedValues", value.asInstanceOf[js.Any])
        
        inline def setDatedValuesUndefined: Self = StObject.set(x, "datedValues", js.undefined)
        
        inline def setDatedValuesVarargs(value: SchemaDatedValue*): Self = StObject.set(x, "datedValues", js.Array(value*))
      }
    }
    
    trait StandardParameters extends StObject {
      
      /**
        * V1 error format.
        */
      @JSName("$.xgafv")
      var $Dotxgafv: js.UndefOr[String] = js.undefined
      
      /**
        * OAuth access token.
        */
      var access_token: js.UndefOr[String] = js.undefined
      
      /**
        * Data format for response.
        */
      var alt: js.UndefOr[String] = js.undefined
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[
            String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
          ] = js.undefined
      
      /**
        * JSONP
        */
      var callback: js.UndefOr[String] = js.undefined
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.undefined
      
      /**
        * API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
        */
      var key: js.UndefOr[String] = js.undefined
      
      /**
        * OAuth 2.0 token for the current user.
        */
      var oauth_token: js.UndefOr[String] = js.undefined
      
      /**
        * Returns response with indentations and line breaks.
        */
      var prettyPrint: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
        */
      var quotaUser: js.UndefOr[String] = js.undefined
      
      /**
        * Legacy upload protocol for media (e.g. "media", "multipart").
        */
      var uploadType: js.UndefOr[String] = js.undefined
      
      /**
        * Upload protocol for media (e.g. "raw", "multipart").
        */
      var upload_protocol: js.UndefOr[String] = js.undefined
    }
    object StandardParameters {
      
      inline def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      extension [Self <: StandardParameters](x: Self) {
        
        inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
        
        inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
        
        inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
        
        inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
        
        inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        inline def setAuth(
          value: String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
        ): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
        
        inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
        
        inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
        
        inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
        
        inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
        
        inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
        
        inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
        
        inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
        
        inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
        
        inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
        
        inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
      }
    }
  }
}
