package typings.googleDashAppsDashScript

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.DateConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  var AdminDirectory: typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectory = js.native
  var AdminGroupsMigration: typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminGroupsMigration = js.native
  var AdminGroupsSettings: typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminGroupsSettings = js.native
  var AdminLicenseManager: typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminLicenseManager = js.native
  var AdminReports: typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminReports = js.native
  var AdminReseller: typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminReseller = js.native
  var Adsense: typings.googleDashAppsDashScript.GoogleAppsScriptNs.Adsense = js.native
  var Analytics: typings.googleDashAppsDashScript.GoogleAppsScriptNs.Analytics = js.native
  var Analyticsreporting: typings.googleDashAppsDashScript.GoogleAppsScriptNs.Analyticsreporting = js.native
  var Appsactivity: typings.googleDashAppsDashScript.GoogleAppsScriptNs.Appsactivity = js.native
  var Bigquery: typings.googleDashAppsDashScript.GoogleAppsScriptNs.Bigquery = js.native
  var Browser: typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Browser = js.native
  var CacheService: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CacheNs.CacheService = js.native
  var Calendar: typings.googleDashAppsDashScript.GoogleAppsScriptNs.Calendar = js.native
  var CalendarApp: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.CalendarApp = js.native
  var CardService: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CardUnderscoreServiceNs.CardService = js.native
  var Charset: typings.googleDashAppsDashScript.GoogleAppsScriptNs.UtilitiesNs.Charset = js.native
  var Charts: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.Charts = js.native
  var Classroom: typings.googleDashAppsDashScript.GoogleAppsScriptNs.Classroom = js.native
  var ContactsApp: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContactsNs.ContactsApp = js.native
  var Content: typings.googleDashAppsDashScript.GoogleAppsScriptNs.Content = js.native
  var ContentService: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.ContentService = js.native
  var DataStudioApp: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DataUnderscoreStudioNs.DataStudioApp = js.native
  // The name `Date` conflicts with lib.es5.d.ts.
  // - We cannot include lib.es5.d.ts with Apps Script though because Apps Script is ES3
  //   and doesn't include all ES5+ features.
  //   Thus developers using the Date class must alias the type in their own TS projects.
  // - We cannot use lib.es3.d.ts because it is no longer by dtslint.
  var Date2: DateConstructor = js.native
  var Dfareporting: typings.googleDashAppsDashScript.GoogleAppsScriptNs.Dfareporting = js.native
  var DigestAlgorithm: typings.googleDashAppsDashScript.GoogleAppsScriptNs.UtilitiesNs.DigestAlgorithm = js.native
  var Docs: typings.googleDashAppsDashScript.GoogleAppsScriptNs.Docs = js.native
  var DocumentApp: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocumentNs.DocumentApp = js.native
  var Drive: typings.googleDashAppsDashScript.GoogleAppsScriptNs.Drive = js.native
  var DriveActivity: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveActivity = js.native
  var DriveApp: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.DriveApp = js.native
  var FormApp: typings.googleDashAppsDashScript.GoogleAppsScriptNs.FormsNs.FormApp = js.native
  var FusionTables: typings.googleDashAppsDashScript.GoogleAppsScriptNs.FusionTables = js.native
  var Gmail: typings.googleDashAppsDashScript.GoogleAppsScriptNs.Gmail = js.native
  var GmailApp: typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.GmailApp = js.native
  var GroupsApp: typings.googleDashAppsDashScript.GoogleAppsScriptNs.GroupsNs.GroupsApp = js.native
  var HtmlService: typings.googleDashAppsDashScript.GoogleAppsScriptNs.HTMLNs.HtmlService = js.native
  var Jdbc: typings.googleDashAppsDashScript.GoogleAppsScriptNs.JDBCNs.Jdbc = js.native
  var LanguageApp: typings.googleDashAppsDashScript.GoogleAppsScriptNs.LanguageNs.LanguageApp = js.native
  var LinearOptimizationService: typings.googleDashAppsDashScript.GoogleAppsScriptNs.OptimizationNs.LinearOptimizationService = js.native
  var LockService: typings.googleDashAppsDashScript.GoogleAppsScriptNs.LockNs.LockService = js.native
  var Logger: typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Logger = js.native
  var MacAlgorithm: typings.googleDashAppsDashScript.GoogleAppsScriptNs.UtilitiesNs.MacAlgorithm = js.native
  var MailApp: typings.googleDashAppsDashScript.GoogleAppsScriptNs.MailNs.MailApp = js.native
  var Maps: typings.googleDashAppsDashScript.GoogleAppsScriptNs.MapsNs.Maps = js.native
  var Mirror: typings.googleDashAppsDashScript.GoogleAppsScriptNs.Mirror = js.native
  var People: typings.googleDashAppsDashScript.GoogleAppsScriptNs.People = js.native
  var PropertiesService: typings.googleDashAppsDashScript.GoogleAppsScriptNs.PropertiesNs.PropertiesService = js.native
  var RsaAlgorithm: typings.googleDashAppsDashScript.GoogleAppsScriptNs.UtilitiesNs.RsaAlgorithm = js.native
  var ScriptApp: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ScriptNs.ScriptApp = js.native
  var ScriptProperties: typings.googleDashAppsDashScript.GoogleAppsScriptNs.PropertiesNs.ScriptProperties = js.native
  // conflicts with MimeType in lib.d.ts
  // declare var MimeType: GoogleAppsScript.Base.MimeType;
  var Session: typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Session = js.native
  var Sheets: typings.googleDashAppsDashScript.GoogleAppsScriptNs.Sheets = js.native
  var SitesApp: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SitesNs.SitesApp = js.native
  var Slides: typings.googleDashAppsDashScript.GoogleAppsScriptNs.Slides = js.native
  var SlidesApp: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SlidesApp = js.native
  var SpreadsheetApp: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.SpreadsheetApp = js.native
  var TagManager: typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManager = js.native
  var Tasks: typings.googleDashAppsDashScript.GoogleAppsScriptNs.Tasks = js.native
  var UiApp: typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs.UiApp = js.native
  var UrlFetchApp: typings.googleDashAppsDashScript.GoogleAppsScriptNs.URLUnderscoreFetchNs.UrlFetchApp = js.native
  var UrlShortener: typings.googleDashAppsDashScript.GoogleAppsScriptNs.UrlShortener = js.native
  var UserProperties: typings.googleDashAppsDashScript.GoogleAppsScriptNs.PropertiesNs.UserProperties = js.native
  var Utilities: typings.googleDashAppsDashScript.GoogleAppsScriptNs.UtilitiesNs.Utilities = js.native
  var XmlService: typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs.XmlService = js.native
  var YouTube: typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTube = js.native
  var YouTubeAnalytics: typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeAnalytics = js.native
  var YoutubePartner: typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartner = js.native
  var console: typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.console = js.native
}

