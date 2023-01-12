package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationCitedArtifactPublicationFormPeriodicReleaseDateOfPublication
  extends StObject
     with BackboneElement {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _day: js.UndefOr[Element] = js.undefined
  
  var _month: js.UndefOr[Element] = js.undefined
  
  var _season: js.UndefOr[Element] = js.undefined
  
  var _text: js.UndefOr[Element] = js.undefined
  
  var _year: js.UndefOr[Element] = js.undefined
  
  /**
    * Date on which the issue of the journal was published.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * Day on which the issue of the journal was published.
    */
  var day: js.UndefOr[String] = js.undefined
  
  /**
    * Month on which the issue of the journal was published.
    */
  var month: js.UndefOr[String] = js.undefined
  
  /**
    * Spring, Summer, Fall/Autumn, Winter.
    */
  var season: js.UndefOr[String] = js.undefined
  
  /**
    * Text representation of the date of which the issue of the journal was published.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Year on which the issue of the journal was published.
    */
  var year: js.UndefOr[String] = js.undefined
}
object CitationCitedArtifactPublicationFormPeriodicReleaseDateOfPublication {
  
  inline def apply(): CitationCitedArtifactPublicationFormPeriodicReleaseDateOfPublication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CitationCitedArtifactPublicationFormPeriodicReleaseDateOfPublication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CitationCitedArtifactPublicationFormPeriodicReleaseDateOfPublication] (val x: Self) extends AnyVal {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setSeason(value: String): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
    
    inline def setSeasonUndefined: Self = StObject.set(x, "season", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_day(value: Element): Self = StObject.set(x, "_day", value.asInstanceOf[js.Any])
    
    inline def set_dayUndefined: Self = StObject.set(x, "_day", js.undefined)
    
    inline def set_month(value: Element): Self = StObject.set(x, "_month", value.asInstanceOf[js.Any])
    
    inline def set_monthUndefined: Self = StObject.set(x, "_month", js.undefined)
    
    inline def set_season(value: Element): Self = StObject.set(x, "_season", value.asInstanceOf[js.Any])
    
    inline def set_seasonUndefined: Self = StObject.set(x, "_season", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
    
    inline def set_year(value: Element): Self = StObject.set(x, "_year", value.asInstanceOf[js.Any])
    
    inline def set_yearUndefined: Self = StObject.set(x, "_year", js.undefined)
  }
}
