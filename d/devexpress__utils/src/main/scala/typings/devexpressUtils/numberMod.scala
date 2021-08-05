package typings.devexpressUtils

import typings.devexpressUtils.optionsMod.INumberFormatterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberMod {
  
  @JSImport("@devexpress/utils/lib/formatters/number", "NumberFormatter")
  @js.native
  class NumberFormatter protected () extends StObject {
    def this(options: INumberFormatterOptions) = this()
    
    /* private */ var appendDigits: js.Any = js.native
    
    /* private */ var appendGroupedInteger: js.Any = js.native
    
    /* private */ var createCustomFormatLists: js.Any = js.native
    
    /* private */ var custom: js.Any = js.native
    
    /* private */ var digits: js.Any = js.native
    
    /* private */ var fillDigitInfo: js.Any = js.native
    
    /* private */ var fillFormatInfo: js.Any = js.native
    
    def format(format: String, value: Double): String = js.native
    
    /* private */ var formatCurrency: js.Any = js.native
    
    /* private */ var formatCustom: js.Any = js.native
    
    /* private */ var formatCustomCore: js.Any = js.native
    
    /* private */ var formatDecimal: js.Any = js.native
    
    /* private */ var formatExp: js.Any = js.native
    
    /* private */ var formatExpCore: js.Any = js.native
    
    /* private */ var formatFixed: js.Any = js.native
    
    /* private */ var formatGeneral: js.Any = js.native
    
    /* private */ var formatHex: js.Any = js.native
    
    /* private */ var formatNumber: js.Any = js.native
    
    /* private */ var formatPercent: js.Any = js.native
    
    /* private */ val options: js.Any = js.native
    
    /* private */ var pointPos: js.Any = js.native
    
    /* private */ var positive: js.Any = js.native
    
    /* private */ var prec: js.Any = js.native
    
    /* private */ var round: js.Any = js.native
    
    /* private */ var selectCustomFormatSection: js.Any = js.native
    
    /* private */ var spec: js.Any = js.native
    
    /* private */ var upper: js.Any = js.native
  }
  /* static members */
  object NumberFormatter {
    
    @JSImport("@devexpress/utils/lib/formatters/number", "NumberFormatter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@devexpress/utils/lib/formatters/number", "NumberFormatter.createCustomFormatInfo")
    @js.native
    def createCustomFormatInfo: js.Any = js.native
    inline def createCustomFormatInfo_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createCustomFormatInfo")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/formatters/number", "NumberFormatter.getCustomFormatSections")
    @js.native
    def getCustomFormatSections: js.Any = js.native
    inline def getCustomFormatSections_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getCustomFormatSections")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/formatters/number", "NumberFormatter.parseCustomFormatSection")
    @js.native
    def parseCustomFormatSection: js.Any = js.native
    inline def parseCustomFormatSection_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseCustomFormatSection")(x.asInstanceOf[js.Any])
  }
}
