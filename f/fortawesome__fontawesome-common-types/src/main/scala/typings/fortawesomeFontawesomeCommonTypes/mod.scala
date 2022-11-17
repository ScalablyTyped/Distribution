package typings.fortawesomeFontawesomeCommonTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object CssStyleClass {
    
    inline def `fa-brands`: "fa-brands" = "fa-brands".asInstanceOf["fa-brands"]
    
    inline def `fa-duotone`: "fa-duotone" = "fa-duotone".asInstanceOf["fa-duotone"]
    
    inline def `fa-light`: "fa-light" = "fa-light".asInstanceOf["fa-light"]
    
    inline def `fa-regular`: "fa-regular" = "fa-regular".asInstanceOf["fa-regular"]
    
    inline def `fa-solid`: "fa-solid" = "fa-solid".asInstanceOf["fa-solid"]
    
    inline def `fa-thin`: "fa-thin" = "fa-thin".asInstanceOf["fa-thin"]
  }
  type CssStyleClass = "fa-solid" | "fa-regular" | "fa-light" | "fa-thin" | "fa-duotone" | "fa-brands"
  
  trait IconDefinition
    extends StObject
       with IconLookup {
    
    var icon: js.Tuple5[
        Double, 
        // width
    Double, 
        js.Array[// height
    String], 
        // ligatures
    String, 
        // unicode
    IconPathData
      ]
  }
  object IconDefinition {
    
    inline def apply(
      icon: js.Tuple5[
          Double, 
          // width
    Double, 
          js.Array[// height
    String], 
          // ligatures
    String, 
          // unicode
    IconPathData
        ],
      iconName: IconName,
      prefix: IconPrefix
    ): IconDefinition = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], iconName = iconName.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconDefinition]
    }
    
    extension [Self <: IconDefinition](x: Self) {
      
      inline def setIcon(
        value: js.Tuple5[
              Double, 
              // width
      Double, 
              js.Array[// height
      String], 
              // ligatures
      String, 
              // unicode
      IconPathData
            ]
      ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    }
  }
  
  object IconFamily {
    
    inline def classic: "classic" = "classic".asInstanceOf["classic"]
    
    inline def duotone: "duotone" = "duotone".asInstanceOf["duotone"]
    
    inline def sharp: "sharp" = "sharp".asInstanceOf["sharp"]
  }
  type IconFamily = "classic" | "sharp" | "duotone"
  
  trait IconLookup extends StObject {
    
    // IconName is defined in the code that will be generated at build time and bundled with this file.
    var iconName: IconName
    
    var prefix: IconPrefix
  }
  object IconLookup {
    
    inline def apply(iconName: IconName, prefix: IconPrefix): IconLookup = {
      val __obj = js.Dynamic.literal(iconName = iconName.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconLookup]
    }
    
    extension [Self <: IconLookup](x: Self) {
      
      inline def setIconName(value: IconName): Self = StObject.set(x, "iconName", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: IconPrefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  object IconName {
    
    inline def `0`: "0" = "0".asInstanceOf["0"]
    
    inline def `00`: "00" = "00".asInstanceOf["00"]
    
    inline def `1`: "1" = "1".asInstanceOf["1"]
    
    inline def `100`: "100" = "100".asInstanceOf["100"]
    
    inline def `2`: "2" = "2".asInstanceOf["2"]
    
    inline def `3`: "3" = "3".asInstanceOf["3"]
    
    inline def `360-degrees`: "360-degrees" = "360-degrees".asInstanceOf["360-degrees"]
    
    inline def `4`: "4" = "4".asInstanceOf["4"]
    
    inline def `42-group`: "42-group" = "42-group".asInstanceOf["42-group"]
    
    inline def `5`: "5" = "5".asInstanceOf["5"]
    
    inline def `500px`: "500px" = "500px".asInstanceOf["500px"]
    
    inline def `6`: "6" = "6".asInstanceOf["6"]
    
    inline def `7`: "7" = "7".asInstanceOf["7"]
    
    inline def `8`: "8" = "8".asInstanceOf["8"]
    
    inline def `9`: "9" = "9".asInstanceOf["9"]
    
    inline def a: "a" = "a".asInstanceOf["a"]
    
    inline def abacus: "abacus" = "abacus".asInstanceOf["abacus"]
    
    inline def `accent-grave`: "accent-grave" = "accent-grave".asInstanceOf["accent-grave"]
    
    inline def `accessible-icon`: "accessible-icon" = "accessible-icon".asInstanceOf["accessible-icon"]
    
    inline def accusoft: "accusoft" = "accusoft".asInstanceOf["accusoft"]
    
    inline def acorn: "acorn" = "acorn".asInstanceOf["acorn"]
    
    inline def ad: "ad" = "ad".asInstanceOf["ad"]
    
    inline def add: "add" = "add".asInstanceOf["add"]
    
    inline def `address-book`: "address-book" = "address-book".asInstanceOf["address-book"]
    
    inline def `address-card`: "address-card" = "address-card".asInstanceOf["address-card"]
    
    inline def adjust: "adjust" = "adjust".asInstanceOf["adjust"]
    
    inline def adn: "adn" = "adn".asInstanceOf["adn"]
    
    inline def adversal: "adversal" = "adversal".asInstanceOf["adversal"]
    
    inline def affiliatetheme: "affiliatetheme" = "affiliatetheme".asInstanceOf["affiliatetheme"]
    
    inline def `air-conditioner`: "air-conditioner" = "air-conditioner".asInstanceOf["air-conditioner"]
    
    inline def `air-freshener`: "air-freshener" = "air-freshener".asInstanceOf["air-freshener"]
    
    inline def airbnb: "airbnb" = "airbnb".asInstanceOf["airbnb"]
    
    inline def airplay: "airplay" = "airplay".asInstanceOf["airplay"]
    
    inline def `alarm-clock`: "alarm-clock" = "alarm-clock".asInstanceOf["alarm-clock"]
    
    inline def `alarm-exclamation`: "alarm-exclamation" = "alarm-exclamation".asInstanceOf["alarm-exclamation"]
    
    inline def `alarm-plus`: "alarm-plus" = "alarm-plus".asInstanceOf["alarm-plus"]
    
    inline def `alarm-snooze`: "alarm-snooze" = "alarm-snooze".asInstanceOf["alarm-snooze"]
    
    inline def album: "album" = "album".asInstanceOf["album"]
    
    inline def `album-circle-plus`: "album-circle-plus" = "album-circle-plus".asInstanceOf["album-circle-plus"]
    
    inline def `album-circle-user`: "album-circle-user" = "album-circle-user".asInstanceOf["album-circle-user"]
    
    inline def `album-collection`: "album-collection" = "album-collection".asInstanceOf["album-collection"]
    
    inline def `album-collection-circle-plus`: "album-collection-circle-plus" = "album-collection-circle-plus".asInstanceOf["album-collection-circle-plus"]
    
    inline def `album-collection-circle-user`: "album-collection-circle-user" = "album-collection-circle-user".asInstanceOf["album-collection-circle-user"]
    
    inline def algolia: "algolia" = "algolia".asInstanceOf["algolia"]
    
    inline def alicorn: "alicorn" = "alicorn".asInstanceOf["alicorn"]
    
    inline def alien: "alien" = "alien".asInstanceOf["alien"]
    
    inline def `alien-8bit`: "alien-8bit" = "alien-8bit".asInstanceOf["alien-8bit"]
    
    inline def `alien-monster`: "alien-monster" = "alien-monster".asInstanceOf["alien-monster"]
    
    inline def `align-center`: "align-center" = "align-center".asInstanceOf["align-center"]
    
    inline def `align-justify`: "align-justify" = "align-justify".asInstanceOf["align-justify"]
    
    inline def `align-left`: "align-left" = "align-left".asInstanceOf["align-left"]
    
    inline def `align-right`: "align-right" = "align-right".asInstanceOf["align-right"]
    
    inline def `align-slash`: "align-slash" = "align-slash".asInstanceOf["align-slash"]
    
    inline def alipay: "alipay" = "alipay".asInstanceOf["alipay"]
    
    inline def allergies: "allergies" = "allergies".asInstanceOf["allergies"]
    
    inline def alt: "alt" = "alt".asInstanceOf["alt"]
    
    inline def amazon: "amazon" = "amazon".asInstanceOf["amazon"]
    
    inline def `amazon-pay`: "amazon-pay" = "amazon-pay".asInstanceOf["amazon-pay"]
    
    inline def ambulance: "ambulance" = "ambulance".asInstanceOf["ambulance"]
    
    inline def `american-sign-language-interpreting`: "american-sign-language-interpreting" = "american-sign-language-interpreting".asInstanceOf["american-sign-language-interpreting"]
    
    inline def amilia: "amilia" = "amilia".asInstanceOf["amilia"]
    
    inline def `amp-guitar`: "amp-guitar" = "amp-guitar".asInstanceOf["amp-guitar"]
    
    inline def ampersand: "ampersand" = "ampersand".asInstanceOf["ampersand"]
    
    inline def analytics: "analytics" = "analytics".asInstanceOf["analytics"]
    
    inline def anchor: "anchor" = "anchor".asInstanceOf["anchor"]
    
    inline def `anchor-circle-check`: "anchor-circle-check" = "anchor-circle-check".asInstanceOf["anchor-circle-check"]
    
    inline def `anchor-circle-exclamation`: "anchor-circle-exclamation" = "anchor-circle-exclamation".asInstanceOf["anchor-circle-exclamation"]
    
    inline def `anchor-circle-xmark`: "anchor-circle-xmark" = "anchor-circle-xmark".asInstanceOf["anchor-circle-xmark"]
    
    inline def `anchor-lock`: "anchor-lock" = "anchor-lock".asInstanceOf["anchor-lock"]
    
    inline def android: "android" = "android".asInstanceOf["android"]
    
    inline def angel: "angel" = "angel".asInstanceOf["angel"]
    
    inline def angellist: "angellist" = "angellist".asInstanceOf["angellist"]
    
    inline def angle: "angle" = "angle".asInstanceOf["angle"]
    
    inline def `angle-90`: "angle-90" = "angle-90".asInstanceOf["angle-90"]
    
    inline def `angle-double-down`: "angle-double-down" = "angle-double-down".asInstanceOf["angle-double-down"]
    
    inline def `angle-double-left`: "angle-double-left" = "angle-double-left".asInstanceOf["angle-double-left"]
    
    inline def `angle-double-right`: "angle-double-right" = "angle-double-right".asInstanceOf["angle-double-right"]
    
    inline def `angle-double-up`: "angle-double-up" = "angle-double-up".asInstanceOf["angle-double-up"]
    
    inline def `angle-down`: "angle-down" = "angle-down".asInstanceOf["angle-down"]
    
    inline def `angle-left`: "angle-left" = "angle-left".asInstanceOf["angle-left"]
    
    inline def `angle-right`: "angle-right" = "angle-right".asInstanceOf["angle-right"]
    
    inline def `angle-up`: "angle-up" = "angle-up".asInstanceOf["angle-up"]
    
    inline def `angles-down`: "angles-down" = "angles-down".asInstanceOf["angles-down"]
    
    inline def `angles-left`: "angles-left" = "angles-left".asInstanceOf["angles-left"]
    
    inline def `angles-right`: "angles-right" = "angles-right".asInstanceOf["angles-right"]
    
    inline def `angles-up`: "angles-up" = "angles-up".asInstanceOf["angles-up"]
    
    inline def angry: "angry" = "angry".asInstanceOf["angry"]
    
    inline def angrycreative: "angrycreative" = "angrycreative".asInstanceOf["angrycreative"]
    
    inline def angular: "angular" = "angular".asInstanceOf["angular"]
    
    inline def ankh: "ankh" = "ankh".asInstanceOf["ankh"]
    
    inline def apartment: "apartment" = "apartment".asInstanceOf["apartment"]
    
    inline def aperture: "aperture" = "aperture".asInstanceOf["aperture"]
    
    inline def apostrophe: "apostrophe" = "apostrophe".asInstanceOf["apostrophe"]
    
    inline def `app-store`: "app-store" = "app-store".asInstanceOf["app-store"]
    
    inline def `app-store-ios`: "app-store-ios" = "app-store-ios".asInstanceOf["app-store-ios"]
    
    inline def apper: "apper" = "apper".asInstanceOf["apper"]
    
    inline def apple: "apple" = "apple".asInstanceOf["apple"]
    
    inline def `apple-alt`: "apple-alt" = "apple-alt".asInstanceOf["apple-alt"]
    
    inline def `apple-core`: "apple-core" = "apple-core".asInstanceOf["apple-core"]
    
    inline def `apple-crate`: "apple-crate" = "apple-crate".asInstanceOf["apple-crate"]
    
    inline def `apple-pay`: "apple-pay" = "apple-pay".asInstanceOf["apple-pay"]
    
    inline def `apple-whole`: "apple-whole" = "apple-whole".asInstanceOf["apple-whole"]
    
    inline def archive: "archive" = "archive".asInstanceOf["archive"]
    
    inline def archway: "archway" = "archway".asInstanceOf["archway"]
    
    inline def `area-chart`: "area-chart" = "area-chart".asInstanceOf["area-chart"]
    
    inline def `arrow-alt-circle-down`: "arrow-alt-circle-down" = "arrow-alt-circle-down".asInstanceOf["arrow-alt-circle-down"]
    
    inline def `arrow-alt-circle-left`: "arrow-alt-circle-left" = "arrow-alt-circle-left".asInstanceOf["arrow-alt-circle-left"]
    
    inline def `arrow-alt-circle-right`: "arrow-alt-circle-right" = "arrow-alt-circle-right".asInstanceOf["arrow-alt-circle-right"]
    
    inline def `arrow-alt-circle-up`: "arrow-alt-circle-up" = "arrow-alt-circle-up".asInstanceOf["arrow-alt-circle-up"]
    
    inline def `arrow-alt-down`: "arrow-alt-down" = "arrow-alt-down".asInstanceOf["arrow-alt-down"]
    
    inline def `arrow-alt-from-bottom`: "arrow-alt-from-bottom" = "arrow-alt-from-bottom".asInstanceOf["arrow-alt-from-bottom"]
    
    inline def `arrow-alt-from-left`: "arrow-alt-from-left" = "arrow-alt-from-left".asInstanceOf["arrow-alt-from-left"]
    
    inline def `arrow-alt-from-right`: "arrow-alt-from-right" = "arrow-alt-from-right".asInstanceOf["arrow-alt-from-right"]
    
    inline def `arrow-alt-from-top`: "arrow-alt-from-top" = "arrow-alt-from-top".asInstanceOf["arrow-alt-from-top"]
    
    inline def `arrow-alt-left`: "arrow-alt-left" = "arrow-alt-left".asInstanceOf["arrow-alt-left"]
    
    inline def `arrow-alt-right`: "arrow-alt-right" = "arrow-alt-right".asInstanceOf["arrow-alt-right"]
    
    inline def `arrow-alt-square-down`: "arrow-alt-square-down" = "arrow-alt-square-down".asInstanceOf["arrow-alt-square-down"]
    
    inline def `arrow-alt-square-left`: "arrow-alt-square-left" = "arrow-alt-square-left".asInstanceOf["arrow-alt-square-left"]
    
    inline def `arrow-alt-square-right`: "arrow-alt-square-right" = "arrow-alt-square-right".asInstanceOf["arrow-alt-square-right"]
    
    inline def `arrow-alt-square-up`: "arrow-alt-square-up" = "arrow-alt-square-up".asInstanceOf["arrow-alt-square-up"]
    
    inline def `arrow-alt-to-bottom`: "arrow-alt-to-bottom" = "arrow-alt-to-bottom".asInstanceOf["arrow-alt-to-bottom"]
    
    inline def `arrow-alt-to-left`: "arrow-alt-to-left" = "arrow-alt-to-left".asInstanceOf["arrow-alt-to-left"]
    
    inline def `arrow-alt-to-right`: "arrow-alt-to-right" = "arrow-alt-to-right".asInstanceOf["arrow-alt-to-right"]
    
    inline def `arrow-alt-to-top`: "arrow-alt-to-top" = "arrow-alt-to-top".asInstanceOf["arrow-alt-to-top"]
    
    inline def `arrow-alt-up`: "arrow-alt-up" = "arrow-alt-up".asInstanceOf["arrow-alt-up"]
    
    inline def `arrow-circle-down`: "arrow-circle-down" = "arrow-circle-down".asInstanceOf["arrow-circle-down"]
    
    inline def `arrow-circle-left`: "arrow-circle-left" = "arrow-circle-left".asInstanceOf["arrow-circle-left"]
    
    inline def `arrow-circle-right`: "arrow-circle-right" = "arrow-circle-right".asInstanceOf["arrow-circle-right"]
    
    inline def `arrow-circle-up`: "arrow-circle-up" = "arrow-circle-up".asInstanceOf["arrow-circle-up"]
    
    inline def `arrow-down`: "arrow-down" = "arrow-down".asInstanceOf["arrow-down"]
    
    inline def `arrow-down-1-9`: "arrow-down-1-9" = "arrow-down-1-9".asInstanceOf["arrow-down-1-9"]
    
    inline def `arrow-down-9-1`: "arrow-down-9-1" = "arrow-down-9-1".asInstanceOf["arrow-down-9-1"]
    
    inline def `arrow-down-a-z`: "arrow-down-a-z" = "arrow-down-a-z".asInstanceOf["arrow-down-a-z"]
    
    inline def `arrow-down-arrow-up`: "arrow-down-arrow-up" = "arrow-down-arrow-up".asInstanceOf["arrow-down-arrow-up"]
    
    inline def `arrow-down-big-small`: "arrow-down-big-small" = "arrow-down-big-small".asInstanceOf["arrow-down-big-small"]
    
    inline def `arrow-down-from-dotted-line`: "arrow-down-from-dotted-line" = "arrow-down-from-dotted-line".asInstanceOf["arrow-down-from-dotted-line"]
    
    inline def `arrow-down-from-line`: "arrow-down-from-line" = "arrow-down-from-line".asInstanceOf["arrow-down-from-line"]
    
    inline def `arrow-down-left`: "arrow-down-left" = "arrow-down-left".asInstanceOf["arrow-down-left"]
    
    inline def `arrow-down-left-and-arrow-up-right-to-center`: "arrow-down-left-and-arrow-up-right-to-center" = "arrow-down-left-and-arrow-up-right-to-center".asInstanceOf["arrow-down-left-and-arrow-up-right-to-center"]
    
    inline def `arrow-down-long`: "arrow-down-long" = "arrow-down-long".asInstanceOf["arrow-down-long"]
    
    inline def `arrow-down-right`: "arrow-down-right" = "arrow-down-right".asInstanceOf["arrow-down-right"]
    
    inline def `arrow-down-short-wide`: "arrow-down-short-wide" = "arrow-down-short-wide".asInstanceOf["arrow-down-short-wide"]
    
    inline def `arrow-down-small-big`: "arrow-down-small-big" = "arrow-down-small-big".asInstanceOf["arrow-down-small-big"]
    
    inline def `arrow-down-square-triangle`: "arrow-down-square-triangle" = "arrow-down-square-triangle".asInstanceOf["arrow-down-square-triangle"]
    
    inline def `arrow-down-to-arc`: "arrow-down-to-arc" = "arrow-down-to-arc".asInstanceOf["arrow-down-to-arc"]
    
    inline def `arrow-down-to-bracket`: "arrow-down-to-bracket" = "arrow-down-to-bracket".asInstanceOf["arrow-down-to-bracket"]
    
    inline def `arrow-down-to-dotted-line`: "arrow-down-to-dotted-line" = "arrow-down-to-dotted-line".asInstanceOf["arrow-down-to-dotted-line"]
    
    inline def `arrow-down-to-line`: "arrow-down-to-line" = "arrow-down-to-line".asInstanceOf["arrow-down-to-line"]
    
    inline def `arrow-down-to-square`: "arrow-down-to-square" = "arrow-down-to-square".asInstanceOf["arrow-down-to-square"]
    
    inline def `arrow-down-triangle-square`: "arrow-down-triangle-square" = "arrow-down-triangle-square".asInstanceOf["arrow-down-triangle-square"]
    
    inline def `arrow-down-up-across-line`: "arrow-down-up-across-line" = "arrow-down-up-across-line".asInstanceOf["arrow-down-up-across-line"]
    
    inline def `arrow-down-up-lock`: "arrow-down-up-lock" = "arrow-down-up-lock".asInstanceOf["arrow-down-up-lock"]
    
    inline def `arrow-down-wide-short`: "arrow-down-wide-short" = "arrow-down-wide-short".asInstanceOf["arrow-down-wide-short"]
    
    inline def `arrow-down-z-a`: "arrow-down-z-a" = "arrow-down-z-a".asInstanceOf["arrow-down-z-a"]
    
    inline def `arrow-from-bottom`: "arrow-from-bottom" = "arrow-from-bottom".asInstanceOf["arrow-from-bottom"]
    
    inline def `arrow-from-left`: "arrow-from-left" = "arrow-from-left".asInstanceOf["arrow-from-left"]
    
    inline def `arrow-from-right`: "arrow-from-right" = "arrow-from-right".asInstanceOf["arrow-from-right"]
    
    inline def `arrow-from-top`: "arrow-from-top" = "arrow-from-top".asInstanceOf["arrow-from-top"]
    
    inline def `arrow-left`: "arrow-left" = "arrow-left".asInstanceOf["arrow-left"]
    
    inline def `arrow-left-from-line`: "arrow-left-from-line" = "arrow-left-from-line".asInstanceOf["arrow-left-from-line"]
    
    inline def `arrow-left-long`: "arrow-left-long" = "arrow-left-long".asInstanceOf["arrow-left-long"]
    
    inline def `arrow-left-long-to-line`: "arrow-left-long-to-line" = "arrow-left-long-to-line".asInstanceOf["arrow-left-long-to-line"]
    
    inline def `arrow-left-rotate`: "arrow-left-rotate" = "arrow-left-rotate".asInstanceOf["arrow-left-rotate"]
    
    inline def `arrow-left-to-line`: "arrow-left-to-line" = "arrow-left-to-line".asInstanceOf["arrow-left-to-line"]
    
    inline def `arrow-pointer`: "arrow-pointer" = "arrow-pointer".asInstanceOf["arrow-pointer"]
    
    inline def `arrow-right`: "arrow-right" = "arrow-right".asInstanceOf["arrow-right"]
    
    inline def `arrow-right-arrow-left`: "arrow-right-arrow-left" = "arrow-right-arrow-left".asInstanceOf["arrow-right-arrow-left"]
    
    inline def `arrow-right-from-arc`: "arrow-right-from-arc" = "arrow-right-from-arc".asInstanceOf["arrow-right-from-arc"]
    
    inline def `arrow-right-from-bracket`: "arrow-right-from-bracket" = "arrow-right-from-bracket".asInstanceOf["arrow-right-from-bracket"]
    
    inline def `arrow-right-from-file`: "arrow-right-from-file" = "arrow-right-from-file".asInstanceOf["arrow-right-from-file"]
    
    inline def `arrow-right-from-line`: "arrow-right-from-line" = "arrow-right-from-line".asInstanceOf["arrow-right-from-line"]
    
    inline def `arrow-right-long`: "arrow-right-long" = "arrow-right-long".asInstanceOf["arrow-right-long"]
    
    inline def `arrow-right-long-to-line`: "arrow-right-long-to-line" = "arrow-right-long-to-line".asInstanceOf["arrow-right-long-to-line"]
    
    inline def `arrow-right-rotate`: "arrow-right-rotate" = "arrow-right-rotate".asInstanceOf["arrow-right-rotate"]
    
    inline def `arrow-right-to-arc`: "arrow-right-to-arc" = "arrow-right-to-arc".asInstanceOf["arrow-right-to-arc"]
    
    inline def `arrow-right-to-bracket`: "arrow-right-to-bracket" = "arrow-right-to-bracket".asInstanceOf["arrow-right-to-bracket"]
    
    inline def `arrow-right-to-city`: "arrow-right-to-city" = "arrow-right-to-city".asInstanceOf["arrow-right-to-city"]
    
    inline def `arrow-right-to-file`: "arrow-right-to-file" = "arrow-right-to-file".asInstanceOf["arrow-right-to-file"]
    
    inline def `arrow-right-to-line`: "arrow-right-to-line" = "arrow-right-to-line".asInstanceOf["arrow-right-to-line"]
    
    inline def `arrow-rotate-back`: "arrow-rotate-back" = "arrow-rotate-back".asInstanceOf["arrow-rotate-back"]
    
    inline def `arrow-rotate-backward`: "arrow-rotate-backward" = "arrow-rotate-backward".asInstanceOf["arrow-rotate-backward"]
    
    inline def `arrow-rotate-forward`: "arrow-rotate-forward" = "arrow-rotate-forward".asInstanceOf["arrow-rotate-forward"]
    
    inline def `arrow-rotate-left`: "arrow-rotate-left" = "arrow-rotate-left".asInstanceOf["arrow-rotate-left"]
    
    inline def `arrow-rotate-right`: "arrow-rotate-right" = "arrow-rotate-right".asInstanceOf["arrow-rotate-right"]
    
    inline def `arrow-square-down`: "arrow-square-down" = "arrow-square-down".asInstanceOf["arrow-square-down"]
    
    inline def `arrow-square-left`: "arrow-square-left" = "arrow-square-left".asInstanceOf["arrow-square-left"]
    
    inline def `arrow-square-right`: "arrow-square-right" = "arrow-square-right".asInstanceOf["arrow-square-right"]
    
    inline def `arrow-square-up`: "arrow-square-up" = "arrow-square-up".asInstanceOf["arrow-square-up"]
    
    inline def `arrow-to-bottom`: "arrow-to-bottom" = "arrow-to-bottom".asInstanceOf["arrow-to-bottom"]
    
    inline def `arrow-to-left`: "arrow-to-left" = "arrow-to-left".asInstanceOf["arrow-to-left"]
    
    inline def `arrow-to-right`: "arrow-to-right" = "arrow-to-right".asInstanceOf["arrow-to-right"]
    
    inline def `arrow-to-top`: "arrow-to-top" = "arrow-to-top".asInstanceOf["arrow-to-top"]
    
    inline def `arrow-trend-down`: "arrow-trend-down" = "arrow-trend-down".asInstanceOf["arrow-trend-down"]
    
    inline def `arrow-trend-up`: "arrow-trend-up" = "arrow-trend-up".asInstanceOf["arrow-trend-up"]
    
    inline def `arrow-turn-down`: "arrow-turn-down" = "arrow-turn-down".asInstanceOf["arrow-turn-down"]
    
    inline def `arrow-turn-down-left`: "arrow-turn-down-left" = "arrow-turn-down-left".asInstanceOf["arrow-turn-down-left"]
    
    inline def `arrow-turn-down-right`: "arrow-turn-down-right" = "arrow-turn-down-right".asInstanceOf["arrow-turn-down-right"]
    
    inline def `arrow-turn-right`: "arrow-turn-right" = "arrow-turn-right".asInstanceOf["arrow-turn-right"]
    
    inline def `arrow-turn-up`: "arrow-turn-up" = "arrow-turn-up".asInstanceOf["arrow-turn-up"]
    
    inline def `arrow-up`: "arrow-up" = "arrow-up".asInstanceOf["arrow-up"]
    
    inline def `arrow-up-1-9`: "arrow-up-1-9" = "arrow-up-1-9".asInstanceOf["arrow-up-1-9"]
    
    inline def `arrow-up-9-1`: "arrow-up-9-1" = "arrow-up-9-1".asInstanceOf["arrow-up-9-1"]
    
    inline def `arrow-up-a-z`: "arrow-up-a-z" = "arrow-up-a-z".asInstanceOf["arrow-up-a-z"]
    
    inline def `arrow-up-arrow-down`: "arrow-up-arrow-down" = "arrow-up-arrow-down".asInstanceOf["arrow-up-arrow-down"]
    
    inline def `arrow-up-big-small`: "arrow-up-big-small" = "arrow-up-big-small".asInstanceOf["arrow-up-big-small"]
    
    inline def `arrow-up-from-arc`: "arrow-up-from-arc" = "arrow-up-from-arc".asInstanceOf["arrow-up-from-arc"]
    
    inline def `arrow-up-from-bracket`: "arrow-up-from-bracket" = "arrow-up-from-bracket".asInstanceOf["arrow-up-from-bracket"]
    
    inline def `arrow-up-from-dotted-line`: "arrow-up-from-dotted-line" = "arrow-up-from-dotted-line".asInstanceOf["arrow-up-from-dotted-line"]
    
    inline def `arrow-up-from-ground-water`: "arrow-up-from-ground-water" = "arrow-up-from-ground-water".asInstanceOf["arrow-up-from-ground-water"]
    
    inline def `arrow-up-from-line`: "arrow-up-from-line" = "arrow-up-from-line".asInstanceOf["arrow-up-from-line"]
    
    inline def `arrow-up-from-square`: "arrow-up-from-square" = "arrow-up-from-square".asInstanceOf["arrow-up-from-square"]
    
    inline def `arrow-up-from-water-pump`: "arrow-up-from-water-pump" = "arrow-up-from-water-pump".asInstanceOf["arrow-up-from-water-pump"]
    
    inline def `arrow-up-left`: "arrow-up-left" = "arrow-up-left".asInstanceOf["arrow-up-left"]
    
    inline def `arrow-up-left-from-circle`: "arrow-up-left-from-circle" = "arrow-up-left-from-circle".asInstanceOf["arrow-up-left-from-circle"]
    
    inline def `arrow-up-long`: "arrow-up-long" = "arrow-up-long".asInstanceOf["arrow-up-long"]
    
    inline def `arrow-up-right`: "arrow-up-right" = "arrow-up-right".asInstanceOf["arrow-up-right"]
    
    inline def `arrow-up-right-and-arrow-down-left-from-center`: "arrow-up-right-and-arrow-down-left-from-center" = "arrow-up-right-and-arrow-down-left-from-center".asInstanceOf["arrow-up-right-and-arrow-down-left-from-center"]
    
    inline def `arrow-up-right-dots`: "arrow-up-right-dots" = "arrow-up-right-dots".asInstanceOf["arrow-up-right-dots"]
    
    inline def `arrow-up-right-from-square`: "arrow-up-right-from-square" = "arrow-up-right-from-square".asInstanceOf["arrow-up-right-from-square"]
    
    inline def `arrow-up-short-wide`: "arrow-up-short-wide" = "arrow-up-short-wide".asInstanceOf["arrow-up-short-wide"]
    
    inline def `arrow-up-small-big`: "arrow-up-small-big" = "arrow-up-small-big".asInstanceOf["arrow-up-small-big"]
    
    inline def `arrow-up-square-triangle`: "arrow-up-square-triangle" = "arrow-up-square-triangle".asInstanceOf["arrow-up-square-triangle"]
    
    inline def `arrow-up-to-dotted-line`: "arrow-up-to-dotted-line" = "arrow-up-to-dotted-line".asInstanceOf["arrow-up-to-dotted-line"]
    
    inline def `arrow-up-to-line`: "arrow-up-to-line" = "arrow-up-to-line".asInstanceOf["arrow-up-to-line"]
    
    inline def `arrow-up-triangle-square`: "arrow-up-triangle-square" = "arrow-up-triangle-square".asInstanceOf["arrow-up-triangle-square"]
    
    inline def `arrow-up-wide-short`: "arrow-up-wide-short" = "arrow-up-wide-short".asInstanceOf["arrow-up-wide-short"]
    
    inline def `arrow-up-z-a`: "arrow-up-z-a" = "arrow-up-z-a".asInstanceOf["arrow-up-z-a"]
    
    inline def arrows: "arrows" = "arrows".asInstanceOf["arrows"]
    
    inline def `arrows-alt`: "arrows-alt" = "arrows-alt".asInstanceOf["arrows-alt"]
    
    inline def `arrows-alt-h`: "arrows-alt-h" = "arrows-alt-h".asInstanceOf["arrows-alt-h"]
    
    inline def `arrows-alt-v`: "arrows-alt-v" = "arrows-alt-v".asInstanceOf["arrows-alt-v"]
    
    inline def `arrows-cross`: "arrows-cross" = "arrows-cross".asInstanceOf["arrows-cross"]
    
    inline def `arrows-down-to-line`: "arrows-down-to-line" = "arrows-down-to-line".asInstanceOf["arrows-down-to-line"]
    
    inline def `arrows-down-to-people`: "arrows-down-to-people" = "arrows-down-to-people".asInstanceOf["arrows-down-to-people"]
    
    inline def `arrows-from-dotted-line`: "arrows-from-dotted-line" = "arrows-from-dotted-line".asInstanceOf["arrows-from-dotted-line"]
    
    inline def `arrows-from-line`: "arrows-from-line" = "arrows-from-line".asInstanceOf["arrows-from-line"]
    
    inline def `arrows-h`: "arrows-h" = "arrows-h".asInstanceOf["arrows-h"]
    
    inline def `arrows-left-right`: "arrows-left-right" = "arrows-left-right".asInstanceOf["arrows-left-right"]
    
    inline def `arrows-left-right-to-line`: "arrows-left-right-to-line" = "arrows-left-right-to-line".asInstanceOf["arrows-left-right-to-line"]
    
    inline def `arrows-maximize`: "arrows-maximize" = "arrows-maximize".asInstanceOf["arrows-maximize"]
    
    inline def `arrows-minimize`: "arrows-minimize" = "arrows-minimize".asInstanceOf["arrows-minimize"]
    
    inline def `arrows-repeat`: "arrows-repeat" = "arrows-repeat".asInstanceOf["arrows-repeat"]
    
    inline def `arrows-repeat-1`: "arrows-repeat-1" = "arrows-repeat-1".asInstanceOf["arrows-repeat-1"]
    
    inline def `arrows-retweet`: "arrows-retweet" = "arrows-retweet".asInstanceOf["arrows-retweet"]
    
    inline def `arrows-rotate`: "arrows-rotate" = "arrows-rotate".asInstanceOf["arrows-rotate"]
    
    inline def `arrows-spin`: "arrows-spin" = "arrows-spin".asInstanceOf["arrows-spin"]
    
    inline def `arrows-split-up-and-left`: "arrows-split-up-and-left" = "arrows-split-up-and-left".asInstanceOf["arrows-split-up-and-left"]
    
    inline def `arrows-to-circle`: "arrows-to-circle" = "arrows-to-circle".asInstanceOf["arrows-to-circle"]
    
    inline def `arrows-to-dot`: "arrows-to-dot" = "arrows-to-dot".asInstanceOf["arrows-to-dot"]
    
    inline def `arrows-to-dotted-line`: "arrows-to-dotted-line" = "arrows-to-dotted-line".asInstanceOf["arrows-to-dotted-line"]
    
    inline def `arrows-to-eye`: "arrows-to-eye" = "arrows-to-eye".asInstanceOf["arrows-to-eye"]
    
    inline def `arrows-to-line`: "arrows-to-line" = "arrows-to-line".asInstanceOf["arrows-to-line"]
    
    inline def `arrows-turn-right`: "arrows-turn-right" = "arrows-turn-right".asInstanceOf["arrows-turn-right"]
    
    inline def `arrows-turn-to-dots`: "arrows-turn-to-dots" = "arrows-turn-to-dots".asInstanceOf["arrows-turn-to-dots"]
    
    inline def `arrows-up-down`: "arrows-up-down" = "arrows-up-down".asInstanceOf["arrows-up-down"]
    
    inline def `arrows-up-down-left-right`: "arrows-up-down-left-right" = "arrows-up-down-left-right".asInstanceOf["arrows-up-down-left-right"]
    
    inline def `arrows-up-to-line`: "arrows-up-to-line" = "arrows-up-to-line".asInstanceOf["arrows-up-to-line"]
    
    inline def `arrows-v`: "arrows-v" = "arrows-v".asInstanceOf["arrows-v"]
    
    inline def artstation: "artstation" = "artstation".asInstanceOf["artstation"]
    
    inline def `asl-interpreting`: "asl-interpreting" = "asl-interpreting".asInstanceOf["asl-interpreting"]
    
    inline def `assistive-listening-systems`: "assistive-listening-systems" = "assistive-listening-systems".asInstanceOf["assistive-listening-systems"]
    
    inline def asterisk: "asterisk" = "asterisk".asInstanceOf["asterisk"]
    
    inline def asymmetrik: "asymmetrik" = "asymmetrik".asInstanceOf["asymmetrik"]
    
    inline def at: "at" = "at".asInstanceOf["at"]
    
    inline def atlas: "atlas" = "atlas".asInstanceOf["atlas"]
    
    inline def atlassian: "atlassian" = "atlassian".asInstanceOf["atlassian"]
    
    inline def atom: "atom" = "atom".asInstanceOf["atom"]
    
    inline def `atom-alt`: "atom-alt" = "atom-alt".asInstanceOf["atom-alt"]
    
    inline def `atom-simple`: "atom-simple" = "atom-simple".asInstanceOf["atom-simple"]
    
    inline def audible: "audible" = "audible".asInstanceOf["audible"]
    
    inline def `audio-description`: "audio-description" = "audio-description".asInstanceOf["audio-description"]
    
    inline def `audio-description-slash`: "audio-description-slash" = "audio-description-slash".asInstanceOf["audio-description-slash"]
    
    inline def `austral-sign`: "austral-sign" = "austral-sign".asInstanceOf["austral-sign"]
    
    inline def automobile: "automobile" = "automobile".asInstanceOf["automobile"]
    
    inline def autoprefixer: "autoprefixer" = "autoprefixer".asInstanceOf["autoprefixer"]
    
    inline def avianex: "avianex" = "avianex".asInstanceOf["avianex"]
    
    inline def aviato: "aviato" = "aviato".asInstanceOf["aviato"]
    
    inline def avocado: "avocado" = "avocado".asInstanceOf["avocado"]
    
    inline def award: "award" = "award".asInstanceOf["award"]
    
    inline def `award-simple`: "award-simple" = "award-simple".asInstanceOf["award-simple"]
    
    inline def aws: "aws" = "aws".asInstanceOf["aws"]
    
    inline def axe: "axe" = "axe".asInstanceOf["axe"]
    
    inline def `axe-battle`: "axe-battle" = "axe-battle".asInstanceOf["axe-battle"]
    
    inline def b: "b" = "b".asInstanceOf["b"]
    
    inline def baby: "baby" = "baby".asInstanceOf["baby"]
    
    inline def `baby-carriage`: "baby-carriage" = "baby-carriage".asInstanceOf["baby-carriage"]
    
    inline def backpack: "backpack" = "backpack".asInstanceOf["backpack"]
    
    inline def backspace: "backspace" = "backspace".asInstanceOf["backspace"]
    
    inline def backward: "backward" = "backward".asInstanceOf["backward"]
    
    inline def `backward-fast`: "backward-fast" = "backward-fast".asInstanceOf["backward-fast"]
    
    inline def `backward-step`: "backward-step" = "backward-step".asInstanceOf["backward-step"]
    
    inline def bacon: "bacon" = "bacon".asInstanceOf["bacon"]
    
    inline def bacteria: "bacteria" = "bacteria".asInstanceOf["bacteria"]
    
    inline def bacterium: "bacterium" = "bacterium".asInstanceOf["bacterium"]
    
    inline def badge: "badge" = "badge".asInstanceOf["badge"]
    
    inline def `badge-check`: "badge-check" = "badge-check".asInstanceOf["badge-check"]
    
    inline def `badge-dollar`: "badge-dollar" = "badge-dollar".asInstanceOf["badge-dollar"]
    
    inline def `badge-percent`: "badge-percent" = "badge-percent".asInstanceOf["badge-percent"]
    
    inline def `badge-sheriff`: "badge-sheriff" = "badge-sheriff".asInstanceOf["badge-sheriff"]
    
    inline def `badger-honey`: "badger-honey" = "badger-honey".asInstanceOf["badger-honey"]
    
    inline def badminton: "badminton" = "badminton".asInstanceOf["badminton"]
    
    inline def `bag-shopping`: "bag-shopping" = "bag-shopping".asInstanceOf["bag-shopping"]
    
    inline def bagel: "bagel" = "bagel".asInstanceOf["bagel"]
    
    inline def `bags-shopping`: "bags-shopping" = "bags-shopping".asInstanceOf["bags-shopping"]
    
    inline def baguette: "baguette" = "baguette".asInstanceOf["baguette"]
    
    inline def bahai: "bahai" = "bahai".asInstanceOf["bahai"]
    
    inline def `baht-sign`: "baht-sign" = "baht-sign".asInstanceOf["baht-sign"]
    
    inline def `balance-scale`: "balance-scale" = "balance-scale".asInstanceOf["balance-scale"]
    
    inline def `balance-scale-left`: "balance-scale-left" = "balance-scale-left".asInstanceOf["balance-scale-left"]
    
    inline def `balance-scale-right`: "balance-scale-right" = "balance-scale-right".asInstanceOf["balance-scale-right"]
    
    inline def `ball-pile`: "ball-pile" = "ball-pile".asInstanceOf["ball-pile"]
    
    inline def balloon: "balloon" = "balloon".asInstanceOf["balloon"]
    
    inline def balloons: "balloons" = "balloons".asInstanceOf["balloons"]
    
    inline def ballot: "ballot" = "ballot".asInstanceOf["ballot"]
    
    inline def `ballot-check`: "ballot-check" = "ballot-check".asInstanceOf["ballot-check"]
    
    inline def ban: "ban" = "ban".asInstanceOf["ban"]
    
    inline def `ban-bug`: "ban-bug" = "ban-bug".asInstanceOf["ban-bug"]
    
    inline def `ban-parking`: "ban-parking" = "ban-parking".asInstanceOf["ban-parking"]
    
    inline def `ban-smoking`: "ban-smoking" = "ban-smoking".asInstanceOf["ban-smoking"]
    
    inline def banana: "banana" = "banana".asInstanceOf["banana"]
    
    inline def `band-aid`: "band-aid" = "band-aid".asInstanceOf["band-aid"]
    
    inline def bandage: "bandage" = "bandage".asInstanceOf["bandage"]
    
    inline def bandcamp: "bandcamp" = "bandcamp".asInstanceOf["bandcamp"]
    
    inline def `bangladeshi-taka-sign`: "bangladeshi-taka-sign" = "bangladeshi-taka-sign".asInstanceOf["bangladeshi-taka-sign"]
    
    inline def banjo: "banjo" = "banjo".asInstanceOf["banjo"]
    
    inline def bank: "bank" = "bank".asInstanceOf["bank"]
    
    inline def `bar-chart`: "bar-chart" = "bar-chart".asInstanceOf["bar-chart"]
    
    inline def barcode: "barcode" = "barcode".asInstanceOf["barcode"]
    
    inline def `barcode-alt`: "barcode-alt" = "barcode-alt".asInstanceOf["barcode-alt"]
    
    inline def `barcode-read`: "barcode-read" = "barcode-read".asInstanceOf["barcode-read"]
    
    inline def `barcode-scan`: "barcode-scan" = "barcode-scan".asInstanceOf["barcode-scan"]
    
    inline def `barn-silo`: "barn-silo" = "barn-silo".asInstanceOf["barn-silo"]
    
    inline def bars: "bars" = "bars".asInstanceOf["bars"]
    
    inline def `bars-filter`: "bars-filter" = "bars-filter".asInstanceOf["bars-filter"]
    
    inline def `bars-progress`: "bars-progress" = "bars-progress".asInstanceOf["bars-progress"]
    
    inline def `bars-sort`: "bars-sort" = "bars-sort".asInstanceOf["bars-sort"]
    
    inline def `bars-staggered`: "bars-staggered" = "bars-staggered".asInstanceOf["bars-staggered"]
    
    inline def baseball: "baseball" = "baseball".asInstanceOf["baseball"]
    
    inline def `baseball-ball`: "baseball-ball" = "baseball-ball".asInstanceOf["baseball-ball"]
    
    inline def `baseball-bat-ball`: "baseball-bat-ball" = "baseball-bat-ball".asInstanceOf["baseball-bat-ball"]
    
    inline def `basket-shopping`: "basket-shopping" = "basket-shopping".asInstanceOf["basket-shopping"]
    
    inline def `basket-shopping-simple`: "basket-shopping-simple" = "basket-shopping-simple".asInstanceOf["basket-shopping-simple"]
    
    inline def basketball: "basketball" = "basketball".asInstanceOf["basketball"]
    
    inline def `basketball-ball`: "basketball-ball" = "basketball-ball".asInstanceOf["basketball-ball"]
    
    inline def `basketball-hoop`: "basketball-hoop" = "basketball-hoop".asInstanceOf["basketball-hoop"]
    
    inline def bat: "bat" = "bat".asInstanceOf["bat"]
    
    inline def bath: "bath" = "bath".asInstanceOf["bath"]
    
    inline def bathtub: "bathtub" = "bathtub".asInstanceOf["bathtub"]
    
    inline def battery: "battery" = "battery".asInstanceOf["battery"]
    
    inline def `battery-bolt`: "battery-bolt" = "battery-bolt".asInstanceOf["battery-bolt"]
    
    inline def `battery-car`: "battery-car" = "battery-car".asInstanceOf["battery-car"]
    
    inline def `battery-empty`: "battery-empty" = "battery-empty".asInstanceOf["battery-empty"]
    
    inline def `battery-exclamation`: "battery-exclamation" = "battery-exclamation".asInstanceOf["battery-exclamation"]
    
    inline def `battery-full`: "battery-full" = "battery-full".asInstanceOf["battery-full"]
    
    inline def `battery-half`: "battery-half" = "battery-half".asInstanceOf["battery-half"]
    
    inline def `battery-low`: "battery-low" = "battery-low".asInstanceOf["battery-low"]
    
    inline def `battery-quarter`: "battery-quarter" = "battery-quarter".asInstanceOf["battery-quarter"]
    
    inline def `battery-slash`: "battery-slash" = "battery-slash".asInstanceOf["battery-slash"]
    
    inline def `battery-three-quarters`: "battery-three-quarters" = "battery-three-quarters".asInstanceOf["battery-three-quarters"]
    
    inline def battery0: "battery0" = "battery0".asInstanceOf["battery0"]
    
    inline def battery1: "battery1" = "battery1".asInstanceOf["battery1"]
    
    inline def battery2: "battery2" = "battery2".asInstanceOf["battery2"]
    
    inline def battery3: "battery3" = "battery3".asInstanceOf["battery3"]
    
    inline def battery4: "battery4" = "battery4".asInstanceOf["battery4"]
    
    inline def battery5: "battery5" = "battery5".asInstanceOf["battery5"]
    
    inline def `battle-net`: "battle-net" = "battle-net".asInstanceOf["battle-net"]
    
    inline def bed: "bed" = "bed".asInstanceOf["bed"]
    
    inline def `bed-alt`: "bed-alt" = "bed-alt".asInstanceOf["bed-alt"]
    
    inline def `bed-bunk`: "bed-bunk" = "bed-bunk".asInstanceOf["bed-bunk"]
    
    inline def `bed-empty`: "bed-empty" = "bed-empty".asInstanceOf["bed-empty"]
    
    inline def `bed-front`: "bed-front" = "bed-front".asInstanceOf["bed-front"]
    
    inline def `bed-pulse`: "bed-pulse" = "bed-pulse".asInstanceOf["bed-pulse"]
    
    inline def bee: "bee" = "bee".asInstanceOf["bee"]
    
    inline def beer: "beer" = "beer".asInstanceOf["beer"]
    
    inline def `beer-foam`: "beer-foam" = "beer-foam".asInstanceOf["beer-foam"]
    
    inline def `beer-mug`: "beer-mug" = "beer-mug".asInstanceOf["beer-mug"]
    
    inline def `beer-mug-empty`: "beer-mug-empty" = "beer-mug-empty".asInstanceOf["beer-mug-empty"]
    
    inline def behance: "behance" = "behance".asInstanceOf["behance"]
    
    inline def `behance-square`: "behance-square" = "behance-square".asInstanceOf["behance-square"]
    
    inline def bell: "bell" = "bell".asInstanceOf["bell"]
    
    inline def `bell-concierge`: "bell-concierge" = "bell-concierge".asInstanceOf["bell-concierge"]
    
    inline def `bell-exclamation`: "bell-exclamation" = "bell-exclamation".asInstanceOf["bell-exclamation"]
    
    inline def `bell-on`: "bell-on" = "bell-on".asInstanceOf["bell-on"]
    
    inline def `bell-plus`: "bell-plus" = "bell-plus".asInstanceOf["bell-plus"]
    
    inline def `bell-school`: "bell-school" = "bell-school".asInstanceOf["bell-school"]
    
    inline def `bell-school-slash`: "bell-school-slash" = "bell-school-slash".asInstanceOf["bell-school-slash"]
    
    inline def `bell-slash`: "bell-slash" = "bell-slash".asInstanceOf["bell-slash"]
    
    inline def bells: "bells" = "bells".asInstanceOf["bells"]
    
    inline def `bench-tree`: "bench-tree" = "bench-tree".asInstanceOf["bench-tree"]
    
    inline def betamax: "betamax" = "betamax".asInstanceOf["betamax"]
    
    inline def `bezier-curve`: "bezier-curve" = "bezier-curve".asInstanceOf["bezier-curve"]
    
    inline def bible: "bible" = "bible".asInstanceOf["bible"]
    
    inline def bicycle: "bicycle" = "bicycle".asInstanceOf["bicycle"]
    
    inline def biking: "biking" = "biking".asInstanceOf["biking"]
    
    inline def `biking-mountain`: "biking-mountain" = "biking-mountain".asInstanceOf["biking-mountain"]
    
    inline def bilibili: "bilibili" = "bilibili".asInstanceOf["bilibili"]
    
    inline def bimobject: "bimobject" = "bimobject".asInstanceOf["bimobject"]
    
    inline def binary: "binary" = "binary".asInstanceOf["binary"]
    
    inline def `binary-circle-check`: "binary-circle-check" = "binary-circle-check".asInstanceOf["binary-circle-check"]
    
    inline def `binary-lock`: "binary-lock" = "binary-lock".asInstanceOf["binary-lock"]
    
    inline def `binary-slash`: "binary-slash" = "binary-slash".asInstanceOf["binary-slash"]
    
    inline def binoculars: "binoculars" = "binoculars".asInstanceOf["binoculars"]
    
    inline def biohazard: "biohazard" = "biohazard".asInstanceOf["biohazard"]
    
    inline def bird: "bird" = "bird".asInstanceOf["bird"]
    
    inline def `birthday-cake`: "birthday-cake" = "birthday-cake".asInstanceOf["birthday-cake"]
    
    inline def bitbucket: "bitbucket" = "bitbucket".asInstanceOf["bitbucket"]
    
    inline def bitcoin: "bitcoin" = "bitcoin".asInstanceOf["bitcoin"]
    
    inline def `bitcoin-sign`: "bitcoin-sign" = "bitcoin-sign".asInstanceOf["bitcoin-sign"]
    
    inline def bity: "bity" = "bity".asInstanceOf["bity"]
    
    inline def `black-tie`: "black-tie" = "black-tie".asInstanceOf["black-tie"]
    
    inline def blackberry: "blackberry" = "blackberry".asInstanceOf["blackberry"]
    
    inline def blackboard: "blackboard" = "blackboard".asInstanceOf["blackboard"]
    
    inline def blanket: "blanket" = "blanket".asInstanceOf["blanket"]
    
    inline def `blanket-fire`: "blanket-fire" = "blanket-fire".asInstanceOf["blanket-fire"]
    
    inline def blender: "blender" = "blender".asInstanceOf["blender"]
    
    inline def `blender-phone`: "blender-phone" = "blender-phone".asInstanceOf["blender-phone"]
    
    inline def blind: "blind" = "blind".asInstanceOf["blind"]
    
    inline def blinds: "blinds" = "blinds".asInstanceOf["blinds"]
    
    inline def `blinds-open`: "blinds-open" = "blinds-open".asInstanceOf["blinds-open"]
    
    inline def `blinds-raised`: "blinds-raised" = "blinds-raised".asInstanceOf["blinds-raised"]
    
    inline def block: "block" = "block".asInstanceOf["block"]
    
    inline def `block-brick`: "block-brick" = "block-brick".asInstanceOf["block-brick"]
    
    inline def `block-brick-fire`: "block-brick-fire" = "block-brick-fire".asInstanceOf["block-brick-fire"]
    
    inline def `block-question`: "block-question" = "block-question".asInstanceOf["block-question"]
    
    inline def `block-quote`: "block-quote" = "block-quote".asInstanceOf["block-quote"]
    
    inline def blog: "blog" = "blog".asInstanceOf["blog"]
    
    inline def blogger: "blogger" = "blogger".asInstanceOf["blogger"]
    
    inline def `blogger-b`: "blogger-b" = "blogger-b".asInstanceOf["blogger-b"]
    
    inline def blueberries: "blueberries" = "blueberries".asInstanceOf["blueberries"]
    
    inline def bluetooth: "bluetooth" = "bluetooth".asInstanceOf["bluetooth"]
    
    inline def `bluetooth-b`: "bluetooth-b" = "bluetooth-b".asInstanceOf["bluetooth-b"]
    
    inline def bold: "bold" = "bold".asInstanceOf["bold"]
    
    inline def bolt: "bolt" = "bolt".asInstanceOf["bolt"]
    
    inline def `bolt-auto`: "bolt-auto" = "bolt-auto".asInstanceOf["bolt-auto"]
    
    inline def `bolt-lightning`: "bolt-lightning" = "bolt-lightning".asInstanceOf["bolt-lightning"]
    
    inline def `bolt-slash`: "bolt-slash" = "bolt-slash".asInstanceOf["bolt-slash"]
    
    inline def bomb: "bomb" = "bomb".asInstanceOf["bomb"]
    
    inline def bone: "bone" = "bone".asInstanceOf["bone"]
    
    inline def `bone-break`: "bone-break" = "bone-break".asInstanceOf["bone-break"]
    
    inline def bong: "bong" = "bong".asInstanceOf["bong"]
    
    inline def book: "book" = "book".asInstanceOf["book"]
    
    inline def `book-alt`: "book-alt" = "book-alt".asInstanceOf["book-alt"]
    
    inline def `book-arrow-right`: "book-arrow-right" = "book-arrow-right".asInstanceOf["book-arrow-right"]
    
    inline def `book-arrow-up`: "book-arrow-up" = "book-arrow-up".asInstanceOf["book-arrow-up"]
    
    inline def `book-atlas`: "book-atlas" = "book-atlas".asInstanceOf["book-atlas"]
    
    inline def `book-bible`: "book-bible" = "book-bible".asInstanceOf["book-bible"]
    
    inline def `book-blank`: "book-blank" = "book-blank".asInstanceOf["book-blank"]
    
    inline def `book-bookmark`: "book-bookmark" = "book-bookmark".asInstanceOf["book-bookmark"]
    
    inline def `book-circle`: "book-circle" = "book-circle".asInstanceOf["book-circle"]
    
    inline def `book-circle-arrow-right`: "book-circle-arrow-right" = "book-circle-arrow-right".asInstanceOf["book-circle-arrow-right"]
    
    inline def `book-circle-arrow-up`: "book-circle-arrow-up" = "book-circle-arrow-up".asInstanceOf["book-circle-arrow-up"]
    
    inline def `book-copy`: "book-copy" = "book-copy".asInstanceOf["book-copy"]
    
    inline def `book-dead`: "book-dead" = "book-dead".asInstanceOf["book-dead"]
    
    inline def `book-font`: "book-font" = "book-font".asInstanceOf["book-font"]
    
    inline def `book-heart`: "book-heart" = "book-heart".asInstanceOf["book-heart"]
    
    inline def `book-journal-whills`: "book-journal-whills" = "book-journal-whills".asInstanceOf["book-journal-whills"]
    
    inline def `book-law`: "book-law" = "book-law".asInstanceOf["book-law"]
    
    inline def `book-medical`: "book-medical" = "book-medical".asInstanceOf["book-medical"]
    
    inline def `book-open`: "book-open" = "book-open".asInstanceOf["book-open"]
    
    inline def `book-open-alt`: "book-open-alt" = "book-open-alt".asInstanceOf["book-open-alt"]
    
    inline def `book-open-cover`: "book-open-cover" = "book-open-cover".asInstanceOf["book-open-cover"]
    
    inline def `book-open-reader`: "book-open-reader" = "book-open-reader".asInstanceOf["book-open-reader"]
    
    inline def `book-quran`: "book-quran" = "book-quran".asInstanceOf["book-quran"]
    
    inline def `book-reader`: "book-reader" = "book-reader".asInstanceOf["book-reader"]
    
    inline def `book-section`: "book-section" = "book-section".asInstanceOf["book-section"]
    
    inline def `book-skull`: "book-skull" = "book-skull".asInstanceOf["book-skull"]
    
    inline def `book-sparkles`: "book-sparkles" = "book-sparkles".asInstanceOf["book-sparkles"]
    
    inline def `book-spells`: "book-spells" = "book-spells".asInstanceOf["book-spells"]
    
    inline def `book-tanakh`: "book-tanakh" = "book-tanakh".asInstanceOf["book-tanakh"]
    
    inline def `book-user`: "book-user" = "book-user".asInstanceOf["book-user"]
    
    inline def bookmark: "bookmark" = "bookmark".asInstanceOf["bookmark"]
    
    inline def `bookmark-circle`: "bookmark-circle" = "bookmark-circle".asInstanceOf["bookmark-circle"]
    
    inline def `bookmark-slash`: "bookmark-slash" = "bookmark-slash".asInstanceOf["bookmark-slash"]
    
    inline def books: "books" = "books".asInstanceOf["books"]
    
    inline def `books-medical`: "books-medical" = "books-medical".asInstanceOf["books-medical"]
    
    inline def boombox: "boombox" = "boombox".asInstanceOf["boombox"]
    
    inline def boot: "boot" = "boot".asInstanceOf["boot"]
    
    inline def `boot-heeled`: "boot-heeled" = "boot-heeled".asInstanceOf["boot-heeled"]
    
    inline def `booth-curtain`: "booth-curtain" = "booth-curtain".asInstanceOf["booth-curtain"]
    
    inline def bootstrap: "bootstrap" = "bootstrap".asInstanceOf["bootstrap"]
    
    inline def `border-all`: "border-all" = "border-all".asInstanceOf["border-all"]
    
    inline def `border-bottom`: "border-bottom" = "border-bottom".asInstanceOf["border-bottom"]
    
    inline def `border-bottom-right`: "border-bottom-right" = "border-bottom-right".asInstanceOf["border-bottom-right"]
    
    inline def `border-center-h`: "border-center-h" = "border-center-h".asInstanceOf["border-center-h"]
    
    inline def `border-center-v`: "border-center-v" = "border-center-v".asInstanceOf["border-center-v"]
    
    inline def `border-inner`: "border-inner" = "border-inner".asInstanceOf["border-inner"]
    
    inline def `border-left`: "border-left" = "border-left".asInstanceOf["border-left"]
    
    inline def `border-none`: "border-none" = "border-none".asInstanceOf["border-none"]
    
    inline def `border-outer`: "border-outer" = "border-outer".asInstanceOf["border-outer"]
    
    inline def `border-right`: "border-right" = "border-right".asInstanceOf["border-right"]
    
    inline def `border-style`: "border-style" = "border-style".asInstanceOf["border-style"]
    
    inline def `border-style-alt`: "border-style-alt" = "border-style-alt".asInstanceOf["border-style-alt"]
    
    inline def `border-top`: "border-top" = "border-top".asInstanceOf["border-top"]
    
    inline def `border-top-left`: "border-top-left" = "border-top-left".asInstanceOf["border-top-left"]
    
    inline def `bore-hole`: "bore-hole" = "bore-hole".asInstanceOf["bore-hole"]
    
    inline def bots: "bots" = "bots".asInstanceOf["bots"]
    
    inline def `bottle-droplet`: "bottle-droplet" = "bottle-droplet".asInstanceOf["bottle-droplet"]
    
    inline def `bottle-water`: "bottle-water" = "bottle-water".asInstanceOf["bottle-water"]
    
    inline def `bow-arrow`: "bow-arrow" = "bow-arrow".asInstanceOf["bow-arrow"]
    
    inline def `bowl-chopsticks`: "bowl-chopsticks" = "bowl-chopsticks".asInstanceOf["bowl-chopsticks"]
    
    inline def `bowl-chopsticks-noodles`: "bowl-chopsticks-noodles" = "bowl-chopsticks-noodles".asInstanceOf["bowl-chopsticks-noodles"]
    
    inline def `bowl-food`: "bowl-food" = "bowl-food".asInstanceOf["bowl-food"]
    
    inline def `bowl-hot`: "bowl-hot" = "bowl-hot".asInstanceOf["bowl-hot"]
    
    inline def `bowl-rice`: "bowl-rice" = "bowl-rice".asInstanceOf["bowl-rice"]
    
    inline def `bowl-salad`: "bowl-salad" = "bowl-salad".asInstanceOf["bowl-salad"]
    
    inline def `bowl-scoop`: "bowl-scoop" = "bowl-scoop".asInstanceOf["bowl-scoop"]
    
    inline def `bowl-scoops`: "bowl-scoops" = "bowl-scoops".asInstanceOf["bowl-scoops"]
    
    inline def `bowl-shaved-ice`: "bowl-shaved-ice" = "bowl-shaved-ice".asInstanceOf["bowl-shaved-ice"]
    
    inline def `bowl-soft-serve`: "bowl-soft-serve" = "bowl-soft-serve".asInstanceOf["bowl-soft-serve"]
    
    inline def `bowl-spoon`: "bowl-spoon" = "bowl-spoon".asInstanceOf["bowl-spoon"]
    
    inline def `bowling-ball`: "bowling-ball" = "bowling-ball".asInstanceOf["bowling-ball"]
    
    inline def `bowling-ball-pin`: "bowling-ball-pin" = "bowling-ball-pin".asInstanceOf["bowling-ball-pin"]
    
    inline def `bowling-pins`: "bowling-pins" = "bowling-pins".asInstanceOf["bowling-pins"]
    
    inline def box: "box" = "box".asInstanceOf["box"]
    
    inline def `box-alt`: "box-alt" = "box-alt".asInstanceOf["box-alt"]
    
    inline def `box-archive`: "box-archive" = "box-archive".asInstanceOf["box-archive"]
    
    inline def `box-ballot`: "box-ballot" = "box-ballot".asInstanceOf["box-ballot"]
    
    inline def `box-check`: "box-check" = "box-check".asInstanceOf["box-check"]
    
    inline def `box-circle-check`: "box-circle-check" = "box-circle-check".asInstanceOf["box-circle-check"]
    
    inline def `box-dollar`: "box-dollar" = "box-dollar".asInstanceOf["box-dollar"]
    
    inline def `box-fragile`: "box-fragile" = "box-fragile".asInstanceOf["box-fragile"]
    
    inline def `box-full`: "box-full" = "box-full".asInstanceOf["box-full"]
    
    inline def `box-heart`: "box-heart" = "box-heart".asInstanceOf["box-heart"]
    
    inline def `box-open`: "box-open" = "box-open".asInstanceOf["box-open"]
    
    inline def `box-open-full`: "box-open-full" = "box-open-full".asInstanceOf["box-open-full"]
    
    inline def `box-taped`: "box-taped" = "box-taped".asInstanceOf["box-taped"]
    
    inline def `box-tissue`: "box-tissue" = "box-tissue".asInstanceOf["box-tissue"]
    
    inline def `box-up`: "box-up" = "box-up".asInstanceOf["box-up"]
    
    inline def `box-usd`: "box-usd" = "box-usd".asInstanceOf["box-usd"]
    
    inline def boxes: "boxes" = "boxes".asInstanceOf["boxes"]
    
    inline def `boxes-alt`: "boxes-alt" = "boxes-alt".asInstanceOf["boxes-alt"]
    
    inline def `boxes-packing`: "boxes-packing" = "boxes-packing".asInstanceOf["boxes-packing"]
    
    inline def `boxes-stacked`: "boxes-stacked" = "boxes-stacked".asInstanceOf["boxes-stacked"]
    
    inline def `boxing-glove`: "boxing-glove" = "boxing-glove".asInstanceOf["boxing-glove"]
    
    inline def bracket: "bracket" = "bracket".asInstanceOf["bracket"]
    
    inline def `bracket-curly`: "bracket-curly" = "bracket-curly".asInstanceOf["bracket-curly"]
    
    inline def `bracket-curly-left`: "bracket-curly-left" = "bracket-curly-left".asInstanceOf["bracket-curly-left"]
    
    inline def `bracket-curly-right`: "bracket-curly-right" = "bracket-curly-right".asInstanceOf["bracket-curly-right"]
    
    inline def `bracket-left`: "bracket-left" = "bracket-left".asInstanceOf["bracket-left"]
    
    inline def `bracket-round`: "bracket-round" = "bracket-round".asInstanceOf["bracket-round"]
    
    inline def `bracket-round-right`: "bracket-round-right" = "bracket-round-right".asInstanceOf["bracket-round-right"]
    
    inline def `bracket-square`: "bracket-square" = "bracket-square".asInstanceOf["bracket-square"]
    
    inline def `bracket-square-right`: "bracket-square-right" = "bracket-square-right".asInstanceOf["bracket-square-right"]
    
    inline def brackets: "brackets" = "brackets".asInstanceOf["brackets"]
    
    inline def `brackets-curly`: "brackets-curly" = "brackets-curly".asInstanceOf["brackets-curly"]
    
    inline def `brackets-round`: "brackets-round" = "brackets-round".asInstanceOf["brackets-round"]
    
    inline def `brackets-square`: "brackets-square" = "brackets-square".asInstanceOf["brackets-square"]
    
    inline def braille: "braille" = "braille".asInstanceOf["braille"]
    
    inline def brain: "brain" = "brain".asInstanceOf["brain"]
    
    inline def `brain-arrow-curved-right`: "brain-arrow-curved-right" = "brain-arrow-curved-right".asInstanceOf["brain-arrow-curved-right"]
    
    inline def `brain-circuit`: "brain-circuit" = "brain-circuit".asInstanceOf["brain-circuit"]
    
    inline def `brake-warning`: "brake-warning" = "brake-warning".asInstanceOf["brake-warning"]
    
    inline def `brazilian-real-sign`: "brazilian-real-sign" = "brazilian-real-sign".asInstanceOf["brazilian-real-sign"]
    
    inline def `bread-loaf`: "bread-loaf" = "bread-loaf".asInstanceOf["bread-loaf"]
    
    inline def `bread-slice`: "bread-slice" = "bread-slice".asInstanceOf["bread-slice"]
    
    inline def `bread-slice-butter`: "bread-slice-butter" = "bread-slice-butter".asInstanceOf["bread-slice-butter"]
    
    inline def bridge: "bridge" = "bridge".asInstanceOf["bridge"]
    
    inline def `bridge-circle-check`: "bridge-circle-check" = "bridge-circle-check".asInstanceOf["bridge-circle-check"]
    
    inline def `bridge-circle-exclamation`: "bridge-circle-exclamation" = "bridge-circle-exclamation".asInstanceOf["bridge-circle-exclamation"]
    
    inline def `bridge-circle-xmark`: "bridge-circle-xmark" = "bridge-circle-xmark".asInstanceOf["bridge-circle-xmark"]
    
    inline def `bridge-lock`: "bridge-lock" = "bridge-lock".asInstanceOf["bridge-lock"]
    
    inline def `bridge-suspension`: "bridge-suspension" = "bridge-suspension".asInstanceOf["bridge-suspension"]
    
    inline def `bridge-water`: "bridge-water" = "bridge-water".asInstanceOf["bridge-water"]
    
    inline def briefcase: "briefcase" = "briefcase".asInstanceOf["briefcase"]
    
    inline def `briefcase-arrow-right`: "briefcase-arrow-right" = "briefcase-arrow-right".asInstanceOf["briefcase-arrow-right"]
    
    inline def `briefcase-blank`: "briefcase-blank" = "briefcase-blank".asInstanceOf["briefcase-blank"]
    
    inline def `briefcase-clock`: "briefcase-clock" = "briefcase-clock".asInstanceOf["briefcase-clock"]
    
    inline def `briefcase-medical`: "briefcase-medical" = "briefcase-medical".asInstanceOf["briefcase-medical"]
    
    inline def brightness: "brightness" = "brightness".asInstanceOf["brightness"]
    
    inline def `brightness-low`: "brightness-low" = "brightness-low".asInstanceOf["brightness-low"]
    
    inline def `bring-forward`: "bring-forward" = "bring-forward".asInstanceOf["bring-forward"]
    
    inline def `bring-front`: "bring-front" = "bring-front".asInstanceOf["bring-front"]
    
    inline def `broadcast-tower`: "broadcast-tower" = "broadcast-tower".asInstanceOf["broadcast-tower"]
    
    inline def broccoli: "broccoli" = "broccoli".asInstanceOf["broccoli"]
    
    inline def broom: "broom" = "broom".asInstanceOf["broom"]
    
    inline def `broom-ball`: "broom-ball" = "broom-ball".asInstanceOf["broom-ball"]
    
    inline def browser: "browser" = "browser".asInstanceOf["browser"]
    
    inline def browsers: "browsers" = "browsers".asInstanceOf["browsers"]
    
    inline def brush: "brush" = "brush".asInstanceOf["brush"]
    
    inline def btc: "btc" = "btc".asInstanceOf["btc"]
    
    inline def bucket: "bucket" = "bucket".asInstanceOf["bucket"]
    
    inline def buffer: "buffer" = "buffer".asInstanceOf["buffer"]
    
    inline def bug: "bug" = "bug".asInstanceOf["bug"]
    
    inline def `bug-slash`: "bug-slash" = "bug-slash".asInstanceOf["bug-slash"]
    
    inline def bugs: "bugs" = "bugs".asInstanceOf["bugs"]
    
    inline def building: "building" = "building".asInstanceOf["building"]
    
    inline def `building-circle-arrow-right`: "building-circle-arrow-right" = "building-circle-arrow-right".asInstanceOf["building-circle-arrow-right"]
    
    inline def `building-circle-check`: "building-circle-check" = "building-circle-check".asInstanceOf["building-circle-check"]
    
    inline def `building-circle-exclamation`: "building-circle-exclamation" = "building-circle-exclamation".asInstanceOf["building-circle-exclamation"]
    
    inline def `building-circle-xmark`: "building-circle-xmark" = "building-circle-xmark".asInstanceOf["building-circle-xmark"]
    
    inline def `building-columns`: "building-columns" = "building-columns".asInstanceOf["building-columns"]
    
    inline def `building-flag`: "building-flag" = "building-flag".asInstanceOf["building-flag"]
    
    inline def `building-lock`: "building-lock" = "building-lock".asInstanceOf["building-lock"]
    
    inline def `building-ngo`: "building-ngo" = "building-ngo".asInstanceOf["building-ngo"]
    
    inline def `building-shield`: "building-shield" = "building-shield".asInstanceOf["building-shield"]
    
    inline def `building-un`: "building-un" = "building-un".asInstanceOf["building-un"]
    
    inline def `building-user`: "building-user" = "building-user".asInstanceOf["building-user"]
    
    inline def `building-wheat`: "building-wheat" = "building-wheat".asInstanceOf["building-wheat"]
    
    inline def buildings: "buildings" = "buildings".asInstanceOf["buildings"]
    
    inline def bullhorn: "bullhorn" = "bullhorn".asInstanceOf["bullhorn"]
    
    inline def bullseye: "bullseye" = "bullseye".asInstanceOf["bullseye"]
    
    inline def `bullseye-arrow`: "bullseye-arrow" = "bullseye-arrow".asInstanceOf["bullseye-arrow"]
    
    inline def `bullseye-pointer`: "bullseye-pointer" = "bullseye-pointer".asInstanceOf["bullseye-pointer"]
    
    inline def buoy: "buoy" = "buoy".asInstanceOf["buoy"]
    
    inline def `buoy-mooring`: "buoy-mooring" = "buoy-mooring".asInstanceOf["buoy-mooring"]
    
    inline def burger: "burger" = "burger".asInstanceOf["burger"]
    
    inline def `burger-cheese`: "burger-cheese" = "burger-cheese".asInstanceOf["burger-cheese"]
    
    inline def `burger-fries`: "burger-fries" = "burger-fries".asInstanceOf["burger-fries"]
    
    inline def `burger-glass`: "burger-glass" = "burger-glass".asInstanceOf["burger-glass"]
    
    inline def `burger-lettuce`: "burger-lettuce" = "burger-lettuce".asInstanceOf["burger-lettuce"]
    
    inline def `burger-soda`: "burger-soda" = "burger-soda".asInstanceOf["burger-soda"]
    
    inline def burn: "burn" = "burn".asInstanceOf["burn"]
    
    inline def buromobelexperte: "buromobelexperte" = "buromobelexperte".asInstanceOf["buromobelexperte"]
    
    inline def burrito: "burrito" = "burrito".asInstanceOf["burrito"]
    
    inline def burst: "burst" = "burst".asInstanceOf["burst"]
    
    inline def bus: "bus" = "bus".asInstanceOf["bus"]
    
    inline def `bus-alt`: "bus-alt" = "bus-alt".asInstanceOf["bus-alt"]
    
    inline def `bus-school`: "bus-school" = "bus-school".asInstanceOf["bus-school"]
    
    inline def `bus-simple`: "bus-simple" = "bus-simple".asInstanceOf["bus-simple"]
    
    inline def `business-front`: "business-front" = "business-front".asInstanceOf["business-front"]
    
    inline def `business-time`: "business-time" = "business-time".asInstanceOf["business-time"]
    
    inline def butter: "butter" = "butter".asInstanceOf["butter"]
    
    inline def `buy-n-large`: "buy-n-large" = "buy-n-large".asInstanceOf["buy-n-large"]
    
    inline def buysellads: "buysellads" = "buysellads".asInstanceOf["buysellads"]
    
    inline def c: "c" = "c".asInstanceOf["c"]
    
    inline def cab: "cab" = "cab".asInstanceOf["cab"]
    
    inline def cabin: "cabin" = "cabin".asInstanceOf["cabin"]
    
    inline def `cabinet-filing`: "cabinet-filing" = "cabinet-filing".asInstanceOf["cabinet-filing"]
    
    inline def `cable-car`: "cable-car" = "cable-car".asInstanceOf["cable-car"]
    
    inline def cactus: "cactus" = "cactus".asInstanceOf["cactus"]
    
    inline def cake: "cake" = "cake".asInstanceOf["cake"]
    
    inline def `cake-candles`: "cake-candles" = "cake-candles".asInstanceOf["cake-candles"]
    
    inline def `cake-slice`: "cake-slice" = "cake-slice".asInstanceOf["cake-slice"]
    
    inline def calculator: "calculator" = "calculator".asInstanceOf["calculator"]
    
    inline def `calculator-alt`: "calculator-alt" = "calculator-alt".asInstanceOf["calculator-alt"]
    
    inline def `calculator-simple`: "calculator-simple" = "calculator-simple".asInstanceOf["calculator-simple"]
    
    inline def calendar: "calendar" = "calendar".asInstanceOf["calendar"]
    
    inline def `calendar-alt`: "calendar-alt" = "calendar-alt".asInstanceOf["calendar-alt"]
    
    inline def `calendar-arrow-down`: "calendar-arrow-down" = "calendar-arrow-down".asInstanceOf["calendar-arrow-down"]
    
    inline def `calendar-arrow-up`: "calendar-arrow-up" = "calendar-arrow-up".asInstanceOf["calendar-arrow-up"]
    
    inline def `calendar-check`: "calendar-check" = "calendar-check".asInstanceOf["calendar-check"]
    
    inline def `calendar-circle`: "calendar-circle" = "calendar-circle".asInstanceOf["calendar-circle"]
    
    inline def `calendar-circle-exclamation`: "calendar-circle-exclamation" = "calendar-circle-exclamation".asInstanceOf["calendar-circle-exclamation"]
    
    inline def `calendar-circle-minus`: "calendar-circle-minus" = "calendar-circle-minus".asInstanceOf["calendar-circle-minus"]
    
    inline def `calendar-circle-plus`: "calendar-circle-plus" = "calendar-circle-plus".asInstanceOf["calendar-circle-plus"]
    
    inline def `calendar-circle-user`: "calendar-circle-user" = "calendar-circle-user".asInstanceOf["calendar-circle-user"]
    
    inline def `calendar-clock`: "calendar-clock" = "calendar-clock".asInstanceOf["calendar-clock"]
    
    inline def `calendar-day`: "calendar-day" = "calendar-day".asInstanceOf["calendar-day"]
    
    inline def `calendar-days`: "calendar-days" = "calendar-days".asInstanceOf["calendar-days"]
    
    inline def `calendar-download`: "calendar-download" = "calendar-download".asInstanceOf["calendar-download"]
    
    inline def `calendar-edit`: "calendar-edit" = "calendar-edit".asInstanceOf["calendar-edit"]
    
    inline def `calendar-exclamation`: "calendar-exclamation" = "calendar-exclamation".asInstanceOf["calendar-exclamation"]
    
    inline def `calendar-heart`: "calendar-heart" = "calendar-heart".asInstanceOf["calendar-heart"]
    
    inline def `calendar-image`: "calendar-image" = "calendar-image".asInstanceOf["calendar-image"]
    
    inline def `calendar-lines`: "calendar-lines" = "calendar-lines".asInstanceOf["calendar-lines"]
    
    inline def `calendar-lines-pen`: "calendar-lines-pen" = "calendar-lines-pen".asInstanceOf["calendar-lines-pen"]
    
    inline def `calendar-minus`: "calendar-minus" = "calendar-minus".asInstanceOf["calendar-minus"]
    
    inline def `calendar-note`: "calendar-note" = "calendar-note".asInstanceOf["calendar-note"]
    
    inline def `calendar-pen`: "calendar-pen" = "calendar-pen".asInstanceOf["calendar-pen"]
    
    inline def `calendar-plus`: "calendar-plus" = "calendar-plus".asInstanceOf["calendar-plus"]
    
    inline def `calendar-range`: "calendar-range" = "calendar-range".asInstanceOf["calendar-range"]
    
    inline def `calendar-star`: "calendar-star" = "calendar-star".asInstanceOf["calendar-star"]
    
    inline def `calendar-time`: "calendar-time" = "calendar-time".asInstanceOf["calendar-time"]
    
    inline def `calendar-times`: "calendar-times" = "calendar-times".asInstanceOf["calendar-times"]
    
    inline def `calendar-upload`: "calendar-upload" = "calendar-upload".asInstanceOf["calendar-upload"]
    
    inline def `calendar-week`: "calendar-week" = "calendar-week".asInstanceOf["calendar-week"]
    
    inline def `calendar-xmark`: "calendar-xmark" = "calendar-xmark".asInstanceOf["calendar-xmark"]
    
    inline def calendars: "calendars" = "calendars".asInstanceOf["calendars"]
    
    inline def camcorder: "camcorder" = "camcorder".asInstanceOf["camcorder"]
    
    inline def camera: "camera" = "camera".asInstanceOf["camera"]
    
    inline def `camera-alt`: "camera-alt" = "camera-alt".asInstanceOf["camera-alt"]
    
    inline def `camera-cctv`: "camera-cctv" = "camera-cctv".asInstanceOf["camera-cctv"]
    
    inline def `camera-circle`: "camera-circle" = "camera-circle".asInstanceOf["camera-circle"]
    
    inline def `camera-home`: "camera-home" = "camera-home".asInstanceOf["camera-home"]
    
    inline def `camera-movie`: "camera-movie" = "camera-movie".asInstanceOf["camera-movie"]
    
    inline def `camera-polaroid`: "camera-polaroid" = "camera-polaroid".asInstanceOf["camera-polaroid"]
    
    inline def `camera-retro`: "camera-retro" = "camera-retro".asInstanceOf["camera-retro"]
    
    inline def `camera-rotate`: "camera-rotate" = "camera-rotate".asInstanceOf["camera-rotate"]
    
    inline def `camera-security`: "camera-security" = "camera-security".asInstanceOf["camera-security"]
    
    inline def `camera-slash`: "camera-slash" = "camera-slash".asInstanceOf["camera-slash"]
    
    inline def `camera-viewfinder`: "camera-viewfinder" = "camera-viewfinder".asInstanceOf["camera-viewfinder"]
    
    inline def `camera-web`: "camera-web" = "camera-web".asInstanceOf["camera-web"]
    
    inline def `camera-web-slash`: "camera-web-slash" = "camera-web-slash".asInstanceOf["camera-web-slash"]
    
    inline def campfire: "campfire" = "campfire".asInstanceOf["campfire"]
    
    inline def campground: "campground" = "campground".asInstanceOf["campground"]
    
    inline def `can-food`: "can-food" = "can-food".asInstanceOf["can-food"]
    
    inline def `canadian-maple-leaf`: "canadian-maple-leaf" = "canadian-maple-leaf".asInstanceOf["canadian-maple-leaf"]
    
    inline def cancel: "cancel" = "cancel".asInstanceOf["cancel"]
    
    inline def `candle-holder`: "candle-holder" = "candle-holder".asInstanceOf["candle-holder"]
    
    inline def candy: "candy" = "candy".asInstanceOf["candy"]
    
    inline def `candy-bar`: "candy-bar" = "candy-bar".asInstanceOf["candy-bar"]
    
    inline def `candy-cane`: "candy-cane" = "candy-cane".asInstanceOf["candy-cane"]
    
    inline def `candy-corn`: "candy-corn" = "candy-corn".asInstanceOf["candy-corn"]
    
    inline def cannabis: "cannabis" = "cannabis".asInstanceOf["cannabis"]
    
    inline def capsules: "capsules" = "capsules".asInstanceOf["capsules"]
    
    inline def car: "car" = "car".asInstanceOf["car"]
    
    inline def `car-alt`: "car-alt" = "car-alt".asInstanceOf["car-alt"]
    
    inline def `car-battery`: "car-battery" = "car-battery".asInstanceOf["car-battery"]
    
    inline def `car-bolt`: "car-bolt" = "car-bolt".asInstanceOf["car-bolt"]
    
    inline def `car-building`: "car-building" = "car-building".asInstanceOf["car-building"]
    
    inline def `car-bump`: "car-bump" = "car-bump".asInstanceOf["car-bump"]
    
    inline def `car-burst`: "car-burst" = "car-burst".asInstanceOf["car-burst"]
    
    inline def `car-bus`: "car-bus" = "car-bus".asInstanceOf["car-bus"]
    
    inline def `car-circle-bolt`: "car-circle-bolt" = "car-circle-bolt".asInstanceOf["car-circle-bolt"]
    
    inline def `car-crash`: "car-crash" = "car-crash".asInstanceOf["car-crash"]
    
    inline def `car-garage`: "car-garage" = "car-garage".asInstanceOf["car-garage"]
    
    inline def `car-mechanic`: "car-mechanic" = "car-mechanic".asInstanceOf["car-mechanic"]
    
    inline def `car-mirrors`: "car-mirrors" = "car-mirrors".asInstanceOf["car-mirrors"]
    
    inline def `car-on`: "car-on" = "car-on".asInstanceOf["car-on"]
    
    inline def `car-rear`: "car-rear" = "car-rear".asInstanceOf["car-rear"]
    
    inline def `car-side`: "car-side" = "car-side".asInstanceOf["car-side"]
    
    inline def `car-side-bolt`: "car-side-bolt" = "car-side-bolt".asInstanceOf["car-side-bolt"]
    
    inline def `car-tilt`: "car-tilt" = "car-tilt".asInstanceOf["car-tilt"]
    
    inline def `car-tunnel`: "car-tunnel" = "car-tunnel".asInstanceOf["car-tunnel"]
    
    inline def `car-wash`: "car-wash" = "car-wash".asInstanceOf["car-wash"]
    
    inline def `car-wrench`: "car-wrench" = "car-wrench".asInstanceOf["car-wrench"]
    
    inline def caravan: "caravan" = "caravan".asInstanceOf["caravan"]
    
    inline def `caravan-alt`: "caravan-alt" = "caravan-alt".asInstanceOf["caravan-alt"]
    
    inline def `caravan-simple`: "caravan-simple" = "caravan-simple".asInstanceOf["caravan-simple"]
    
    inline def `card-club`: "card-club" = "card-club".asInstanceOf["card-club"]
    
    inline def `card-diamond`: "card-diamond" = "card-diamond".asInstanceOf["card-diamond"]
    
    inline def `card-heart`: "card-heart" = "card-heart".asInstanceOf["card-heart"]
    
    inline def `card-spade`: "card-spade" = "card-spade".asInstanceOf["card-spade"]
    
    inline def cards: "cards" = "cards".asInstanceOf["cards"]
    
    inline def `cards-blank`: "cards-blank" = "cards-blank".asInstanceOf["cards-blank"]
    
    inline def `caret-circle-down`: "caret-circle-down" = "caret-circle-down".asInstanceOf["caret-circle-down"]
    
    inline def `caret-circle-left`: "caret-circle-left" = "caret-circle-left".asInstanceOf["caret-circle-left"]
    
    inline def `caret-circle-right`: "caret-circle-right" = "caret-circle-right".asInstanceOf["caret-circle-right"]
    
    inline def `caret-circle-up`: "caret-circle-up" = "caret-circle-up".asInstanceOf["caret-circle-up"]
    
    inline def `caret-down`: "caret-down" = "caret-down".asInstanceOf["caret-down"]
    
    inline def `caret-left`: "caret-left" = "caret-left".asInstanceOf["caret-left"]
    
    inline def `caret-right`: "caret-right" = "caret-right".asInstanceOf["caret-right"]
    
    inline def `caret-square-down`: "caret-square-down" = "caret-square-down".asInstanceOf["caret-square-down"]
    
    inline def `caret-square-left`: "caret-square-left" = "caret-square-left".asInstanceOf["caret-square-left"]
    
    inline def `caret-square-right`: "caret-square-right" = "caret-square-right".asInstanceOf["caret-square-right"]
    
    inline def `caret-square-up`: "caret-square-up" = "caret-square-up".asInstanceOf["caret-square-up"]
    
    inline def `caret-up`: "caret-up" = "caret-up".asInstanceOf["caret-up"]
    
    inline def `carriage-baby`: "carriage-baby" = "carriage-baby".asInstanceOf["carriage-baby"]
    
    inline def carrot: "carrot" = "carrot".asInstanceOf["carrot"]
    
    inline def cars: "cars" = "cars".asInstanceOf["cars"]
    
    inline def `cart-arrow-down`: "cart-arrow-down" = "cart-arrow-down".asInstanceOf["cart-arrow-down"]
    
    inline def `cart-arrow-up`: "cart-arrow-up" = "cart-arrow-up".asInstanceOf["cart-arrow-up"]
    
    inline def `cart-circle-arrow-down`: "cart-circle-arrow-down" = "cart-circle-arrow-down".asInstanceOf["cart-circle-arrow-down"]
    
    inline def `cart-circle-arrow-up`: "cart-circle-arrow-up" = "cart-circle-arrow-up".asInstanceOf["cart-circle-arrow-up"]
    
    inline def `cart-circle-check`: "cart-circle-check" = "cart-circle-check".asInstanceOf["cart-circle-check"]
    
    inline def `cart-circle-exclamation`: "cart-circle-exclamation" = "cart-circle-exclamation".asInstanceOf["cart-circle-exclamation"]
    
    inline def `cart-circle-plus`: "cart-circle-plus" = "cart-circle-plus".asInstanceOf["cart-circle-plus"]
    
    inline def `cart-circle-xmark`: "cart-circle-xmark" = "cart-circle-xmark".asInstanceOf["cart-circle-xmark"]
    
    inline def `cart-flatbed`: "cart-flatbed" = "cart-flatbed".asInstanceOf["cart-flatbed"]
    
    inline def `cart-flatbed-boxes`: "cart-flatbed-boxes" = "cart-flatbed-boxes".asInstanceOf["cart-flatbed-boxes"]
    
    inline def `cart-flatbed-empty`: "cart-flatbed-empty" = "cart-flatbed-empty".asInstanceOf["cart-flatbed-empty"]
    
    inline def `cart-flatbed-suitcase`: "cart-flatbed-suitcase" = "cart-flatbed-suitcase".asInstanceOf["cart-flatbed-suitcase"]
    
    inline def `cart-minus`: "cart-minus" = "cart-minus".asInstanceOf["cart-minus"]
    
    inline def `cart-plus`: "cart-plus" = "cart-plus".asInstanceOf["cart-plus"]
    
    inline def `cart-shopping`: "cart-shopping" = "cart-shopping".asInstanceOf["cart-shopping"]
    
    inline def `cart-shopping-fast`: "cart-shopping-fast" = "cart-shopping-fast".asInstanceOf["cart-shopping-fast"]
    
    inline def `cart-xmark`: "cart-xmark" = "cart-xmark".asInstanceOf["cart-xmark"]
    
    inline def `cash-register`: "cash-register" = "cash-register".asInstanceOf["cash-register"]
    
    inline def `cassette-betamax`: "cassette-betamax" = "cassette-betamax".asInstanceOf["cassette-betamax"]
    
    inline def `cassette-tape`: "cassette-tape" = "cassette-tape".asInstanceOf["cassette-tape"]
    
    inline def `cassette-vhs`: "cassette-vhs" = "cassette-vhs".asInstanceOf["cassette-vhs"]
    
    inline def castle: "castle" = "castle".asInstanceOf["castle"]
    
    inline def cat: "cat" = "cat".asInstanceOf["cat"]
    
    inline def `cat-space`: "cat-space" = "cat-space".asInstanceOf["cat-space"]
    
    inline def cauldron: "cauldron" = "cauldron".asInstanceOf["cauldron"]
    
    inline def `cc-amazon-pay`: "cc-amazon-pay" = "cc-amazon-pay".asInstanceOf["cc-amazon-pay"]
    
    inline def `cc-amex`: "cc-amex" = "cc-amex".asInstanceOf["cc-amex"]
    
    inline def `cc-apple-pay`: "cc-apple-pay" = "cc-apple-pay".asInstanceOf["cc-apple-pay"]
    
    inline def `cc-diners-club`: "cc-diners-club" = "cc-diners-club".asInstanceOf["cc-diners-club"]
    
    inline def `cc-discover`: "cc-discover" = "cc-discover".asInstanceOf["cc-discover"]
    
    inline def `cc-jcb`: "cc-jcb" = "cc-jcb".asInstanceOf["cc-jcb"]
    
    inline def `cc-mastercard`: "cc-mastercard" = "cc-mastercard".asInstanceOf["cc-mastercard"]
    
    inline def `cc-paypal`: "cc-paypal" = "cc-paypal".asInstanceOf["cc-paypal"]
    
    inline def `cc-stripe`: "cc-stripe" = "cc-stripe".asInstanceOf["cc-stripe"]
    
    inline def `cc-visa`: "cc-visa" = "cc-visa".asInstanceOf["cc-visa"]
    
    inline def cctv: "cctv" = "cctv".asInstanceOf["cctv"]
    
    inline def `cedi-sign`: "cedi-sign" = "cedi-sign".asInstanceOf["cedi-sign"]
    
    inline def `cent-sign`: "cent-sign" = "cent-sign".asInstanceOf["cent-sign"]
    
    inline def centercode: "centercode" = "centercode".asInstanceOf["centercode"]
    
    inline def centos: "centos" = "centos".asInstanceOf["centos"]
    
    inline def certificate: "certificate" = "certificate".asInstanceOf["certificate"]
    
    inline def chain: "chain" = "chain".asInstanceOf["chain"]
    
    inline def `chain-broken`: "chain-broken" = "chain-broken".asInstanceOf["chain-broken"]
    
    inline def `chain-horizontal`: "chain-horizontal" = "chain-horizontal".asInstanceOf["chain-horizontal"]
    
    inline def `chain-horizontal-slash`: "chain-horizontal-slash" = "chain-horizontal-slash".asInstanceOf["chain-horizontal-slash"]
    
    inline def `chain-slash`: "chain-slash" = "chain-slash".asInstanceOf["chain-slash"]
    
    inline def chair: "chair" = "chair".asInstanceOf["chair"]
    
    inline def `chair-office`: "chair-office" = "chair-office".asInstanceOf["chair-office"]
    
    inline def chalkboard: "chalkboard" = "chalkboard".asInstanceOf["chalkboard"]
    
    inline def `chalkboard-teacher`: "chalkboard-teacher" = "chalkboard-teacher".asInstanceOf["chalkboard-teacher"]
    
    inline def `chalkboard-user`: "chalkboard-user" = "chalkboard-user".asInstanceOf["chalkboard-user"]
    
    inline def `champagne-glass`: "champagne-glass" = "champagne-glass".asInstanceOf["champagne-glass"]
    
    inline def `champagne-glasses`: "champagne-glasses" = "champagne-glasses".asInstanceOf["champagne-glasses"]
    
    inline def `charging-station`: "charging-station" = "charging-station".asInstanceOf["charging-station"]
    
    inline def `chart-area`: "chart-area" = "chart-area".asInstanceOf["chart-area"]
    
    inline def `chart-bar`: "chart-bar" = "chart-bar".asInstanceOf["chart-bar"]
    
    inline def `chart-bullet`: "chart-bullet" = "chart-bullet".asInstanceOf["chart-bullet"]
    
    inline def `chart-candlestick`: "chart-candlestick" = "chart-candlestick".asInstanceOf["chart-candlestick"]
    
    inline def `chart-column`: "chart-column" = "chart-column".asInstanceOf["chart-column"]
    
    inline def `chart-gantt`: "chart-gantt" = "chart-gantt".asInstanceOf["chart-gantt"]
    
    inline def `chart-line`: "chart-line" = "chart-line".asInstanceOf["chart-line"]
    
    inline def `chart-line-down`: "chart-line-down" = "chart-line-down".asInstanceOf["chart-line-down"]
    
    inline def `chart-line-up`: "chart-line-up" = "chart-line-up".asInstanceOf["chart-line-up"]
    
    inline def `chart-mixed`: "chart-mixed" = "chart-mixed".asInstanceOf["chart-mixed"]
    
    inline def `chart-network`: "chart-network" = "chart-network".asInstanceOf["chart-network"]
    
    inline def `chart-pie`: "chart-pie" = "chart-pie".asInstanceOf["chart-pie"]
    
    inline def `chart-pie-alt`: "chart-pie-alt" = "chart-pie-alt".asInstanceOf["chart-pie-alt"]
    
    inline def `chart-pie-simple`: "chart-pie-simple" = "chart-pie-simple".asInstanceOf["chart-pie-simple"]
    
    inline def `chart-pyramid`: "chart-pyramid" = "chart-pyramid".asInstanceOf["chart-pyramid"]
    
    inline def `chart-radar`: "chart-radar" = "chart-radar".asInstanceOf["chart-radar"]
    
    inline def `chart-scatter`: "chart-scatter" = "chart-scatter".asInstanceOf["chart-scatter"]
    
    inline def `chart-scatter-3d`: "chart-scatter-3d" = "chart-scatter-3d".asInstanceOf["chart-scatter-3d"]
    
    inline def `chart-scatter-bubble`: "chart-scatter-bubble" = "chart-scatter-bubble".asInstanceOf["chart-scatter-bubble"]
    
    inline def `chart-simple`: "chart-simple" = "chart-simple".asInstanceOf["chart-simple"]
    
    inline def `chart-simple-horizontal`: "chart-simple-horizontal" = "chart-simple-horizontal".asInstanceOf["chart-simple-horizontal"]
    
    inline def `chart-tree-map`: "chart-tree-map" = "chart-tree-map".asInstanceOf["chart-tree-map"]
    
    inline def `chart-user`: "chart-user" = "chart-user".asInstanceOf["chart-user"]
    
    inline def `chart-waterfall`: "chart-waterfall" = "chart-waterfall".asInstanceOf["chart-waterfall"]
    
    inline def check: "check" = "check".asInstanceOf["check"]
    
    inline def `check-circle`: "check-circle" = "check-circle".asInstanceOf["check-circle"]
    
    inline def `check-double`: "check-double" = "check-double".asInstanceOf["check-double"]
    
    inline def `check-square`: "check-square" = "check-square".asInstanceOf["check-square"]
    
    inline def `check-to-slot`: "check-to-slot" = "check-to-slot".asInstanceOf["check-to-slot"]
    
    inline def cheese: "cheese" = "cheese".asInstanceOf["cheese"]
    
    inline def `cheese-swiss`: "cheese-swiss" = "cheese-swiss".asInstanceOf["cheese-swiss"]
    
    inline def cheeseburger: "cheeseburger" = "cheeseburger".asInstanceOf["cheeseburger"]
    
    inline def cherries: "cherries" = "cherries".asInstanceOf["cherries"]
    
    inline def chess: "chess" = "chess".asInstanceOf["chess"]
    
    inline def `chess-bishop`: "chess-bishop" = "chess-bishop".asInstanceOf["chess-bishop"]
    
    inline def `chess-bishop-alt`: "chess-bishop-alt" = "chess-bishop-alt".asInstanceOf["chess-bishop-alt"]
    
    inline def `chess-bishop-piece`: "chess-bishop-piece" = "chess-bishop-piece".asInstanceOf["chess-bishop-piece"]
    
    inline def `chess-board`: "chess-board" = "chess-board".asInstanceOf["chess-board"]
    
    inline def `chess-clock`: "chess-clock" = "chess-clock".asInstanceOf["chess-clock"]
    
    inline def `chess-clock-alt`: "chess-clock-alt" = "chess-clock-alt".asInstanceOf["chess-clock-alt"]
    
    inline def `chess-clock-flip`: "chess-clock-flip" = "chess-clock-flip".asInstanceOf["chess-clock-flip"]
    
    inline def `chess-king`: "chess-king" = "chess-king".asInstanceOf["chess-king"]
    
    inline def `chess-king-alt`: "chess-king-alt" = "chess-king-alt".asInstanceOf["chess-king-alt"]
    
    inline def `chess-king-piece`: "chess-king-piece" = "chess-king-piece".asInstanceOf["chess-king-piece"]
    
    inline def `chess-knight`: "chess-knight" = "chess-knight".asInstanceOf["chess-knight"]
    
    inline def `chess-knight-alt`: "chess-knight-alt" = "chess-knight-alt".asInstanceOf["chess-knight-alt"]
    
    inline def `chess-knight-piece`: "chess-knight-piece" = "chess-knight-piece".asInstanceOf["chess-knight-piece"]
    
    inline def `chess-pawn`: "chess-pawn" = "chess-pawn".asInstanceOf["chess-pawn"]
    
    inline def `chess-pawn-alt`: "chess-pawn-alt" = "chess-pawn-alt".asInstanceOf["chess-pawn-alt"]
    
    inline def `chess-pawn-piece`: "chess-pawn-piece" = "chess-pawn-piece".asInstanceOf["chess-pawn-piece"]
    
    inline def `chess-queen`: "chess-queen" = "chess-queen".asInstanceOf["chess-queen"]
    
    inline def `chess-queen-alt`: "chess-queen-alt" = "chess-queen-alt".asInstanceOf["chess-queen-alt"]
    
    inline def `chess-queen-piece`: "chess-queen-piece" = "chess-queen-piece".asInstanceOf["chess-queen-piece"]
    
    inline def `chess-rook`: "chess-rook" = "chess-rook".asInstanceOf["chess-rook"]
    
    inline def `chess-rook-alt`: "chess-rook-alt" = "chess-rook-alt".asInstanceOf["chess-rook-alt"]
    
    inline def `chess-rook-piece`: "chess-rook-piece" = "chess-rook-piece".asInstanceOf["chess-rook-piece"]
    
    inline def chestnut: "chestnut" = "chestnut".asInstanceOf["chestnut"]
    
    inline def `chevron-circle-down`: "chevron-circle-down" = "chevron-circle-down".asInstanceOf["chevron-circle-down"]
    
    inline def `chevron-circle-left`: "chevron-circle-left" = "chevron-circle-left".asInstanceOf["chevron-circle-left"]
    
    inline def `chevron-circle-right`: "chevron-circle-right" = "chevron-circle-right".asInstanceOf["chevron-circle-right"]
    
    inline def `chevron-circle-up`: "chevron-circle-up" = "chevron-circle-up".asInstanceOf["chevron-circle-up"]
    
    inline def `chevron-double-down`: "chevron-double-down" = "chevron-double-down".asInstanceOf["chevron-double-down"]
    
    inline def `chevron-double-left`: "chevron-double-left" = "chevron-double-left".asInstanceOf["chevron-double-left"]
    
    inline def `chevron-double-right`: "chevron-double-right" = "chevron-double-right".asInstanceOf["chevron-double-right"]
    
    inline def `chevron-double-up`: "chevron-double-up" = "chevron-double-up".asInstanceOf["chevron-double-up"]
    
    inline def `chevron-down`: "chevron-down" = "chevron-down".asInstanceOf["chevron-down"]
    
    inline def `chevron-left`: "chevron-left" = "chevron-left".asInstanceOf["chevron-left"]
    
    inline def `chevron-right`: "chevron-right" = "chevron-right".asInstanceOf["chevron-right"]
    
    inline def `chevron-square-down`: "chevron-square-down" = "chevron-square-down".asInstanceOf["chevron-square-down"]
    
    inline def `chevron-square-left`: "chevron-square-left" = "chevron-square-left".asInstanceOf["chevron-square-left"]
    
    inline def `chevron-square-right`: "chevron-square-right" = "chevron-square-right".asInstanceOf["chevron-square-right"]
    
    inline def `chevron-square-up`: "chevron-square-up" = "chevron-square-up".asInstanceOf["chevron-square-up"]
    
    inline def `chevron-up`: "chevron-up" = "chevron-up".asInstanceOf["chevron-up"]
    
    inline def `chevrons-down`: "chevrons-down" = "chevrons-down".asInstanceOf["chevrons-down"]
    
    inline def `chevrons-left`: "chevrons-left" = "chevrons-left".asInstanceOf["chevrons-left"]
    
    inline def `chevrons-right`: "chevrons-right" = "chevrons-right".asInstanceOf["chevrons-right"]
    
    inline def `chevrons-up`: "chevrons-up" = "chevrons-up".asInstanceOf["chevrons-up"]
    
    inline def child: "child" = "child".asInstanceOf["child"]
    
    inline def `child-combatant`: "child-combatant" = "child-combatant".asInstanceOf["child-combatant"]
    
    inline def `child-dress`: "child-dress" = "child-dress".asInstanceOf["child-dress"]
    
    inline def `child-reaching`: "child-reaching" = "child-reaching".asInstanceOf["child-reaching"]
    
    inline def `child-rifle`: "child-rifle" = "child-rifle".asInstanceOf["child-rifle"]
    
    inline def children: "children" = "children".asInstanceOf["children"]
    
    inline def chimney: "chimney" = "chimney".asInstanceOf["chimney"]
    
    inline def `chocolate-bar`: "chocolate-bar" = "chocolate-bar".asInstanceOf["chocolate-bar"]
    
    inline def chopsticks: "chopsticks" = "chopsticks".asInstanceOf["chopsticks"]
    
    inline def chrome: "chrome" = "chrome".asInstanceOf["chrome"]
    
    inline def chromecast: "chromecast" = "chromecast".asInstanceOf["chromecast"]
    
    inline def church: "church" = "church".asInstanceOf["church"]
    
    inline def circle: "circle" = "circle".asInstanceOf["circle"]
    
    inline def `circle-0`: "circle-0" = "circle-0".asInstanceOf["circle-0"]
    
    inline def `circle-1`: "circle-1" = "circle-1".asInstanceOf["circle-1"]
    
    inline def `circle-2`: "circle-2" = "circle-2".asInstanceOf["circle-2"]
    
    inline def `circle-3`: "circle-3" = "circle-3".asInstanceOf["circle-3"]
    
    inline def `circle-4`: "circle-4" = "circle-4".asInstanceOf["circle-4"]
    
    inline def `circle-5`: "circle-5" = "circle-5".asInstanceOf["circle-5"]
    
    inline def `circle-6`: "circle-6" = "circle-6".asInstanceOf["circle-6"]
    
    inline def `circle-7`: "circle-7" = "circle-7".asInstanceOf["circle-7"]
    
    inline def `circle-8`: "circle-8" = "circle-8".asInstanceOf["circle-8"]
    
    inline def `circle-9`: "circle-9" = "circle-9".asInstanceOf["circle-9"]
    
    inline def `circle-a`: "circle-a" = "circle-a".asInstanceOf["circle-a"]
    
    inline def `circle-ampersand`: "circle-ampersand" = "circle-ampersand".asInstanceOf["circle-ampersand"]
    
    inline def `circle-arrow-down`: "circle-arrow-down" = "circle-arrow-down".asInstanceOf["circle-arrow-down"]
    
    inline def `circle-arrow-down-left`: "circle-arrow-down-left" = "circle-arrow-down-left".asInstanceOf["circle-arrow-down-left"]
    
    inline def `circle-arrow-down-right`: "circle-arrow-down-right" = "circle-arrow-down-right".asInstanceOf["circle-arrow-down-right"]
    
    inline def `circle-arrow-left`: "circle-arrow-left" = "circle-arrow-left".asInstanceOf["circle-arrow-left"]
    
    inline def `circle-arrow-right`: "circle-arrow-right" = "circle-arrow-right".asInstanceOf["circle-arrow-right"]
    
    inline def `circle-arrow-up`: "circle-arrow-up" = "circle-arrow-up".asInstanceOf["circle-arrow-up"]
    
    inline def `circle-arrow-up-left`: "circle-arrow-up-left" = "circle-arrow-up-left".asInstanceOf["circle-arrow-up-left"]
    
    inline def `circle-arrow-up-right`: "circle-arrow-up-right" = "circle-arrow-up-right".asInstanceOf["circle-arrow-up-right"]
    
    inline def `circle-b`: "circle-b" = "circle-b".asInstanceOf["circle-b"]
    
    inline def `circle-bolt`: "circle-bolt" = "circle-bolt".asInstanceOf["circle-bolt"]
    
    inline def `circle-book-open`: "circle-book-open" = "circle-book-open".asInstanceOf["circle-book-open"]
    
    inline def `circle-bookmark`: "circle-bookmark" = "circle-bookmark".asInstanceOf["circle-bookmark"]
    
    inline def `circle-c`: "circle-c" = "circle-c".asInstanceOf["circle-c"]
    
    inline def `circle-calendar`: "circle-calendar" = "circle-calendar".asInstanceOf["circle-calendar"]
    
    inline def `circle-camera`: "circle-camera" = "circle-camera".asInstanceOf["circle-camera"]
    
    inline def `circle-caret-down`: "circle-caret-down" = "circle-caret-down".asInstanceOf["circle-caret-down"]
    
    inline def `circle-caret-left`: "circle-caret-left" = "circle-caret-left".asInstanceOf["circle-caret-left"]
    
    inline def `circle-caret-right`: "circle-caret-right" = "circle-caret-right".asInstanceOf["circle-caret-right"]
    
    inline def `circle-caret-up`: "circle-caret-up" = "circle-caret-up".asInstanceOf["circle-caret-up"]
    
    inline def `circle-check`: "circle-check" = "circle-check".asInstanceOf["circle-check"]
    
    inline def `circle-chevron-down`: "circle-chevron-down" = "circle-chevron-down".asInstanceOf["circle-chevron-down"]
    
    inline def `circle-chevron-left`: "circle-chevron-left" = "circle-chevron-left".asInstanceOf["circle-chevron-left"]
    
    inline def `circle-chevron-right`: "circle-chevron-right" = "circle-chevron-right".asInstanceOf["circle-chevron-right"]
    
    inline def `circle-chevron-up`: "circle-chevron-up" = "circle-chevron-up".asInstanceOf["circle-chevron-up"]
    
    inline def `circle-d`: "circle-d" = "circle-d".asInstanceOf["circle-d"]
    
    inline def `circle-dashed`: "circle-dashed" = "circle-dashed".asInstanceOf["circle-dashed"]
    
    inline def `circle-divide`: "circle-divide" = "circle-divide".asInstanceOf["circle-divide"]
    
    inline def `circle-dollar`: "circle-dollar" = "circle-dollar".asInstanceOf["circle-dollar"]
    
    inline def `circle-dollar-to-slot`: "circle-dollar-to-slot" = "circle-dollar-to-slot".asInstanceOf["circle-dollar-to-slot"]
    
    inline def `circle-dot`: "circle-dot" = "circle-dot".asInstanceOf["circle-dot"]
    
    inline def `circle-down`: "circle-down" = "circle-down".asInstanceOf["circle-down"]
    
    inline def `circle-down-left`: "circle-down-left" = "circle-down-left".asInstanceOf["circle-down-left"]
    
    inline def `circle-down-right`: "circle-down-right" = "circle-down-right".asInstanceOf["circle-down-right"]
    
    inline def `circle-e`: "circle-e" = "circle-e".asInstanceOf["circle-e"]
    
    inline def `circle-ellipsis`: "circle-ellipsis" = "circle-ellipsis".asInstanceOf["circle-ellipsis"]
    
    inline def `circle-ellipsis-vertical`: "circle-ellipsis-vertical" = "circle-ellipsis-vertical".asInstanceOf["circle-ellipsis-vertical"]
    
    inline def `circle-envelope`: "circle-envelope" = "circle-envelope".asInstanceOf["circle-envelope"]
    
    inline def `circle-exclamation`: "circle-exclamation" = "circle-exclamation".asInstanceOf["circle-exclamation"]
    
    inline def `circle-exclamation-check`: "circle-exclamation-check" = "circle-exclamation-check".asInstanceOf["circle-exclamation-check"]
    
    inline def `circle-f`: "circle-f" = "circle-f".asInstanceOf["circle-f"]
    
    inline def `circle-g`: "circle-g" = "circle-g".asInstanceOf["circle-g"]
    
    inline def `circle-h`: "circle-h" = "circle-h".asInstanceOf["circle-h"]
    
    inline def `circle-half`: "circle-half" = "circle-half".asInstanceOf["circle-half"]
    
    inline def `circle-half-stroke`: "circle-half-stroke" = "circle-half-stroke".asInstanceOf["circle-half-stroke"]
    
    inline def `circle-heart`: "circle-heart" = "circle-heart".asInstanceOf["circle-heart"]
    
    inline def `circle-i`: "circle-i" = "circle-i".asInstanceOf["circle-i"]
    
    inline def `circle-info`: "circle-info" = "circle-info".asInstanceOf["circle-info"]
    
    inline def `circle-j`: "circle-j" = "circle-j".asInstanceOf["circle-j"]
    
    inline def `circle-k`: "circle-k" = "circle-k".asInstanceOf["circle-k"]
    
    inline def `circle-l`: "circle-l" = "circle-l".asInstanceOf["circle-l"]
    
    inline def `circle-left`: "circle-left" = "circle-left".asInstanceOf["circle-left"]
    
    inline def `circle-location-arrow`: "circle-location-arrow" = "circle-location-arrow".asInstanceOf["circle-location-arrow"]
    
    inline def `circle-m`: "circle-m" = "circle-m".asInstanceOf["circle-m"]
    
    inline def `circle-microphone`: "circle-microphone" = "circle-microphone".asInstanceOf["circle-microphone"]
    
    inline def `circle-microphone-lines`: "circle-microphone-lines" = "circle-microphone-lines".asInstanceOf["circle-microphone-lines"]
    
    inline def `circle-minus`: "circle-minus" = "circle-minus".asInstanceOf["circle-minus"]
    
    inline def `circle-n`: "circle-n" = "circle-n".asInstanceOf["circle-n"]
    
    inline def `circle-nodes`: "circle-nodes" = "circle-nodes".asInstanceOf["circle-nodes"]
    
    inline def `circle-notch`: "circle-notch" = "circle-notch".asInstanceOf["circle-notch"]
    
    inline def `circle-o`: "circle-o" = "circle-o".asInstanceOf["circle-o"]
    
    inline def `circle-p`: "circle-p" = "circle-p".asInstanceOf["circle-p"]
    
    inline def `circle-parking`: "circle-parking" = "circle-parking".asInstanceOf["circle-parking"]
    
    inline def `circle-pause`: "circle-pause" = "circle-pause".asInstanceOf["circle-pause"]
    
    inline def `circle-phone`: "circle-phone" = "circle-phone".asInstanceOf["circle-phone"]
    
    inline def `circle-phone-flip`: "circle-phone-flip" = "circle-phone-flip".asInstanceOf["circle-phone-flip"]
    
    inline def `circle-phone-hangup`: "circle-phone-hangup" = "circle-phone-hangup".asInstanceOf["circle-phone-hangup"]
    
    inline def `circle-play`: "circle-play" = "circle-play".asInstanceOf["circle-play"]
    
    inline def `circle-plus`: "circle-plus" = "circle-plus".asInstanceOf["circle-plus"]
    
    inline def `circle-q`: "circle-q" = "circle-q".asInstanceOf["circle-q"]
    
    inline def `circle-quarter`: "circle-quarter" = "circle-quarter".asInstanceOf["circle-quarter"]
    
    inline def `circle-quarters`: "circle-quarters" = "circle-quarters".asInstanceOf["circle-quarters"]
    
    inline def `circle-question`: "circle-question" = "circle-question".asInstanceOf["circle-question"]
    
    inline def `circle-r`: "circle-r" = "circle-r".asInstanceOf["circle-r"]
    
    inline def `circle-radiation`: "circle-radiation" = "circle-radiation".asInstanceOf["circle-radiation"]
    
    inline def `circle-right`: "circle-right" = "circle-right".asInstanceOf["circle-right"]
    
    inline def `circle-s`: "circle-s" = "circle-s".asInstanceOf["circle-s"]
    
    inline def `circle-small`: "circle-small" = "circle-small".asInstanceOf["circle-small"]
    
    inline def `circle-sort`: "circle-sort" = "circle-sort".asInstanceOf["circle-sort"]
    
    inline def `circle-sort-down`: "circle-sort-down" = "circle-sort-down".asInstanceOf["circle-sort-down"]
    
    inline def `circle-sort-up`: "circle-sort-up" = "circle-sort-up".asInstanceOf["circle-sort-up"]
    
    inline def `circle-star`: "circle-star" = "circle-star".asInstanceOf["circle-star"]
    
    inline def `circle-stop`: "circle-stop" = "circle-stop".asInstanceOf["circle-stop"]
    
    inline def `circle-t`: "circle-t" = "circle-t".asInstanceOf["circle-t"]
    
    inline def `circle-three-quarters`: "circle-three-quarters" = "circle-three-quarters".asInstanceOf["circle-three-quarters"]
    
    inline def `circle-trash`: "circle-trash" = "circle-trash".asInstanceOf["circle-trash"]
    
    inline def `circle-u`: "circle-u" = "circle-u".asInstanceOf["circle-u"]
    
    inline def `circle-up`: "circle-up" = "circle-up".asInstanceOf["circle-up"]
    
    inline def `circle-up-left`: "circle-up-left" = "circle-up-left".asInstanceOf["circle-up-left"]
    
    inline def `circle-up-right`: "circle-up-right" = "circle-up-right".asInstanceOf["circle-up-right"]
    
    inline def `circle-user`: "circle-user" = "circle-user".asInstanceOf["circle-user"]
    
    inline def `circle-v`: "circle-v" = "circle-v".asInstanceOf["circle-v"]
    
    inline def `circle-video`: "circle-video" = "circle-video".asInstanceOf["circle-video"]
    
    inline def `circle-w`: "circle-w" = "circle-w".asInstanceOf["circle-w"]
    
    inline def `circle-waveform-lines`: "circle-waveform-lines" = "circle-waveform-lines".asInstanceOf["circle-waveform-lines"]
    
    inline def `circle-x`: "circle-x" = "circle-x".asInstanceOf["circle-x"]
    
    inline def `circle-xmark`: "circle-xmark" = "circle-xmark".asInstanceOf["circle-xmark"]
    
    inline def `circle-y`: "circle-y" = "circle-y".asInstanceOf["circle-y"]
    
    inline def `circle-z`: "circle-z" = "circle-z".asInstanceOf["circle-z"]
    
    inline def citrus: "citrus" = "citrus".asInstanceOf["citrus"]
    
    inline def `citrus-slice`: "citrus-slice" = "citrus-slice".asInstanceOf["citrus-slice"]
    
    inline def city: "city" = "city".asInstanceOf["city"]
    
    inline def clapperboard: "clapperboard" = "clapperboard".asInstanceOf["clapperboard"]
    
    inline def `clapperboard-play`: "clapperboard-play" = "clapperboard-play".asInstanceOf["clapperboard-play"]
    
    inline def clarinet: "clarinet" = "clarinet".asInstanceOf["clarinet"]
    
    inline def `claw-marks`: "claw-marks" = "claw-marks".asInstanceOf["claw-marks"]
    
    inline def `clinic-medical`: "clinic-medical" = "clinic-medical".asInstanceOf["clinic-medical"]
    
    inline def clipboard: "clipboard" = "clipboard".asInstanceOf["clipboard"]
    
    inline def `clipboard-check`: "clipboard-check" = "clipboard-check".asInstanceOf["clipboard-check"]
    
    inline def `clipboard-list`: "clipboard-list" = "clipboard-list".asInstanceOf["clipboard-list"]
    
    inline def `clipboard-list-check`: "clipboard-list-check" = "clipboard-list-check".asInstanceOf["clipboard-list-check"]
    
    inline def `clipboard-medical`: "clipboard-medical" = "clipboard-medical".asInstanceOf["clipboard-medical"]
    
    inline def `clipboard-prescription`: "clipboard-prescription" = "clipboard-prescription".asInstanceOf["clipboard-prescription"]
    
    inline def `clipboard-question`: "clipboard-question" = "clipboard-question".asInstanceOf["clipboard-question"]
    
    inline def `clipboard-user`: "clipboard-user" = "clipboard-user".asInstanceOf["clipboard-user"]
    
    inline def clock: "clock" = "clock".asInstanceOf["clock"]
    
    inline def `clock-desk`: "clock-desk" = "clock-desk".asInstanceOf["clock-desk"]
    
    inline def `clock-eight`: "clock-eight" = "clock-eight".asInstanceOf["clock-eight"]
    
    inline def `clock-eight-thirty`: "clock-eight-thirty" = "clock-eight-thirty".asInstanceOf["clock-eight-thirty"]
    
    inline def `clock-eleven`: "clock-eleven" = "clock-eleven".asInstanceOf["clock-eleven"]
    
    inline def `clock-eleven-thirty`: "clock-eleven-thirty" = "clock-eleven-thirty".asInstanceOf["clock-eleven-thirty"]
    
    inline def `clock-five`: "clock-five" = "clock-five".asInstanceOf["clock-five"]
    
    inline def `clock-five-thirty`: "clock-five-thirty" = "clock-five-thirty".asInstanceOf["clock-five-thirty"]
    
    inline def `clock-four`: "clock-four" = "clock-four".asInstanceOf["clock-four"]
    
    inline def `clock-four-thirty`: "clock-four-thirty" = "clock-four-thirty".asInstanceOf["clock-four-thirty"]
    
    inline def `clock-nine`: "clock-nine" = "clock-nine".asInstanceOf["clock-nine"]
    
    inline def `clock-nine-thirty`: "clock-nine-thirty" = "clock-nine-thirty".asInstanceOf["clock-nine-thirty"]
    
    inline def `clock-one`: "clock-one" = "clock-one".asInstanceOf["clock-one"]
    
    inline def `clock-one-thirty`: "clock-one-thirty" = "clock-one-thirty".asInstanceOf["clock-one-thirty"]
    
    inline def `clock-rotate-left`: "clock-rotate-left" = "clock-rotate-left".asInstanceOf["clock-rotate-left"]
    
    inline def `clock-seven`: "clock-seven" = "clock-seven".asInstanceOf["clock-seven"]
    
    inline def `clock-seven-thirty`: "clock-seven-thirty" = "clock-seven-thirty".asInstanceOf["clock-seven-thirty"]
    
    inline def `clock-six`: "clock-six" = "clock-six".asInstanceOf["clock-six"]
    
    inline def `clock-six-thirty`: "clock-six-thirty" = "clock-six-thirty".asInstanceOf["clock-six-thirty"]
    
    inline def `clock-ten`: "clock-ten" = "clock-ten".asInstanceOf["clock-ten"]
    
    inline def `clock-ten-thirty`: "clock-ten-thirty" = "clock-ten-thirty".asInstanceOf["clock-ten-thirty"]
    
    inline def `clock-three`: "clock-three" = "clock-three".asInstanceOf["clock-three"]
    
    inline def `clock-three-thirty`: "clock-three-thirty" = "clock-three-thirty".asInstanceOf["clock-three-thirty"]
    
    inline def `clock-twelve`: "clock-twelve" = "clock-twelve".asInstanceOf["clock-twelve"]
    
    inline def `clock-twelve-thirty`: "clock-twelve-thirty" = "clock-twelve-thirty".asInstanceOf["clock-twelve-thirty"]
    
    inline def `clock-two`: "clock-two" = "clock-two".asInstanceOf["clock-two"]
    
    inline def `clock-two-thirty`: "clock-two-thirty" = "clock-two-thirty".asInstanceOf["clock-two-thirty"]
    
    inline def close: "close" = "close".asInstanceOf["close"]
    
    inline def `closed-captioning`: "closed-captioning" = "closed-captioning".asInstanceOf["closed-captioning"]
    
    inline def `closed-captioning-slash`: "closed-captioning-slash" = "closed-captioning-slash".asInstanceOf["closed-captioning-slash"]
    
    inline def `clothes-hanger`: "clothes-hanger" = "clothes-hanger".asInstanceOf["clothes-hanger"]
    
    inline def cloud: "cloud" = "cloud".asInstanceOf["cloud"]
    
    inline def `cloud-arrow-down`: "cloud-arrow-down" = "cloud-arrow-down".asInstanceOf["cloud-arrow-down"]
    
    inline def `cloud-arrow-up`: "cloud-arrow-up" = "cloud-arrow-up".asInstanceOf["cloud-arrow-up"]
    
    inline def `cloud-bolt`: "cloud-bolt" = "cloud-bolt".asInstanceOf["cloud-bolt"]
    
    inline def `cloud-bolt-moon`: "cloud-bolt-moon" = "cloud-bolt-moon".asInstanceOf["cloud-bolt-moon"]
    
    inline def `cloud-bolt-sun`: "cloud-bolt-sun" = "cloud-bolt-sun".asInstanceOf["cloud-bolt-sun"]
    
    inline def `cloud-check`: "cloud-check" = "cloud-check".asInstanceOf["cloud-check"]
    
    inline def `cloud-download`: "cloud-download" = "cloud-download".asInstanceOf["cloud-download"]
    
    inline def `cloud-download-alt`: "cloud-download-alt" = "cloud-download-alt".asInstanceOf["cloud-download-alt"]
    
    inline def `cloud-drizzle`: "cloud-drizzle" = "cloud-drizzle".asInstanceOf["cloud-drizzle"]
    
    inline def `cloud-exclamation`: "cloud-exclamation" = "cloud-exclamation".asInstanceOf["cloud-exclamation"]
    
    inline def `cloud-fog`: "cloud-fog" = "cloud-fog".asInstanceOf["cloud-fog"]
    
    inline def `cloud-hail`: "cloud-hail" = "cloud-hail".asInstanceOf["cloud-hail"]
    
    inline def `cloud-hail-mixed`: "cloud-hail-mixed" = "cloud-hail-mixed".asInstanceOf["cloud-hail-mixed"]
    
    inline def `cloud-meatball`: "cloud-meatball" = "cloud-meatball".asInstanceOf["cloud-meatball"]
    
    inline def `cloud-minus`: "cloud-minus" = "cloud-minus".asInstanceOf["cloud-minus"]
    
    inline def `cloud-moon`: "cloud-moon" = "cloud-moon".asInstanceOf["cloud-moon"]
    
    inline def `cloud-moon-rain`: "cloud-moon-rain" = "cloud-moon-rain".asInstanceOf["cloud-moon-rain"]
    
    inline def `cloud-music`: "cloud-music" = "cloud-music".asInstanceOf["cloud-music"]
    
    inline def `cloud-plus`: "cloud-plus" = "cloud-plus".asInstanceOf["cloud-plus"]
    
    inline def `cloud-question`: "cloud-question" = "cloud-question".asInstanceOf["cloud-question"]
    
    inline def `cloud-rain`: "cloud-rain" = "cloud-rain".asInstanceOf["cloud-rain"]
    
    inline def `cloud-rainbow`: "cloud-rainbow" = "cloud-rainbow".asInstanceOf["cloud-rainbow"]
    
    inline def `cloud-showers`: "cloud-showers" = "cloud-showers".asInstanceOf["cloud-showers"]
    
    inline def `cloud-showers-heavy`: "cloud-showers-heavy" = "cloud-showers-heavy".asInstanceOf["cloud-showers-heavy"]
    
    inline def `cloud-showers-water`: "cloud-showers-water" = "cloud-showers-water".asInstanceOf["cloud-showers-water"]
    
    inline def `cloud-slash`: "cloud-slash" = "cloud-slash".asInstanceOf["cloud-slash"]
    
    inline def `cloud-sleet`: "cloud-sleet" = "cloud-sleet".asInstanceOf["cloud-sleet"]
    
    inline def `cloud-snow`: "cloud-snow" = "cloud-snow".asInstanceOf["cloud-snow"]
    
    inline def `cloud-sun`: "cloud-sun" = "cloud-sun".asInstanceOf["cloud-sun"]
    
    inline def `cloud-sun-rain`: "cloud-sun-rain" = "cloud-sun-rain".asInstanceOf["cloud-sun-rain"]
    
    inline def `cloud-upload`: "cloud-upload" = "cloud-upload".asInstanceOf["cloud-upload"]
    
    inline def `cloud-upload-alt`: "cloud-upload-alt" = "cloud-upload-alt".asInstanceOf["cloud-upload-alt"]
    
    inline def `cloud-word`: "cloud-word" = "cloud-word".asInstanceOf["cloud-word"]
    
    inline def `cloud-xmark`: "cloud-xmark" = "cloud-xmark".asInstanceOf["cloud-xmark"]
    
    inline def cloudflare: "cloudflare" = "cloudflare".asInstanceOf["cloudflare"]
    
    inline def clouds: "clouds" = "clouds".asInstanceOf["clouds"]
    
    inline def `clouds-moon`: "clouds-moon" = "clouds-moon".asInstanceOf["clouds-moon"]
    
    inline def `clouds-sun`: "clouds-sun" = "clouds-sun".asInstanceOf["clouds-sun"]
    
    inline def cloudscale: "cloudscale" = "cloudscale".asInstanceOf["cloudscale"]
    
    inline def cloudsmith: "cloudsmith" = "cloudsmith".asInstanceOf["cloudsmith"]
    
    inline def cloudversify: "cloudversify" = "cloudversify".asInstanceOf["cloudversify"]
    
    inline def clover: "clover" = "clover".asInstanceOf["clover"]
    
    inline def club: "club" = "club".asInstanceOf["club"]
    
    inline def cmplid: "cmplid" = "cmplid".asInstanceOf["cmplid"]
    
    inline def cny: "cny" = "cny".asInstanceOf["cny"]
    
    inline def cocktail: "cocktail" = "cocktail".asInstanceOf["cocktail"]
    
    inline def coconut: "coconut" = "coconut".asInstanceOf["coconut"]
    
    inline def code: "code" = "code".asInstanceOf["code"]
    
    inline def `code-branch`: "code-branch" = "code-branch".asInstanceOf["code-branch"]
    
    inline def `code-commit`: "code-commit" = "code-commit".asInstanceOf["code-commit"]
    
    inline def `code-compare`: "code-compare" = "code-compare".asInstanceOf["code-compare"]
    
    inline def `code-fork`: "code-fork" = "code-fork".asInstanceOf["code-fork"]
    
    inline def `code-merge`: "code-merge" = "code-merge".asInstanceOf["code-merge"]
    
    inline def `code-pull-request`: "code-pull-request" = "code-pull-request".asInstanceOf["code-pull-request"]
    
    inline def `code-pull-request-closed`: "code-pull-request-closed" = "code-pull-request-closed".asInstanceOf["code-pull-request-closed"]
    
    inline def `code-pull-request-draft`: "code-pull-request-draft" = "code-pull-request-draft".asInstanceOf["code-pull-request-draft"]
    
    inline def `code-simple`: "code-simple" = "code-simple".asInstanceOf["code-simple"]
    
    inline def codepen: "codepen" = "codepen".asInstanceOf["codepen"]
    
    inline def codiepie: "codiepie" = "codiepie".asInstanceOf["codiepie"]
    
    inline def coffee: "coffee" = "coffee".asInstanceOf["coffee"]
    
    inline def `coffee-bean`: "coffee-bean" = "coffee-bean".asInstanceOf["coffee-bean"]
    
    inline def `coffee-beans`: "coffee-beans" = "coffee-beans".asInstanceOf["coffee-beans"]
    
    inline def `coffee-pot`: "coffee-pot" = "coffee-pot".asInstanceOf["coffee-pot"]
    
    inline def `coffee-togo`: "coffee-togo" = "coffee-togo".asInstanceOf["coffee-togo"]
    
    inline def coffin: "coffin" = "coffin".asInstanceOf["coffin"]
    
    inline def `coffin-cross`: "coffin-cross" = "coffin-cross".asInstanceOf["coffin-cross"]
    
    inline def cog: "cog" = "cog".asInstanceOf["cog"]
    
    inline def cogs: "cogs" = "cogs".asInstanceOf["cogs"]
    
    inline def coin: "coin" = "coin".asInstanceOf["coin"]
    
    inline def `coin-blank`: "coin-blank" = "coin-blank".asInstanceOf["coin-blank"]
    
    inline def `coin-front`: "coin-front" = "coin-front".asInstanceOf["coin-front"]
    
    inline def `coin-vertical`: "coin-vertical" = "coin-vertical".asInstanceOf["coin-vertical"]
    
    inline def coins: "coins" = "coins".asInstanceOf["coins"]
    
    inline def colon: "colon" = "colon".asInstanceOf["colon"]
    
    inline def `colon-sign`: "colon-sign" = "colon-sign".asInstanceOf["colon-sign"]
    
    inline def columns: "columns" = "columns".asInstanceOf["columns"]
    
    inline def `columns-3`: "columns-3" = "columns-3".asInstanceOf["columns-3"]
    
    inline def comet: "comet" = "comet".asInstanceOf["comet"]
    
    inline def comma: "comma" = "comma".asInstanceOf["comma"]
    
    inline def command: "command" = "command".asInstanceOf["command"]
    
    inline def comment: "comment" = "comment".asInstanceOf["comment"]
    
    inline def `comment-alt`: "comment-alt" = "comment-alt".asInstanceOf["comment-alt"]
    
    inline def `comment-alt-arrow-down`: "comment-alt-arrow-down" = "comment-alt-arrow-down".asInstanceOf["comment-alt-arrow-down"]
    
    inline def `comment-alt-arrow-up`: "comment-alt-arrow-up" = "comment-alt-arrow-up".asInstanceOf["comment-alt-arrow-up"]
    
    inline def `comment-alt-captions`: "comment-alt-captions" = "comment-alt-captions".asInstanceOf["comment-alt-captions"]
    
    inline def `comment-alt-check`: "comment-alt-check" = "comment-alt-check".asInstanceOf["comment-alt-check"]
    
    inline def `comment-alt-dollar`: "comment-alt-dollar" = "comment-alt-dollar".asInstanceOf["comment-alt-dollar"]
    
    inline def `comment-alt-dots`: "comment-alt-dots" = "comment-alt-dots".asInstanceOf["comment-alt-dots"]
    
    inline def `comment-alt-edit`: "comment-alt-edit" = "comment-alt-edit".asInstanceOf["comment-alt-edit"]
    
    inline def `comment-alt-exclamation`: "comment-alt-exclamation" = "comment-alt-exclamation".asInstanceOf["comment-alt-exclamation"]
    
    inline def `comment-alt-image`: "comment-alt-image" = "comment-alt-image".asInstanceOf["comment-alt-image"]
    
    inline def `comment-alt-lines`: "comment-alt-lines" = "comment-alt-lines".asInstanceOf["comment-alt-lines"]
    
    inline def `comment-alt-medical`: "comment-alt-medical" = "comment-alt-medical".asInstanceOf["comment-alt-medical"]
    
    inline def `comment-alt-minus`: "comment-alt-minus" = "comment-alt-minus".asInstanceOf["comment-alt-minus"]
    
    inline def `comment-alt-music`: "comment-alt-music" = "comment-alt-music".asInstanceOf["comment-alt-music"]
    
    inline def `comment-alt-plus`: "comment-alt-plus" = "comment-alt-plus".asInstanceOf["comment-alt-plus"]
    
    inline def `comment-alt-quote`: "comment-alt-quote" = "comment-alt-quote".asInstanceOf["comment-alt-quote"]
    
    inline def `comment-alt-slash`: "comment-alt-slash" = "comment-alt-slash".asInstanceOf["comment-alt-slash"]
    
    inline def `comment-alt-smile`: "comment-alt-smile" = "comment-alt-smile".asInstanceOf["comment-alt-smile"]
    
    inline def `comment-alt-text`: "comment-alt-text" = "comment-alt-text".asInstanceOf["comment-alt-text"]
    
    inline def `comment-alt-times`: "comment-alt-times" = "comment-alt-times".asInstanceOf["comment-alt-times"]
    
    inline def `comment-arrow-down`: "comment-arrow-down" = "comment-arrow-down".asInstanceOf["comment-arrow-down"]
    
    inline def `comment-arrow-up`: "comment-arrow-up" = "comment-arrow-up".asInstanceOf["comment-arrow-up"]
    
    inline def `comment-arrow-up-right`: "comment-arrow-up-right" = "comment-arrow-up-right".asInstanceOf["comment-arrow-up-right"]
    
    inline def `comment-captions`: "comment-captions" = "comment-captions".asInstanceOf["comment-captions"]
    
    inline def `comment-check`: "comment-check" = "comment-check".asInstanceOf["comment-check"]
    
    inline def `comment-code`: "comment-code" = "comment-code".asInstanceOf["comment-code"]
    
    inline def `comment-dollar`: "comment-dollar" = "comment-dollar".asInstanceOf["comment-dollar"]
    
    inline def `comment-dots`: "comment-dots" = "comment-dots".asInstanceOf["comment-dots"]
    
    inline def `comment-edit`: "comment-edit" = "comment-edit".asInstanceOf["comment-edit"]
    
    inline def `comment-exclamation`: "comment-exclamation" = "comment-exclamation".asInstanceOf["comment-exclamation"]
    
    inline def `comment-heart`: "comment-heart" = "comment-heart".asInstanceOf["comment-heart"]
    
    inline def `comment-image`: "comment-image" = "comment-image".asInstanceOf["comment-image"]
    
    inline def `comment-lines`: "comment-lines" = "comment-lines".asInstanceOf["comment-lines"]
    
    inline def `comment-medical`: "comment-medical" = "comment-medical".asInstanceOf["comment-medical"]
    
    inline def `comment-middle`: "comment-middle" = "comment-middle".asInstanceOf["comment-middle"]
    
    inline def `comment-middle-alt`: "comment-middle-alt" = "comment-middle-alt".asInstanceOf["comment-middle-alt"]
    
    inline def `comment-middle-top`: "comment-middle-top" = "comment-middle-top".asInstanceOf["comment-middle-top"]
    
    inline def `comment-middle-top-alt`: "comment-middle-top-alt" = "comment-middle-top-alt".asInstanceOf["comment-middle-top-alt"]
    
    inline def `comment-minus`: "comment-minus" = "comment-minus".asInstanceOf["comment-minus"]
    
    inline def `comment-music`: "comment-music" = "comment-music".asInstanceOf["comment-music"]
    
    inline def `comment-pen`: "comment-pen" = "comment-pen".asInstanceOf["comment-pen"]
    
    inline def `comment-plus`: "comment-plus" = "comment-plus".asInstanceOf["comment-plus"]
    
    inline def `comment-question`: "comment-question" = "comment-question".asInstanceOf["comment-question"]
    
    inline def `comment-quote`: "comment-quote" = "comment-quote".asInstanceOf["comment-quote"]
    
    inline def `comment-slash`: "comment-slash" = "comment-slash".asInstanceOf["comment-slash"]
    
    inline def `comment-smile`: "comment-smile" = "comment-smile".asInstanceOf["comment-smile"]
    
    inline def `comment-sms`: "comment-sms" = "comment-sms".asInstanceOf["comment-sms"]
    
    inline def `comment-text`: "comment-text" = "comment-text".asInstanceOf["comment-text"]
    
    inline def `comment-times`: "comment-times" = "comment-times".asInstanceOf["comment-times"]
    
    inline def `comment-xmark`: "comment-xmark" = "comment-xmark".asInstanceOf["comment-xmark"]
    
    inline def commenting: "commenting" = "commenting".asInstanceOf["commenting"]
    
    inline def comments: "comments" = "comments".asInstanceOf["comments"]
    
    inline def `comments-alt`: "comments-alt" = "comments-alt".asInstanceOf["comments-alt"]
    
    inline def `comments-alt-dollar`: "comments-alt-dollar" = "comments-alt-dollar".asInstanceOf["comments-alt-dollar"]
    
    inline def `comments-dollar`: "comments-dollar" = "comments-dollar".asInstanceOf["comments-dollar"]
    
    inline def `comments-question`: "comments-question" = "comments-question".asInstanceOf["comments-question"]
    
    inline def `comments-question-check`: "comments-question-check" = "comments-question-check".asInstanceOf["comments-question-check"]
    
    inline def `compact-disc`: "compact-disc" = "compact-disc".asInstanceOf["compact-disc"]
    
    inline def compass: "compass" = "compass".asInstanceOf["compass"]
    
    inline def `compass-drafting`: "compass-drafting" = "compass-drafting".asInstanceOf["compass-drafting"]
    
    inline def `compass-slash`: "compass-slash" = "compass-slash".asInstanceOf["compass-slash"]
    
    inline def compress: "compress" = "compress".asInstanceOf["compress"]
    
    inline def `compress-alt`: "compress-alt" = "compress-alt".asInstanceOf["compress-alt"]
    
    inline def `compress-arrows`: "compress-arrows" = "compress-arrows".asInstanceOf["compress-arrows"]
    
    inline def `compress-arrows-alt`: "compress-arrows-alt" = "compress-arrows-alt".asInstanceOf["compress-arrows-alt"]
    
    inline def `compress-wide`: "compress-wide" = "compress-wide".asInstanceOf["compress-wide"]
    
    inline def computer: "computer" = "computer".asInstanceOf["computer"]
    
    inline def `computer-classic`: "computer-classic" = "computer-classic".asInstanceOf["computer-classic"]
    
    inline def `computer-mouse`: "computer-mouse" = "computer-mouse".asInstanceOf["computer-mouse"]
    
    inline def `computer-mouse-scrollwheel`: "computer-mouse-scrollwheel" = "computer-mouse-scrollwheel".asInstanceOf["computer-mouse-scrollwheel"]
    
    inline def `computer-speaker`: "computer-speaker" = "computer-speaker".asInstanceOf["computer-speaker"]
    
    inline def `concierge-bell`: "concierge-bell" = "concierge-bell".asInstanceOf["concierge-bell"]
    
    inline def confluence: "confluence" = "confluence".asInstanceOf["confluence"]
    
    inline def connectdevelop: "connectdevelop" = "connectdevelop".asInstanceOf["connectdevelop"]
    
    inline def construction: "construction" = "construction".asInstanceOf["construction"]
    
    inline def `contact-book`: "contact-book" = "contact-book".asInstanceOf["contact-book"]
    
    inline def `contact-card`: "contact-card" = "contact-card".asInstanceOf["contact-card"]
    
    inline def `container-storage`: "container-storage" = "container-storage".asInstanceOf["container-storage"]
    
    inline def contao: "contao" = "contao".asInstanceOf["contao"]
    
    inline def `conveyor-belt`: "conveyor-belt" = "conveyor-belt".asInstanceOf["conveyor-belt"]
    
    inline def `conveyor-belt-alt`: "conveyor-belt-alt" = "conveyor-belt-alt".asInstanceOf["conveyor-belt-alt"]
    
    inline def `conveyor-belt-boxes`: "conveyor-belt-boxes" = "conveyor-belt-boxes".asInstanceOf["conveyor-belt-boxes"]
    
    inline def `conveyor-belt-empty`: "conveyor-belt-empty" = "conveyor-belt-empty".asInstanceOf["conveyor-belt-empty"]
    
    inline def cookie: "cookie" = "cookie".asInstanceOf["cookie"]
    
    inline def `cookie-bite`: "cookie-bite" = "cookie-bite".asInstanceOf["cookie-bite"]
    
    inline def copy: "copy" = "copy".asInstanceOf["copy"]
    
    inline def copyright: "copyright" = "copyright".asInstanceOf["copyright"]
    
    inline def corn: "corn" = "corn".asInstanceOf["corn"]
    
    inline def corner: "corner" = "corner".asInstanceOf["corner"]
    
    inline def `cotton-bureau`: "cotton-bureau" = "cotton-bureau".asInstanceOf["cotton-bureau"]
    
    inline def couch: "couch" = "couch".asInstanceOf["couch"]
    
    inline def `couch-small`: "couch-small" = "couch-small".asInstanceOf["couch-small"]
    
    inline def cow: "cow" = "cow".asInstanceOf["cow"]
    
    inline def cowbell: "cowbell" = "cowbell".asInstanceOf["cowbell"]
    
    inline def `cowbell-circle-plus`: "cowbell-circle-plus" = "cowbell-circle-plus".asInstanceOf["cowbell-circle-plus"]
    
    inline def `cowbell-more`: "cowbell-more" = "cowbell-more".asInstanceOf["cowbell-more"]
    
    inline def cpanel: "cpanel" = "cpanel".asInstanceOf["cpanel"]
    
    inline def crab: "crab" = "crab".asInstanceOf["crab"]
    
    inline def `crate-apple`: "crate-apple" = "crate-apple".asInstanceOf["crate-apple"]
    
    inline def `crate-empty`: "crate-empty" = "crate-empty".asInstanceOf["crate-empty"]
    
    inline def `creative-commons`: "creative-commons" = "creative-commons".asInstanceOf["creative-commons"]
    
    inline def `creative-commons-by`: "creative-commons-by" = "creative-commons-by".asInstanceOf["creative-commons-by"]
    
    inline def `creative-commons-nc`: "creative-commons-nc" = "creative-commons-nc".asInstanceOf["creative-commons-nc"]
    
    inline def `creative-commons-nc-eu`: "creative-commons-nc-eu" = "creative-commons-nc-eu".asInstanceOf["creative-commons-nc-eu"]
    
    inline def `creative-commons-nc-jp`: "creative-commons-nc-jp" = "creative-commons-nc-jp".asInstanceOf["creative-commons-nc-jp"]
    
    inline def `creative-commons-nd`: "creative-commons-nd" = "creative-commons-nd".asInstanceOf["creative-commons-nd"]
    
    inline def `creative-commons-pd`: "creative-commons-pd" = "creative-commons-pd".asInstanceOf["creative-commons-pd"]
    
    inline def `creative-commons-pd-alt`: "creative-commons-pd-alt" = "creative-commons-pd-alt".asInstanceOf["creative-commons-pd-alt"]
    
    inline def `creative-commons-remix`: "creative-commons-remix" = "creative-commons-remix".asInstanceOf["creative-commons-remix"]
    
    inline def `creative-commons-sa`: "creative-commons-sa" = "creative-commons-sa".asInstanceOf["creative-commons-sa"]
    
    inline def `creative-commons-sampling`: "creative-commons-sampling" = "creative-commons-sampling".asInstanceOf["creative-commons-sampling"]
    
    inline def `creative-commons-sampling-plus`: "creative-commons-sampling-plus" = "creative-commons-sampling-plus".asInstanceOf["creative-commons-sampling-plus"]
    
    inline def `creative-commons-share`: "creative-commons-share" = "creative-commons-share".asInstanceOf["creative-commons-share"]
    
    inline def `creative-commons-zero`: "creative-commons-zero" = "creative-commons-zero".asInstanceOf["creative-commons-zero"]
    
    inline def `credit-card`: "credit-card" = "credit-card".asInstanceOf["credit-card"]
    
    inline def `credit-card-alt`: "credit-card-alt" = "credit-card-alt".asInstanceOf["credit-card-alt"]
    
    inline def `credit-card-blank`: "credit-card-blank" = "credit-card-blank".asInstanceOf["credit-card-blank"]
    
    inline def `credit-card-front`: "credit-card-front" = "credit-card-front".asInstanceOf["credit-card-front"]
    
    inline def creemee: "creemee" = "creemee".asInstanceOf["creemee"]
    
    inline def cricket: "cricket" = "cricket".asInstanceOf["cricket"]
    
    inline def `cricket-bat-ball`: "cricket-bat-ball" = "cricket-bat-ball".asInstanceOf["cricket-bat-ball"]
    
    inline def `critical-role`: "critical-role" = "critical-role".asInstanceOf["critical-role"]
    
    inline def croissant: "croissant" = "croissant".asInstanceOf["croissant"]
    
    inline def crop: "crop" = "crop".asInstanceOf["crop"]
    
    inline def `crop-alt`: "crop-alt" = "crop-alt".asInstanceOf["crop-alt"]
    
    inline def `crop-simple`: "crop-simple" = "crop-simple".asInstanceOf["crop-simple"]
    
    inline def cross: "cross" = "cross".asInstanceOf["cross"]
    
    inline def crosshairs: "crosshairs" = "crosshairs".asInstanceOf["crosshairs"]
    
    inline def `crosshairs-simple`: "crosshairs-simple" = "crosshairs-simple".asInstanceOf["crosshairs-simple"]
    
    inline def crow: "crow" = "crow".asInstanceOf["crow"]
    
    inline def crown: "crown" = "crown".asInstanceOf["crown"]
    
    inline def crutch: "crutch" = "crutch".asInstanceOf["crutch"]
    
    inline def crutches: "crutches" = "crutches".asInstanceOf["crutches"]
    
    inline def `cruzeiro-sign`: "cruzeiro-sign" = "cruzeiro-sign".asInstanceOf["cruzeiro-sign"]
    
    inline def `crystal-ball`: "crystal-ball" = "crystal-ball".asInstanceOf["crystal-ball"]
    
    inline def css3: "css3" = "css3".asInstanceOf["css3"]
    
    inline def `css3-alt`: "css3-alt" = "css3-alt".asInstanceOf["css3-alt"]
    
    inline def cube: "cube" = "cube".asInstanceOf["cube"]
    
    inline def cubes: "cubes" = "cubes".asInstanceOf["cubes"]
    
    inline def `cubes-stacked`: "cubes-stacked" = "cubes-stacked".asInstanceOf["cubes-stacked"]
    
    inline def cucumber: "cucumber" = "cucumber".asInstanceOf["cucumber"]
    
    inline def `cup-straw`: "cup-straw" = "cup-straw".asInstanceOf["cup-straw"]
    
    inline def `cup-straw-swoosh`: "cup-straw-swoosh" = "cup-straw-swoosh".asInstanceOf["cup-straw-swoosh"]
    
    inline def `cup-togo`: "cup-togo" = "cup-togo".asInstanceOf["cup-togo"]
    
    inline def cupcake: "cupcake" = "cupcake".asInstanceOf["cupcake"]
    
    inline def curling: "curling" = "curling".asInstanceOf["curling"]
    
    inline def `curling-stone`: "curling-stone" = "curling-stone".asInstanceOf["curling-stone"]
    
    inline def custard: "custard" = "custard".asInstanceOf["custard"]
    
    inline def cut: "cut" = "cut".asInstanceOf["cut"]
    
    inline def cutlery: "cutlery" = "cutlery".asInstanceOf["cutlery"]
    
    inline def cuttlefish: "cuttlefish" = "cuttlefish".asInstanceOf["cuttlefish"]
    
    inline def d: "d" = "d".asInstanceOf["d"]
    
    inline def `d-and-d`: "d-and-d" = "d-and-d".asInstanceOf["d-and-d"]
    
    inline def `d-and-d-beyond`: "d-and-d-beyond" = "d-and-d-beyond".asInstanceOf["d-and-d-beyond"]
    
    inline def dagger: "dagger" = "dagger".asInstanceOf["dagger"]
    
    inline def dailymotion: "dailymotion" = "dailymotion".asInstanceOf["dailymotion"]
    
    inline def dash: "dash" = "dash".asInstanceOf["dash"]
    
    inline def dashboard: "dashboard" = "dashboard".asInstanceOf["dashboard"]
    
    inline def dashcube: "dashcube" = "dashcube".asInstanceOf["dashcube"]
    
    inline def database: "database" = "database".asInstanceOf["database"]
    
    inline def deaf: "deaf" = "deaf".asInstanceOf["deaf"]
    
    inline def deafness: "deafness" = "deafness".asInstanceOf["deafness"]
    
    inline def debug: "debug" = "debug".asInstanceOf["debug"]
    
    inline def dedent: "dedent" = "dedent".asInstanceOf["dedent"]
    
    inline def deer: "deer" = "deer".asInstanceOf["deer"]
    
    inline def `deer-rudolph`: "deer-rudolph" = "deer-rudolph".asInstanceOf["deer-rudolph"]
    
    inline def deezer: "deezer" = "deezer".asInstanceOf["deezer"]
    
    inline def `delete-left`: "delete-left" = "delete-left".asInstanceOf["delete-left"]
    
    inline def `delete-right`: "delete-right" = "delete-right".asInstanceOf["delete-right"]
    
    inline def delicious: "delicious" = "delicious".asInstanceOf["delicious"]
    
    inline def democrat: "democrat" = "democrat".asInstanceOf["democrat"]
    
    inline def deploydog: "deploydog" = "deploydog".asInstanceOf["deploydog"]
    
    inline def deskpro: "deskpro" = "deskpro".asInstanceOf["deskpro"]
    
    inline def desktop: "desktop" = "desktop".asInstanceOf["desktop"]
    
    inline def `desktop-alt`: "desktop-alt" = "desktop-alt".asInstanceOf["desktop-alt"]
    
    inline def `desktop-arrow-down`: "desktop-arrow-down" = "desktop-arrow-down".asInstanceOf["desktop-arrow-down"]
    
    inline def `desktop-code`: "desktop-code" = "desktop-code".asInstanceOf["desktop-code"]
    
    inline def `desktop-medical`: "desktop-medical" = "desktop-medical".asInstanceOf["desktop-medical"]
    
    inline def `desktop-slash`: "desktop-slash" = "desktop-slash".asInstanceOf["desktop-slash"]
    
    inline def dev: "dev" = "dev".asInstanceOf["dev"]
    
    inline def deviantart: "deviantart" = "deviantart".asInstanceOf["deviantart"]
    
    inline def dewpoint: "dewpoint" = "dewpoint".asInstanceOf["dewpoint"]
    
    inline def dharmachakra: "dharmachakra" = "dharmachakra".asInstanceOf["dharmachakra"]
    
    inline def dhl: "dhl" = "dhl".asInstanceOf["dhl"]
    
    inline def diagnoses: "diagnoses" = "diagnoses".asInstanceOf["diagnoses"]
    
    inline def `diagram-cells`: "diagram-cells" = "diagram-cells".asInstanceOf["diagram-cells"]
    
    inline def `diagram-lean-canvas`: "diagram-lean-canvas" = "diagram-lean-canvas".asInstanceOf["diagram-lean-canvas"]
    
    inline def `diagram-nested`: "diagram-nested" = "diagram-nested".asInstanceOf["diagram-nested"]
    
    inline def `diagram-next`: "diagram-next" = "diagram-next".asInstanceOf["diagram-next"]
    
    inline def `diagram-predecessor`: "diagram-predecessor" = "diagram-predecessor".asInstanceOf["diagram-predecessor"]
    
    inline def `diagram-previous`: "diagram-previous" = "diagram-previous".asInstanceOf["diagram-previous"]
    
    inline def `diagram-project`: "diagram-project" = "diagram-project".asInstanceOf["diagram-project"]
    
    inline def `diagram-sankey`: "diagram-sankey" = "diagram-sankey".asInstanceOf["diagram-sankey"]
    
    inline def `diagram-subtask`: "diagram-subtask" = "diagram-subtask".asInstanceOf["diagram-subtask"]
    
    inline def `diagram-successor`: "diagram-successor" = "diagram-successor".asInstanceOf["diagram-successor"]
    
    inline def `diagram-venn`: "diagram-venn" = "diagram-venn".asInstanceOf["diagram-venn"]
    
    inline def dial: "dial" = "dial".asInstanceOf["dial"]
    
    inline def `dial-high`: "dial-high" = "dial-high".asInstanceOf["dial-high"]
    
    inline def `dial-low`: "dial-low" = "dial-low".asInstanceOf["dial-low"]
    
    inline def `dial-max`: "dial-max" = "dial-max".asInstanceOf["dial-max"]
    
    inline def `dial-med`: "dial-med" = "dial-med".asInstanceOf["dial-med"]
    
    inline def `dial-med-high`: "dial-med-high" = "dial-med-high".asInstanceOf["dial-med-high"]
    
    inline def `dial-med-low`: "dial-med-low" = "dial-med-low".asInstanceOf["dial-med-low"]
    
    inline def `dial-min`: "dial-min" = "dial-min".asInstanceOf["dial-min"]
    
    inline def `dial-off`: "dial-off" = "dial-off".asInstanceOf["dial-off"]
    
    inline def diamond: "diamond" = "diamond".asInstanceOf["diamond"]
    
    inline def `diamond-exclamation`: "diamond-exclamation" = "diamond-exclamation".asInstanceOf["diamond-exclamation"]
    
    inline def `diamond-half`: "diamond-half" = "diamond-half".asInstanceOf["diamond-half"]
    
    inline def `diamond-half-stroke`: "diamond-half-stroke" = "diamond-half-stroke".asInstanceOf["diamond-half-stroke"]
    
    inline def `diamond-turn-right`: "diamond-turn-right" = "diamond-turn-right".asInstanceOf["diamond-turn-right"]
    
    inline def diaspora: "diaspora" = "diaspora".asInstanceOf["diaspora"]
    
    inline def dice: "dice" = "dice".asInstanceOf["dice"]
    
    inline def `dice-d10`: "dice-d10" = "dice-d10".asInstanceOf["dice-d10"]
    
    inline def `dice-d12`: "dice-d12" = "dice-d12".asInstanceOf["dice-d12"]
    
    inline def `dice-d20`: "dice-d20" = "dice-d20".asInstanceOf["dice-d20"]
    
    inline def `dice-d4`: "dice-d4" = "dice-d4".asInstanceOf["dice-d4"]
    
    inline def `dice-d6`: "dice-d6" = "dice-d6".asInstanceOf["dice-d6"]
    
    inline def `dice-d8`: "dice-d8" = "dice-d8".asInstanceOf["dice-d8"]
    
    inline def `dice-five`: "dice-five" = "dice-five".asInstanceOf["dice-five"]
    
    inline def `dice-four`: "dice-four" = "dice-four".asInstanceOf["dice-four"]
    
    inline def `dice-one`: "dice-one" = "dice-one".asInstanceOf["dice-one"]
    
    inline def `dice-six`: "dice-six" = "dice-six".asInstanceOf["dice-six"]
    
    inline def `dice-three`: "dice-three" = "dice-three".asInstanceOf["dice-three"]
    
    inline def `dice-two`: "dice-two" = "dice-two".asInstanceOf["dice-two"]
    
    inline def digg: "digg" = "digg".asInstanceOf["digg"]
    
    inline def digging: "digging" = "digging".asInstanceOf["digging"]
    
    inline def `digital-ocean`: "digital-ocean" = "digital-ocean".asInstanceOf["digital-ocean"]
    
    inline def `digital-tachograph`: "digital-tachograph" = "digital-tachograph".asInstanceOf["digital-tachograph"]
    
    inline def diploma: "diploma" = "diploma".asInstanceOf["diploma"]
    
    inline def directions: "directions" = "directions".asInstanceOf["directions"]
    
    inline def `disc-drive`: "disc-drive" = "disc-drive".asInstanceOf["disc-drive"]
    
    inline def discord: "discord" = "discord".asInstanceOf["discord"]
    
    inline def discourse: "discourse" = "discourse".asInstanceOf["discourse"]
    
    inline def disease: "disease" = "disease".asInstanceOf["disease"]
    
    inline def display: "display" = "display".asInstanceOf["display"]
    
    inline def `display-arrow-down`: "display-arrow-down" = "display-arrow-down".asInstanceOf["display-arrow-down"]
    
    inline def `display-code`: "display-code" = "display-code".asInstanceOf["display-code"]
    
    inline def `display-medical`: "display-medical" = "display-medical".asInstanceOf["display-medical"]
    
    inline def `display-slash`: "display-slash" = "display-slash".asInstanceOf["display-slash"]
    
    inline def `distribute-spacing-horizontal`: "distribute-spacing-horizontal" = "distribute-spacing-horizontal".asInstanceOf["distribute-spacing-horizontal"]
    
    inline def `distribute-spacing-vertical`: "distribute-spacing-vertical" = "distribute-spacing-vertical".asInstanceOf["distribute-spacing-vertical"]
    
    inline def ditto: "ditto" = "ditto".asInstanceOf["ditto"]
    
    inline def divide: "divide" = "divide".asInstanceOf["divide"]
    
    inline def dizzy: "dizzy" = "dizzy".asInstanceOf["dizzy"]
    
    inline def dna: "dna" = "dna".asInstanceOf["dna"]
    
    inline def `do-not-enter`: "do-not-enter" = "do-not-enter".asInstanceOf["do-not-enter"]
    
    inline def dochub: "dochub" = "dochub".asInstanceOf["dochub"]
    
    inline def docker: "docker" = "docker".asInstanceOf["docker"]
    
    inline def dog: "dog" = "dog".asInstanceOf["dog"]
    
    inline def `dog-leashed`: "dog-leashed" = "dog-leashed".asInstanceOf["dog-leashed"]
    
    inline def dollar: "dollar" = "dollar".asInstanceOf["dollar"]
    
    inline def `dollar-circle`: "dollar-circle" = "dollar-circle".asInstanceOf["dollar-circle"]
    
    inline def `dollar-sign`: "dollar-sign" = "dollar-sign".asInstanceOf["dollar-sign"]
    
    inline def `dollar-square`: "dollar-square" = "dollar-square".asInstanceOf["dollar-square"]
    
    inline def dolly: "dolly" = "dolly".asInstanceOf["dolly"]
    
    inline def `dolly-box`: "dolly-box" = "dolly-box".asInstanceOf["dolly-box"]
    
    inline def `dolly-empty`: "dolly-empty" = "dolly-empty".asInstanceOf["dolly-empty"]
    
    inline def `dolly-flatbed`: "dolly-flatbed" = "dolly-flatbed".asInstanceOf["dolly-flatbed"]
    
    inline def `dolly-flatbed-alt`: "dolly-flatbed-alt" = "dolly-flatbed-alt".asInstanceOf["dolly-flatbed-alt"]
    
    inline def `dolly-flatbed-empty`: "dolly-flatbed-empty" = "dolly-flatbed-empty".asInstanceOf["dolly-flatbed-empty"]
    
    inline def dolphin: "dolphin" = "dolphin".asInstanceOf["dolphin"]
    
    inline def donate: "donate" = "donate".asInstanceOf["donate"]
    
    inline def `dong-sign`: "dong-sign" = "dong-sign".asInstanceOf["dong-sign"]
    
    inline def donut: "donut" = "donut".asInstanceOf["donut"]
    
    inline def `door-closed`: "door-closed" = "door-closed".asInstanceOf["door-closed"]
    
    inline def `door-open`: "door-open" = "door-open".asInstanceOf["door-open"]
    
    inline def `dot-circle`: "dot-circle" = "dot-circle".asInstanceOf["dot-circle"]
    
    inline def doughnut: "doughnut" = "doughnut".asInstanceOf["doughnut"]
    
    inline def dove: "dove" = "dove".asInstanceOf["dove"]
    
    inline def down: "down" = "down".asInstanceOf["down"]
    
    inline def `down-from-dotted-line`: "down-from-dotted-line" = "down-from-dotted-line".asInstanceOf["down-from-dotted-line"]
    
    inline def `down-from-line`: "down-from-line" = "down-from-line".asInstanceOf["down-from-line"]
    
    inline def `down-left`: "down-left" = "down-left".asInstanceOf["down-left"]
    
    inline def `down-left-and-up-right-to-center`: "down-left-and-up-right-to-center" = "down-left-and-up-right-to-center".asInstanceOf["down-left-and-up-right-to-center"]
    
    inline def `down-long`: "down-long" = "down-long".asInstanceOf["down-long"]
    
    inline def `down-right`: "down-right" = "down-right".asInstanceOf["down-right"]
    
    inline def `down-to-bracket`: "down-to-bracket" = "down-to-bracket".asInstanceOf["down-to-bracket"]
    
    inline def `down-to-dotted-line`: "down-to-dotted-line" = "down-to-dotted-line".asInstanceOf["down-to-dotted-line"]
    
    inline def `down-to-line`: "down-to-line" = "down-to-line".asInstanceOf["down-to-line"]
    
    inline def download: "download" = "download".asInstanceOf["download"]
    
    inline def draft2digital: "draft2digital" = "draft2digital".asInstanceOf["draft2digital"]
    
    inline def `drafting-compass`: "drafting-compass" = "drafting-compass".asInstanceOf["drafting-compass"]
    
    inline def dragon: "dragon" = "dragon".asInstanceOf["dragon"]
    
    inline def `draw-circle`: "draw-circle" = "draw-circle".asInstanceOf["draw-circle"]
    
    inline def `draw-polygon`: "draw-polygon" = "draw-polygon".asInstanceOf["draw-polygon"]
    
    inline def `draw-square`: "draw-square" = "draw-square".asInstanceOf["draw-square"]
    
    inline def dreidel: "dreidel" = "dreidel".asInstanceOf["dreidel"]
    
    inline def dribbble: "dribbble" = "dribbble".asInstanceOf["dribbble"]
    
    inline def `dribbble-square`: "dribbble-square" = "dribbble-square".asInstanceOf["dribbble-square"]
    
    inline def `drivers-license`: "drivers-license" = "drivers-license".asInstanceOf["drivers-license"]
    
    inline def drone: "drone" = "drone".asInstanceOf["drone"]
    
    inline def `drone-alt`: "drone-alt" = "drone-alt".asInstanceOf["drone-alt"]
    
    inline def `drone-front`: "drone-front" = "drone-front".asInstanceOf["drone-front"]
    
    inline def dropbox: "dropbox" = "dropbox".asInstanceOf["dropbox"]
    
    inline def droplet: "droplet" = "droplet".asInstanceOf["droplet"]
    
    inline def `droplet-degree`: "droplet-degree" = "droplet-degree".asInstanceOf["droplet-degree"]
    
    inline def `droplet-percent`: "droplet-percent" = "droplet-percent".asInstanceOf["droplet-percent"]
    
    inline def `droplet-slash`: "droplet-slash" = "droplet-slash".asInstanceOf["droplet-slash"]
    
    inline def drum: "drum" = "drum".asInstanceOf["drum"]
    
    inline def `drum-steelpan`: "drum-steelpan" = "drum-steelpan".asInstanceOf["drum-steelpan"]
    
    inline def drumstick: "drumstick" = "drumstick".asInstanceOf["drumstick"]
    
    inline def `drumstick-bite`: "drumstick-bite" = "drumstick-bite".asInstanceOf["drumstick-bite"]
    
    inline def drupal: "drupal" = "drupal".asInstanceOf["drupal"]
    
    inline def dryer: "dryer" = "dryer".asInstanceOf["dryer"]
    
    inline def `dryer-alt`: "dryer-alt" = "dryer-alt".asInstanceOf["dryer-alt"]
    
    inline def `dryer-heat`: "dryer-heat" = "dryer-heat".asInstanceOf["dryer-heat"]
    
    inline def duck: "duck" = "duck".asInstanceOf["duck"]
    
    inline def dumbbell: "dumbbell" = "dumbbell".asInstanceOf["dumbbell"]
    
    inline def dumpster: "dumpster" = "dumpster".asInstanceOf["dumpster"]
    
    inline def `dumpster-fire`: "dumpster-fire" = "dumpster-fire".asInstanceOf["dumpster-fire"]
    
    inline def dungeon: "dungeon" = "dungeon".asInstanceOf["dungeon"]
    
    inline def dyalog: "dyalog" = "dyalog".asInstanceOf["dyalog"]
    
    inline def e: "e" = "e".asInstanceOf["e"]
    
    inline def ear: "ear" = "ear".asInstanceOf["ear"]
    
    inline def `ear-deaf`: "ear-deaf" = "ear-deaf".asInstanceOf["ear-deaf"]
    
    inline def `ear-listen`: "ear-listen" = "ear-listen".asInstanceOf["ear-listen"]
    
    inline def `ear-muffs`: "ear-muffs" = "ear-muffs".asInstanceOf["ear-muffs"]
    
    inline def earlybirds: "earlybirds" = "earlybirds".asInstanceOf["earlybirds"]
    
    inline def earth: "earth" = "earth".asInstanceOf["earth"]
    
    inline def `earth-africa`: "earth-africa" = "earth-africa".asInstanceOf["earth-africa"]
    
    inline def `earth-america`: "earth-america" = "earth-america".asInstanceOf["earth-america"]
    
    inline def `earth-americas`: "earth-americas" = "earth-americas".asInstanceOf["earth-americas"]
    
    inline def `earth-asia`: "earth-asia" = "earth-asia".asInstanceOf["earth-asia"]
    
    inline def `earth-europe`: "earth-europe" = "earth-europe".asInstanceOf["earth-europe"]
    
    inline def `earth-oceania`: "earth-oceania" = "earth-oceania".asInstanceOf["earth-oceania"]
    
    inline def ebay: "ebay" = "ebay".asInstanceOf["ebay"]
    
    inline def eclipse: "eclipse" = "eclipse".asInstanceOf["eclipse"]
    
    inline def `eclipse-alt`: "eclipse-alt" = "eclipse-alt".asInstanceOf["eclipse-alt"]
    
    inline def edge: "edge" = "edge".asInstanceOf["edge"]
    
    inline def `edge-legacy`: "edge-legacy" = "edge-legacy".asInstanceOf["edge-legacy"]
    
    inline def edit: "edit" = "edit".asInstanceOf["edit"]
    
    inline def egg: "egg" = "egg".asInstanceOf["egg"]
    
    inline def `egg-fried`: "egg-fried" = "egg-fried".asInstanceOf["egg-fried"]
    
    inline def eggplant: "eggplant" = "eggplant".asInstanceOf["eggplant"]
    
    inline def eject: "eject" = "eject".asInstanceOf["eject"]
    
    inline def elementor: "elementor" = "elementor".asInstanceOf["elementor"]
    
    inline def elephant: "elephant" = "elephant".asInstanceOf["elephant"]
    
    inline def elevator: "elevator" = "elevator".asInstanceOf["elevator"]
    
    inline def ellipsis: "ellipsis" = "ellipsis".asInstanceOf["ellipsis"]
    
    inline def `ellipsis-h`: "ellipsis-h" = "ellipsis-h".asInstanceOf["ellipsis-h"]
    
    inline def `ellipsis-h-alt`: "ellipsis-h-alt" = "ellipsis-h-alt".asInstanceOf["ellipsis-h-alt"]
    
    inline def `ellipsis-stroke`: "ellipsis-stroke" = "ellipsis-stroke".asInstanceOf["ellipsis-stroke"]
    
    inline def `ellipsis-stroke-vertical`: "ellipsis-stroke-vertical" = "ellipsis-stroke-vertical".asInstanceOf["ellipsis-stroke-vertical"]
    
    inline def `ellipsis-v`: "ellipsis-v" = "ellipsis-v".asInstanceOf["ellipsis-v"]
    
    inline def `ellipsis-v-alt`: "ellipsis-v-alt" = "ellipsis-v-alt".asInstanceOf["ellipsis-v-alt"]
    
    inline def `ellipsis-vertical`: "ellipsis-vertical" = "ellipsis-vertical".asInstanceOf["ellipsis-vertical"]
    
    inline def ello: "ello" = "ello".asInstanceOf["ello"]
    
    inline def ember: "ember" = "ember".asInstanceOf["ember"]
    
    inline def empire: "empire" = "empire".asInstanceOf["empire"]
    
    inline def `empty-set`: "empty-set" = "empty-set".asInstanceOf["empty-set"]
    
    inline def engine: "engine" = "engine".asInstanceOf["engine"]
    
    inline def `engine-exclamation`: "engine-exclamation" = "engine-exclamation".asInstanceOf["engine-exclamation"]
    
    inline def `engine-warning`: "engine-warning" = "engine-warning".asInstanceOf["engine-warning"]
    
    inline def envelope: "envelope" = "envelope".asInstanceOf["envelope"]
    
    inline def `envelope-badge`: "envelope-badge" = "envelope-badge".asInstanceOf["envelope-badge"]
    
    inline def `envelope-circle`: "envelope-circle" = "envelope-circle".asInstanceOf["envelope-circle"]
    
    inline def `envelope-circle-check`: "envelope-circle-check" = "envelope-circle-check".asInstanceOf["envelope-circle-check"]
    
    inline def `envelope-dot`: "envelope-dot" = "envelope-dot".asInstanceOf["envelope-dot"]
    
    inline def `envelope-open`: "envelope-open" = "envelope-open".asInstanceOf["envelope-open"]
    
    inline def `envelope-open-dollar`: "envelope-open-dollar" = "envelope-open-dollar".asInstanceOf["envelope-open-dollar"]
    
    inline def `envelope-open-text`: "envelope-open-text" = "envelope-open-text".asInstanceOf["envelope-open-text"]
    
    inline def `envelope-square`: "envelope-square" = "envelope-square".asInstanceOf["envelope-square"]
    
    inline def envelopes: "envelopes" = "envelopes".asInstanceOf["envelopes"]
    
    inline def `envelopes-bulk`: "envelopes-bulk" = "envelopes-bulk".asInstanceOf["envelopes-bulk"]
    
    inline def envira: "envira" = "envira".asInstanceOf["envira"]
    
    inline def equals: "equals" = "equals".asInstanceOf["equals"]
    
    inline def eraser: "eraser" = "eraser".asInstanceOf["eraser"]
    
    inline def erlang: "erlang" = "erlang".asInstanceOf["erlang"]
    
    inline def escalator: "escalator" = "escalator".asInstanceOf["escalator"]
    
    inline def ethereum: "ethereum" = "ethereum".asInstanceOf["ethereum"]
    
    inline def ethernet: "ethernet" = "ethernet".asInstanceOf["ethernet"]
    
    inline def etsy: "etsy" = "etsy".asInstanceOf["etsy"]
    
    inline def eur: "eur" = "eur".asInstanceOf["eur"]
    
    inline def euro: "euro" = "euro".asInstanceOf["euro"]
    
    inline def `euro-sign`: "euro-sign" = "euro-sign".asInstanceOf["euro-sign"]
    
    inline def evernote: "evernote" = "evernote".asInstanceOf["evernote"]
    
    inline def exchange: "exchange" = "exchange".asInstanceOf["exchange"]
    
    inline def `exchange-alt`: "exchange-alt" = "exchange-alt".asInstanceOf["exchange-alt"]
    
    inline def exclamation: "exclamation" = "exclamation".asInstanceOf["exclamation"]
    
    inline def `exclamation-circle`: "exclamation-circle" = "exclamation-circle".asInstanceOf["exclamation-circle"]
    
    inline def `exclamation-square`: "exclamation-square" = "exclamation-square".asInstanceOf["exclamation-square"]
    
    inline def `exclamation-triangle`: "exclamation-triangle" = "exclamation-triangle".asInstanceOf["exclamation-triangle"]
    
    inline def expand: "expand" = "expand".asInstanceOf["expand"]
    
    inline def `expand-alt`: "expand-alt" = "expand-alt".asInstanceOf["expand-alt"]
    
    inline def `expand-arrows`: "expand-arrows" = "expand-arrows".asInstanceOf["expand-arrows"]
    
    inline def `expand-arrows-alt`: "expand-arrows-alt" = "expand-arrows-alt".asInstanceOf["expand-arrows-alt"]
    
    inline def `expand-wide`: "expand-wide" = "expand-wide".asInstanceOf["expand-wide"]
    
    inline def expeditedssl: "expeditedssl" = "expeditedssl".asInstanceOf["expeditedssl"]
    
    inline def `exploding-head`: "exploding-head" = "exploding-head".asInstanceOf["exploding-head"]
    
    inline def explosion: "explosion" = "explosion".asInstanceOf["explosion"]
    
    inline def `external-link`: "external-link" = "external-link".asInstanceOf["external-link"]
    
    inline def `external-link-alt`: "external-link-alt" = "external-link-alt".asInstanceOf["external-link-alt"]
    
    inline def `external-link-square`: "external-link-square" = "external-link-square".asInstanceOf["external-link-square"]
    
    inline def `external-link-square-alt`: "external-link-square-alt" = "external-link-square-alt".asInstanceOf["external-link-square-alt"]
    
    inline def eye: "eye" = "eye".asInstanceOf["eye"]
    
    inline def `eye-dropper`: "eye-dropper" = "eye-dropper".asInstanceOf["eye-dropper"]
    
    inline def `eye-dropper-empty`: "eye-dropper-empty" = "eye-dropper-empty".asInstanceOf["eye-dropper-empty"]
    
    inline def `eye-dropper-full`: "eye-dropper-full" = "eye-dropper-full".asInstanceOf["eye-dropper-full"]
    
    inline def `eye-dropper-half`: "eye-dropper-half" = "eye-dropper-half".asInstanceOf["eye-dropper-half"]
    
    inline def `eye-evil`: "eye-evil" = "eye-evil".asInstanceOf["eye-evil"]
    
    inline def `eye-low-vision`: "eye-low-vision" = "eye-low-vision".asInstanceOf["eye-low-vision"]
    
    inline def `eye-slash`: "eye-slash" = "eye-slash".asInstanceOf["eye-slash"]
    
    inline def eyedropper: "eyedropper" = "eyedropper".asInstanceOf["eyedropper"]
    
    inline def eyes: "eyes" = "eyes".asInstanceOf["eyes"]
    
    inline def f: "f" = "f".asInstanceOf["f"]
    
    inline def `face-angry`: "face-angry" = "face-angry".asInstanceOf["face-angry"]
    
    inline def `face-angry-horns`: "face-angry-horns" = "face-angry-horns".asInstanceOf["face-angry-horns"]
    
    inline def `face-anguished`: "face-anguished" = "face-anguished".asInstanceOf["face-anguished"]
    
    inline def `face-anxious-sweat`: "face-anxious-sweat" = "face-anxious-sweat".asInstanceOf["face-anxious-sweat"]
    
    inline def `face-astonished`: "face-astonished" = "face-astonished".asInstanceOf["face-astonished"]
    
    inline def `face-awesome`: "face-awesome" = "face-awesome".asInstanceOf["face-awesome"]
    
    inline def `face-beam-hand-over-mouth`: "face-beam-hand-over-mouth" = "face-beam-hand-over-mouth".asInstanceOf["face-beam-hand-over-mouth"]
    
    inline def `face-clouds`: "face-clouds" = "face-clouds".asInstanceOf["face-clouds"]
    
    inline def `face-confounded`: "face-confounded" = "face-confounded".asInstanceOf["face-confounded"]
    
    inline def `face-confused`: "face-confused" = "face-confused".asInstanceOf["face-confused"]
    
    inline def `face-cowboy-hat`: "face-cowboy-hat" = "face-cowboy-hat".asInstanceOf["face-cowboy-hat"]
    
    inline def `face-diagonal-mouth`: "face-diagonal-mouth" = "face-diagonal-mouth".asInstanceOf["face-diagonal-mouth"]
    
    inline def `face-disappointed`: "face-disappointed" = "face-disappointed".asInstanceOf["face-disappointed"]
    
    inline def `face-disguise`: "face-disguise" = "face-disguise".asInstanceOf["face-disguise"]
    
    inline def `face-dizzy`: "face-dizzy" = "face-dizzy".asInstanceOf["face-dizzy"]
    
    inline def `face-dotted`: "face-dotted" = "face-dotted".asInstanceOf["face-dotted"]
    
    inline def `face-downcast-sweat`: "face-downcast-sweat" = "face-downcast-sweat".asInstanceOf["face-downcast-sweat"]
    
    inline def `face-drooling`: "face-drooling" = "face-drooling".asInstanceOf["face-drooling"]
    
    inline def `face-exhaling`: "face-exhaling" = "face-exhaling".asInstanceOf["face-exhaling"]
    
    inline def `face-explode`: "face-explode" = "face-explode".asInstanceOf["face-explode"]
    
    inline def `face-expressionless`: "face-expressionless" = "face-expressionless".asInstanceOf["face-expressionless"]
    
    inline def `face-eyes-xmarks`: "face-eyes-xmarks" = "face-eyes-xmarks".asInstanceOf["face-eyes-xmarks"]
    
    inline def `face-fearful`: "face-fearful" = "face-fearful".asInstanceOf["face-fearful"]
    
    inline def `face-flushed`: "face-flushed" = "face-flushed".asInstanceOf["face-flushed"]
    
    inline def `face-frown`: "face-frown" = "face-frown".asInstanceOf["face-frown"]
    
    inline def `face-frown-open`: "face-frown-open" = "face-frown-open".asInstanceOf["face-frown-open"]
    
    inline def `face-frown-slight`: "face-frown-slight" = "face-frown-slight".asInstanceOf["face-frown-slight"]
    
    inline def `face-glasses`: "face-glasses" = "face-glasses".asInstanceOf["face-glasses"]
    
    inline def `face-grimace`: "face-grimace" = "face-grimace".asInstanceOf["face-grimace"]
    
    inline def `face-grin`: "face-grin" = "face-grin".asInstanceOf["face-grin"]
    
    inline def `face-grin-beam`: "face-grin-beam" = "face-grin-beam".asInstanceOf["face-grin-beam"]
    
    inline def `face-grin-beam-sweat`: "face-grin-beam-sweat" = "face-grin-beam-sweat".asInstanceOf["face-grin-beam-sweat"]
    
    inline def `face-grin-hearts`: "face-grin-hearts" = "face-grin-hearts".asInstanceOf["face-grin-hearts"]
    
    inline def `face-grin-squint`: "face-grin-squint" = "face-grin-squint".asInstanceOf["face-grin-squint"]
    
    inline def `face-grin-squint-tears`: "face-grin-squint-tears" = "face-grin-squint-tears".asInstanceOf["face-grin-squint-tears"]
    
    inline def `face-grin-stars`: "face-grin-stars" = "face-grin-stars".asInstanceOf["face-grin-stars"]
    
    inline def `face-grin-tears`: "face-grin-tears" = "face-grin-tears".asInstanceOf["face-grin-tears"]
    
    inline def `face-grin-tongue`: "face-grin-tongue" = "face-grin-tongue".asInstanceOf["face-grin-tongue"]
    
    inline def `face-grin-tongue-squint`: "face-grin-tongue-squint" = "face-grin-tongue-squint".asInstanceOf["face-grin-tongue-squint"]
    
    inline def `face-grin-tongue-wink`: "face-grin-tongue-wink" = "face-grin-tongue-wink".asInstanceOf["face-grin-tongue-wink"]
    
    inline def `face-grin-wide`: "face-grin-wide" = "face-grin-wide".asInstanceOf["face-grin-wide"]
    
    inline def `face-grin-wink`: "face-grin-wink" = "face-grin-wink".asInstanceOf["face-grin-wink"]
    
    inline def `face-hand-over-mouth`: "face-hand-over-mouth" = "face-hand-over-mouth".asInstanceOf["face-hand-over-mouth"]
    
    inline def `face-hand-peeking`: "face-hand-peeking" = "face-hand-peeking".asInstanceOf["face-hand-peeking"]
    
    inline def `face-hand-yawn`: "face-hand-yawn" = "face-hand-yawn".asInstanceOf["face-hand-yawn"]
    
    inline def `face-head-bandage`: "face-head-bandage" = "face-head-bandage".asInstanceOf["face-head-bandage"]
    
    inline def `face-holding-back-tears`: "face-holding-back-tears" = "face-holding-back-tears".asInstanceOf["face-holding-back-tears"]
    
    inline def `face-hushed`: "face-hushed" = "face-hushed".asInstanceOf["face-hushed"]
    
    inline def `face-icicles`: "face-icicles" = "face-icicles".asInstanceOf["face-icicles"]
    
    inline def `face-kiss`: "face-kiss" = "face-kiss".asInstanceOf["face-kiss"]
    
    inline def `face-kiss-beam`: "face-kiss-beam" = "face-kiss-beam".asInstanceOf["face-kiss-beam"]
    
    inline def `face-kiss-closed-eyes`: "face-kiss-closed-eyes" = "face-kiss-closed-eyes".asInstanceOf["face-kiss-closed-eyes"]
    
    inline def `face-kiss-wink-heart`: "face-kiss-wink-heart" = "face-kiss-wink-heart".asInstanceOf["face-kiss-wink-heart"]
    
    inline def `face-laugh`: "face-laugh" = "face-laugh".asInstanceOf["face-laugh"]
    
    inline def `face-laugh-beam`: "face-laugh-beam" = "face-laugh-beam".asInstanceOf["face-laugh-beam"]
    
    inline def `face-laugh-squint`: "face-laugh-squint" = "face-laugh-squint".asInstanceOf["face-laugh-squint"]
    
    inline def `face-laugh-wink`: "face-laugh-wink" = "face-laugh-wink".asInstanceOf["face-laugh-wink"]
    
    inline def `face-lying`: "face-lying" = "face-lying".asInstanceOf["face-lying"]
    
    inline def `face-mask`: "face-mask" = "face-mask".asInstanceOf["face-mask"]
    
    inline def `face-meh`: "face-meh" = "face-meh".asInstanceOf["face-meh"]
    
    inline def `face-meh-blank`: "face-meh-blank" = "face-meh-blank".asInstanceOf["face-meh-blank"]
    
    inline def `face-melting`: "face-melting" = "face-melting".asInstanceOf["face-melting"]
    
    inline def `face-monocle`: "face-monocle" = "face-monocle".asInstanceOf["face-monocle"]
    
    inline def `face-nauseated`: "face-nauseated" = "face-nauseated".asInstanceOf["face-nauseated"]
    
    inline def `face-nose-steam`: "face-nose-steam" = "face-nose-steam".asInstanceOf["face-nose-steam"]
    
    inline def `face-party`: "face-party" = "face-party".asInstanceOf["face-party"]
    
    inline def `face-pensive`: "face-pensive" = "face-pensive".asInstanceOf["face-pensive"]
    
    inline def `face-persevering`: "face-persevering" = "face-persevering".asInstanceOf["face-persevering"]
    
    inline def `face-pleading`: "face-pleading" = "face-pleading".asInstanceOf["face-pleading"]
    
    inline def `face-pouting`: "face-pouting" = "face-pouting".asInstanceOf["face-pouting"]
    
    inline def `face-raised-eyebrow`: "face-raised-eyebrow" = "face-raised-eyebrow".asInstanceOf["face-raised-eyebrow"]
    
    inline def `face-relieved`: "face-relieved" = "face-relieved".asInstanceOf["face-relieved"]
    
    inline def `face-rolling-eyes`: "face-rolling-eyes" = "face-rolling-eyes".asInstanceOf["face-rolling-eyes"]
    
    inline def `face-sad-cry`: "face-sad-cry" = "face-sad-cry".asInstanceOf["face-sad-cry"]
    
    inline def `face-sad-sweat`: "face-sad-sweat" = "face-sad-sweat".asInstanceOf["face-sad-sweat"]
    
    inline def `face-sad-tear`: "face-sad-tear" = "face-sad-tear".asInstanceOf["face-sad-tear"]
    
    inline def `face-saluting`: "face-saluting" = "face-saluting".asInstanceOf["face-saluting"]
    
    inline def `face-scream`: "face-scream" = "face-scream".asInstanceOf["face-scream"]
    
    inline def `face-shush`: "face-shush" = "face-shush".asInstanceOf["face-shush"]
    
    inline def `face-sleeping`: "face-sleeping" = "face-sleeping".asInstanceOf["face-sleeping"]
    
    inline def `face-sleepy`: "face-sleepy" = "face-sleepy".asInstanceOf["face-sleepy"]
    
    inline def `face-smile`: "face-smile" = "face-smile".asInstanceOf["face-smile"]
    
    inline def `face-smile-beam`: "face-smile-beam" = "face-smile-beam".asInstanceOf["face-smile-beam"]
    
    inline def `face-smile-halo`: "face-smile-halo" = "face-smile-halo".asInstanceOf["face-smile-halo"]
    
    inline def `face-smile-hearts`: "face-smile-hearts" = "face-smile-hearts".asInstanceOf["face-smile-hearts"]
    
    inline def `face-smile-horns`: "face-smile-horns" = "face-smile-horns".asInstanceOf["face-smile-horns"]
    
    inline def `face-smile-plus`: "face-smile-plus" = "face-smile-plus".asInstanceOf["face-smile-plus"]
    
    inline def `face-smile-relaxed`: "face-smile-relaxed" = "face-smile-relaxed".asInstanceOf["face-smile-relaxed"]
    
    inline def `face-smile-tear`: "face-smile-tear" = "face-smile-tear".asInstanceOf["face-smile-tear"]
    
    inline def `face-smile-tongue`: "face-smile-tongue" = "face-smile-tongue".asInstanceOf["face-smile-tongue"]
    
    inline def `face-smile-upside-down`: "face-smile-upside-down" = "face-smile-upside-down".asInstanceOf["face-smile-upside-down"]
    
    inline def `face-smile-wink`: "face-smile-wink" = "face-smile-wink".asInstanceOf["face-smile-wink"]
    
    inline def `face-smiling-hands`: "face-smiling-hands" = "face-smiling-hands".asInstanceOf["face-smiling-hands"]
    
    inline def `face-smirking`: "face-smirking" = "face-smirking".asInstanceOf["face-smirking"]
    
    inline def `face-spiral-eyes`: "face-spiral-eyes" = "face-spiral-eyes".asInstanceOf["face-spiral-eyes"]
    
    inline def `face-sunglasses`: "face-sunglasses" = "face-sunglasses".asInstanceOf["face-sunglasses"]
    
    inline def `face-surprise`: "face-surprise" = "face-surprise".asInstanceOf["face-surprise"]
    
    inline def `face-swear`: "face-swear" = "face-swear".asInstanceOf["face-swear"]
    
    inline def `face-thermometer`: "face-thermometer" = "face-thermometer".asInstanceOf["face-thermometer"]
    
    inline def `face-thinking`: "face-thinking" = "face-thinking".asInstanceOf["face-thinking"]
    
    inline def `face-tired`: "face-tired" = "face-tired".asInstanceOf["face-tired"]
    
    inline def `face-tissue`: "face-tissue" = "face-tissue".asInstanceOf["face-tissue"]
    
    inline def `face-tongue-money`: "face-tongue-money" = "face-tongue-money".asInstanceOf["face-tongue-money"]
    
    inline def `face-tongue-sweat`: "face-tongue-sweat" = "face-tongue-sweat".asInstanceOf["face-tongue-sweat"]
    
    inline def `face-unamused`: "face-unamused" = "face-unamused".asInstanceOf["face-unamused"]
    
    inline def `face-viewfinder`: "face-viewfinder" = "face-viewfinder".asInstanceOf["face-viewfinder"]
    
    inline def `face-vomit`: "face-vomit" = "face-vomit".asInstanceOf["face-vomit"]
    
    inline def `face-weary`: "face-weary" = "face-weary".asInstanceOf["face-weary"]
    
    inline def `face-woozy`: "face-woozy" = "face-woozy".asInstanceOf["face-woozy"]
    
    inline def `face-worried`: "face-worried" = "face-worried".asInstanceOf["face-worried"]
    
    inline def `face-zany`: "face-zany" = "face-zany".asInstanceOf["face-zany"]
    
    inline def `face-zipper`: "face-zipper" = "face-zipper".asInstanceOf["face-zipper"]
    
    inline def facebook: "facebook" = "facebook".asInstanceOf["facebook"]
    
    inline def `facebook-f`: "facebook-f" = "facebook-f".asInstanceOf["facebook-f"]
    
    inline def `facebook-messenger`: "facebook-messenger" = "facebook-messenger".asInstanceOf["facebook-messenger"]
    
    inline def `facebook-square`: "facebook-square" = "facebook-square".asInstanceOf["facebook-square"]
    
    inline def falafel: "falafel" = "falafel".asInstanceOf["falafel"]
    
    inline def family: "family" = "family".asInstanceOf["family"]
    
    inline def `family-dress`: "family-dress" = "family-dress".asInstanceOf["family-dress"]
    
    inline def `family-pants`: "family-pants" = "family-pants".asInstanceOf["family-pants"]
    
    inline def fan: "fan" = "fan".asInstanceOf["fan"]
    
    inline def `fan-table`: "fan-table" = "fan-table".asInstanceOf["fan-table"]
    
    inline def `fantasy-flight-games`: "fantasy-flight-games" = "fantasy-flight-games".asInstanceOf["fantasy-flight-games"]
    
    inline def farm: "farm" = "farm".asInstanceOf["farm"]
    
    inline def `fast-backward`: "fast-backward" = "fast-backward".asInstanceOf["fast-backward"]
    
    inline def `fast-forward`: "fast-forward" = "fast-forward".asInstanceOf["fast-forward"]
    
    inline def faucet: "faucet" = "faucet".asInstanceOf["faucet"]
    
    inline def `faucet-drip`: "faucet-drip" = "faucet-drip".asInstanceOf["faucet-drip"]
    
    inline def fax: "fax" = "fax".asInstanceOf["fax"]
    
    inline def feather: "feather" = "feather".asInstanceOf["feather"]
    
    inline def `feather-alt`: "feather-alt" = "feather-alt".asInstanceOf["feather-alt"]
    
    inline def `feather-pointed`: "feather-pointed" = "feather-pointed".asInstanceOf["feather-pointed"]
    
    inline def fedex: "fedex" = "fedex".asInstanceOf["fedex"]
    
    inline def fedora: "fedora" = "fedora".asInstanceOf["fedora"]
    
    inline def feed: "feed" = "feed".asInstanceOf["feed"]
    
    inline def female: "female" = "female".asInstanceOf["female"]
    
    inline def fence: "fence" = "fence".asInstanceOf["fence"]
    
    inline def `ferris-wheel`: "ferris-wheel" = "ferris-wheel".asInstanceOf["ferris-wheel"]
    
    inline def ferry: "ferry" = "ferry".asInstanceOf["ferry"]
    
    inline def `field-hockey`: "field-hockey" = "field-hockey".asInstanceOf["field-hockey"]
    
    inline def `field-hockey-stick-ball`: "field-hockey-stick-ball" = "field-hockey-stick-ball".asInstanceOf["field-hockey-stick-ball"]
    
    inline def `fighter-jet`: "fighter-jet" = "fighter-jet".asInstanceOf["fighter-jet"]
    
    inline def figma: "figma" = "figma".asInstanceOf["figma"]
    
    inline def file: "file" = "file".asInstanceOf["file"]
    
    inline def `file-alt`: "file-alt" = "file-alt".asInstanceOf["file-alt"]
    
    inline def `file-archive`: "file-archive" = "file-archive".asInstanceOf["file-archive"]
    
    inline def `file-arrow-down`: "file-arrow-down" = "file-arrow-down".asInstanceOf["file-arrow-down"]
    
    inline def `file-arrow-up`: "file-arrow-up" = "file-arrow-up".asInstanceOf["file-arrow-up"]
    
    inline def `file-audio`: "file-audio" = "file-audio".asInstanceOf["file-audio"]
    
    inline def `file-award`: "file-award" = "file-award".asInstanceOf["file-award"]
    
    inline def `file-binary`: "file-binary" = "file-binary".asInstanceOf["file-binary"]
    
    inline def `file-caret-down`: "file-caret-down" = "file-caret-down".asInstanceOf["file-caret-down"]
    
    inline def `file-caret-up`: "file-caret-up" = "file-caret-up".asInstanceOf["file-caret-up"]
    
    inline def `file-certificate`: "file-certificate" = "file-certificate".asInstanceOf["file-certificate"]
    
    inline def `file-chart-column`: "file-chart-column" = "file-chart-column".asInstanceOf["file-chart-column"]
    
    inline def `file-chart-line`: "file-chart-line" = "file-chart-line".asInstanceOf["file-chart-line"]
    
    inline def `file-chart-pie`: "file-chart-pie" = "file-chart-pie".asInstanceOf["file-chart-pie"]
    
    inline def `file-check`: "file-check" = "file-check".asInstanceOf["file-check"]
    
    inline def `file-circle-check`: "file-circle-check" = "file-circle-check".asInstanceOf["file-circle-check"]
    
    inline def `file-circle-exclamation`: "file-circle-exclamation" = "file-circle-exclamation".asInstanceOf["file-circle-exclamation"]
    
    inline def `file-circle-info`: "file-circle-info" = "file-circle-info".asInstanceOf["file-circle-info"]
    
    inline def `file-circle-minus`: "file-circle-minus" = "file-circle-minus".asInstanceOf["file-circle-minus"]
    
    inline def `file-circle-plus`: "file-circle-plus" = "file-circle-plus".asInstanceOf["file-circle-plus"]
    
    inline def `file-circle-question`: "file-circle-question" = "file-circle-question".asInstanceOf["file-circle-question"]
    
    inline def `file-circle-xmark`: "file-circle-xmark" = "file-circle-xmark".asInstanceOf["file-circle-xmark"]
    
    inline def `file-clipboard`: "file-clipboard" = "file-clipboard".asInstanceOf["file-clipboard"]
    
    inline def `file-code`: "file-code" = "file-code".asInstanceOf["file-code"]
    
    inline def `file-contract`: "file-contract" = "file-contract".asInstanceOf["file-contract"]
    
    inline def `file-csv`: "file-csv" = "file-csv".asInstanceOf["file-csv"]
    
    inline def `file-dashed-line`: "file-dashed-line" = "file-dashed-line".asInstanceOf["file-dashed-line"]
    
    inline def `file-download`: "file-download" = "file-download".asInstanceOf["file-download"]
    
    inline def `file-edit`: "file-edit" = "file-edit".asInstanceOf["file-edit"]
    
    inline def `file-excel`: "file-excel" = "file-excel".asInstanceOf["file-excel"]
    
    inline def `file-exclamation`: "file-exclamation" = "file-exclamation".asInstanceOf["file-exclamation"]
    
    inline def `file-export`: "file-export" = "file-export".asInstanceOf["file-export"]
    
    inline def `file-heart`: "file-heart" = "file-heart".asInstanceOf["file-heart"]
    
    inline def `file-image`: "file-image" = "file-image".asInstanceOf["file-image"]
    
    inline def `file-import`: "file-import" = "file-import".asInstanceOf["file-import"]
    
    inline def `file-invoice`: "file-invoice" = "file-invoice".asInstanceOf["file-invoice"]
    
    inline def `file-invoice-dollar`: "file-invoice-dollar" = "file-invoice-dollar".asInstanceOf["file-invoice-dollar"]
    
    inline def `file-lines`: "file-lines" = "file-lines".asInstanceOf["file-lines"]
    
    inline def `file-lock`: "file-lock" = "file-lock".asInstanceOf["file-lock"]
    
    inline def `file-magnifying-glass`: "file-magnifying-glass" = "file-magnifying-glass".asInstanceOf["file-magnifying-glass"]
    
    inline def `file-medical`: "file-medical" = "file-medical".asInstanceOf["file-medical"]
    
    inline def `file-medical-alt`: "file-medical-alt" = "file-medical-alt".asInstanceOf["file-medical-alt"]
    
    inline def `file-minus`: "file-minus" = "file-minus".asInstanceOf["file-minus"]
    
    inline def `file-music`: "file-music" = "file-music".asInstanceOf["file-music"]
    
    inline def `file-pdf`: "file-pdf" = "file-pdf".asInstanceOf["file-pdf"]
    
    inline def `file-pen`: "file-pen" = "file-pen".asInstanceOf["file-pen"]
    
    inline def `file-plus`: "file-plus" = "file-plus".asInstanceOf["file-plus"]
    
    inline def `file-plus-minus`: "file-plus-minus" = "file-plus-minus".asInstanceOf["file-plus-minus"]
    
    inline def `file-powerpoint`: "file-powerpoint" = "file-powerpoint".asInstanceOf["file-powerpoint"]
    
    inline def `file-prescription`: "file-prescription" = "file-prescription".asInstanceOf["file-prescription"]
    
    inline def `file-search`: "file-search" = "file-search".asInstanceOf["file-search"]
    
    inline def `file-shield`: "file-shield" = "file-shield".asInstanceOf["file-shield"]
    
    inline def `file-signature`: "file-signature" = "file-signature".asInstanceOf["file-signature"]
    
    inline def `file-slash`: "file-slash" = "file-slash".asInstanceOf["file-slash"]
    
    inline def `file-spreadsheet`: "file-spreadsheet" = "file-spreadsheet".asInstanceOf["file-spreadsheet"]
    
    inline def `file-text`: "file-text" = "file-text".asInstanceOf["file-text"]
    
    inline def `file-times`: "file-times" = "file-times".asInstanceOf["file-times"]
    
    inline def `file-upload`: "file-upload" = "file-upload".asInstanceOf["file-upload"]
    
    inline def `file-user`: "file-user" = "file-user".asInstanceOf["file-user"]
    
    inline def `file-video`: "file-video" = "file-video".asInstanceOf["file-video"]
    
    inline def `file-waveform`: "file-waveform" = "file-waveform".asInstanceOf["file-waveform"]
    
    inline def `file-word`: "file-word" = "file-word".asInstanceOf["file-word"]
    
    inline def `file-xmark`: "file-xmark" = "file-xmark".asInstanceOf["file-xmark"]
    
    inline def `file-zipper`: "file-zipper" = "file-zipper".asInstanceOf["file-zipper"]
    
    inline def files: "files" = "files".asInstanceOf["files"]
    
    inline def `files-medical`: "files-medical" = "files-medical".asInstanceOf["files-medical"]
    
    inline def fill: "fill" = "fill".asInstanceOf["fill"]
    
    inline def `fill-drip`: "fill-drip" = "fill-drip".asInstanceOf["fill-drip"]
    
    inline def film: "film" = "film".asInstanceOf["film"]
    
    inline def `film-alt`: "film-alt" = "film-alt".asInstanceOf["film-alt"]
    
    inline def `film-canister`: "film-canister" = "film-canister".asInstanceOf["film-canister"]
    
    inline def `film-cannister`: "film-cannister" = "film-cannister".asInstanceOf["film-cannister"]
    
    inline def `film-simple`: "film-simple" = "film-simple".asInstanceOf["film-simple"]
    
    inline def `film-slash`: "film-slash" = "film-slash".asInstanceOf["film-slash"]
    
    inline def films: "films" = "films".asInstanceOf["films"]
    
    inline def filter: "filter" = "filter".asInstanceOf["filter"]
    
    inline def `filter-circle-dollar`: "filter-circle-dollar" = "filter-circle-dollar".asInstanceOf["filter-circle-dollar"]
    
    inline def `filter-circle-xmark`: "filter-circle-xmark" = "filter-circle-xmark".asInstanceOf["filter-circle-xmark"]
    
    inline def `filter-list`: "filter-list" = "filter-list".asInstanceOf["filter-list"]
    
    inline def `filter-slash`: "filter-slash" = "filter-slash".asInstanceOf["filter-slash"]
    
    inline def filters: "filters" = "filters".asInstanceOf["filters"]
    
    inline def fingerprint: "fingerprint" = "fingerprint".asInstanceOf["fingerprint"]
    
    inline def fire: "fire" = "fire".asInstanceOf["fire"]
    
    inline def `fire-alt`: "fire-alt" = "fire-alt".asInstanceOf["fire-alt"]
    
    inline def `fire-burner`: "fire-burner" = "fire-burner".asInstanceOf["fire-burner"]
    
    inline def `fire-extinguisher`: "fire-extinguisher" = "fire-extinguisher".asInstanceOf["fire-extinguisher"]
    
    inline def `fire-flame`: "fire-flame" = "fire-flame".asInstanceOf["fire-flame"]
    
    inline def `fire-flame-curved`: "fire-flame-curved" = "fire-flame-curved".asInstanceOf["fire-flame-curved"]
    
    inline def `fire-flame-simple`: "fire-flame-simple" = "fire-flame-simple".asInstanceOf["fire-flame-simple"]
    
    inline def `fire-hydrant`: "fire-hydrant" = "fire-hydrant".asInstanceOf["fire-hydrant"]
    
    inline def `fire-smoke`: "fire-smoke" = "fire-smoke".asInstanceOf["fire-smoke"]
    
    inline def firefox: "firefox" = "firefox".asInstanceOf["firefox"]
    
    inline def `firefox-browser`: "firefox-browser" = "firefox-browser".asInstanceOf["firefox-browser"]
    
    inline def fireplace: "fireplace" = "fireplace".asInstanceOf["fireplace"]
    
    inline def firewall: "firewall" = "firewall".asInstanceOf["firewall"]
    
    inline def `first-aid`: "first-aid" = "first-aid".asInstanceOf["first-aid"]
    
    inline def `first-order`: "first-order" = "first-order".asInstanceOf["first-order"]
    
    inline def `first-order-alt`: "first-order-alt" = "first-order-alt".asInstanceOf["first-order-alt"]
    
    inline def firstdraft: "firstdraft" = "firstdraft".asInstanceOf["firstdraft"]
    
    inline def fish: "fish" = "fish".asInstanceOf["fish"]
    
    inline def `fish-bones`: "fish-bones" = "fish-bones".asInstanceOf["fish-bones"]
    
    inline def `fish-cooked`: "fish-cooked" = "fish-cooked".asInstanceOf["fish-cooked"]
    
    inline def `fish-fins`: "fish-fins" = "fish-fins".asInstanceOf["fish-fins"]
    
    inline def `fishing-rod`: "fishing-rod" = "fishing-rod".asInstanceOf["fishing-rod"]
    
    inline def `fist-raised`: "fist-raised" = "fist-raised".asInstanceOf["fist-raised"]
    
    inline def flag: "flag" = "flag".asInstanceOf["flag"]
    
    inline def `flag-alt`: "flag-alt" = "flag-alt".asInstanceOf["flag-alt"]
    
    inline def `flag-checkered`: "flag-checkered" = "flag-checkered".asInstanceOf["flag-checkered"]
    
    inline def `flag-pennant`: "flag-pennant" = "flag-pennant".asInstanceOf["flag-pennant"]
    
    inline def `flag-swallowtail`: "flag-swallowtail" = "flag-swallowtail".asInstanceOf["flag-swallowtail"]
    
    inline def `flag-usa`: "flag-usa" = "flag-usa".asInstanceOf["flag-usa"]
    
    inline def flame: "flame" = "flame".asInstanceOf["flame"]
    
    inline def flashlight: "flashlight" = "flashlight".asInstanceOf["flashlight"]
    
    inline def flask: "flask" = "flask".asInstanceOf["flask"]
    
    inline def `flask-poison`: "flask-poison" = "flask-poison".asInstanceOf["flask-poison"]
    
    inline def `flask-potion`: "flask-potion" = "flask-potion".asInstanceOf["flask-potion"]
    
    inline def `flask-round-poison`: "flask-round-poison" = "flask-round-poison".asInstanceOf["flask-round-poison"]
    
    inline def `flask-round-potion`: "flask-round-potion" = "flask-round-potion".asInstanceOf["flask-round-potion"]
    
    inline def `flask-vial`: "flask-vial" = "flask-vial".asInstanceOf["flask-vial"]
    
    inline def flatbread: "flatbread" = "flatbread".asInstanceOf["flatbread"]
    
    inline def `flatbread-stuffed`: "flatbread-stuffed" = "flatbread-stuffed".asInstanceOf["flatbread-stuffed"]
    
    inline def flickr: "flickr" = "flickr".asInstanceOf["flickr"]
    
    inline def flipboard: "flipboard" = "flipboard".asInstanceOf["flipboard"]
    
    inline def `floppy-disk`: "floppy-disk" = "floppy-disk".asInstanceOf["floppy-disk"]
    
    inline def `floppy-disk-circle-arrow-right`: "floppy-disk-circle-arrow-right" = "floppy-disk-circle-arrow-right".asInstanceOf["floppy-disk-circle-arrow-right"]
    
    inline def `floppy-disk-circle-xmark`: "floppy-disk-circle-xmark" = "floppy-disk-circle-xmark".asInstanceOf["floppy-disk-circle-xmark"]
    
    inline def `floppy-disk-pen`: "floppy-disk-pen" = "floppy-disk-pen".asInstanceOf["floppy-disk-pen"]
    
    inline def `floppy-disk-times`: "floppy-disk-times" = "floppy-disk-times".asInstanceOf["floppy-disk-times"]
    
    inline def `floppy-disks`: "floppy-disks" = "floppy-disks".asInstanceOf["floppy-disks"]
    
    inline def `florin-sign`: "florin-sign" = "florin-sign".asInstanceOf["florin-sign"]
    
    inline def flower: "flower" = "flower".asInstanceOf["flower"]
    
    inline def `flower-daffodil`: "flower-daffodil" = "flower-daffodil".asInstanceOf["flower-daffodil"]
    
    inline def `flower-tulip`: "flower-tulip" = "flower-tulip".asInstanceOf["flower-tulip"]
    
    inline def flushed: "flushed" = "flushed".asInstanceOf["flushed"]
    
    inline def flute: "flute" = "flute".asInstanceOf["flute"]
    
    inline def `flux-capacitor`: "flux-capacitor" = "flux-capacitor".asInstanceOf["flux-capacitor"]
    
    inline def fly: "fly" = "fly".asInstanceOf["fly"]
    
    inline def `flying-disc`: "flying-disc" = "flying-disc".asInstanceOf["flying-disc"]
    
    inline def fog: "fog" = "fog".asInstanceOf["fog"]
    
    inline def folder: "folder" = "folder".asInstanceOf["folder"]
    
    inline def `folder-arrow-down`: "folder-arrow-down" = "folder-arrow-down".asInstanceOf["folder-arrow-down"]
    
    inline def `folder-arrow-up`: "folder-arrow-up" = "folder-arrow-up".asInstanceOf["folder-arrow-up"]
    
    inline def `folder-blank`: "folder-blank" = "folder-blank".asInstanceOf["folder-blank"]
    
    inline def `folder-bookmark`: "folder-bookmark" = "folder-bookmark".asInstanceOf["folder-bookmark"]
    
    inline def `folder-closed`: "folder-closed" = "folder-closed".asInstanceOf["folder-closed"]
    
    inline def `folder-cog`: "folder-cog" = "folder-cog".asInstanceOf["folder-cog"]
    
    inline def `folder-download`: "folder-download" = "folder-download".asInstanceOf["folder-download"]
    
    inline def `folder-gear`: "folder-gear" = "folder-gear".asInstanceOf["folder-gear"]
    
    inline def `folder-grid`: "folder-grid" = "folder-grid".asInstanceOf["folder-grid"]
    
    inline def `folder-heart`: "folder-heart" = "folder-heart".asInstanceOf["folder-heart"]
    
    inline def `folder-image`: "folder-image" = "folder-image".asInstanceOf["folder-image"]
    
    inline def `folder-magnifying-glass`: "folder-magnifying-glass" = "folder-magnifying-glass".asInstanceOf["folder-magnifying-glass"]
    
    inline def `folder-medical`: "folder-medical" = "folder-medical".asInstanceOf["folder-medical"]
    
    inline def `folder-minus`: "folder-minus" = "folder-minus".asInstanceOf["folder-minus"]
    
    inline def `folder-music`: "folder-music" = "folder-music".asInstanceOf["folder-music"]
    
    inline def `folder-open`: "folder-open" = "folder-open".asInstanceOf["folder-open"]
    
    inline def `folder-plus`: "folder-plus" = "folder-plus".asInstanceOf["folder-plus"]
    
    inline def `folder-search`: "folder-search" = "folder-search".asInstanceOf["folder-search"]
    
    inline def `folder-times`: "folder-times" = "folder-times".asInstanceOf["folder-times"]
    
    inline def `folder-tree`: "folder-tree" = "folder-tree".asInstanceOf["folder-tree"]
    
    inline def `folder-upload`: "folder-upload" = "folder-upload".asInstanceOf["folder-upload"]
    
    inline def `folder-user`: "folder-user" = "folder-user".asInstanceOf["folder-user"]
    
    inline def `folder-xmark`: "folder-xmark" = "folder-xmark".asInstanceOf["folder-xmark"]
    
    inline def folders: "folders" = "folders".asInstanceOf["folders"]
    
    inline def `fondue-pot`: "fondue-pot" = "fondue-pot".asInstanceOf["fondue-pot"]
    
    inline def font: "font" = "font".asInstanceOf["font"]
    
    inline def `font-awesome`: "font-awesome" = "font-awesome".asInstanceOf["font-awesome"]
    
    inline def `font-awesome-alt`: "font-awesome-alt" = "font-awesome-alt".asInstanceOf["font-awesome-alt"]
    
    inline def `font-awesome-flag`: "font-awesome-flag" = "font-awesome-flag".asInstanceOf["font-awesome-flag"]
    
    inline def `font-awesome-logo-full`: "font-awesome-logo-full" = "font-awesome-logo-full".asInstanceOf["font-awesome-logo-full"]
    
    inline def `font-case`: "font-case" = "font-case".asInstanceOf["font-case"]
    
    inline def fonticons: "fonticons" = "fonticons".asInstanceOf["fonticons"]
    
    inline def `fonticons-fi`: "fonticons-fi" = "fonticons-fi".asInstanceOf["fonticons-fi"]
    
    inline def football: "football" = "football".asInstanceOf["football"]
    
    inline def `football-ball`: "football-ball" = "football-ball".asInstanceOf["football-ball"]
    
    inline def `football-helmet`: "football-helmet" = "football-helmet".asInstanceOf["football-helmet"]
    
    inline def fork: "fork" = "fork".asInstanceOf["fork"]
    
    inline def `fork-knife`: "fork-knife" = "fork-knife".asInstanceOf["fork-knife"]
    
    inline def forklift: "forklift" = "forklift".asInstanceOf["forklift"]
    
    inline def fort: "fort" = "fort".asInstanceOf["fort"]
    
    inline def `fort-awesome`: "fort-awesome" = "fort-awesome".asInstanceOf["fort-awesome"]
    
    inline def `fort-awesome-alt`: "fort-awesome-alt" = "fort-awesome-alt".asInstanceOf["fort-awesome-alt"]
    
    inline def forumbee: "forumbee" = "forumbee".asInstanceOf["forumbee"]
    
    inline def forward: "forward" = "forward".asInstanceOf["forward"]
    
    inline def `forward-fast`: "forward-fast" = "forward-fast".asInstanceOf["forward-fast"]
    
    inline def `forward-step`: "forward-step" = "forward-step".asInstanceOf["forward-step"]
    
    inline def foursquare: "foursquare" = "foursquare".asInstanceOf["foursquare"]
    
    inline def fragile: "fragile" = "fragile".asInstanceOf["fragile"]
    
    inline def frame: "frame" = "frame".asInstanceOf["frame"]
    
    inline def `franc-sign`: "franc-sign" = "franc-sign".asInstanceOf["franc-sign"]
    
    inline def `free-code-camp`: "free-code-camp" = "free-code-camp".asInstanceOf["free-code-camp"]
    
    inline def freebsd: "freebsd" = "freebsd".asInstanceOf["freebsd"]
    
    inline def `french-fries`: "french-fries" = "french-fries".asInstanceOf["french-fries"]
    
    inline def frog: "frog" = "frog".asInstanceOf["frog"]
    
    inline def `frosty-head`: "frosty-head" = "frosty-head".asInstanceOf["frosty-head"]
    
    inline def frown: "frown" = "frown".asInstanceOf["frown"]
    
    inline def `frown-open`: "frown-open" = "frown-open".asInstanceOf["frown-open"]
    
    inline def fulcrum: "fulcrum" = "fulcrum".asInstanceOf["fulcrum"]
    
    inline def function: "function" = "function".asInstanceOf["function"]
    
    inline def `funnel-dollar`: "funnel-dollar" = "funnel-dollar".asInstanceOf["funnel-dollar"]
    
    inline def futbol: "futbol" = "futbol".asInstanceOf["futbol"]
    
    inline def `futbol-ball`: "futbol-ball" = "futbol-ball".asInstanceOf["futbol-ball"]
    
    inline def g: "g" = "g".asInstanceOf["g"]
    
    inline def `galactic-republic`: "galactic-republic" = "galactic-republic".asInstanceOf["galactic-republic"]
    
    inline def `galactic-senate`: "galactic-senate" = "galactic-senate".asInstanceOf["galactic-senate"]
    
    inline def galaxy: "galaxy" = "galaxy".asInstanceOf["galaxy"]
    
    inline def `gallery-thumbnails`: "gallery-thumbnails" = "gallery-thumbnails".asInstanceOf["gallery-thumbnails"]
    
    inline def `game-board`: "game-board" = "game-board".asInstanceOf["game-board"]
    
    inline def `game-board-alt`: "game-board-alt" = "game-board-alt".asInstanceOf["game-board-alt"]
    
    inline def `game-board-simple`: "game-board-simple" = "game-board-simple".asInstanceOf["game-board-simple"]
    
    inline def `game-console-handheld`: "game-console-handheld" = "game-console-handheld".asInstanceOf["game-console-handheld"]
    
    inline def `game-console-handheld-crank`: "game-console-handheld-crank" = "game-console-handheld-crank".asInstanceOf["game-console-handheld-crank"]
    
    inline def gamepad: "gamepad" = "gamepad".asInstanceOf["gamepad"]
    
    inline def `gamepad-alt`: "gamepad-alt" = "gamepad-alt".asInstanceOf["gamepad-alt"]
    
    inline def `gamepad-modern`: "gamepad-modern" = "gamepad-modern".asInstanceOf["gamepad-modern"]
    
    inline def garage: "garage" = "garage".asInstanceOf["garage"]
    
    inline def `garage-car`: "garage-car" = "garage-car".asInstanceOf["garage-car"]
    
    inline def `garage-open`: "garage-open" = "garage-open".asInstanceOf["garage-open"]
    
    inline def garlic: "garlic" = "garlic".asInstanceOf["garlic"]
    
    inline def `gas-pump`: "gas-pump" = "gas-pump".asInstanceOf["gas-pump"]
    
    inline def `gas-pump-slash`: "gas-pump-slash" = "gas-pump-slash".asInstanceOf["gas-pump-slash"]
    
    inline def gauge: "gauge" = "gauge".asInstanceOf["gauge"]
    
    inline def `gauge-circle-bolt`: "gauge-circle-bolt" = "gauge-circle-bolt".asInstanceOf["gauge-circle-bolt"]
    
    inline def `gauge-circle-minus`: "gauge-circle-minus" = "gauge-circle-minus".asInstanceOf["gauge-circle-minus"]
    
    inline def `gauge-circle-plus`: "gauge-circle-plus" = "gauge-circle-plus".asInstanceOf["gauge-circle-plus"]
    
    inline def `gauge-high`: "gauge-high" = "gauge-high".asInstanceOf["gauge-high"]
    
    inline def `gauge-low`: "gauge-low" = "gauge-low".asInstanceOf["gauge-low"]
    
    inline def `gauge-max`: "gauge-max" = "gauge-max".asInstanceOf["gauge-max"]
    
    inline def `gauge-med`: "gauge-med" = "gauge-med".asInstanceOf["gauge-med"]
    
    inline def `gauge-min`: "gauge-min" = "gauge-min".asInstanceOf["gauge-min"]
    
    inline def `gauge-simple`: "gauge-simple" = "gauge-simple".asInstanceOf["gauge-simple"]
    
    inline def `gauge-simple-high`: "gauge-simple-high" = "gauge-simple-high".asInstanceOf["gauge-simple-high"]
    
    inline def `gauge-simple-low`: "gauge-simple-low" = "gauge-simple-low".asInstanceOf["gauge-simple-low"]
    
    inline def `gauge-simple-max`: "gauge-simple-max" = "gauge-simple-max".asInstanceOf["gauge-simple-max"]
    
    inline def `gauge-simple-med`: "gauge-simple-med" = "gauge-simple-med".asInstanceOf["gauge-simple-med"]
    
    inline def `gauge-simple-min`: "gauge-simple-min" = "gauge-simple-min".asInstanceOf["gauge-simple-min"]
    
    inline def `gave-dandy`: "gave-dandy" = "gave-dandy".asInstanceOf["gave-dandy"]
    
    inline def gavel: "gavel" = "gavel".asInstanceOf["gavel"]
    
    inline def gbp: "gbp" = "gbp".asInstanceOf["gbp"]
    
    inline def gear: "gear" = "gear".asInstanceOf["gear"]
    
    inline def gears: "gears" = "gears".asInstanceOf["gears"]
    
    inline def gem: "gem" = "gem".asInstanceOf["gem"]
    
    inline def genderless: "genderless" = "genderless".asInstanceOf["genderless"]
    
    inline def `get-pocket`: "get-pocket" = "get-pocket".asInstanceOf["get-pocket"]
    
    inline def gg: "gg" = "gg".asInstanceOf["gg"]
    
    inline def `gg-circle`: "gg-circle" = "gg-circle".asInstanceOf["gg-circle"]
    
    inline def ghost: "ghost" = "ghost".asInstanceOf["ghost"]
    
    inline def gif: "gif" = "gif".asInstanceOf["gif"]
    
    inline def gift: "gift" = "gift".asInstanceOf["gift"]
    
    inline def `gift-card`: "gift-card" = "gift-card".asInstanceOf["gift-card"]
    
    inline def gifts: "gifts" = "gifts".asInstanceOf["gifts"]
    
    inline def `gingerbread-man`: "gingerbread-man" = "gingerbread-man".asInstanceOf["gingerbread-man"]
    
    inline def git: "git" = "git".asInstanceOf["git"]
    
    inline def `git-alt`: "git-alt" = "git-alt".asInstanceOf["git-alt"]
    
    inline def `git-square`: "git-square" = "git-square".asInstanceOf["git-square"]
    
    inline def github: "github" = "github".asInstanceOf["github"]
    
    inline def `github-alt`: "github-alt" = "github-alt".asInstanceOf["github-alt"]
    
    inline def `github-square`: "github-square" = "github-square".asInstanceOf["github-square"]
    
    inline def gitkraken: "gitkraken" = "gitkraken".asInstanceOf["gitkraken"]
    
    inline def gitlab: "gitlab" = "gitlab".asInstanceOf["gitlab"]
    
    inline def `gitlab-square`: "gitlab-square" = "gitlab-square".asInstanceOf["gitlab-square"]
    
    inline def gitter: "gitter" = "gitter".asInstanceOf["gitter"]
    
    inline def glass: "glass" = "glass".asInstanceOf["glass"]
    
    inline def `glass-champagne`: "glass-champagne" = "glass-champagne".asInstanceOf["glass-champagne"]
    
    inline def `glass-cheers`: "glass-cheers" = "glass-cheers".asInstanceOf["glass-cheers"]
    
    inline def `glass-citrus`: "glass-citrus" = "glass-citrus".asInstanceOf["glass-citrus"]
    
    inline def `glass-empty`: "glass-empty" = "glass-empty".asInstanceOf["glass-empty"]
    
    inline def `glass-half`: "glass-half" = "glass-half".asInstanceOf["glass-half"]
    
    inline def `glass-half-empty`: "glass-half-empty" = "glass-half-empty".asInstanceOf["glass-half-empty"]
    
    inline def `glass-half-full`: "glass-half-full" = "glass-half-full".asInstanceOf["glass-half-full"]
    
    inline def `glass-martini`: "glass-martini" = "glass-martini".asInstanceOf["glass-martini"]
    
    inline def `glass-martini-alt`: "glass-martini-alt" = "glass-martini-alt".asInstanceOf["glass-martini-alt"]
    
    inline def `glass-water`: "glass-water" = "glass-water".asInstanceOf["glass-water"]
    
    inline def `glass-water-droplet`: "glass-water-droplet" = "glass-water-droplet".asInstanceOf["glass-water-droplet"]
    
    inline def `glass-whiskey`: "glass-whiskey" = "glass-whiskey".asInstanceOf["glass-whiskey"]
    
    inline def `glass-whiskey-rocks`: "glass-whiskey-rocks" = "glass-whiskey-rocks".asInstanceOf["glass-whiskey-rocks"]
    
    inline def glasses: "glasses" = "glasses".asInstanceOf["glasses"]
    
    inline def `glasses-alt`: "glasses-alt" = "glasses-alt".asInstanceOf["glasses-alt"]
    
    inline def `glasses-round`: "glasses-round" = "glasses-round".asInstanceOf["glasses-round"]
    
    inline def glide: "glide" = "glide".asInstanceOf["glide"]
    
    inline def `glide-g`: "glide-g" = "glide-g".asInstanceOf["glide-g"]
    
    inline def globe: "globe" = "globe".asInstanceOf["globe"]
    
    inline def `globe-africa`: "globe-africa" = "globe-africa".asInstanceOf["globe-africa"]
    
    inline def `globe-americas`: "globe-americas" = "globe-americas".asInstanceOf["globe-americas"]
    
    inline def `globe-asia`: "globe-asia" = "globe-asia".asInstanceOf["globe-asia"]
    
    inline def `globe-europe`: "globe-europe" = "globe-europe".asInstanceOf["globe-europe"]
    
    inline def `globe-oceania`: "globe-oceania" = "globe-oceania".asInstanceOf["globe-oceania"]
    
    inline def `globe-snow`: "globe-snow" = "globe-snow".asInstanceOf["globe-snow"]
    
    inline def `globe-stand`: "globe-stand" = "globe-stand".asInstanceOf["globe-stand"]
    
    inline def `glove-boxing`: "glove-boxing" = "glove-boxing".asInstanceOf["glove-boxing"]
    
    inline def `goal-net`: "goal-net" = "goal-net".asInstanceOf["goal-net"]
    
    inline def gofore: "gofore" = "gofore".asInstanceOf["gofore"]
    
    inline def golang: "golang" = "golang".asInstanceOf["golang"]
    
    inline def `golf-ball`: "golf-ball" = "golf-ball".asInstanceOf["golf-ball"]
    
    inline def `golf-ball-tee`: "golf-ball-tee" = "golf-ball-tee".asInstanceOf["golf-ball-tee"]
    
    inline def `golf-club`: "golf-club" = "golf-club".asInstanceOf["golf-club"]
    
    inline def `golf-flag-hole`: "golf-flag-hole" = "golf-flag-hole".asInstanceOf["golf-flag-hole"]
    
    inline def goodreads: "goodreads" = "goodreads".asInstanceOf["goodreads"]
    
    inline def `goodreads-g`: "goodreads-g" = "goodreads-g".asInstanceOf["goodreads-g"]
    
    inline def google: "google" = "google".asInstanceOf["google"]
    
    inline def `google-drive`: "google-drive" = "google-drive".asInstanceOf["google-drive"]
    
    inline def `google-pay`: "google-pay" = "google-pay".asInstanceOf["google-pay"]
    
    inline def `google-play`: "google-play" = "google-play".asInstanceOf["google-play"]
    
    inline def `google-plus`: "google-plus" = "google-plus".asInstanceOf["google-plus"]
    
    inline def `google-plus-g`: "google-plus-g" = "google-plus-g".asInstanceOf["google-plus-g"]
    
    inline def `google-plus-square`: "google-plus-square" = "google-plus-square".asInstanceOf["google-plus-square"]
    
    inline def `google-wallet`: "google-wallet" = "google-wallet".asInstanceOf["google-wallet"]
    
    inline def gopuram: "gopuram" = "gopuram".asInstanceOf["gopuram"]
    
    inline def `graduation-cap`: "graduation-cap" = "graduation-cap".asInstanceOf["graduation-cap"]
    
    inline def gramophone: "gramophone" = "gramophone".asInstanceOf["gramophone"]
    
    inline def grapes: "grapes" = "grapes".asInstanceOf["grapes"]
    
    inline def grate: "grate" = "grate".asInstanceOf["grate"]
    
    inline def `grate-droplet`: "grate-droplet" = "grate-droplet".asInstanceOf["grate-droplet"]
    
    inline def gratipay: "gratipay" = "gratipay".asInstanceOf["gratipay"]
    
    inline def grav: "grav" = "grav".asInstanceOf["grav"]
    
    inline def `greater-than`: "greater-than" = "greater-than".asInstanceOf["greater-than"]
    
    inline def `greater-than-equal`: "greater-than-equal" = "greater-than-equal".asInstanceOf["greater-than-equal"]
    
    inline def grid: "grid" = "grid".asInstanceOf["grid"]
    
    inline def `grid-2`: "grid-2" = "grid-2".asInstanceOf["grid-2"]
    
    inline def `grid-2-plus`: "grid-2-plus" = "grid-2-plus".asInstanceOf["grid-2-plus"]
    
    inline def `grid-4`: "grid-4" = "grid-4".asInstanceOf["grid-4"]
    
    inline def `grid-5`: "grid-5" = "grid-5".asInstanceOf["grid-5"]
    
    inline def `grid-dividers`: "grid-dividers" = "grid-dividers".asInstanceOf["grid-dividers"]
    
    inline def `grid-horizontal`: "grid-horizontal" = "grid-horizontal".asInstanceOf["grid-horizontal"]
    
    inline def grid3: "grid3" = "grid3".asInstanceOf["grid3"]
    
    inline def grill: "grill" = "grill".asInstanceOf["grill"]
    
    inline def `grill-fire`: "grill-fire" = "grill-fire".asInstanceOf["grill-fire"]
    
    inline def `grill-hot`: "grill-hot" = "grill-hot".asInstanceOf["grill-hot"]
    
    inline def grimace: "grimace" = "grimace".asInstanceOf["grimace"]
    
    inline def grin: "grin" = "grin".asInstanceOf["grin"]
    
    inline def `grin-alt`: "grin-alt" = "grin-alt".asInstanceOf["grin-alt"]
    
    inline def `grin-beam`: "grin-beam" = "grin-beam".asInstanceOf["grin-beam"]
    
    inline def `grin-beam-sweat`: "grin-beam-sweat" = "grin-beam-sweat".asInstanceOf["grin-beam-sweat"]
    
    inline def `grin-hearts`: "grin-hearts" = "grin-hearts".asInstanceOf["grin-hearts"]
    
    inline def `grin-squint`: "grin-squint" = "grin-squint".asInstanceOf["grin-squint"]
    
    inline def `grin-squint-tears`: "grin-squint-tears" = "grin-squint-tears".asInstanceOf["grin-squint-tears"]
    
    inline def `grin-stars`: "grin-stars" = "grin-stars".asInstanceOf["grin-stars"]
    
    inline def `grin-tears`: "grin-tears" = "grin-tears".asInstanceOf["grin-tears"]
    
    inline def `grin-tongue`: "grin-tongue" = "grin-tongue".asInstanceOf["grin-tongue"]
    
    inline def `grin-tongue-squint`: "grin-tongue-squint" = "grin-tongue-squint".asInstanceOf["grin-tongue-squint"]
    
    inline def `grin-tongue-wink`: "grin-tongue-wink" = "grin-tongue-wink".asInstanceOf["grin-tongue-wink"]
    
    inline def `grin-wink`: "grin-wink" = "grin-wink".asInstanceOf["grin-wink"]
    
    inline def grip: "grip" = "grip".asInstanceOf["grip"]
    
    inline def `grip-dots`: "grip-dots" = "grip-dots".asInstanceOf["grip-dots"]
    
    inline def `grip-dots-vertical`: "grip-dots-vertical" = "grip-dots-vertical".asInstanceOf["grip-dots-vertical"]
    
    inline def `grip-horizontal`: "grip-horizontal" = "grip-horizontal".asInstanceOf["grip-horizontal"]
    
    inline def `grip-lines`: "grip-lines" = "grip-lines".asInstanceOf["grip-lines"]
    
    inline def `grip-lines-vertical`: "grip-lines-vertical" = "grip-lines-vertical".asInstanceOf["grip-lines-vertical"]
    
    inline def `grip-vertical`: "grip-vertical" = "grip-vertical".asInstanceOf["grip-vertical"]
    
    inline def gripfire: "gripfire" = "gripfire".asInstanceOf["gripfire"]
    
    inline def `group-arrows-rotate`: "group-arrows-rotate" = "group-arrows-rotate".asInstanceOf["group-arrows-rotate"]
    
    inline def grunt: "grunt" = "grunt".asInstanceOf["grunt"]
    
    inline def `guarani-sign`: "guarani-sign" = "guarani-sign".asInstanceOf["guarani-sign"]
    
    inline def guilded: "guilded" = "guilded".asInstanceOf["guilded"]
    
    inline def guitar: "guitar" = "guitar".asInstanceOf["guitar"]
    
    inline def `guitar-electric`: "guitar-electric" = "guitar-electric".asInstanceOf["guitar-electric"]
    
    inline def guitars: "guitars" = "guitars".asInstanceOf["guitars"]
    
    inline def gulp: "gulp" = "gulp".asInstanceOf["gulp"]
    
    inline def gun: "gun" = "gun".asInstanceOf["gun"]
    
    inline def `gun-slash`: "gun-slash" = "gun-slash".asInstanceOf["gun-slash"]
    
    inline def `gun-squirt`: "gun-squirt" = "gun-squirt".asInstanceOf["gun-squirt"]
    
    inline def h: "h" = "h".asInstanceOf["h"]
    
    inline def `h-square`: "h-square" = "h-square".asInstanceOf["h-square"]
    
    inline def h1: "h1" = "h1".asInstanceOf["h1"]
    
    inline def h2: "h2" = "h2".asInstanceOf["h2"]
    
    inline def h3: "h3" = "h3".asInstanceOf["h3"]
    
    inline def h4: "h4" = "h4".asInstanceOf["h4"]
    
    inline def h5: "h5" = "h5".asInstanceOf["h5"]
    
    inline def h6: "h6" = "h6".asInstanceOf["h6"]
    
    inline def `hacker-news`: "hacker-news" = "hacker-news".asInstanceOf["hacker-news"]
    
    inline def `hacker-news-square`: "hacker-news-square" = "hacker-news-square".asInstanceOf["hacker-news-square"]
    
    inline def hackerrank: "hackerrank" = "hackerrank".asInstanceOf["hackerrank"]
    
    inline def hamburger: "hamburger" = "hamburger".asInstanceOf["hamburger"]
    
    inline def hammer: "hammer" = "hammer".asInstanceOf["hammer"]
    
    inline def `hammer-crash`: "hammer-crash" = "hammer-crash".asInstanceOf["hammer-crash"]
    
    inline def `hammer-war`: "hammer-war" = "hammer-war".asInstanceOf["hammer-war"]
    
    inline def hamsa: "hamsa" = "hamsa".asInstanceOf["hamsa"]
    
    inline def hand: "hand" = "hand".asInstanceOf["hand"]
    
    inline def `hand-back-fist`: "hand-back-fist" = "hand-back-fist".asInstanceOf["hand-back-fist"]
    
    inline def `hand-back-point-down`: "hand-back-point-down" = "hand-back-point-down".asInstanceOf["hand-back-point-down"]
    
    inline def `hand-back-point-left`: "hand-back-point-left" = "hand-back-point-left".asInstanceOf["hand-back-point-left"]
    
    inline def `hand-back-point-ribbon`: "hand-back-point-ribbon" = "hand-back-point-ribbon".asInstanceOf["hand-back-point-ribbon"]
    
    inline def `hand-back-point-right`: "hand-back-point-right" = "hand-back-point-right".asInstanceOf["hand-back-point-right"]
    
    inline def `hand-back-point-up`: "hand-back-point-up" = "hand-back-point-up".asInstanceOf["hand-back-point-up"]
    
    inline def `hand-dots`: "hand-dots" = "hand-dots".asInstanceOf["hand-dots"]
    
    inline def `hand-fingers-crossed`: "hand-fingers-crossed" = "hand-fingers-crossed".asInstanceOf["hand-fingers-crossed"]
    
    inline def `hand-fist`: "hand-fist" = "hand-fist".asInstanceOf["hand-fist"]
    
    inline def `hand-heart`: "hand-heart" = "hand-heart".asInstanceOf["hand-heart"]
    
    inline def `hand-holding`: "hand-holding" = "hand-holding".asInstanceOf["hand-holding"]
    
    inline def `hand-holding-box`: "hand-holding-box" = "hand-holding-box".asInstanceOf["hand-holding-box"]
    
    inline def `hand-holding-dollar`: "hand-holding-dollar" = "hand-holding-dollar".asInstanceOf["hand-holding-dollar"]
    
    inline def `hand-holding-droplet`: "hand-holding-droplet" = "hand-holding-droplet".asInstanceOf["hand-holding-droplet"]
    
    inline def `hand-holding-hand`: "hand-holding-hand" = "hand-holding-hand".asInstanceOf["hand-holding-hand"]
    
    inline def `hand-holding-heart`: "hand-holding-heart" = "hand-holding-heart".asInstanceOf["hand-holding-heart"]
    
    inline def `hand-holding-magic`: "hand-holding-magic" = "hand-holding-magic".asInstanceOf["hand-holding-magic"]
    
    inline def `hand-holding-medical`: "hand-holding-medical" = "hand-holding-medical".asInstanceOf["hand-holding-medical"]
    
    inline def `hand-holding-seedling`: "hand-holding-seedling" = "hand-holding-seedling".asInstanceOf["hand-holding-seedling"]
    
    inline def `hand-holding-skull`: "hand-holding-skull" = "hand-holding-skull".asInstanceOf["hand-holding-skull"]
    
    inline def `hand-holding-usd`: "hand-holding-usd" = "hand-holding-usd".asInstanceOf["hand-holding-usd"]
    
    inline def `hand-holding-water`: "hand-holding-water" = "hand-holding-water".asInstanceOf["hand-holding-water"]
    
    inline def `hand-horns`: "hand-horns" = "hand-horns".asInstanceOf["hand-horns"]
    
    inline def `hand-lizard`: "hand-lizard" = "hand-lizard".asInstanceOf["hand-lizard"]
    
    inline def `hand-love`: "hand-love" = "hand-love".asInstanceOf["hand-love"]
    
    inline def `hand-middle-finger`: "hand-middle-finger" = "hand-middle-finger".asInstanceOf["hand-middle-finger"]
    
    inline def `hand-paper`: "hand-paper" = "hand-paper".asInstanceOf["hand-paper"]
    
    inline def `hand-peace`: "hand-peace" = "hand-peace".asInstanceOf["hand-peace"]
    
    inline def `hand-point-down`: "hand-point-down" = "hand-point-down".asInstanceOf["hand-point-down"]
    
    inline def `hand-point-left`: "hand-point-left" = "hand-point-left".asInstanceOf["hand-point-left"]
    
    inline def `hand-point-ribbon`: "hand-point-ribbon" = "hand-point-ribbon".asInstanceOf["hand-point-ribbon"]
    
    inline def `hand-point-right`: "hand-point-right" = "hand-point-right".asInstanceOf["hand-point-right"]
    
    inline def `hand-point-up`: "hand-point-up" = "hand-point-up".asInstanceOf["hand-point-up"]
    
    inline def `hand-pointer`: "hand-pointer" = "hand-pointer".asInstanceOf["hand-pointer"]
    
    inline def `hand-receiving`: "hand-receiving" = "hand-receiving".asInstanceOf["hand-receiving"]
    
    inline def `hand-rock`: "hand-rock" = "hand-rock".asInstanceOf["hand-rock"]
    
    inline def `hand-scissors`: "hand-scissors" = "hand-scissors".asInstanceOf["hand-scissors"]
    
    inline def `hand-sparkles`: "hand-sparkles" = "hand-sparkles".asInstanceOf["hand-sparkles"]
    
    inline def `hand-spock`: "hand-spock" = "hand-spock".asInstanceOf["hand-spock"]
    
    inline def `hand-wave`: "hand-wave" = "hand-wave".asInstanceOf["hand-wave"]
    
    inline def handcuffs: "handcuffs" = "handcuffs".asInstanceOf["handcuffs"]
    
    inline def hands: "hands" = "hands".asInstanceOf["hands"]
    
    inline def `hands-american-sign-language-interpreting`: "hands-american-sign-language-interpreting" = "hands-american-sign-language-interpreting".asInstanceOf["hands-american-sign-language-interpreting"]
    
    inline def `hands-asl-interpreting`: "hands-asl-interpreting" = "hands-asl-interpreting".asInstanceOf["hands-asl-interpreting"]
    
    inline def `hands-bound`: "hands-bound" = "hands-bound".asInstanceOf["hands-bound"]
    
    inline def `hands-bubbles`: "hands-bubbles" = "hands-bubbles".asInstanceOf["hands-bubbles"]
    
    inline def `hands-clapping`: "hands-clapping" = "hands-clapping".asInstanceOf["hands-clapping"]
    
    inline def `hands-heart`: "hands-heart" = "hands-heart".asInstanceOf["hands-heart"]
    
    inline def `hands-helping`: "hands-helping" = "hands-helping".asInstanceOf["hands-helping"]
    
    inline def `hands-holding`: "hands-holding" = "hands-holding".asInstanceOf["hands-holding"]
    
    inline def `hands-holding-child`: "hands-holding-child" = "hands-holding-child".asInstanceOf["hands-holding-child"]
    
    inline def `hands-holding-circle`: "hands-holding-circle" = "hands-holding-circle".asInstanceOf["hands-holding-circle"]
    
    inline def `hands-holding-diamond`: "hands-holding-diamond" = "hands-holding-diamond".asInstanceOf["hands-holding-diamond"]
    
    inline def `hands-holding-dollar`: "hands-holding-dollar" = "hands-holding-dollar".asInstanceOf["hands-holding-dollar"]
    
    inline def `hands-holding-heart`: "hands-holding-heart" = "hands-holding-heart".asInstanceOf["hands-holding-heart"]
    
    inline def `hands-praying`: "hands-praying" = "hands-praying".asInstanceOf["hands-praying"]
    
    inline def `hands-usd`: "hands-usd" = "hands-usd".asInstanceOf["hands-usd"]
    
    inline def `hands-wash`: "hands-wash" = "hands-wash".asInstanceOf["hands-wash"]
    
    inline def handshake: "handshake" = "handshake".asInstanceOf["handshake"]
    
    inline def `handshake-alt`: "handshake-alt" = "handshake-alt".asInstanceOf["handshake-alt"]
    
    inline def `handshake-alt-slash`: "handshake-alt-slash" = "handshake-alt-slash".asInstanceOf["handshake-alt-slash"]
    
    inline def `handshake-angle`: "handshake-angle" = "handshake-angle".asInstanceOf["handshake-angle"]
    
    inline def `handshake-simple`: "handshake-simple" = "handshake-simple".asInstanceOf["handshake-simple"]
    
    inline def `handshake-simple-slash`: "handshake-simple-slash" = "handshake-simple-slash".asInstanceOf["handshake-simple-slash"]
    
    inline def `handshake-slash`: "handshake-slash" = "handshake-slash".asInstanceOf["handshake-slash"]
    
    inline def hanukiah: "hanukiah" = "hanukiah".asInstanceOf["hanukiah"]
    
    inline def `hard-drive`: "hard-drive" = "hard-drive".asInstanceOf["hard-drive"]
    
    inline def `hard-hat`: "hard-hat" = "hard-hat".asInstanceOf["hard-hat"]
    
    inline def `hard-of-hearing`: "hard-of-hearing" = "hard-of-hearing".asInstanceOf["hard-of-hearing"]
    
    inline def hashnode: "hashnode" = "hashnode".asInstanceOf["hashnode"]
    
    inline def hashtag: "hashtag" = "hashtag".asInstanceOf["hashtag"]
    
    inline def `hashtag-lock`: "hashtag-lock" = "hashtag-lock".asInstanceOf["hashtag-lock"]
    
    inline def `hat-chef`: "hat-chef" = "hat-chef".asInstanceOf["hat-chef"]
    
    inline def `hat-cowboy`: "hat-cowboy" = "hat-cowboy".asInstanceOf["hat-cowboy"]
    
    inline def `hat-cowboy-side`: "hat-cowboy-side" = "hat-cowboy-side".asInstanceOf["hat-cowboy-side"]
    
    inline def `hat-hard`: "hat-hard" = "hat-hard".asInstanceOf["hat-hard"]
    
    inline def `hat-santa`: "hat-santa" = "hat-santa".asInstanceOf["hat-santa"]
    
    inline def `hat-winter`: "hat-winter" = "hat-winter".asInstanceOf["hat-winter"]
    
    inline def `hat-witch`: "hat-witch" = "hat-witch".asInstanceOf["hat-witch"]
    
    inline def `hat-wizard`: "hat-wizard" = "hat-wizard".asInstanceOf["hat-wizard"]
    
    inline def haykal: "haykal" = "haykal".asInstanceOf["haykal"]
    
    inline def hdd: "hdd" = "hdd".asInstanceOf["hdd"]
    
    inline def `head-side`: "head-side" = "head-side".asInstanceOf["head-side"]
    
    inline def `head-side-brain`: "head-side-brain" = "head-side-brain".asInstanceOf["head-side-brain"]
    
    inline def `head-side-cough`: "head-side-cough" = "head-side-cough".asInstanceOf["head-side-cough"]
    
    inline def `head-side-cough-slash`: "head-side-cough-slash" = "head-side-cough-slash".asInstanceOf["head-side-cough-slash"]
    
    inline def `head-side-goggles`: "head-side-goggles" = "head-side-goggles".asInstanceOf["head-side-goggles"]
    
    inline def `head-side-headphones`: "head-side-headphones" = "head-side-headphones".asInstanceOf["head-side-headphones"]
    
    inline def `head-side-heart`: "head-side-heart" = "head-side-heart".asInstanceOf["head-side-heart"]
    
    inline def `head-side-mask`: "head-side-mask" = "head-side-mask".asInstanceOf["head-side-mask"]
    
    inline def `head-side-medical`: "head-side-medical" = "head-side-medical".asInstanceOf["head-side-medical"]
    
    inline def `head-side-virus`: "head-side-virus" = "head-side-virus".asInstanceOf["head-side-virus"]
    
    inline def `head-vr`: "head-vr" = "head-vr".asInstanceOf["head-vr"]
    
    inline def header: "header" = "header".asInstanceOf["header"]
    
    inline def heading: "heading" = "heading".asInstanceOf["heading"]
    
    inline def headphones: "headphones" = "headphones".asInstanceOf["headphones"]
    
    inline def `headphones-alt`: "headphones-alt" = "headphones-alt".asInstanceOf["headphones-alt"]
    
    inline def `headphones-simple`: "headphones-simple" = "headphones-simple".asInstanceOf["headphones-simple"]
    
    inline def headset: "headset" = "headset".asInstanceOf["headset"]
    
    inline def heart: "heart" = "heart".asInstanceOf["heart"]
    
    inline def `heart-broken`: "heart-broken" = "heart-broken".asInstanceOf["heart-broken"]
    
    inline def `heart-circle`: "heart-circle" = "heart-circle".asInstanceOf["heart-circle"]
    
    inline def `heart-circle-bolt`: "heart-circle-bolt" = "heart-circle-bolt".asInstanceOf["heart-circle-bolt"]
    
    inline def `heart-circle-check`: "heart-circle-check" = "heart-circle-check".asInstanceOf["heart-circle-check"]
    
    inline def `heart-circle-exclamation`: "heart-circle-exclamation" = "heart-circle-exclamation".asInstanceOf["heart-circle-exclamation"]
    
    inline def `heart-circle-minus`: "heart-circle-minus" = "heart-circle-minus".asInstanceOf["heart-circle-minus"]
    
    inline def `heart-circle-plus`: "heart-circle-plus" = "heart-circle-plus".asInstanceOf["heart-circle-plus"]
    
    inline def `heart-circle-xmark`: "heart-circle-xmark" = "heart-circle-xmark".asInstanceOf["heart-circle-xmark"]
    
    inline def `heart-crack`: "heart-crack" = "heart-crack".asInstanceOf["heart-crack"]
    
    inline def `heart-half`: "heart-half" = "heart-half".asInstanceOf["heart-half"]
    
    inline def `heart-half-alt`: "heart-half-alt" = "heart-half-alt".asInstanceOf["heart-half-alt"]
    
    inline def `heart-half-stroke`: "heart-half-stroke" = "heart-half-stroke".asInstanceOf["heart-half-stroke"]
    
    inline def `heart-music-camera-bolt`: "heart-music-camera-bolt" = "heart-music-camera-bolt".asInstanceOf["heart-music-camera-bolt"]
    
    inline def `heart-pulse`: "heart-pulse" = "heart-pulse".asInstanceOf["heart-pulse"]
    
    inline def `heart-rate`: "heart-rate" = "heart-rate".asInstanceOf["heart-rate"]
    
    inline def `heart-square`: "heart-square" = "heart-square".asInstanceOf["heart-square"]
    
    inline def heartbeat: "heartbeat" = "heartbeat".asInstanceOf["heartbeat"]
    
    inline def heat: "heat" = "heat".asInstanceOf["heat"]
    
    inline def helicopter: "helicopter" = "helicopter".asInstanceOf["helicopter"]
    
    inline def `helicopter-symbol`: "helicopter-symbol" = "helicopter-symbol".asInstanceOf["helicopter-symbol"]
    
    inline def `helmet-battle`: "helmet-battle" = "helmet-battle".asInstanceOf["helmet-battle"]
    
    inline def `helmet-safety`: "helmet-safety" = "helmet-safety".asInstanceOf["helmet-safety"]
    
    inline def `helmet-un`: "helmet-un" = "helmet-un".asInstanceOf["helmet-un"]
    
    inline def hexagon: "hexagon" = "hexagon".asInstanceOf["hexagon"]
    
    inline def `hexagon-check`: "hexagon-check" = "hexagon-check".asInstanceOf["hexagon-check"]
    
    inline def `hexagon-divide`: "hexagon-divide" = "hexagon-divide".asInstanceOf["hexagon-divide"]
    
    inline def `hexagon-exclamation`: "hexagon-exclamation" = "hexagon-exclamation".asInstanceOf["hexagon-exclamation"]
    
    inline def `hexagon-image`: "hexagon-image" = "hexagon-image".asInstanceOf["hexagon-image"]
    
    inline def `hexagon-minus`: "hexagon-minus" = "hexagon-minus".asInstanceOf["hexagon-minus"]
    
    inline def `hexagon-plus`: "hexagon-plus" = "hexagon-plus".asInstanceOf["hexagon-plus"]
    
    inline def `hexagon-vertical-nft`: "hexagon-vertical-nft" = "hexagon-vertical-nft".asInstanceOf["hexagon-vertical-nft"]
    
    inline def `hexagon-vertical-nft-slanted`: "hexagon-vertical-nft-slanted" = "hexagon-vertical-nft-slanted".asInstanceOf["hexagon-vertical-nft-slanted"]
    
    inline def `hexagon-xmark`: "hexagon-xmark" = "hexagon-xmark".asInstanceOf["hexagon-xmark"]
    
    inline def `high-definition`: "high-definition" = "high-definition".asInstanceOf["high-definition"]
    
    inline def highlighter: "highlighter" = "highlighter".asInstanceOf["highlighter"]
    
    inline def `highlighter-line`: "highlighter-line" = "highlighter-line".asInstanceOf["highlighter-line"]
    
    inline def hiking: "hiking" = "hiking".asInstanceOf["hiking"]
    
    inline def `hill-avalanche`: "hill-avalanche" = "hill-avalanche".asInstanceOf["hill-avalanche"]
    
    inline def `hill-rockslide`: "hill-rockslide" = "hill-rockslide".asInstanceOf["hill-rockslide"]
    
    inline def hippo: "hippo" = "hippo".asInstanceOf["hippo"]
    
    inline def hips: "hips" = "hips".asInstanceOf["hips"]
    
    inline def `hire-a-helper`: "hire-a-helper" = "hire-a-helper".asInstanceOf["hire-a-helper"]
    
    inline def history: "history" = "history".asInstanceOf["history"]
    
    inline def hive: "hive" = "hive".asInstanceOf["hive"]
    
    inline def `hockey-mask`: "hockey-mask" = "hockey-mask".asInstanceOf["hockey-mask"]
    
    inline def `hockey-puck`: "hockey-puck" = "hockey-puck".asInstanceOf["hockey-puck"]
    
    inline def `hockey-stick-puck`: "hockey-stick-puck" = "hockey-stick-puck".asInstanceOf["hockey-stick-puck"]
    
    inline def `hockey-sticks`: "hockey-sticks" = "hockey-sticks".asInstanceOf["hockey-sticks"]
    
    inline def `holly-berry`: "holly-berry" = "holly-berry".asInstanceOf["holly-berry"]
    
    inline def home: "home" = "home".asInstanceOf["home"]
    
    inline def `home-alt`: "home-alt" = "home-alt".asInstanceOf["home-alt"]
    
    inline def `home-blank`: "home-blank" = "home-blank".asInstanceOf["home-blank"]
    
    inline def `home-heart`: "home-heart" = "home-heart".asInstanceOf["home-heart"]
    
    inline def `home-lg`: "home-lg" = "home-lg".asInstanceOf["home-lg"]
    
    inline def `home-lg-alt`: "home-lg-alt" = "home-lg-alt".asInstanceOf["home-lg-alt"]
    
    inline def `home-user`: "home-user" = "home-user".asInstanceOf["home-user"]
    
    inline def `honey-pot`: "honey-pot" = "honey-pot".asInstanceOf["honey-pot"]
    
    inline def `hood-cloak`: "hood-cloak" = "hood-cloak".asInstanceOf["hood-cloak"]
    
    inline def hooli: "hooli" = "hooli".asInstanceOf["hooli"]
    
    inline def `horizontal-rule`: "horizontal-rule" = "horizontal-rule".asInstanceOf["horizontal-rule"]
    
    inline def hornbill: "hornbill" = "hornbill".asInstanceOf["hornbill"]
    
    inline def horse: "horse" = "horse".asInstanceOf["horse"]
    
    inline def `horse-head`: "horse-head" = "horse-head".asInstanceOf["horse-head"]
    
    inline def `horse-saddle`: "horse-saddle" = "horse-saddle".asInstanceOf["horse-saddle"]
    
    inline def hose: "hose" = "hose".asInstanceOf["hose"]
    
    inline def `hose-reel`: "hose-reel" = "hose-reel".asInstanceOf["hose-reel"]
    
    inline def hospital: "hospital" = "hospital".asInstanceOf["hospital"]
    
    inline def `hospital-alt`: "hospital-alt" = "hospital-alt".asInstanceOf["hospital-alt"]
    
    inline def `hospital-symbol`: "hospital-symbol" = "hospital-symbol".asInstanceOf["hospital-symbol"]
    
    inline def `hospital-user`: "hospital-user" = "hospital-user".asInstanceOf["hospital-user"]
    
    inline def `hospital-wide`: "hospital-wide" = "hospital-wide".asInstanceOf["hospital-wide"]
    
    inline def hospitals: "hospitals" = "hospitals".asInstanceOf["hospitals"]
    
    inline def `hot-tub`: "hot-tub" = "hot-tub".asInstanceOf["hot-tub"]
    
    inline def `hot-tub-person`: "hot-tub-person" = "hot-tub-person".asInstanceOf["hot-tub-person"]
    
    inline def hotdog: "hotdog" = "hotdog".asInstanceOf["hotdog"]
    
    inline def hotel: "hotel" = "hotel".asInstanceOf["hotel"]
    
    inline def hotjar: "hotjar" = "hotjar".asInstanceOf["hotjar"]
    
    inline def hourglass: "hourglass" = "hourglass".asInstanceOf["hourglass"]
    
    inline def `hourglass-clock`: "hourglass-clock" = "hourglass-clock".asInstanceOf["hourglass-clock"]
    
    inline def `hourglass-empty`: "hourglass-empty" = "hourglass-empty".asInstanceOf["hourglass-empty"]
    
    inline def `hourglass-end`: "hourglass-end" = "hourglass-end".asInstanceOf["hourglass-end"]
    
    inline def `hourglass-half`: "hourglass-half" = "hourglass-half".asInstanceOf["hourglass-half"]
    
    inline def `hourglass-start`: "hourglass-start" = "hourglass-start".asInstanceOf["hourglass-start"]
    
    inline def hourglass1: "hourglass1" = "hourglass1".asInstanceOf["hourglass1"]
    
    inline def hourglass2: "hourglass2" = "hourglass2".asInstanceOf["hourglass2"]
    
    inline def hourglass3: "hourglass3" = "hourglass3".asInstanceOf["hourglass3"]
    
    inline def house: "house" = "house".asInstanceOf["house"]
    
    inline def `house-blank`: "house-blank" = "house-blank".asInstanceOf["house-blank"]
    
    inline def `house-building`: "house-building" = "house-building".asInstanceOf["house-building"]
    
    inline def `house-chimney`: "house-chimney" = "house-chimney".asInstanceOf["house-chimney"]
    
    inline def `house-chimney-blank`: "house-chimney-blank" = "house-chimney-blank".asInstanceOf["house-chimney-blank"]
    
    inline def `house-chimney-crack`: "house-chimney-crack" = "house-chimney-crack".asInstanceOf["house-chimney-crack"]
    
    inline def `house-chimney-heart`: "house-chimney-heart" = "house-chimney-heart".asInstanceOf["house-chimney-heart"]
    
    inline def `house-chimney-medical`: "house-chimney-medical" = "house-chimney-medical".asInstanceOf["house-chimney-medical"]
    
    inline def `house-chimney-user`: "house-chimney-user" = "house-chimney-user".asInstanceOf["house-chimney-user"]
    
    inline def `house-chimney-window`: "house-chimney-window" = "house-chimney-window".asInstanceOf["house-chimney-window"]
    
    inline def `house-circle-check`: "house-circle-check" = "house-circle-check".asInstanceOf["house-circle-check"]
    
    inline def `house-circle-exclamation`: "house-circle-exclamation" = "house-circle-exclamation".asInstanceOf["house-circle-exclamation"]
    
    inline def `house-circle-xmark`: "house-circle-xmark" = "house-circle-xmark".asInstanceOf["house-circle-xmark"]
    
    inline def `house-crack`: "house-crack" = "house-crack".asInstanceOf["house-crack"]
    
    inline def `house-damage`: "house-damage" = "house-damage".asInstanceOf["house-damage"]
    
    inline def `house-day`: "house-day" = "house-day".asInstanceOf["house-day"]
    
    inline def `house-fire`: "house-fire" = "house-fire".asInstanceOf["house-fire"]
    
    inline def `house-flag`: "house-flag" = "house-flag".asInstanceOf["house-flag"]
    
    inline def `house-flood`: "house-flood" = "house-flood".asInstanceOf["house-flood"]
    
    inline def `house-flood-water`: "house-flood-water" = "house-flood-water".asInstanceOf["house-flood-water"]
    
    inline def `house-flood-water-circle-arrow-right`: "house-flood-water-circle-arrow-right" = "house-flood-water-circle-arrow-right".asInstanceOf["house-flood-water-circle-arrow-right"]
    
    inline def `house-heart`: "house-heart" = "house-heart".asInstanceOf["house-heart"]
    
    inline def `house-laptop`: "house-laptop" = "house-laptop".asInstanceOf["house-laptop"]
    
    inline def `house-leave`: "house-leave" = "house-leave".asInstanceOf["house-leave"]
    
    inline def `house-lock`: "house-lock" = "house-lock".asInstanceOf["house-lock"]
    
    inline def `house-medical`: "house-medical" = "house-medical".asInstanceOf["house-medical"]
    
    inline def `house-medical-circle-check`: "house-medical-circle-check" = "house-medical-circle-check".asInstanceOf["house-medical-circle-check"]
    
    inline def `house-medical-circle-exclamation`: "house-medical-circle-exclamation" = "house-medical-circle-exclamation".asInstanceOf["house-medical-circle-exclamation"]
    
    inline def `house-medical-circle-xmark`: "house-medical-circle-xmark" = "house-medical-circle-xmark".asInstanceOf["house-medical-circle-xmark"]
    
    inline def `house-medical-flag`: "house-medical-flag" = "house-medical-flag".asInstanceOf["house-medical-flag"]
    
    inline def `house-night`: "house-night" = "house-night".asInstanceOf["house-night"]
    
    inline def `house-person-arrive`: "house-person-arrive" = "house-person-arrive".asInstanceOf["house-person-arrive"]
    
    inline def `house-person-depart`: "house-person-depart" = "house-person-depart".asInstanceOf["house-person-depart"]
    
    inline def `house-person-leave`: "house-person-leave" = "house-person-leave".asInstanceOf["house-person-leave"]
    
    inline def `house-person-return`: "house-person-return" = "house-person-return".asInstanceOf["house-person-return"]
    
    inline def `house-return`: "house-return" = "house-return".asInstanceOf["house-return"]
    
    inline def `house-signal`: "house-signal" = "house-signal".asInstanceOf["house-signal"]
    
    inline def `house-tree`: "house-tree" = "house-tree".asInstanceOf["house-tree"]
    
    inline def `house-tsunami`: "house-tsunami" = "house-tsunami".asInstanceOf["house-tsunami"]
    
    inline def `house-turret`: "house-turret" = "house-turret".asInstanceOf["house-turret"]
    
    inline def `house-user`: "house-user" = "house-user".asInstanceOf["house-user"]
    
    inline def `house-water`: "house-water" = "house-water".asInstanceOf["house-water"]
    
    inline def `house-window`: "house-window" = "house-window".asInstanceOf["house-window"]
    
    inline def houzz: "houzz" = "houzz".asInstanceOf["houzz"]
    
    inline def hryvnia: "hryvnia" = "hryvnia".asInstanceOf["hryvnia"]
    
    inline def `hryvnia-sign`: "hryvnia-sign" = "hryvnia-sign".asInstanceOf["hryvnia-sign"]
    
    inline def html5: "html5" = "html5".asInstanceOf["html5"]
    
    inline def hubspot: "hubspot" = "hubspot".asInstanceOf["hubspot"]
    
    inline def humidity: "humidity" = "humidity".asInstanceOf["humidity"]
    
    inline def `hundred-points`: "hundred-points" = "hundred-points".asInstanceOf["hundred-points"]
    
    inline def hurricane: "hurricane" = "hurricane".asInstanceOf["hurricane"]
    
    inline def hyphen: "hyphen" = "hyphen".asInstanceOf["hyphen"]
    
    inline def i: "i" = "i".asInstanceOf["i"]
    
    inline def `i-cursor`: "i-cursor" = "i-cursor".asInstanceOf["i-cursor"]
    
    inline def `ice-cream`: "ice-cream" = "ice-cream".asInstanceOf["ice-cream"]
    
    inline def `ice-skate`: "ice-skate" = "ice-skate".asInstanceOf["ice-skate"]
    
    inline def icicles: "icicles" = "icicles".asInstanceOf["icicles"]
    
    inline def icons: "icons" = "icons".asInstanceOf["icons"]
    
    inline def `icons-alt`: "icons-alt" = "icons-alt".asInstanceOf["icons-alt"]
    
    inline def `id-badge`: "id-badge" = "id-badge".asInstanceOf["id-badge"]
    
    inline def `id-card`: "id-card" = "id-card".asInstanceOf["id-card"]
    
    inline def `id-card-alt`: "id-card-alt" = "id-card-alt".asInstanceOf["id-card-alt"]
    
    inline def `id-card-clip`: "id-card-clip" = "id-card-clip".asInstanceOf["id-card-clip"]
    
    inline def ideal: "ideal" = "ideal".asInstanceOf["ideal"]
    
    inline def igloo: "igloo" = "igloo".asInstanceOf["igloo"]
    
    inline def ils: "ils" = "ils".asInstanceOf["ils"]
    
    inline def image: "image" = "image".asInstanceOf["image"]
    
    inline def `image-landscape`: "image-landscape" = "image-landscape".asInstanceOf["image-landscape"]
    
    inline def `image-polaroid`: "image-polaroid" = "image-polaroid".asInstanceOf["image-polaroid"]
    
    inline def `image-polaroid-user`: "image-polaroid-user" = "image-polaroid-user".asInstanceOf["image-polaroid-user"]
    
    inline def `image-portrait`: "image-portrait" = "image-portrait".asInstanceOf["image-portrait"]
    
    inline def `image-slash`: "image-slash" = "image-slash".asInstanceOf["image-slash"]
    
    inline def `image-user`: "image-user" = "image-user".asInstanceOf["image-user"]
    
    inline def images: "images" = "images".asInstanceOf["images"]
    
    inline def `images-user`: "images-user" = "images-user".asInstanceOf["images-user"]
    
    inline def imdb: "imdb" = "imdb".asInstanceOf["imdb"]
    
    inline def inbox: "inbox" = "inbox".asInstanceOf["inbox"]
    
    inline def `inbox-arrow-down`: "inbox-arrow-down" = "inbox-arrow-down".asInstanceOf["inbox-arrow-down"]
    
    inline def `inbox-arrow-up`: "inbox-arrow-up" = "inbox-arrow-up".asInstanceOf["inbox-arrow-up"]
    
    inline def `inbox-full`: "inbox-full" = "inbox-full".asInstanceOf["inbox-full"]
    
    inline def `inbox-in`: "inbox-in" = "inbox-in".asInstanceOf["inbox-in"]
    
    inline def `inbox-out`: "inbox-out" = "inbox-out".asInstanceOf["inbox-out"]
    
    inline def inboxes: "inboxes" = "inboxes".asInstanceOf["inboxes"]
    
    inline def indent: "indent" = "indent".asInstanceOf["indent"]
    
    inline def `indian-rupee`: "indian-rupee" = "indian-rupee".asInstanceOf["indian-rupee"]
    
    inline def `indian-rupee-sign`: "indian-rupee-sign" = "indian-rupee-sign".asInstanceOf["indian-rupee-sign"]
    
    inline def industry: "industry" = "industry".asInstanceOf["industry"]
    
    inline def `industry-alt`: "industry-alt" = "industry-alt".asInstanceOf["industry-alt"]
    
    inline def `industry-windows`: "industry-windows" = "industry-windows".asInstanceOf["industry-windows"]
    
    inline def infinity: "infinity" = "infinity".asInstanceOf["infinity"]
    
    inline def info: "info" = "info".asInstanceOf["info"]
    
    inline def `info-circle`: "info-circle" = "info-circle".asInstanceOf["info-circle"]
    
    inline def `info-square`: "info-square" = "info-square".asInstanceOf["info-square"]
    
    inline def inhaler: "inhaler" = "inhaler".asInstanceOf["inhaler"]
    
    inline def innosoft: "innosoft" = "innosoft".asInstanceOf["innosoft"]
    
    inline def `input-numeric`: "input-numeric" = "input-numeric".asInstanceOf["input-numeric"]
    
    inline def `input-pipe`: "input-pipe" = "input-pipe".asInstanceOf["input-pipe"]
    
    inline def `input-text`: "input-text" = "input-text".asInstanceOf["input-text"]
    
    inline def inr: "inr" = "inr".asInstanceOf["inr"]
    
    inline def instagram: "instagram" = "instagram".asInstanceOf["instagram"]
    
    inline def `instagram-square`: "instagram-square" = "instagram-square".asInstanceOf["instagram-square"]
    
    inline def instalod: "instalod" = "instalod".asInstanceOf["instalod"]
    
    inline def institution: "institution" = "institution".asInstanceOf["institution"]
    
    inline def integral: "integral" = "integral".asInstanceOf["integral"]
    
    inline def intercom: "intercom" = "intercom".asInstanceOf["intercom"]
    
    inline def `internet-explorer`: "internet-explorer" = "internet-explorer".asInstanceOf["internet-explorer"]
    
    inline def interrobang: "interrobang" = "interrobang".asInstanceOf["interrobang"]
    
    inline def intersection: "intersection" = "intersection".asInstanceOf["intersection"]
    
    inline def inventory: "inventory" = "inventory".asInstanceOf["inventory"]
    
    inline def invision: "invision" = "invision".asInstanceOf["invision"]
    
    inline def ioxhost: "ioxhost" = "ioxhost".asInstanceOf["ioxhost"]
    
    inline def `island-tree-palm`: "island-tree-palm" = "island-tree-palm".asInstanceOf["island-tree-palm"]
    
    inline def `island-tropical`: "island-tropical" = "island-tropical".asInstanceOf["island-tropical"]
    
    inline def italic: "italic" = "italic".asInstanceOf["italic"]
    
    inline def `itch-io`: "itch-io" = "itch-io".asInstanceOf["itch-io"]
    
    inline def itunes: "itunes" = "itunes".asInstanceOf["itunes"]
    
    inline def `itunes-note`: "itunes-note" = "itunes-note".asInstanceOf["itunes-note"]
    
    inline def j: "j" = "j".asInstanceOf["j"]
    
    inline def `jack-o-lantern`: "jack-o-lantern" = "jack-o-lantern".asInstanceOf["jack-o-lantern"]
    
    inline def jar: "jar" = "jar".asInstanceOf["jar"]
    
    inline def `jar-wheat`: "jar-wheat" = "jar-wheat".asInstanceOf["jar-wheat"]
    
    inline def java_ : "java" = "java".asInstanceOf["java"]
    
    inline def jedi: "jedi" = "jedi".asInstanceOf["jedi"]
    
    inline def `jedi-order`: "jedi-order" = "jedi-order".asInstanceOf["jedi-order"]
    
    inline def jenkins: "jenkins" = "jenkins".asInstanceOf["jenkins"]
    
    inline def `jet-fighter`: "jet-fighter" = "jet-fighter".asInstanceOf["jet-fighter"]
    
    inline def `jet-fighter-up`: "jet-fighter-up" = "jet-fighter-up".asInstanceOf["jet-fighter-up"]
    
    inline def jira: "jira" = "jira".asInstanceOf["jira"]
    
    inline def joget: "joget" = "joget".asInstanceOf["joget"]
    
    inline def joint: "joint" = "joint".asInstanceOf["joint"]
    
    inline def joomla: "joomla" = "joomla".asInstanceOf["joomla"]
    
    inline def `journal-whills`: "journal-whills" = "journal-whills".asInstanceOf["journal-whills"]
    
    inline def joystick: "joystick" = "joystick".asInstanceOf["joystick"]
    
    inline def jpy: "jpy" = "jpy".asInstanceOf["jpy"]
    
    inline def `js-square`: "js-square" = "js-square".asInstanceOf["js-square"]
    
    inline def js_ : "js" = "js".asInstanceOf["js"]
    
    inline def jsfiddle: "jsfiddle" = "jsfiddle".asInstanceOf["jsfiddle"]
    
    inline def jug: "jug" = "jug".asInstanceOf["jug"]
    
    inline def `jug-detergent`: "jug-detergent" = "jug-detergent".asInstanceOf["jug-detergent"]
    
    inline def k: "k" = "k".asInstanceOf["k"]
    
    inline def kaaba: "kaaba" = "kaaba".asInstanceOf["kaaba"]
    
    inline def kaggle: "kaggle" = "kaggle".asInstanceOf["kaggle"]
    
    inline def kazoo: "kazoo" = "kazoo".asInstanceOf["kazoo"]
    
    inline def kerning: "kerning" = "kerning".asInstanceOf["kerning"]
    
    inline def key: "key" = "key".asInstanceOf["key"]
    
    inline def `key-skeleton`: "key-skeleton" = "key-skeleton".asInstanceOf["key-skeleton"]
    
    inline def `key-skeleton-left-right`: "key-skeleton-left-right" = "key-skeleton-left-right".asInstanceOf["key-skeleton-left-right"]
    
    inline def keybase: "keybase" = "keybase".asInstanceOf["keybase"]
    
    inline def keyboard: "keyboard" = "keyboard".asInstanceOf["keyboard"]
    
    inline def `keyboard-brightness`: "keyboard-brightness" = "keyboard-brightness".asInstanceOf["keyboard-brightness"]
    
    inline def `keyboard-brightness-low`: "keyboard-brightness-low" = "keyboard-brightness-low".asInstanceOf["keyboard-brightness-low"]
    
    inline def `keyboard-down`: "keyboard-down" = "keyboard-down".asInstanceOf["keyboard-down"]
    
    inline def `keyboard-left`: "keyboard-left" = "keyboard-left".asInstanceOf["keyboard-left"]
    
    inline def keycdn: "keycdn" = "keycdn".asInstanceOf["keycdn"]
    
    inline def keynote: "keynote" = "keynote".asInstanceOf["keynote"]
    
    inline def khanda: "khanda" = "khanda".asInstanceOf["khanda"]
    
    inline def kickstarter: "kickstarter" = "kickstarter".asInstanceOf["kickstarter"]
    
    inline def `kickstarter-k`: "kickstarter-k" = "kickstarter-k".asInstanceOf["kickstarter-k"]
    
    inline def kidneys: "kidneys" = "kidneys".asInstanceOf["kidneys"]
    
    inline def `kip-sign`: "kip-sign" = "kip-sign".asInstanceOf["kip-sign"]
    
    inline def kiss: "kiss" = "kiss".asInstanceOf["kiss"]
    
    inline def `kiss-beam`: "kiss-beam" = "kiss-beam".asInstanceOf["kiss-beam"]
    
    inline def `kiss-wink-heart`: "kiss-wink-heart" = "kiss-wink-heart".asInstanceOf["kiss-wink-heart"]
    
    inline def `kit-medical`: "kit-medical" = "kit-medical".asInstanceOf["kit-medical"]
    
    inline def `kitchen-set`: "kitchen-set" = "kitchen-set".asInstanceOf["kitchen-set"]
    
    inline def kite: "kite" = "kite".asInstanceOf["kite"]
    
    inline def `kiwi-bird`: "kiwi-bird" = "kiwi-bird".asInstanceOf["kiwi-bird"]
    
    inline def `kiwi-fruit`: "kiwi-fruit" = "kiwi-fruit".asInstanceOf["kiwi-fruit"]
    
    inline def knife: "knife" = "knife".asInstanceOf["knife"]
    
    inline def `knife-kitchen`: "knife-kitchen" = "knife-kitchen".asInstanceOf["knife-kitchen"]
    
    inline def korvue: "korvue" = "korvue".asInstanceOf["korvue"]
    
    inline def krw: "krw" = "krw".asInstanceOf["krw"]
    
    inline def l: "l" = "l".asInstanceOf["l"]
    
    inline def `lacrosse-stick`: "lacrosse-stick" = "lacrosse-stick".asInstanceOf["lacrosse-stick"]
    
    inline def `lacrosse-stick-ball`: "lacrosse-stick-ball" = "lacrosse-stick-ball".asInstanceOf["lacrosse-stick-ball"]
    
    inline def `ladder-water`: "ladder-water" = "ladder-water".asInstanceOf["ladder-water"]
    
    inline def lambda: "lambda" = "lambda".asInstanceOf["lambda"]
    
    inline def lamp: "lamp" = "lamp".asInstanceOf["lamp"]
    
    inline def `lamp-desk`: "lamp-desk" = "lamp-desk".asInstanceOf["lamp-desk"]
    
    inline def `lamp-floor`: "lamp-floor" = "lamp-floor".asInstanceOf["lamp-floor"]
    
    inline def `lamp-street`: "lamp-street" = "lamp-street".asInstanceOf["lamp-street"]
    
    inline def `land-mine-on`: "land-mine-on" = "land-mine-on".asInstanceOf["land-mine-on"]
    
    inline def landmark: "landmark" = "landmark".asInstanceOf["landmark"]
    
    inline def `landmark-alt`: "landmark-alt" = "landmark-alt".asInstanceOf["landmark-alt"]
    
    inline def `landmark-dome`: "landmark-dome" = "landmark-dome".asInstanceOf["landmark-dome"]
    
    inline def `landmark-flag`: "landmark-flag" = "landmark-flag".asInstanceOf["landmark-flag"]
    
    inline def landscape: "landscape" = "landscape".asInstanceOf["landscape"]
    
    inline def language: "language" = "language".asInstanceOf["language"]
    
    inline def laptop: "laptop" = "laptop".asInstanceOf["laptop"]
    
    inline def `laptop-arrow-down`: "laptop-arrow-down" = "laptop-arrow-down".asInstanceOf["laptop-arrow-down"]
    
    inline def `laptop-code`: "laptop-code" = "laptop-code".asInstanceOf["laptop-code"]
    
    inline def `laptop-file`: "laptop-file" = "laptop-file".asInstanceOf["laptop-file"]
    
    inline def `laptop-house`: "laptop-house" = "laptop-house".asInstanceOf["laptop-house"]
    
    inline def `laptop-medical`: "laptop-medical" = "laptop-medical".asInstanceOf["laptop-medical"]
    
    inline def `laptop-mobile`: "laptop-mobile" = "laptop-mobile".asInstanceOf["laptop-mobile"]
    
    inline def `laptop-slash`: "laptop-slash" = "laptop-slash".asInstanceOf["laptop-slash"]
    
    inline def laravel: "laravel" = "laravel".asInstanceOf["laravel"]
    
    inline def `lari-sign`: "lari-sign" = "lari-sign".asInstanceOf["lari-sign"]
    
    inline def lasso: "lasso" = "lasso".asInstanceOf["lasso"]
    
    inline def `lasso-sparkles`: "lasso-sparkles" = "lasso-sparkles".asInstanceOf["lasso-sparkles"]
    
    inline def lastfm: "lastfm" = "lastfm".asInstanceOf["lastfm"]
    
    inline def `lastfm-square`: "lastfm-square" = "lastfm-square".asInstanceOf["lastfm-square"]
    
    inline def laugh: "laugh" = "laugh".asInstanceOf["laugh"]
    
    inline def `laugh-beam`: "laugh-beam" = "laugh-beam".asInstanceOf["laugh-beam"]
    
    inline def `laugh-squint`: "laugh-squint" = "laugh-squint".asInstanceOf["laugh-squint"]
    
    inline def `laugh-wink`: "laugh-wink" = "laugh-wink".asInstanceOf["laugh-wink"]
    
    inline def `layer-group`: "layer-group" = "layer-group".asInstanceOf["layer-group"]
    
    inline def `layer-group-minus`: "layer-group-minus" = "layer-group-minus".asInstanceOf["layer-group-minus"]
    
    inline def `layer-group-plus`: "layer-group-plus" = "layer-group-plus".asInstanceOf["layer-group-plus"]
    
    inline def `layer-minus`: "layer-minus" = "layer-minus".asInstanceOf["layer-minus"]
    
    inline def `layer-plus`: "layer-plus" = "layer-plus".asInstanceOf["layer-plus"]
    
    inline def leaf: "leaf" = "leaf".asInstanceOf["leaf"]
    
    inline def `leaf-heart`: "leaf-heart" = "leaf-heart".asInstanceOf["leaf-heart"]
    
    inline def `leaf-maple`: "leaf-maple" = "leaf-maple".asInstanceOf["leaf-maple"]
    
    inline def `leaf-oak`: "leaf-oak" = "leaf-oak".asInstanceOf["leaf-oak"]
    
    inline def `leafy-green`: "leafy-green" = "leafy-green".asInstanceOf["leafy-green"]
    
    inline def leanpub: "leanpub" = "leanpub".asInstanceOf["leanpub"]
    
    inline def left: "left" = "left".asInstanceOf["left"]
    
    inline def `left-from-line`: "left-from-line" = "left-from-line".asInstanceOf["left-from-line"]
    
    inline def `left-long`: "left-long" = "left-long".asInstanceOf["left-long"]
    
    inline def `left-long-to-line`: "left-long-to-line" = "left-long-to-line".asInstanceOf["left-long-to-line"]
    
    inline def `left-right`: "left-right" = "left-right".asInstanceOf["left-right"]
    
    inline def `left-to-line`: "left-to-line" = "left-to-line".asInstanceOf["left-to-line"]
    
    inline def legal: "legal" = "legal".asInstanceOf["legal"]
    
    inline def lemon: "lemon" = "lemon".asInstanceOf["lemon"]
    
    inline def less: "less" = "less".asInstanceOf["less"]
    
    inline def `less-than`: "less-than" = "less-than".asInstanceOf["less-than"]
    
    inline def `less-than-equal`: "less-than-equal" = "less-than-equal".asInstanceOf["less-than-equal"]
    
    inline def `level-down`: "level-down" = "level-down".asInstanceOf["level-down"]
    
    inline def `level-down-alt`: "level-down-alt" = "level-down-alt".asInstanceOf["level-down-alt"]
    
    inline def `level-up`: "level-up" = "level-up".asInstanceOf["level-up"]
    
    inline def `level-up-alt`: "level-up-alt" = "level-up-alt".asInstanceOf["level-up-alt"]
    
    inline def `life-ring`: "life-ring" = "life-ring".asInstanceOf["life-ring"]
    
    inline def `light-ceiling`: "light-ceiling" = "light-ceiling".asInstanceOf["light-ceiling"]
    
    inline def `light-emergency`: "light-emergency" = "light-emergency".asInstanceOf["light-emergency"]
    
    inline def `light-emergency-on`: "light-emergency-on" = "light-emergency-on".asInstanceOf["light-emergency-on"]
    
    inline def `light-switch`: "light-switch" = "light-switch".asInstanceOf["light-switch"]
    
    inline def `light-switch-off`: "light-switch-off" = "light-switch-off".asInstanceOf["light-switch-off"]
    
    inline def `light-switch-on`: "light-switch-on" = "light-switch-on".asInstanceOf["light-switch-on"]
    
    inline def lightbulb: "lightbulb" = "lightbulb".asInstanceOf["lightbulb"]
    
    inline def `lightbulb-cfl`: "lightbulb-cfl" = "lightbulb-cfl".asInstanceOf["lightbulb-cfl"]
    
    inline def `lightbulb-cfl-on`: "lightbulb-cfl-on" = "lightbulb-cfl-on".asInstanceOf["lightbulb-cfl-on"]
    
    inline def `lightbulb-dollar`: "lightbulb-dollar" = "lightbulb-dollar".asInstanceOf["lightbulb-dollar"]
    
    inline def `lightbulb-exclamation`: "lightbulb-exclamation" = "lightbulb-exclamation".asInstanceOf["lightbulb-exclamation"]
    
    inline def `lightbulb-exclamation-on`: "lightbulb-exclamation-on" = "lightbulb-exclamation-on".asInstanceOf["lightbulb-exclamation-on"]
    
    inline def `lightbulb-on`: "lightbulb-on" = "lightbulb-on".asInstanceOf["lightbulb-on"]
    
    inline def `lightbulb-slash`: "lightbulb-slash" = "lightbulb-slash".asInstanceOf["lightbulb-slash"]
    
    inline def `lights-holiday`: "lights-holiday" = "lights-holiday".asInstanceOf["lights-holiday"]
    
    inline def line: "line" = "line".asInstanceOf["line"]
    
    inline def `line-chart`: "line-chart" = "line-chart".asInstanceOf["line-chart"]
    
    inline def `line-columns`: "line-columns" = "line-columns".asInstanceOf["line-columns"]
    
    inline def `line-height`: "line-height" = "line-height".asInstanceOf["line-height"]
    
    inline def `lines-leaning`: "lines-leaning" = "lines-leaning".asInstanceOf["lines-leaning"]
    
    inline def link: "link" = "link".asInstanceOf["link"]
    
    inline def `link-horizontal`: "link-horizontal" = "link-horizontal".asInstanceOf["link-horizontal"]
    
    inline def `link-horizontal-slash`: "link-horizontal-slash" = "link-horizontal-slash".asInstanceOf["link-horizontal-slash"]
    
    inline def `link-simple`: "link-simple" = "link-simple".asInstanceOf["link-simple"]
    
    inline def `link-simple-slash`: "link-simple-slash" = "link-simple-slash".asInstanceOf["link-simple-slash"]
    
    inline def `link-slash`: "link-slash" = "link-slash".asInstanceOf["link-slash"]
    
    inline def linkedin: "linkedin" = "linkedin".asInstanceOf["linkedin"]
    
    inline def `linkedin-in`: "linkedin-in" = "linkedin-in".asInstanceOf["linkedin-in"]
    
    inline def linode: "linode" = "linode".asInstanceOf["linode"]
    
    inline def linux: "linux" = "linux".asInstanceOf["linux"]
    
    inline def lips: "lips" = "lips".asInstanceOf["lips"]
    
    inline def `lira-sign`: "lira-sign" = "lira-sign".asInstanceOf["lira-sign"]
    
    inline def list: "list" = "list".asInstanceOf["list"]
    
    inline def `list-alt`: "list-alt" = "list-alt".asInstanceOf["list-alt"]
    
    inline def `list-check`: "list-check" = "list-check".asInstanceOf["list-check"]
    
    inline def `list-dots`: "list-dots" = "list-dots".asInstanceOf["list-dots"]
    
    inline def `list-dropdown`: "list-dropdown" = "list-dropdown".asInstanceOf["list-dropdown"]
    
    inline def `list-music`: "list-music" = "list-music".asInstanceOf["list-music"]
    
    inline def `list-numeric`: "list-numeric" = "list-numeric".asInstanceOf["list-numeric"]
    
    inline def `list-ol`: "list-ol" = "list-ol".asInstanceOf["list-ol"]
    
    inline def `list-radio`: "list-radio" = "list-radio".asInstanceOf["list-radio"]
    
    inline def `list-squares`: "list-squares" = "list-squares".asInstanceOf["list-squares"]
    
    inline def `list-timeline`: "list-timeline" = "list-timeline".asInstanceOf["list-timeline"]
    
    inline def `list-tree`: "list-tree" = "list-tree".asInstanceOf["list-tree"]
    
    inline def `list-ul`: "list-ul" = "list-ul".asInstanceOf["list-ul"]
    
    inline def list12: "list12" = "list12".asInstanceOf["list12"]
    
    inline def `litecoin-sign`: "litecoin-sign" = "litecoin-sign".asInstanceOf["litecoin-sign"]
    
    inline def loader: "loader" = "loader".asInstanceOf["loader"]
    
    inline def lobster: "lobster" = "lobster".asInstanceOf["lobster"]
    
    inline def location: "location" = "location".asInstanceOf["location"]
    
    inline def `location-arrow`: "location-arrow" = "location-arrow".asInstanceOf["location-arrow"]
    
    inline def `location-check`: "location-check" = "location-check".asInstanceOf["location-check"]
    
    inline def `location-circle`: "location-circle" = "location-circle".asInstanceOf["location-circle"]
    
    inline def `location-crosshairs`: "location-crosshairs" = "location-crosshairs".asInstanceOf["location-crosshairs"]
    
    inline def `location-crosshairs-slash`: "location-crosshairs-slash" = "location-crosshairs-slash".asInstanceOf["location-crosshairs-slash"]
    
    inline def `location-dot`: "location-dot" = "location-dot".asInstanceOf["location-dot"]
    
    inline def `location-dot-slash`: "location-dot-slash" = "location-dot-slash".asInstanceOf["location-dot-slash"]
    
    inline def `location-exclamation`: "location-exclamation" = "location-exclamation".asInstanceOf["location-exclamation"]
    
    inline def `location-minus`: "location-minus" = "location-minus".asInstanceOf["location-minus"]
    
    inline def `location-pen`: "location-pen" = "location-pen".asInstanceOf["location-pen"]
    
    inline def `location-pin`: "location-pin" = "location-pin".asInstanceOf["location-pin"]
    
    inline def `location-pin-lock`: "location-pin-lock" = "location-pin-lock".asInstanceOf["location-pin-lock"]
    
    inline def `location-pin-slash`: "location-pin-slash" = "location-pin-slash".asInstanceOf["location-pin-slash"]
    
    inline def `location-plus`: "location-plus" = "location-plus".asInstanceOf["location-plus"]
    
    inline def `location-question`: "location-question" = "location-question".asInstanceOf["location-question"]
    
    inline def `location-slash`: "location-slash" = "location-slash".asInstanceOf["location-slash"]
    
    inline def `location-smile`: "location-smile" = "location-smile".asInstanceOf["location-smile"]
    
    inline def `location-xmark`: "location-xmark" = "location-xmark".asInstanceOf["location-xmark"]
    
    inline def lock: "lock" = "lock".asInstanceOf["lock"]
    
    inline def `lock-a`: "lock-a" = "lock-a".asInstanceOf["lock-a"]
    
    inline def `lock-alt`: "lock-alt" = "lock-alt".asInstanceOf["lock-alt"]
    
    inline def `lock-hashtag`: "lock-hashtag" = "lock-hashtag".asInstanceOf["lock-hashtag"]
    
    inline def `lock-keyhole`: "lock-keyhole" = "lock-keyhole".asInstanceOf["lock-keyhole"]
    
    inline def `lock-keyhole-open`: "lock-keyhole-open" = "lock-keyhole-open".asInstanceOf["lock-keyhole-open"]
    
    inline def `lock-open`: "lock-open" = "lock-open".asInstanceOf["lock-open"]
    
    inline def `lock-open-alt`: "lock-open-alt" = "lock-open-alt".asInstanceOf["lock-open-alt"]
    
    inline def locust: "locust" = "locust".asInstanceOf["locust"]
    
    inline def lollipop: "lollipop" = "lollipop".asInstanceOf["lollipop"]
    
    inline def lollypop: "lollypop" = "lollypop".asInstanceOf["lollypop"]
    
    inline def `long-arrow-alt-down`: "long-arrow-alt-down" = "long-arrow-alt-down".asInstanceOf["long-arrow-alt-down"]
    
    inline def `long-arrow-alt-left`: "long-arrow-alt-left" = "long-arrow-alt-left".asInstanceOf["long-arrow-alt-left"]
    
    inline def `long-arrow-alt-right`: "long-arrow-alt-right" = "long-arrow-alt-right".asInstanceOf["long-arrow-alt-right"]
    
    inline def `long-arrow-alt-up`: "long-arrow-alt-up" = "long-arrow-alt-up".asInstanceOf["long-arrow-alt-up"]
    
    inline def `long-arrow-down`: "long-arrow-down" = "long-arrow-down".asInstanceOf["long-arrow-down"]
    
    inline def `long-arrow-left`: "long-arrow-left" = "long-arrow-left".asInstanceOf["long-arrow-left"]
    
    inline def `long-arrow-right`: "long-arrow-right" = "long-arrow-right".asInstanceOf["long-arrow-right"]
    
    inline def `long-arrow-up`: "long-arrow-up" = "long-arrow-up".asInstanceOf["long-arrow-up"]
    
    inline def loveseat: "loveseat" = "loveseat".asInstanceOf["loveseat"]
    
    inline def `low-vision`: "low-vision" = "low-vision".asInstanceOf["low-vision"]
    
    inline def luchador: "luchador" = "luchador".asInstanceOf["luchador"]
    
    inline def `luchador-mask`: "luchador-mask" = "luchador-mask".asInstanceOf["luchador-mask"]
    
    inline def `luggage-cart`: "luggage-cart" = "luggage-cart".asInstanceOf["luggage-cart"]
    
    inline def lungs: "lungs" = "lungs".asInstanceOf["lungs"]
    
    inline def `lungs-virus`: "lungs-virus" = "lungs-virus".asInstanceOf["lungs-virus"]
    
    inline def lyft: "lyft" = "lyft".asInstanceOf["lyft"]
    
    inline def m: "m" = "m".asInstanceOf["m"]
    
    inline def mace: "mace" = "mace".asInstanceOf["mace"]
    
    inline def magento: "magento" = "magento".asInstanceOf["magento"]
    
    inline def magic: "magic" = "magic".asInstanceOf["magic"]
    
    inline def `magic-wand-sparkles`: "magic-wand-sparkles" = "magic-wand-sparkles".asInstanceOf["magic-wand-sparkles"]
    
    inline def magnet: "magnet" = "magnet".asInstanceOf["magnet"]
    
    inline def `magnifying-glass`: "magnifying-glass" = "magnifying-glass".asInstanceOf["magnifying-glass"]
    
    inline def `magnifying-glass-arrow-right`: "magnifying-glass-arrow-right" = "magnifying-glass-arrow-right".asInstanceOf["magnifying-glass-arrow-right"]
    
    inline def `magnifying-glass-chart`: "magnifying-glass-chart" = "magnifying-glass-chart".asInstanceOf["magnifying-glass-chart"]
    
    inline def `magnifying-glass-dollar`: "magnifying-glass-dollar" = "magnifying-glass-dollar".asInstanceOf["magnifying-glass-dollar"]
    
    inline def `magnifying-glass-location`: "magnifying-glass-location" = "magnifying-glass-location".asInstanceOf["magnifying-glass-location"]
    
    inline def `magnifying-glass-minus`: "magnifying-glass-minus" = "magnifying-glass-minus".asInstanceOf["magnifying-glass-minus"]
    
    inline def `magnifying-glass-plus`: "magnifying-glass-plus" = "magnifying-glass-plus".asInstanceOf["magnifying-glass-plus"]
    
    inline def `mail-bulk`: "mail-bulk" = "mail-bulk".asInstanceOf["mail-bulk"]
    
    inline def `mail-forward`: "mail-forward" = "mail-forward".asInstanceOf["mail-forward"]
    
    inline def `mail-reply`: "mail-reply" = "mail-reply".asInstanceOf["mail-reply"]
    
    inline def `mail-reply-all`: "mail-reply-all" = "mail-reply-all".asInstanceOf["mail-reply-all"]
    
    inline def mailbox: "mailbox" = "mailbox".asInstanceOf["mailbox"]
    
    inline def `mailbox-flag-up`: "mailbox-flag-up" = "mailbox-flag-up".asInstanceOf["mailbox-flag-up"]
    
    inline def mailchimp: "mailchimp" = "mailchimp".asInstanceOf["mailchimp"]
    
    inline def `maki-roll`: "maki-roll" = "maki-roll".asInstanceOf["maki-roll"]
    
    inline def makizushi: "makizushi" = "makizushi".asInstanceOf["makizushi"]
    
    inline def male: "male" = "male".asInstanceOf["male"]
    
    inline def `manat-sign`: "manat-sign" = "manat-sign".asInstanceOf["manat-sign"]
    
    inline def mandalorian: "mandalorian" = "mandalorian".asInstanceOf["mandalorian"]
    
    inline def mandolin: "mandolin" = "mandolin".asInstanceOf["mandolin"]
    
    inline def mango: "mango" = "mango".asInstanceOf["mango"]
    
    inline def manhole: "manhole" = "manhole".asInstanceOf["manhole"]
    
    inline def map: "map" = "map".asInstanceOf["map"]
    
    inline def `map-location`: "map-location" = "map-location".asInstanceOf["map-location"]
    
    inline def `map-location-dot`: "map-location-dot" = "map-location-dot".asInstanceOf["map-location-dot"]
    
    inline def `map-marked`: "map-marked" = "map-marked".asInstanceOf["map-marked"]
    
    inline def `map-marked-alt`: "map-marked-alt" = "map-marked-alt".asInstanceOf["map-marked-alt"]
    
    inline def `map-marker`: "map-marker" = "map-marker".asInstanceOf["map-marker"]
    
    inline def `map-marker-alt`: "map-marker-alt" = "map-marker-alt".asInstanceOf["map-marker-alt"]
    
    inline def `map-marker-alt-slash`: "map-marker-alt-slash" = "map-marker-alt-slash".asInstanceOf["map-marker-alt-slash"]
    
    inline def `map-marker-check`: "map-marker-check" = "map-marker-check".asInstanceOf["map-marker-check"]
    
    inline def `map-marker-edit`: "map-marker-edit" = "map-marker-edit".asInstanceOf["map-marker-edit"]
    
    inline def `map-marker-exclamation`: "map-marker-exclamation" = "map-marker-exclamation".asInstanceOf["map-marker-exclamation"]
    
    inline def `map-marker-minus`: "map-marker-minus" = "map-marker-minus".asInstanceOf["map-marker-minus"]
    
    inline def `map-marker-plus`: "map-marker-plus" = "map-marker-plus".asInstanceOf["map-marker-plus"]
    
    inline def `map-marker-question`: "map-marker-question" = "map-marker-question".asInstanceOf["map-marker-question"]
    
    inline def `map-marker-slash`: "map-marker-slash" = "map-marker-slash".asInstanceOf["map-marker-slash"]
    
    inline def `map-marker-smile`: "map-marker-smile" = "map-marker-smile".asInstanceOf["map-marker-smile"]
    
    inline def `map-marker-times`: "map-marker-times" = "map-marker-times".asInstanceOf["map-marker-times"]
    
    inline def `map-marker-xmark`: "map-marker-xmark" = "map-marker-xmark".asInstanceOf["map-marker-xmark"]
    
    inline def `map-pin`: "map-pin" = "map-pin".asInstanceOf["map-pin"]
    
    inline def `map-signs`: "map-signs" = "map-signs".asInstanceOf["map-signs"]
    
    inline def markdown: "markdown" = "markdown".asInstanceOf["markdown"]
    
    inline def marker: "marker" = "marker".asInstanceOf["marker"]
    
    inline def mars: "mars" = "mars".asInstanceOf["mars"]
    
    inline def `mars-and-venus`: "mars-and-venus" = "mars-and-venus".asInstanceOf["mars-and-venus"]
    
    inline def `mars-and-venus-burst`: "mars-and-venus-burst" = "mars-and-venus-burst".asInstanceOf["mars-and-venus-burst"]
    
    inline def `mars-double`: "mars-double" = "mars-double".asInstanceOf["mars-double"]
    
    inline def `mars-stroke`: "mars-stroke" = "mars-stroke".asInstanceOf["mars-stroke"]
    
    inline def `mars-stroke-h`: "mars-stroke-h" = "mars-stroke-h".asInstanceOf["mars-stroke-h"]
    
    inline def `mars-stroke-right`: "mars-stroke-right" = "mars-stroke-right".asInstanceOf["mars-stroke-right"]
    
    inline def `mars-stroke-up`: "mars-stroke-up" = "mars-stroke-up".asInstanceOf["mars-stroke-up"]
    
    inline def `mars-stroke-v`: "mars-stroke-v" = "mars-stroke-v".asInstanceOf["mars-stroke-v"]
    
    inline def `martini-glass`: "martini-glass" = "martini-glass".asInstanceOf["martini-glass"]
    
    inline def `martini-glass-citrus`: "martini-glass-citrus" = "martini-glass-citrus".asInstanceOf["martini-glass-citrus"]
    
    inline def `martini-glass-empty`: "martini-glass-empty" = "martini-glass-empty".asInstanceOf["martini-glass-empty"]
    
    inline def mask: "mask" = "mask".asInstanceOf["mask"]
    
    inline def `mask-face`: "mask-face" = "mask-face".asInstanceOf["mask-face"]
    
    inline def `mask-luchador`: "mask-luchador" = "mask-luchador".asInstanceOf["mask-luchador"]
    
    inline def `mask-snorkel`: "mask-snorkel" = "mask-snorkel".asInstanceOf["mask-snorkel"]
    
    inline def `mask-ventilator`: "mask-ventilator" = "mask-ventilator".asInstanceOf["mask-ventilator"]
    
    inline def `masks-theater`: "masks-theater" = "masks-theater".asInstanceOf["masks-theater"]
    
    inline def mastodon: "mastodon" = "mastodon".asInstanceOf["mastodon"]
    
    inline def `mattress-pillow`: "mattress-pillow" = "mattress-pillow".asInstanceOf["mattress-pillow"]
    
    inline def maxcdn: "maxcdn" = "maxcdn".asInstanceOf["maxcdn"]
    
    inline def maximize: "maximize" = "maximize".asInstanceOf["maximize"]
    
    inline def mdb: "mdb" = "mdb".asInstanceOf["mdb"]
    
    inline def meat: "meat" = "meat".asInstanceOf["meat"]
    
    inline def medal: "medal" = "medal".asInstanceOf["medal"]
    
    inline def medapps: "medapps" = "medapps".asInstanceOf["medapps"]
    
    inline def medium: "medium" = "medium".asInstanceOf["medium"]
    
    inline def `medium-m`: "medium-m" = "medium-m".asInstanceOf["medium-m"]
    
    inline def medkit: "medkit" = "medkit".asInstanceOf["medkit"]
    
    inline def medrt: "medrt" = "medrt".asInstanceOf["medrt"]
    
    inline def meetup: "meetup" = "meetup".asInstanceOf["meetup"]
    
    inline def megaphone: "megaphone" = "megaphone".asInstanceOf["megaphone"]
    
    inline def megaport: "megaport" = "megaport".asInstanceOf["megaport"]
    
    inline def meh: "meh" = "meh".asInstanceOf["meh"]
    
    inline def `meh-blank`: "meh-blank" = "meh-blank".asInstanceOf["meh-blank"]
    
    inline def `meh-rolling-eyes`: "meh-rolling-eyes" = "meh-rolling-eyes".asInstanceOf["meh-rolling-eyes"]
    
    inline def melon: "melon" = "melon".asInstanceOf["melon"]
    
    inline def `melon-slice`: "melon-slice" = "melon-slice".asInstanceOf["melon-slice"]
    
    inline def memo: "memo" = "memo".asInstanceOf["memo"]
    
    inline def `memo-circle-check`: "memo-circle-check" = "memo-circle-check".asInstanceOf["memo-circle-check"]
    
    inline def `memo-circle-info`: "memo-circle-info" = "memo-circle-info".asInstanceOf["memo-circle-info"]
    
    inline def `memo-pad`: "memo-pad" = "memo-pad".asInstanceOf["memo-pad"]
    
    inline def memory: "memory" = "memory".asInstanceOf["memory"]
    
    inline def mendeley: "mendeley" = "mendeley".asInstanceOf["mendeley"]
    
    inline def menorah: "menorah" = "menorah".asInstanceOf["menorah"]
    
    inline def mercury: "mercury" = "mercury".asInstanceOf["mercury"]
    
    inline def merge: "merge" = "merge".asInstanceOf["merge"]
    
    inline def message: "message" = "message".asInstanceOf["message"]
    
    inline def `message-arrow-down`: "message-arrow-down" = "message-arrow-down".asInstanceOf["message-arrow-down"]
    
    inline def `message-arrow-up`: "message-arrow-up" = "message-arrow-up".asInstanceOf["message-arrow-up"]
    
    inline def `message-arrow-up-right`: "message-arrow-up-right" = "message-arrow-up-right".asInstanceOf["message-arrow-up-right"]
    
    inline def `message-bot`: "message-bot" = "message-bot".asInstanceOf["message-bot"]
    
    inline def `message-captions`: "message-captions" = "message-captions".asInstanceOf["message-captions"]
    
    inline def `message-check`: "message-check" = "message-check".asInstanceOf["message-check"]
    
    inline def `message-code`: "message-code" = "message-code".asInstanceOf["message-code"]
    
    inline def `message-dollar`: "message-dollar" = "message-dollar".asInstanceOf["message-dollar"]
    
    inline def `message-dots`: "message-dots" = "message-dots".asInstanceOf["message-dots"]
    
    inline def `message-edit`: "message-edit" = "message-edit".asInstanceOf["message-edit"]
    
    inline def `message-exclamation`: "message-exclamation" = "message-exclamation".asInstanceOf["message-exclamation"]
    
    inline def `message-heart`: "message-heart" = "message-heart".asInstanceOf["message-heart"]
    
    inline def `message-image`: "message-image" = "message-image".asInstanceOf["message-image"]
    
    inline def `message-lines`: "message-lines" = "message-lines".asInstanceOf["message-lines"]
    
    inline def `message-medical`: "message-medical" = "message-medical".asInstanceOf["message-medical"]
    
    inline def `message-middle`: "message-middle" = "message-middle".asInstanceOf["message-middle"]
    
    inline def `message-middle-top`: "message-middle-top" = "message-middle-top".asInstanceOf["message-middle-top"]
    
    inline def `message-minus`: "message-minus" = "message-minus".asInstanceOf["message-minus"]
    
    inline def `message-music`: "message-music" = "message-music".asInstanceOf["message-music"]
    
    inline def `message-pen`: "message-pen" = "message-pen".asInstanceOf["message-pen"]
    
    inline def `message-plus`: "message-plus" = "message-plus".asInstanceOf["message-plus"]
    
    inline def `message-question`: "message-question" = "message-question".asInstanceOf["message-question"]
    
    inline def `message-quote`: "message-quote" = "message-quote".asInstanceOf["message-quote"]
    
    inline def `message-slash`: "message-slash" = "message-slash".asInstanceOf["message-slash"]
    
    inline def `message-smile`: "message-smile" = "message-smile".asInstanceOf["message-smile"]
    
    inline def `message-sms`: "message-sms" = "message-sms".asInstanceOf["message-sms"]
    
    inline def `message-text`: "message-text" = "message-text".asInstanceOf["message-text"]
    
    inline def `message-times`: "message-times" = "message-times".asInstanceOf["message-times"]
    
    inline def `message-xmark`: "message-xmark" = "message-xmark".asInstanceOf["message-xmark"]
    
    inline def messages: "messages" = "messages".asInstanceOf["messages"]
    
    inline def `messages-dollar`: "messages-dollar" = "messages-dollar".asInstanceOf["messages-dollar"]
    
    inline def `messages-question`: "messages-question" = "messages-question".asInstanceOf["messages-question"]
    
    inline def messaging: "messaging" = "messaging".asInstanceOf["messaging"]
    
    inline def meta: "meta" = "meta".asInstanceOf["meta"]
    
    inline def meteor: "meteor" = "meteor".asInstanceOf["meteor"]
    
    inline def meter: "meter" = "meter".asInstanceOf["meter"]
    
    inline def `meter-bolt`: "meter-bolt" = "meter-bolt".asInstanceOf["meter-bolt"]
    
    inline def `meter-droplet`: "meter-droplet" = "meter-droplet".asInstanceOf["meter-droplet"]
    
    inline def `meter-fire`: "meter-fire" = "meter-fire".asInstanceOf["meter-fire"]
    
    inline def microblog: "microblog" = "microblog".asInstanceOf["microblog"]
    
    inline def microchip: "microchip" = "microchip".asInstanceOf["microchip"]
    
    inline def `microchip-ai`: "microchip-ai" = "microchip-ai".asInstanceOf["microchip-ai"]
    
    inline def microphone: "microphone" = "microphone".asInstanceOf["microphone"]
    
    inline def `microphone-alt`: "microphone-alt" = "microphone-alt".asInstanceOf["microphone-alt"]
    
    inline def `microphone-alt-slash`: "microphone-alt-slash" = "microphone-alt-slash".asInstanceOf["microphone-alt-slash"]
    
    inline def `microphone-circle`: "microphone-circle" = "microphone-circle".asInstanceOf["microphone-circle"]
    
    inline def `microphone-circle-alt`: "microphone-circle-alt" = "microphone-circle-alt".asInstanceOf["microphone-circle-alt"]
    
    inline def `microphone-lines`: "microphone-lines" = "microphone-lines".asInstanceOf["microphone-lines"]
    
    inline def `microphone-lines-slash`: "microphone-lines-slash" = "microphone-lines-slash".asInstanceOf["microphone-lines-slash"]
    
    inline def `microphone-slash`: "microphone-slash" = "microphone-slash".asInstanceOf["microphone-slash"]
    
    inline def `microphone-stand`: "microphone-stand" = "microphone-stand".asInstanceOf["microphone-stand"]
    
    inline def microscope: "microscope" = "microscope".asInstanceOf["microscope"]
    
    inline def microsoft: "microsoft" = "microsoft".asInstanceOf["microsoft"]
    
    inline def microwave: "microwave" = "microwave".asInstanceOf["microwave"]
    
    inline def `mill-sign`: "mill-sign" = "mill-sign".asInstanceOf["mill-sign"]
    
    inline def `mind-share`: "mind-share" = "mind-share".asInstanceOf["mind-share"]
    
    inline def minimize: "minimize" = "minimize".asInstanceOf["minimize"]
    
    inline def minus: "minus" = "minus".asInstanceOf["minus"]
    
    inline def `minus-circle`: "minus-circle" = "minus-circle".asInstanceOf["minus-circle"]
    
    inline def `minus-hexagon`: "minus-hexagon" = "minus-hexagon".asInstanceOf["minus-hexagon"]
    
    inline def `minus-large`: "minus-large" = "minus-large".asInstanceOf["minus-large"]
    
    inline def `minus-octagon`: "minus-octagon" = "minus-octagon".asInstanceOf["minus-octagon"]
    
    inline def `minus-square`: "minus-square" = "minus-square".asInstanceOf["minus-square"]
    
    inline def mistletoe: "mistletoe" = "mistletoe".asInstanceOf["mistletoe"]
    
    inline def mitten: "mitten" = "mitten".asInstanceOf["mitten"]
    
    inline def mix: "mix" = "mix".asInstanceOf["mix"]
    
    inline def mixcloud: "mixcloud" = "mixcloud".asInstanceOf["mixcloud"]
    
    inline def mixer: "mixer" = "mixer".asInstanceOf["mixer"]
    
    inline def mizuni: "mizuni" = "mizuni".asInstanceOf["mizuni"]
    
    inline def mobile: "mobile" = "mobile".asInstanceOf["mobile"]
    
    inline def `mobile-alt`: "mobile-alt" = "mobile-alt".asInstanceOf["mobile-alt"]
    
    inline def `mobile-android`: "mobile-android" = "mobile-android".asInstanceOf["mobile-android"]
    
    inline def `mobile-android-alt`: "mobile-android-alt" = "mobile-android-alt".asInstanceOf["mobile-android-alt"]
    
    inline def `mobile-button`: "mobile-button" = "mobile-button".asInstanceOf["mobile-button"]
    
    inline def `mobile-iphone`: "mobile-iphone" = "mobile-iphone".asInstanceOf["mobile-iphone"]
    
    inline def `mobile-notch`: "mobile-notch" = "mobile-notch".asInstanceOf["mobile-notch"]
    
    inline def `mobile-phone`: "mobile-phone" = "mobile-phone".asInstanceOf["mobile-phone"]
    
    inline def `mobile-retro`: "mobile-retro" = "mobile-retro".asInstanceOf["mobile-retro"]
    
    inline def `mobile-screen`: "mobile-screen" = "mobile-screen".asInstanceOf["mobile-screen"]
    
    inline def `mobile-screen-button`: "mobile-screen-button" = "mobile-screen-button".asInstanceOf["mobile-screen-button"]
    
    inline def `mobile-signal`: "mobile-signal" = "mobile-signal".asInstanceOf["mobile-signal"]
    
    inline def `mobile-signal-out`: "mobile-signal-out" = "mobile-signal-out".asInstanceOf["mobile-signal-out"]
    
    inline def modx: "modx" = "modx".asInstanceOf["modx"]
    
    inline def monero: "monero" = "monero".asInstanceOf["monero"]
    
    inline def `money-bill`: "money-bill" = "money-bill".asInstanceOf["money-bill"]
    
    inline def `money-bill-1`: "money-bill-1" = "money-bill-1".asInstanceOf["money-bill-1"]
    
    inline def `money-bill-1-wave`: "money-bill-1-wave" = "money-bill-1-wave".asInstanceOf["money-bill-1-wave"]
    
    inline def `money-bill-alt`: "money-bill-alt" = "money-bill-alt".asInstanceOf["money-bill-alt"]
    
    inline def `money-bill-simple`: "money-bill-simple" = "money-bill-simple".asInstanceOf["money-bill-simple"]
    
    inline def `money-bill-simple-wave`: "money-bill-simple-wave" = "money-bill-simple-wave".asInstanceOf["money-bill-simple-wave"]
    
    inline def `money-bill-transfer`: "money-bill-transfer" = "money-bill-transfer".asInstanceOf["money-bill-transfer"]
    
    inline def `money-bill-trend-up`: "money-bill-trend-up" = "money-bill-trend-up".asInstanceOf["money-bill-trend-up"]
    
    inline def `money-bill-wave`: "money-bill-wave" = "money-bill-wave".asInstanceOf["money-bill-wave"]
    
    inline def `money-bill-wave-alt`: "money-bill-wave-alt" = "money-bill-wave-alt".asInstanceOf["money-bill-wave-alt"]
    
    inline def `money-bill-wheat`: "money-bill-wheat" = "money-bill-wheat".asInstanceOf["money-bill-wheat"]
    
    inline def `money-bills`: "money-bills" = "money-bills".asInstanceOf["money-bills"]
    
    inline def `money-bills-alt`: "money-bills-alt" = "money-bills-alt".asInstanceOf["money-bills-alt"]
    
    inline def `money-bills-simple`: "money-bills-simple" = "money-bills-simple".asInstanceOf["money-bills-simple"]
    
    inline def `money-check`: "money-check" = "money-check".asInstanceOf["money-check"]
    
    inline def `money-check-alt`: "money-check-alt" = "money-check-alt".asInstanceOf["money-check-alt"]
    
    inline def `money-check-dollar`: "money-check-dollar" = "money-check-dollar".asInstanceOf["money-check-dollar"]
    
    inline def `money-check-dollar-pen`: "money-check-dollar-pen" = "money-check-dollar-pen".asInstanceOf["money-check-dollar-pen"]
    
    inline def `money-check-edit`: "money-check-edit" = "money-check-edit".asInstanceOf["money-check-edit"]
    
    inline def `money-check-edit-alt`: "money-check-edit-alt" = "money-check-edit-alt".asInstanceOf["money-check-edit-alt"]
    
    inline def `money-check-pen`: "money-check-pen" = "money-check-pen".asInstanceOf["money-check-pen"]
    
    inline def `money-from-bracket`: "money-from-bracket" = "money-from-bracket".asInstanceOf["money-from-bracket"]
    
    inline def `money-simple-from-bracket`: "money-simple-from-bracket" = "money-simple-from-bracket".asInstanceOf["money-simple-from-bracket"]
    
    inline def `monitor-heart-rate`: "monitor-heart-rate" = "monitor-heart-rate".asInstanceOf["monitor-heart-rate"]
    
    inline def `monitor-waveform`: "monitor-waveform" = "monitor-waveform".asInstanceOf["monitor-waveform"]
    
    inline def monkey: "monkey" = "monkey".asInstanceOf["monkey"]
    
    inline def monument: "monument" = "monument".asInstanceOf["monument"]
    
    inline def moon: "moon" = "moon".asInstanceOf["moon"]
    
    inline def `moon-cloud`: "moon-cloud" = "moon-cloud".asInstanceOf["moon-cloud"]
    
    inline def `moon-over-sun`: "moon-over-sun" = "moon-over-sun".asInstanceOf["moon-over-sun"]
    
    inline def `moon-stars`: "moon-stars" = "moon-stars".asInstanceOf["moon-stars"]
    
    inline def moped: "moped" = "moped".asInstanceOf["moped"]
    
    inline def `mortar-board`: "mortar-board" = "mortar-board".asInstanceOf["mortar-board"]
    
    inline def `mortar-pestle`: "mortar-pestle" = "mortar-pestle".asInstanceOf["mortar-pestle"]
    
    inline def mosque: "mosque" = "mosque".asInstanceOf["mosque"]
    
    inline def mosquito: "mosquito" = "mosquito".asInstanceOf["mosquito"]
    
    inline def `mosquito-net`: "mosquito-net" = "mosquito-net".asInstanceOf["mosquito-net"]
    
    inline def motorcycle: "motorcycle" = "motorcycle".asInstanceOf["motorcycle"]
    
    inline def mound: "mound" = "mound".asInstanceOf["mound"]
    
    inline def mountain: "mountain" = "mountain".asInstanceOf["mountain"]
    
    inline def `mountain-city`: "mountain-city" = "mountain-city".asInstanceOf["mountain-city"]
    
    inline def `mountain-sun`: "mountain-sun" = "mountain-sun".asInstanceOf["mountain-sun"]
    
    inline def mountains: "mountains" = "mountains".asInstanceOf["mountains"]
    
    inline def mouse: "mouse" = "mouse".asInstanceOf["mouse"]
    
    inline def `mouse-alt`: "mouse-alt" = "mouse-alt".asInstanceOf["mouse-alt"]
    
    inline def `mouse-field`: "mouse-field" = "mouse-field".asInstanceOf["mouse-field"]
    
    inline def `mouse-pointer`: "mouse-pointer" = "mouse-pointer".asInstanceOf["mouse-pointer"]
    
    inline def `mp3-player`: "mp3-player" = "mp3-player".asInstanceOf["mp3-player"]
    
    inline def mug: "mug" = "mug".asInstanceOf["mug"]
    
    inline def `mug-hot`: "mug-hot" = "mug-hot".asInstanceOf["mug-hot"]
    
    inline def `mug-marshmallows`: "mug-marshmallows" = "mug-marshmallows".asInstanceOf["mug-marshmallows"]
    
    inline def `mug-saucer`: "mug-saucer" = "mug-saucer".asInstanceOf["mug-saucer"]
    
    inline def `mug-tea`: "mug-tea" = "mug-tea".asInstanceOf["mug-tea"]
    
    inline def `mug-tea-saucer`: "mug-tea-saucer" = "mug-tea-saucer".asInstanceOf["mug-tea-saucer"]
    
    inline def multiply: "multiply" = "multiply".asInstanceOf["multiply"]
    
    inline def museum: "museum" = "museum".asInstanceOf["museum"]
    
    inline def mushroom: "mushroom" = "mushroom".asInstanceOf["mushroom"]
    
    inline def music: "music" = "music".asInstanceOf["music"]
    
    inline def `music-alt`: "music-alt" = "music-alt".asInstanceOf["music-alt"]
    
    inline def `music-alt-slash`: "music-alt-slash" = "music-alt-slash".asInstanceOf["music-alt-slash"]
    
    inline def `music-note`: "music-note" = "music-note".asInstanceOf["music-note"]
    
    inline def `music-note-slash`: "music-note-slash" = "music-note-slash".asInstanceOf["music-note-slash"]
    
    inline def `music-slash`: "music-slash" = "music-slash".asInstanceOf["music-slash"]
    
    inline def mustache: "mustache" = "mustache".asInstanceOf["mustache"]
    
    inline def n: "n" = "n".asInstanceOf["n"]
    
    inline def `naira-sign`: "naira-sign" = "naira-sign".asInstanceOf["naira-sign"]
    
    inline def napster: "napster" = "napster".asInstanceOf["napster"]
    
    inline def narwhal: "narwhal" = "narwhal".asInstanceOf["narwhal"]
    
    inline def navicon: "navicon" = "navicon".asInstanceOf["navicon"]
    
    inline def neos: "neos" = "neos".asInstanceOf["neos"]
    
    inline def `nesting-dolls`: "nesting-dolls" = "nesting-dolls".asInstanceOf["nesting-dolls"]
    
    inline def `network-wired`: "network-wired" = "network-wired".asInstanceOf["network-wired"]
    
    inline def neuter: "neuter" = "neuter".asInstanceOf["neuter"]
    
    inline def newspaper: "newspaper" = "newspaper".asInstanceOf["newspaper"]
    
    inline def nfc: "nfc" = "nfc".asInstanceOf["nfc"]
    
    inline def `nfc-directional`: "nfc-directional" = "nfc-directional".asInstanceOf["nfc-directional"]
    
    inline def `nfc-lock`: "nfc-lock" = "nfc-lock".asInstanceOf["nfc-lock"]
    
    inline def `nfc-magnifying-glass`: "nfc-magnifying-glass" = "nfc-magnifying-glass".asInstanceOf["nfc-magnifying-glass"]
    
    inline def `nfc-pen`: "nfc-pen" = "nfc-pen".asInstanceOf["nfc-pen"]
    
    inline def `nfc-signal`: "nfc-signal" = "nfc-signal".asInstanceOf["nfc-signal"]
    
    inline def `nfc-slash`: "nfc-slash" = "nfc-slash".asInstanceOf["nfc-slash"]
    
    inline def `nfc-symbol`: "nfc-symbol" = "nfc-symbol".asInstanceOf["nfc-symbol"]
    
    inline def `nfc-trash`: "nfc-trash" = "nfc-trash".asInstanceOf["nfc-trash"]
    
    inline def nigiri: "nigiri" = "nigiri".asInstanceOf["nigiri"]
    
    inline def nimblr: "nimblr" = "nimblr".asInstanceOf["nimblr"]
    
    inline def node: "node" = "node".asInstanceOf["node"]
    
    inline def `node-js`: "node-js" = "node-js".asInstanceOf["node-js"]
    
    inline def nose: "nose" = "nose".asInstanceOf["nose"]
    
    inline def `not-equal`: "not-equal" = "not-equal".asInstanceOf["not-equal"]
    
    inline def notdef: "notdef" = "notdef".asInstanceOf["notdef"]
    
    inline def note: "note" = "note".asInstanceOf["note"]
    
    inline def `note-medical`: "note-medical" = "note-medical".asInstanceOf["note-medical"]
    
    inline def `note-sticky`: "note-sticky" = "note-sticky".asInstanceOf["note-sticky"]
    
    inline def notebook: "notebook" = "notebook".asInstanceOf["notebook"]
    
    inline def notes: "notes" = "notes".asInstanceOf["notes"]
    
    inline def `notes-medical`: "notes-medical" = "notes-medical".asInstanceOf["notes-medical"]
    
    inline def npm: "npm" = "npm".asInstanceOf["npm"]
    
    inline def ns8: "ns8" = "ns8".asInstanceOf["ns8"]
    
    inline def nutritionix: "nutritionix" = "nutritionix".asInstanceOf["nutritionix"]
    
    inline def o: "o" = "o".asInstanceOf["o"]
    
    inline def `object-exclude`: "object-exclude" = "object-exclude".asInstanceOf["object-exclude"]
    
    inline def `object-group`: "object-group" = "object-group".asInstanceOf["object-group"]
    
    inline def `object-intersect`: "object-intersect" = "object-intersect".asInstanceOf["object-intersect"]
    
    inline def `object-subtract`: "object-subtract" = "object-subtract".asInstanceOf["object-subtract"]
    
    inline def `object-ungroup`: "object-ungroup" = "object-ungroup".asInstanceOf["object-ungroup"]
    
    inline def `object-union`: "object-union" = "object-union".asInstanceOf["object-union"]
    
    inline def `objects-align-bottom`: "objects-align-bottom" = "objects-align-bottom".asInstanceOf["objects-align-bottom"]
    
    inline def `objects-align-center-horizontal`: "objects-align-center-horizontal" = "objects-align-center-horizontal".asInstanceOf["objects-align-center-horizontal"]
    
    inline def `objects-align-center-vertical`: "objects-align-center-vertical" = "objects-align-center-vertical".asInstanceOf["objects-align-center-vertical"]
    
    inline def `objects-align-left`: "objects-align-left" = "objects-align-left".asInstanceOf["objects-align-left"]
    
    inline def `objects-align-right`: "objects-align-right" = "objects-align-right".asInstanceOf["objects-align-right"]
    
    inline def `objects-align-top`: "objects-align-top" = "objects-align-top".asInstanceOf["objects-align-top"]
    
    inline def `objects-column`: "objects-column" = "objects-column".asInstanceOf["objects-column"]
    
    inline def octagon: "octagon" = "octagon".asInstanceOf["octagon"]
    
    inline def `octagon-check`: "octagon-check" = "octagon-check".asInstanceOf["octagon-check"]
    
    inline def `octagon-divide`: "octagon-divide" = "octagon-divide".asInstanceOf["octagon-divide"]
    
    inline def `octagon-exclamation`: "octagon-exclamation" = "octagon-exclamation".asInstanceOf["octagon-exclamation"]
    
    inline def `octagon-minus`: "octagon-minus" = "octagon-minus".asInstanceOf["octagon-minus"]
    
    inline def `octagon-plus`: "octagon-plus" = "octagon-plus".asInstanceOf["octagon-plus"]
    
    inline def `octagon-xmark`: "octagon-xmark" = "octagon-xmark".asInstanceOf["octagon-xmark"]
    
    inline def `octopus-deploy`: "octopus-deploy" = "octopus-deploy".asInstanceOf["octopus-deploy"]
    
    inline def odnoklassniki: "odnoklassniki" = "odnoklassniki".asInstanceOf["odnoklassniki"]
    
    inline def `odnoklassniki-square`: "odnoklassniki-square" = "odnoklassniki-square".asInstanceOf["odnoklassniki-square"]
    
    inline def odysee: "odysee" = "odysee".asInstanceOf["odysee"]
    
    inline def `oil-can`: "oil-can" = "oil-can".asInstanceOf["oil-can"]
    
    inline def `oil-can-drip`: "oil-can-drip" = "oil-can-drip".asInstanceOf["oil-can-drip"]
    
    inline def `oil-temp`: "oil-temp" = "oil-temp".asInstanceOf["oil-temp"]
    
    inline def `oil-temperature`: "oil-temperature" = "oil-temperature".asInstanceOf["oil-temperature"]
    
    inline def `oil-well`: "oil-well" = "oil-well".asInstanceOf["oil-well"]
    
    inline def `old-republic`: "old-republic" = "old-republic".asInstanceOf["old-republic"]
    
    inline def olive: "olive" = "olive".asInstanceOf["olive"]
    
    inline def `olive-branch`: "olive-branch" = "olive-branch".asInstanceOf["olive-branch"]
    
    inline def om: "om" = "om".asInstanceOf["om"]
    
    inline def omega: "omega" = "omega".asInstanceOf["omega"]
    
    inline def onion: "onion" = "onion".asInstanceOf["onion"]
    
    inline def opencart: "opencart" = "opencart".asInstanceOf["opencart"]
    
    inline def openid: "openid" = "openid".asInstanceOf["openid"]
    
    inline def opera: "opera" = "opera".asInstanceOf["opera"]
    
    inline def `optin-monster`: "optin-monster" = "optin-monster".asInstanceOf["optin-monster"]
    
    inline def option: "option" = "option".asInstanceOf["option"]
    
    inline def orcid: "orcid" = "orcid".asInstanceOf["orcid"]
    
    inline def ornament: "ornament" = "ornament".asInstanceOf["ornament"]
    
    inline def osi: "osi" = "osi".asInstanceOf["osi"]
    
    inline def otter: "otter" = "otter".asInstanceOf["otter"]
    
    inline def outdent: "outdent" = "outdent".asInstanceOf["outdent"]
    
    inline def outlet: "outlet" = "outlet".asInstanceOf["outlet"]
    
    inline def oven: "oven" = "oven".asInstanceOf["oven"]
    
    inline def overline: "overline" = "overline".asInstanceOf["overline"]
    
    inline def p: "p" = "p".asInstanceOf["p"]
    
    inline def padlet: "padlet" = "padlet".asInstanceOf["padlet"]
    
    inline def page: "page" = "page".asInstanceOf["page"]
    
    inline def `page-break`: "page-break" = "page-break".asInstanceOf["page-break"]
    
    inline def `page-caret-down`: "page-caret-down" = "page-caret-down".asInstanceOf["page-caret-down"]
    
    inline def `page-caret-up`: "page-caret-up" = "page-caret-up".asInstanceOf["page-caret-up"]
    
    inline def page4: "page4" = "page4".asInstanceOf["page4"]
    
    inline def pagelines: "pagelines" = "pagelines".asInstanceOf["pagelines"]
    
    inline def pager: "pager" = "pager".asInstanceOf["pager"]
    
    inline def `paint-brush`: "paint-brush" = "paint-brush".asInstanceOf["paint-brush"]
    
    inline def `paint-brush-alt`: "paint-brush-alt" = "paint-brush-alt".asInstanceOf["paint-brush-alt"]
    
    inline def `paint-brush-fine`: "paint-brush-fine" = "paint-brush-fine".asInstanceOf["paint-brush-fine"]
    
    inline def `paint-roller`: "paint-roller" = "paint-roller".asInstanceOf["paint-roller"]
    
    inline def paintbrush: "paintbrush" = "paintbrush".asInstanceOf["paintbrush"]
    
    inline def `paintbrush-alt`: "paintbrush-alt" = "paintbrush-alt".asInstanceOf["paintbrush-alt"]
    
    inline def `paintbrush-fine`: "paintbrush-fine" = "paintbrush-fine".asInstanceOf["paintbrush-fine"]
    
    inline def `paintbrush-pencil`: "paintbrush-pencil" = "paintbrush-pencil".asInstanceOf["paintbrush-pencil"]
    
    inline def palette: "palette" = "palette".asInstanceOf["palette"]
    
    inline def `palette-boxes`: "palette-boxes" = "palette-boxes".asInstanceOf["palette-boxes"]
    
    inline def palfed: "palfed" = "palfed".asInstanceOf["palfed"]
    
    inline def pallet: "pallet" = "pallet".asInstanceOf["pallet"]
    
    inline def `pallet-alt`: "pallet-alt" = "pallet-alt".asInstanceOf["pallet-alt"]
    
    inline def `pallet-box`: "pallet-box" = "pallet-box".asInstanceOf["pallet-box"]
    
    inline def `pallet-boxes`: "pallet-boxes" = "pallet-boxes".asInstanceOf["pallet-boxes"]
    
    inline def `pan-food`: "pan-food" = "pan-food".asInstanceOf["pan-food"]
    
    inline def `pan-frying`: "pan-frying" = "pan-frying".asInstanceOf["pan-frying"]
    
    inline def pancakes: "pancakes" = "pancakes".asInstanceOf["pancakes"]
    
    inline def `panel-ews`: "panel-ews" = "panel-ews".asInstanceOf["panel-ews"]
    
    inline def `panel-fire`: "panel-fire" = "panel-fire".asInstanceOf["panel-fire"]
    
    inline def panorama: "panorama" = "panorama".asInstanceOf["panorama"]
    
    inline def `paper-plane`: "paper-plane" = "paper-plane".asInstanceOf["paper-plane"]
    
    inline def `paper-plane-alt`: "paper-plane-alt" = "paper-plane-alt".asInstanceOf["paper-plane-alt"]
    
    inline def `paper-plane-top`: "paper-plane-top" = "paper-plane-top".asInstanceOf["paper-plane-top"]
    
    inline def paperclip: "paperclip" = "paperclip".asInstanceOf["paperclip"]
    
    inline def `paperclip-vertical`: "paperclip-vertical" = "paperclip-vertical".asInstanceOf["paperclip-vertical"]
    
    inline def `parachute-box`: "parachute-box" = "parachute-box".asInstanceOf["parachute-box"]
    
    inline def paragraph: "paragraph" = "paragraph".asInstanceOf["paragraph"]
    
    inline def `paragraph-left`: "paragraph-left" = "paragraph-left".asInstanceOf["paragraph-left"]
    
    inline def `paragraph-rtl`: "paragraph-rtl" = "paragraph-rtl".asInstanceOf["paragraph-rtl"]
    
    inline def parentheses: "parentheses" = "parentheses".asInstanceOf["parentheses"]
    
    inline def parenthesis: "parenthesis" = "parenthesis".asInstanceOf["parenthesis"]
    
    inline def parking: "parking" = "parking".asInstanceOf["parking"]
    
    inline def `parking-circle`: "parking-circle" = "parking-circle".asInstanceOf["parking-circle"]
    
    inline def `parking-circle-slash`: "parking-circle-slash" = "parking-circle-slash".asInstanceOf["parking-circle-slash"]
    
    inline def `parking-slash`: "parking-slash" = "parking-slash".asInstanceOf["parking-slash"]
    
    inline def `party-back`: "party-back" = "party-back".asInstanceOf["party-back"]
    
    inline def `party-bell`: "party-bell" = "party-bell".asInstanceOf["party-bell"]
    
    inline def `party-horn`: "party-horn" = "party-horn".asInstanceOf["party-horn"]
    
    inline def passport: "passport" = "passport".asInstanceOf["passport"]
    
    inline def pastafarianism: "pastafarianism" = "pastafarianism".asInstanceOf["pastafarianism"]
    
    inline def paste: "paste" = "paste".asInstanceOf["paste"]
    
    inline def patreon: "patreon" = "patreon".asInstanceOf["patreon"]
    
    inline def pause: "pause" = "pause".asInstanceOf["pause"]
    
    inline def `pause-circle`: "pause-circle" = "pause-circle".asInstanceOf["pause-circle"]
    
    inline def paw: "paw" = "paw".asInstanceOf["paw"]
    
    inline def `paw-alt`: "paw-alt" = "paw-alt".asInstanceOf["paw-alt"]
    
    inline def `paw-claws`: "paw-claws" = "paw-claws".asInstanceOf["paw-claws"]
    
    inline def `paw-simple`: "paw-simple" = "paw-simple".asInstanceOf["paw-simple"]
    
    inline def paypal: "paypal" = "paypal".asInstanceOf["paypal"]
    
    inline def peace: "peace" = "peace".asInstanceOf["peace"]
    
    inline def peach: "peach" = "peach".asInstanceOf["peach"]
    
    inline def peanut: "peanut" = "peanut".asInstanceOf["peanut"]
    
    inline def peanuts: "peanuts" = "peanuts".asInstanceOf["peanuts"]
    
    inline def peapod: "peapod" = "peapod".asInstanceOf["peapod"]
    
    inline def pear: "pear" = "pear".asInstanceOf["pear"]
    
    inline def pedestal: "pedestal" = "pedestal".asInstanceOf["pedestal"]
    
    inline def pegasus: "pegasus" = "pegasus".asInstanceOf["pegasus"]
    
    inline def pen: "pen" = "pen".asInstanceOf["pen"]
    
    inline def `pen-alt`: "pen-alt" = "pen-alt".asInstanceOf["pen-alt"]
    
    inline def `pen-alt-slash`: "pen-alt-slash" = "pen-alt-slash".asInstanceOf["pen-alt-slash"]
    
    inline def `pen-circle`: "pen-circle" = "pen-circle".asInstanceOf["pen-circle"]
    
    inline def `pen-clip`: "pen-clip" = "pen-clip".asInstanceOf["pen-clip"]
    
    inline def `pen-clip-slash`: "pen-clip-slash" = "pen-clip-slash".asInstanceOf["pen-clip-slash"]
    
    inline def `pen-fancy`: "pen-fancy" = "pen-fancy".asInstanceOf["pen-fancy"]
    
    inline def `pen-fancy-slash`: "pen-fancy-slash" = "pen-fancy-slash".asInstanceOf["pen-fancy-slash"]
    
    inline def `pen-field`: "pen-field" = "pen-field".asInstanceOf["pen-field"]
    
    inline def `pen-line`: "pen-line" = "pen-line".asInstanceOf["pen-line"]
    
    inline def `pen-nib`: "pen-nib" = "pen-nib".asInstanceOf["pen-nib"]
    
    inline def `pen-nib-slash`: "pen-nib-slash" = "pen-nib-slash".asInstanceOf["pen-nib-slash"]
    
    inline def `pen-paintbrush`: "pen-paintbrush" = "pen-paintbrush".asInstanceOf["pen-paintbrush"]
    
    inline def `pen-ruler`: "pen-ruler" = "pen-ruler".asInstanceOf["pen-ruler"]
    
    inline def `pen-slash`: "pen-slash" = "pen-slash".asInstanceOf["pen-slash"]
    
    inline def `pen-square`: "pen-square" = "pen-square".asInstanceOf["pen-square"]
    
    inline def `pen-swirl`: "pen-swirl" = "pen-swirl".asInstanceOf["pen-swirl"]
    
    inline def `pen-to-square`: "pen-to-square" = "pen-to-square".asInstanceOf["pen-to-square"]
    
    inline def pencil: "pencil" = "pencil".asInstanceOf["pencil"]
    
    inline def `pencil-alt`: "pencil-alt" = "pencil-alt".asInstanceOf["pencil-alt"]
    
    inline def `pencil-paintbrush`: "pencil-paintbrush" = "pencil-paintbrush".asInstanceOf["pencil-paintbrush"]
    
    inline def `pencil-ruler`: "pencil-ruler" = "pencil-ruler".asInstanceOf["pencil-ruler"]
    
    inline def `pencil-slash`: "pencil-slash" = "pencil-slash".asInstanceOf["pencil-slash"]
    
    inline def `pencil-square`: "pencil-square" = "pencil-square".asInstanceOf["pencil-square"]
    
    inline def pennant: "pennant" = "pennant".asInstanceOf["pennant"]
    
    inline def people: "people" = "people".asInstanceOf["people"]
    
    inline def `people-arrows`: "people-arrows" = "people-arrows".asInstanceOf["people-arrows"]
    
    inline def `people-arrows-left-right`: "people-arrows-left-right" = "people-arrows-left-right".asInstanceOf["people-arrows-left-right"]
    
    inline def `people-carry`: "people-carry" = "people-carry".asInstanceOf["people-carry"]
    
    inline def `people-carry-box`: "people-carry-box" = "people-carry-box".asInstanceOf["people-carry-box"]
    
    inline def `people-dress`: "people-dress" = "people-dress".asInstanceOf["people-dress"]
    
    inline def `people-dress-simple`: "people-dress-simple" = "people-dress-simple".asInstanceOf["people-dress-simple"]
    
    inline def `people-group`: "people-group" = "people-group".asInstanceOf["people-group"]
    
    inline def `people-line`: "people-line" = "people-line".asInstanceOf["people-line"]
    
    inline def `people-pants`: "people-pants" = "people-pants".asInstanceOf["people-pants"]
    
    inline def `people-pants-simple`: "people-pants-simple" = "people-pants-simple".asInstanceOf["people-pants-simple"]
    
    inline def `people-pulling`: "people-pulling" = "people-pulling".asInstanceOf["people-pulling"]
    
    inline def `people-robbery`: "people-robbery" = "people-robbery".asInstanceOf["people-robbery"]
    
    inline def `people-roof`: "people-roof" = "people-roof".asInstanceOf["people-roof"]
    
    inline def `people-simple`: "people-simple" = "people-simple".asInstanceOf["people-simple"]
    
    inline def pepper: "pepper" = "pepper".asInstanceOf["pepper"]
    
    inline def `pepper-hot`: "pepper-hot" = "pepper-hot".asInstanceOf["pepper-hot"]
    
    inline def perbyte: "perbyte" = "perbyte".asInstanceOf["perbyte"]
    
    inline def percent: "percent" = "percent".asInstanceOf["percent"]
    
    inline def percentage: "percentage" = "percentage".asInstanceOf["percentage"]
    
    inline def period: "period" = "period".asInstanceOf["period"]
    
    inline def periscope: "periscope" = "periscope".asInstanceOf["periscope"]
    
    inline def person: "person" = "person".asInstanceOf["person"]
    
    inline def `person-arrow-down-to-line`: "person-arrow-down-to-line" = "person-arrow-down-to-line".asInstanceOf["person-arrow-down-to-line"]
    
    inline def `person-arrow-up-from-line`: "person-arrow-up-from-line" = "person-arrow-up-from-line".asInstanceOf["person-arrow-up-from-line"]
    
    inline def `person-biking`: "person-biking" = "person-biking".asInstanceOf["person-biking"]
    
    inline def `person-biking-mountain`: "person-biking-mountain" = "person-biking-mountain".asInstanceOf["person-biking-mountain"]
    
    inline def `person-booth`: "person-booth" = "person-booth".asInstanceOf["person-booth"]
    
    inline def `person-breastfeeding`: "person-breastfeeding" = "person-breastfeeding".asInstanceOf["person-breastfeeding"]
    
    inline def `person-burst`: "person-burst" = "person-burst".asInstanceOf["person-burst"]
    
    inline def `person-cane`: "person-cane" = "person-cane".asInstanceOf["person-cane"]
    
    inline def `person-carry`: "person-carry" = "person-carry".asInstanceOf["person-carry"]
    
    inline def `person-carry-box`: "person-carry-box" = "person-carry-box".asInstanceOf["person-carry-box"]
    
    inline def `person-chalkboard`: "person-chalkboard" = "person-chalkboard".asInstanceOf["person-chalkboard"]
    
    inline def `person-circle-check`: "person-circle-check" = "person-circle-check".asInstanceOf["person-circle-check"]
    
    inline def `person-circle-exclamation`: "person-circle-exclamation" = "person-circle-exclamation".asInstanceOf["person-circle-exclamation"]
    
    inline def `person-circle-minus`: "person-circle-minus" = "person-circle-minus".asInstanceOf["person-circle-minus"]
    
    inline def `person-circle-plus`: "person-circle-plus" = "person-circle-plus".asInstanceOf["person-circle-plus"]
    
    inline def `person-circle-question`: "person-circle-question" = "person-circle-question".asInstanceOf["person-circle-question"]
    
    inline def `person-circle-xmark`: "person-circle-xmark" = "person-circle-xmark".asInstanceOf["person-circle-xmark"]
    
    inline def `person-digging`: "person-digging" = "person-digging".asInstanceOf["person-digging"]
    
    inline def `person-dolly`: "person-dolly" = "person-dolly".asInstanceOf["person-dolly"]
    
    inline def `person-dolly-empty`: "person-dolly-empty" = "person-dolly-empty".asInstanceOf["person-dolly-empty"]
    
    inline def `person-dots-from-line`: "person-dots-from-line" = "person-dots-from-line".asInstanceOf["person-dots-from-line"]
    
    inline def `person-dress`: "person-dress" = "person-dress".asInstanceOf["person-dress"]
    
    inline def `person-dress-burst`: "person-dress-burst" = "person-dress-burst".asInstanceOf["person-dress-burst"]
    
    inline def `person-dress-simple`: "person-dress-simple" = "person-dress-simple".asInstanceOf["person-dress-simple"]
    
    inline def `person-drowning`: "person-drowning" = "person-drowning".asInstanceOf["person-drowning"]
    
    inline def `person-falling`: "person-falling" = "person-falling".asInstanceOf["person-falling"]
    
    inline def `person-falling-burst`: "person-falling-burst" = "person-falling-burst".asInstanceOf["person-falling-burst"]
    
    inline def `person-from-portal`: "person-from-portal" = "person-from-portal".asInstanceOf["person-from-portal"]
    
    inline def `person-half-dress`: "person-half-dress" = "person-half-dress".asInstanceOf["person-half-dress"]
    
    inline def `person-harassing`: "person-harassing" = "person-harassing".asInstanceOf["person-harassing"]
    
    inline def `person-hiking`: "person-hiking" = "person-hiking".asInstanceOf["person-hiking"]
    
    inline def `person-military-pointing`: "person-military-pointing" = "person-military-pointing".asInstanceOf["person-military-pointing"]
    
    inline def `person-military-rifle`: "person-military-rifle" = "person-military-rifle".asInstanceOf["person-military-rifle"]
    
    inline def `person-military-to-person`: "person-military-to-person" = "person-military-to-person".asInstanceOf["person-military-to-person"]
    
    inline def `person-pinball`: "person-pinball" = "person-pinball".asInstanceOf["person-pinball"]
    
    inline def `person-praying`: "person-praying" = "person-praying".asInstanceOf["person-praying"]
    
    inline def `person-pregnant`: "person-pregnant" = "person-pregnant".asInstanceOf["person-pregnant"]
    
    inline def `person-rays`: "person-rays" = "person-rays".asInstanceOf["person-rays"]
    
    inline def `person-rifle`: "person-rifle" = "person-rifle".asInstanceOf["person-rifle"]
    
    inline def `person-running`: "person-running" = "person-running".asInstanceOf["person-running"]
    
    inline def `person-seat`: "person-seat" = "person-seat".asInstanceOf["person-seat"]
    
    inline def `person-seat-reclined`: "person-seat-reclined" = "person-seat-reclined".asInstanceOf["person-seat-reclined"]
    
    inline def `person-shelter`: "person-shelter" = "person-shelter".asInstanceOf["person-shelter"]
    
    inline def `person-sign`: "person-sign" = "person-sign".asInstanceOf["person-sign"]
    
    inline def `person-simple`: "person-simple" = "person-simple".asInstanceOf["person-simple"]
    
    inline def `person-skating`: "person-skating" = "person-skating".asInstanceOf["person-skating"]
    
    inline def `person-ski-jumping`: "person-ski-jumping" = "person-ski-jumping".asInstanceOf["person-ski-jumping"]
    
    inline def `person-ski-lift`: "person-ski-lift" = "person-ski-lift".asInstanceOf["person-ski-lift"]
    
    inline def `person-skiing`: "person-skiing" = "person-skiing".asInstanceOf["person-skiing"]
    
    inline def `person-skiing-nordic`: "person-skiing-nordic" = "person-skiing-nordic".asInstanceOf["person-skiing-nordic"]
    
    inline def `person-sledding`: "person-sledding" = "person-sledding".asInstanceOf["person-sledding"]
    
    inline def `person-snowboarding`: "person-snowboarding" = "person-snowboarding".asInstanceOf["person-snowboarding"]
    
    inline def `person-snowmobiling`: "person-snowmobiling" = "person-snowmobiling".asInstanceOf["person-snowmobiling"]
    
    inline def `person-swimming`: "person-swimming" = "person-swimming".asInstanceOf["person-swimming"]
    
    inline def `person-through-window`: "person-through-window" = "person-through-window".asInstanceOf["person-through-window"]
    
    inline def `person-to-door`: "person-to-door" = "person-to-door".asInstanceOf["person-to-door"]
    
    inline def `person-to-portal`: "person-to-portal" = "person-to-portal".asInstanceOf["person-to-portal"]
    
    inline def `person-walking`: "person-walking" = "person-walking".asInstanceOf["person-walking"]
    
    inline def `person-walking-arrow-loop-left`: "person-walking-arrow-loop-left" = "person-walking-arrow-loop-left".asInstanceOf["person-walking-arrow-loop-left"]
    
    inline def `person-walking-arrow-right`: "person-walking-arrow-right" = "person-walking-arrow-right".asInstanceOf["person-walking-arrow-right"]
    
    inline def `person-walking-dashed-line-arrow-right`: "person-walking-dashed-line-arrow-right" = "person-walking-dashed-line-arrow-right".asInstanceOf["person-walking-dashed-line-arrow-right"]
    
    inline def `person-walking-luggage`: "person-walking-luggage" = "person-walking-luggage".asInstanceOf["person-walking-luggage"]
    
    inline def `person-walking-with-cane`: "person-walking-with-cane" = "person-walking-with-cane".asInstanceOf["person-walking-with-cane"]
    
    inline def `peseta-sign`: "peseta-sign" = "peseta-sign".asInstanceOf["peseta-sign"]
    
    inline def `peso-sign`: "peso-sign" = "peso-sign".asInstanceOf["peso-sign"]
    
    inline def phabricator: "phabricator" = "phabricator".asInstanceOf["phabricator"]
    
    inline def `phoenix-framework`: "phoenix-framework" = "phoenix-framework".asInstanceOf["phoenix-framework"]
    
    inline def `phoenix-squadron`: "phoenix-squadron" = "phoenix-squadron".asInstanceOf["phoenix-squadron"]
    
    inline def phone: "phone" = "phone".asInstanceOf["phone"]
    
    inline def `phone-alt`: "phone-alt" = "phone-alt".asInstanceOf["phone-alt"]
    
    inline def `phone-arrow-down`: "phone-arrow-down" = "phone-arrow-down".asInstanceOf["phone-arrow-down"]
    
    inline def `phone-arrow-down-left`: "phone-arrow-down-left" = "phone-arrow-down-left".asInstanceOf["phone-arrow-down-left"]
    
    inline def `phone-arrow-right`: "phone-arrow-right" = "phone-arrow-right".asInstanceOf["phone-arrow-right"]
    
    inline def `phone-arrow-up`: "phone-arrow-up" = "phone-arrow-up".asInstanceOf["phone-arrow-up"]
    
    inline def `phone-arrow-up-right`: "phone-arrow-up-right" = "phone-arrow-up-right".asInstanceOf["phone-arrow-up-right"]
    
    inline def `phone-circle`: "phone-circle" = "phone-circle".asInstanceOf["phone-circle"]
    
    inline def `phone-circle-alt`: "phone-circle-alt" = "phone-circle-alt".asInstanceOf["phone-circle-alt"]
    
    inline def `phone-circle-down`: "phone-circle-down" = "phone-circle-down".asInstanceOf["phone-circle-down"]
    
    inline def `phone-flip`: "phone-flip" = "phone-flip".asInstanceOf["phone-flip"]
    
    inline def `phone-hangup`: "phone-hangup" = "phone-hangup".asInstanceOf["phone-hangup"]
    
    inline def `phone-incoming`: "phone-incoming" = "phone-incoming".asInstanceOf["phone-incoming"]
    
    inline def `phone-intercom`: "phone-intercom" = "phone-intercom".asInstanceOf["phone-intercom"]
    
    inline def `phone-laptop`: "phone-laptop" = "phone-laptop".asInstanceOf["phone-laptop"]
    
    inline def `phone-missed`: "phone-missed" = "phone-missed".asInstanceOf["phone-missed"]
    
    inline def `phone-office`: "phone-office" = "phone-office".asInstanceOf["phone-office"]
    
    inline def `phone-outgoing`: "phone-outgoing" = "phone-outgoing".asInstanceOf["phone-outgoing"]
    
    inline def `phone-plus`: "phone-plus" = "phone-plus".asInstanceOf["phone-plus"]
    
    inline def `phone-rotary`: "phone-rotary" = "phone-rotary".asInstanceOf["phone-rotary"]
    
    inline def `phone-slash`: "phone-slash" = "phone-slash".asInstanceOf["phone-slash"]
    
    inline def `phone-square`: "phone-square" = "phone-square".asInstanceOf["phone-square"]
    
    inline def `phone-square-alt`: "phone-square-alt" = "phone-square-alt".asInstanceOf["phone-square-alt"]
    
    inline def `phone-square-down`: "phone-square-down" = "phone-square-down".asInstanceOf["phone-square-down"]
    
    inline def `phone-volume`: "phone-volume" = "phone-volume".asInstanceOf["phone-volume"]
    
    inline def `phone-xmark`: "phone-xmark" = "phone-xmark".asInstanceOf["phone-xmark"]
    
    inline def `photo-film`: "photo-film" = "photo-film".asInstanceOf["photo-film"]
    
    inline def `photo-film-music`: "photo-film-music" = "photo-film-music".asInstanceOf["photo-film-music"]
    
    inline def `photo-video`: "photo-video" = "photo-video".asInstanceOf["photo-video"]
    
    inline def php: "php" = "php".asInstanceOf["php"]
    
    inline def pi: "pi" = "pi".asInstanceOf["pi"]
    
    inline def piano: "piano" = "piano".asInstanceOf["piano"]
    
    inline def `piano-keyboard`: "piano-keyboard" = "piano-keyboard".asInstanceOf["piano-keyboard"]
    
    inline def pickaxe: "pickaxe" = "pickaxe".asInstanceOf["pickaxe"]
    
    inline def pickleball: "pickleball" = "pickleball".asInstanceOf["pickleball"]
    
    inline def pie: "pie" = "pie".asInstanceOf["pie"]
    
    inline def `pie-chart`: "pie-chart" = "pie-chart".asInstanceOf["pie-chart"]
    
    inline def `pied-piper`: "pied-piper" = "pied-piper".asInstanceOf["pied-piper"]
    
    inline def `pied-piper-alt`: "pied-piper-alt" = "pied-piper-alt".asInstanceOf["pied-piper-alt"]
    
    inline def `pied-piper-hat`: "pied-piper-hat" = "pied-piper-hat".asInstanceOf["pied-piper-hat"]
    
    inline def `pied-piper-pp`: "pied-piper-pp" = "pied-piper-pp".asInstanceOf["pied-piper-pp"]
    
    inline def `pied-piper-square`: "pied-piper-square" = "pied-piper-square".asInstanceOf["pied-piper-square"]
    
    inline def pig: "pig" = "pig".asInstanceOf["pig"]
    
    inline def `piggy-bank`: "piggy-bank" = "piggy-bank".asInstanceOf["piggy-bank"]
    
    inline def pills: "pills" = "pills".asInstanceOf["pills"]
    
    inline def pinata: "pinata" = "pinata".asInstanceOf["pinata"]
    
    inline def pinball: "pinball" = "pinball".asInstanceOf["pinball"]
    
    inline def pineapple: "pineapple" = "pineapple".asInstanceOf["pineapple"]
    
    inline def `ping-pong-paddle-ball`: "ping-pong-paddle-ball" = "ping-pong-paddle-ball".asInstanceOf["ping-pong-paddle-ball"]
    
    inline def pinterest: "pinterest" = "pinterest".asInstanceOf["pinterest"]
    
    inline def `pinterest-p`: "pinterest-p" = "pinterest-p".asInstanceOf["pinterest-p"]
    
    inline def `pinterest-square`: "pinterest-square" = "pinterest-square".asInstanceOf["pinterest-square"]
    
    inline def pipe: "pipe" = "pipe".asInstanceOf["pipe"]
    
    inline def `pipe-circle-check`: "pipe-circle-check" = "pipe-circle-check".asInstanceOf["pipe-circle-check"]
    
    inline def `pipe-collar`: "pipe-collar" = "pipe-collar".asInstanceOf["pipe-collar"]
    
    inline def `pipe-section`: "pipe-section" = "pipe-section".asInstanceOf["pipe-section"]
    
    inline def `pipe-smoking`: "pipe-smoking" = "pipe-smoking".asInstanceOf["pipe-smoking"]
    
    inline def `pipe-valve`: "pipe-valve" = "pipe-valve".asInstanceOf["pipe-valve"]
    
    inline def pix: "pix" = "pix".asInstanceOf["pix"]
    
    inline def pizza: "pizza" = "pizza".asInstanceOf["pizza"]
    
    inline def `pizza-slice`: "pizza-slice" = "pizza-slice".asInstanceOf["pizza-slice"]
    
    inline def `place-of-worship`: "place-of-worship" = "place-of-worship".asInstanceOf["place-of-worship"]
    
    inline def plane: "plane" = "plane".asInstanceOf["plane"]
    
    inline def `plane-alt`: "plane-alt" = "plane-alt".asInstanceOf["plane-alt"]
    
    inline def `plane-arrival`: "plane-arrival" = "plane-arrival".asInstanceOf["plane-arrival"]
    
    inline def `plane-circle-check`: "plane-circle-check" = "plane-circle-check".asInstanceOf["plane-circle-check"]
    
    inline def `plane-circle-exclamation`: "plane-circle-exclamation" = "plane-circle-exclamation".asInstanceOf["plane-circle-exclamation"]
    
    inline def `plane-circle-xmark`: "plane-circle-xmark" = "plane-circle-xmark".asInstanceOf["plane-circle-xmark"]
    
    inline def `plane-departure`: "plane-departure" = "plane-departure".asInstanceOf["plane-departure"]
    
    inline def `plane-engines`: "plane-engines" = "plane-engines".asInstanceOf["plane-engines"]
    
    inline def `plane-lock`: "plane-lock" = "plane-lock".asInstanceOf["plane-lock"]
    
    inline def `plane-prop`: "plane-prop" = "plane-prop".asInstanceOf["plane-prop"]
    
    inline def `plane-slash`: "plane-slash" = "plane-slash".asInstanceOf["plane-slash"]
    
    inline def `plane-tail`: "plane-tail" = "plane-tail".asInstanceOf["plane-tail"]
    
    inline def `plane-up`: "plane-up" = "plane-up".asInstanceOf["plane-up"]
    
    inline def `plane-up-slash`: "plane-up-slash" = "plane-up-slash".asInstanceOf["plane-up-slash"]
    
    inline def `planet-moon`: "planet-moon" = "planet-moon".asInstanceOf["planet-moon"]
    
    inline def `planet-ringed`: "planet-ringed" = "planet-ringed".asInstanceOf["planet-ringed"]
    
    inline def `plant-wilt`: "plant-wilt" = "plant-wilt".asInstanceOf["plant-wilt"]
    
    inline def `plate-utensils`: "plate-utensils" = "plate-utensils".asInstanceOf["plate-utensils"]
    
    inline def `plate-wheat`: "plate-wheat" = "plate-wheat".asInstanceOf["plate-wheat"]
    
    inline def play: "play" = "play".asInstanceOf["play"]
    
    inline def `play-circle`: "play-circle" = "play-circle".asInstanceOf["play-circle"]
    
    inline def `play-pause`: "play-pause" = "play-pause".asInstanceOf["play-pause"]
    
    inline def playstation: "playstation" = "playstation".asInstanceOf["playstation"]
    
    inline def plug: "plug" = "plug".asInstanceOf["plug"]
    
    inline def `plug-circle-bolt`: "plug-circle-bolt" = "plug-circle-bolt".asInstanceOf["plug-circle-bolt"]
    
    inline def `plug-circle-check`: "plug-circle-check" = "plug-circle-check".asInstanceOf["plug-circle-check"]
    
    inline def `plug-circle-exclamation`: "plug-circle-exclamation" = "plug-circle-exclamation".asInstanceOf["plug-circle-exclamation"]
    
    inline def `plug-circle-minus`: "plug-circle-minus" = "plug-circle-minus".asInstanceOf["plug-circle-minus"]
    
    inline def `plug-circle-plus`: "plug-circle-plus" = "plug-circle-plus".asInstanceOf["plug-circle-plus"]
    
    inline def `plug-circle-xmark`: "plug-circle-xmark" = "plug-circle-xmark".asInstanceOf["plug-circle-xmark"]
    
    inline def plus: "plus" = "plus".asInstanceOf["plus"]
    
    inline def `plus-circle`: "plus-circle" = "plus-circle".asInstanceOf["plus-circle"]
    
    inline def `plus-hexagon`: "plus-hexagon" = "plus-hexagon".asInstanceOf["plus-hexagon"]
    
    inline def `plus-large`: "plus-large" = "plus-large".asInstanceOf["plus-large"]
    
    inline def `plus-minus`: "plus-minus" = "plus-minus".asInstanceOf["plus-minus"]
    
    inline def `plus-octagon`: "plus-octagon" = "plus-octagon".asInstanceOf["plus-octagon"]
    
    inline def `plus-square`: "plus-square" = "plus-square".asInstanceOf["plus-square"]
    
    inline def podcast: "podcast" = "podcast".asInstanceOf["podcast"]
    
    inline def podium: "podium" = "podium".asInstanceOf["podium"]
    
    inline def `podium-star`: "podium-star" = "podium-star".asInstanceOf["podium-star"]
    
    inline def `police-box`: "police-box" = "police-box".asInstanceOf["police-box"]
    
    inline def poll: "poll" = "poll".asInstanceOf["poll"]
    
    inline def `poll-h`: "poll-h" = "poll-h".asInstanceOf["poll-h"]
    
    inline def `poll-people`: "poll-people" = "poll-people".asInstanceOf["poll-people"]
    
    inline def pompebled: "pompebled" = "pompebled".asInstanceOf["pompebled"]
    
    inline def poo: "poo" = "poo".asInstanceOf["poo"]
    
    inline def `poo-bolt`: "poo-bolt" = "poo-bolt".asInstanceOf["poo-bolt"]
    
    inline def `poo-storm`: "poo-storm" = "poo-storm".asInstanceOf["poo-storm"]
    
    inline def `pool-8-ball`: "pool-8-ball" = "pool-8-ball".asInstanceOf["pool-8-ball"]
    
    inline def poop: "poop" = "poop".asInstanceOf["poop"]
    
    inline def popcorn: "popcorn" = "popcorn".asInstanceOf["popcorn"]
    
    inline def popsicle: "popsicle" = "popsicle".asInstanceOf["popsicle"]
    
    inline def `portal-enter`: "portal-enter" = "portal-enter".asInstanceOf["portal-enter"]
    
    inline def `portal-exit`: "portal-exit" = "portal-exit".asInstanceOf["portal-exit"]
    
    inline def portrait: "portrait" = "portrait".asInstanceOf["portrait"]
    
    inline def `pot-food`: "pot-food" = "pot-food".asInstanceOf["pot-food"]
    
    inline def potato: "potato" = "potato".asInstanceOf["potato"]
    
    inline def `pound-sign`: "pound-sign" = "pound-sign".asInstanceOf["pound-sign"]
    
    inline def `power-off`: "power-off" = "power-off".asInstanceOf["power-off"]
    
    inline def pray: "pray" = "pray".asInstanceOf["pray"]
    
    inline def `praying-hands`: "praying-hands" = "praying-hands".asInstanceOf["praying-hands"]
    
    inline def prescription: "prescription" = "prescription".asInstanceOf["prescription"]
    
    inline def `prescription-bottle`: "prescription-bottle" = "prescription-bottle".asInstanceOf["prescription-bottle"]
    
    inline def `prescription-bottle-alt`: "prescription-bottle-alt" = "prescription-bottle-alt".asInstanceOf["prescription-bottle-alt"]
    
    inline def `prescription-bottle-medical`: "prescription-bottle-medical" = "prescription-bottle-medical".asInstanceOf["prescription-bottle-medical"]
    
    inline def `prescription-bottle-pill`: "prescription-bottle-pill" = "prescription-bottle-pill".asInstanceOf["prescription-bottle-pill"]
    
    inline def presentation: "presentation" = "presentation".asInstanceOf["presentation"]
    
    inline def `presentation-screen`: "presentation-screen" = "presentation-screen".asInstanceOf["presentation-screen"]
    
    inline def pretzel: "pretzel" = "pretzel".asInstanceOf["pretzel"]
    
    inline def print: "print" = "print".asInstanceOf["print"]
    
    inline def `print-magnifying-glass`: "print-magnifying-glass" = "print-magnifying-glass".asInstanceOf["print-magnifying-glass"]
    
    inline def `print-search`: "print-search" = "print-search".asInstanceOf["print-search"]
    
    inline def `print-slash`: "print-slash" = "print-slash".asInstanceOf["print-slash"]
    
    inline def pro: "pro" = "pro".asInstanceOf["pro"]
    
    inline def procedures: "procedures" = "procedures".asInstanceOf["procedures"]
    
    inline def `product-hunt`: "product-hunt" = "product-hunt".asInstanceOf["product-hunt"]
    
    inline def `project-diagram`: "project-diagram" = "project-diagram".asInstanceOf["project-diagram"]
    
    inline def projector: "projector" = "projector".asInstanceOf["projector"]
    
    inline def pump: "pump" = "pump".asInstanceOf["pump"]
    
    inline def `pump-medical`: "pump-medical" = "pump-medical".asInstanceOf["pump-medical"]
    
    inline def `pump-soap`: "pump-soap" = "pump-soap".asInstanceOf["pump-soap"]
    
    inline def pumpkin: "pumpkin" = "pumpkin".asInstanceOf["pumpkin"]
    
    inline def pushed: "pushed" = "pushed".asInstanceOf["pushed"]
    
    inline def puzzle: "puzzle" = "puzzle".asInstanceOf["puzzle"]
    
    inline def `puzzle-piece`: "puzzle-piece" = "puzzle-piece".asInstanceOf["puzzle-piece"]
    
    inline def `puzzle-piece-alt`: "puzzle-piece-alt" = "puzzle-piece-alt".asInstanceOf["puzzle-piece-alt"]
    
    inline def `puzzle-piece-simple`: "puzzle-piece-simple" = "puzzle-piece-simple".asInstanceOf["puzzle-piece-simple"]
    
    inline def python: "python" = "python".asInstanceOf["python"]
    
    inline def q: "q" = "q".asInstanceOf["q"]
    
    inline def qq: "qq" = "qq".asInstanceOf["qq"]
    
    inline def qrcode: "qrcode" = "qrcode".asInstanceOf["qrcode"]
    
    inline def question: "question" = "question".asInstanceOf["question"]
    
    inline def `question-circle`: "question-circle" = "question-circle".asInstanceOf["question-circle"]
    
    inline def `question-square`: "question-square" = "question-square".asInstanceOf["question-square"]
    
    inline def quidditch: "quidditch" = "quidditch".asInstanceOf["quidditch"]
    
    inline def `quidditch-broom-ball`: "quidditch-broom-ball" = "quidditch-broom-ball".asInstanceOf["quidditch-broom-ball"]
    
    inline def quinscape: "quinscape" = "quinscape".asInstanceOf["quinscape"]
    
    inline def quora: "quora" = "quora".asInstanceOf["quora"]
    
    inline def `quote-left`: "quote-left" = "quote-left".asInstanceOf["quote-left"]
    
    inline def `quote-left-alt`: "quote-left-alt" = "quote-left-alt".asInstanceOf["quote-left-alt"]
    
    inline def `quote-right`: "quote-right" = "quote-right".asInstanceOf["quote-right"]
    
    inline def `quote-right-alt`: "quote-right-alt" = "quote-right-alt".asInstanceOf["quote-right-alt"]
    
    inline def quotes: "quotes" = "quotes".asInstanceOf["quotes"]
    
    inline def quran: "quran" = "quran".asInstanceOf["quran"]
    
    inline def r: "r" = "r".asInstanceOf["r"]
    
    inline def `r-project`: "r-project" = "r-project".asInstanceOf["r-project"]
    
    inline def rabbit: "rabbit" = "rabbit".asInstanceOf["rabbit"]
    
    inline def `rabbit-fast`: "rabbit-fast" = "rabbit-fast".asInstanceOf["rabbit-fast"]
    
    inline def `rabbit-running`: "rabbit-running" = "rabbit-running".asInstanceOf["rabbit-running"]
    
    inline def racquet: "racquet" = "racquet".asInstanceOf["racquet"]
    
    inline def radar: "radar" = "radar".asInstanceOf["radar"]
    
    inline def radiation: "radiation" = "radiation".asInstanceOf["radiation"]
    
    inline def `radiation-alt`: "radiation-alt" = "radiation-alt".asInstanceOf["radiation-alt"]
    
    inline def radio: "radio" = "radio".asInstanceOf["radio"]
    
    inline def `radio-alt`: "radio-alt" = "radio-alt".asInstanceOf["radio-alt"]
    
    inline def `radio-tuner`: "radio-tuner" = "radio-tuner".asInstanceOf["radio-tuner"]
    
    inline def rainbow: "rainbow" = "rainbow".asInstanceOf["rainbow"]
    
    inline def raindrops: "raindrops" = "raindrops".asInstanceOf["raindrops"]
    
    inline def ram: "ram" = "ram".asInstanceOf["ram"]
    
    inline def `ramp-loading`: "ramp-loading" = "ramp-loading".asInstanceOf["ramp-loading"]
    
    inline def random: "random" = "random".asInstanceOf["random"]
    
    inline def `ranking-star`: "ranking-star" = "ranking-star".asInstanceOf["ranking-star"]
    
    inline def `raspberry-pi`: "raspberry-pi" = "raspberry-pi".asInstanceOf["raspberry-pi"]
    
    inline def ravelry: "ravelry" = "ravelry".asInstanceOf["ravelry"]
    
    inline def raygun: "raygun" = "raygun".asInstanceOf["raygun"]
    
    inline def react: "react" = "react".asInstanceOf["react"]
    
    inline def reacteurope: "reacteurope" = "reacteurope".asInstanceOf["reacteurope"]
    
    inline def readme: "readme" = "readme".asInstanceOf["readme"]
    
    inline def rebel: "rebel" = "rebel".asInstanceOf["rebel"]
    
    inline def receipt: "receipt" = "receipt".asInstanceOf["receipt"]
    
    inline def `record-vinyl`: "record-vinyl" = "record-vinyl".asInstanceOf["record-vinyl"]
    
    inline def rectangle: "rectangle" = "rectangle".asInstanceOf["rectangle"]
    
    inline def `rectangle-ad`: "rectangle-ad" = "rectangle-ad".asInstanceOf["rectangle-ad"]
    
    inline def `rectangle-barcode`: "rectangle-barcode" = "rectangle-barcode".asInstanceOf["rectangle-barcode"]
    
    inline def `rectangle-code`: "rectangle-code" = "rectangle-code".asInstanceOf["rectangle-code"]
    
    inline def `rectangle-hd`: "rectangle-hd" = "rectangle-hd".asInstanceOf["rectangle-hd"]
    
    inline def `rectangle-history`: "rectangle-history" = "rectangle-history".asInstanceOf["rectangle-history"]
    
    inline def `rectangle-history-circle-plus`: "rectangle-history-circle-plus" = "rectangle-history-circle-plus".asInstanceOf["rectangle-history-circle-plus"]
    
    inline def `rectangle-history-circle-user`: "rectangle-history-circle-user" = "rectangle-history-circle-user".asInstanceOf["rectangle-history-circle-user"]
    
    inline def `rectangle-landscape`: "rectangle-landscape" = "rectangle-landscape".asInstanceOf["rectangle-landscape"]
    
    inline def `rectangle-list`: "rectangle-list" = "rectangle-list".asInstanceOf["rectangle-list"]
    
    inline def `rectangle-portrait`: "rectangle-portrait" = "rectangle-portrait".asInstanceOf["rectangle-portrait"]
    
    inline def `rectangle-pro`: "rectangle-pro" = "rectangle-pro".asInstanceOf["rectangle-pro"]
    
    inline def `rectangle-sd`: "rectangle-sd" = "rectangle-sd".asInstanceOf["rectangle-sd"]
    
    inline def `rectangle-terminal`: "rectangle-terminal" = "rectangle-terminal".asInstanceOf["rectangle-terminal"]
    
    inline def `rectangle-times`: "rectangle-times" = "rectangle-times".asInstanceOf["rectangle-times"]
    
    inline def `rectangle-vertical`: "rectangle-vertical" = "rectangle-vertical".asInstanceOf["rectangle-vertical"]
    
    inline def `rectangle-vertical-history`: "rectangle-vertical-history" = "rectangle-vertical-history".asInstanceOf["rectangle-vertical-history"]
    
    inline def `rectangle-wide`: "rectangle-wide" = "rectangle-wide".asInstanceOf["rectangle-wide"]
    
    inline def `rectangle-xmark`: "rectangle-xmark" = "rectangle-xmark".asInstanceOf["rectangle-xmark"]
    
    inline def `rectangles-mixed`: "rectangles-mixed" = "rectangles-mixed".asInstanceOf["rectangles-mixed"]
    
    inline def recycle: "recycle" = "recycle".asInstanceOf["recycle"]
    
    inline def `red-river`: "red-river" = "red-river".asInstanceOf["red-river"]
    
    inline def reddit: "reddit" = "reddit".asInstanceOf["reddit"]
    
    inline def `reddit-alien`: "reddit-alien" = "reddit-alien".asInstanceOf["reddit-alien"]
    
    inline def `reddit-square`: "reddit-square" = "reddit-square".asInstanceOf["reddit-square"]
    
    inline def redhat: "redhat" = "redhat".asInstanceOf["redhat"]
    
    inline def redo: "redo" = "redo".asInstanceOf["redo"]
    
    inline def `redo-alt`: "redo-alt" = "redo-alt".asInstanceOf["redo-alt"]
    
    inline def reel: "reel" = "reel".asInstanceOf["reel"]
    
    inline def refresh: "refresh" = "refresh".asInstanceOf["refresh"]
    
    inline def refrigerator: "refrigerator" = "refrigerator".asInstanceOf["refrigerator"]
    
    inline def registered: "registered" = "registered".asInstanceOf["registered"]
    
    inline def remove: "remove" = "remove".asInstanceOf["remove"]
    
    inline def `remove-format`: "remove-format" = "remove-format".asInstanceOf["remove-format"]
    
    inline def rendact: "rendact" = "rendact".asInstanceOf["rendact"]
    
    inline def renren: "renren" = "renren".asInstanceOf["renren"]
    
    inline def reorder: "reorder" = "reorder".asInstanceOf["reorder"]
    
    inline def repeat: "repeat" = "repeat".asInstanceOf["repeat"]
    
    inline def `repeat-1`: "repeat-1" = "repeat-1".asInstanceOf["repeat-1"]
    
    inline def `repeat-alt`: "repeat-alt" = "repeat-alt".asInstanceOf["repeat-alt"]
    
    inline def `repeat1-alt`: "repeat1-alt" = "repeat1-alt".asInstanceOf["repeat1-alt"]
    
    inline def reply: "reply" = "reply".asInstanceOf["reply"]
    
    inline def `reply-all`: "reply-all" = "reply-all".asInstanceOf["reply-all"]
    
    inline def `reply-clock`: "reply-clock" = "reply-clock".asInstanceOf["reply-clock"]
    
    inline def `reply-time`: "reply-time" = "reply-time".asInstanceOf["reply-time"]
    
    inline def replyd: "replyd" = "replyd".asInstanceOf["replyd"]
    
    inline def republican: "republican" = "republican".asInstanceOf["republican"]
    
    inline def researchgate: "researchgate" = "researchgate".asInstanceOf["researchgate"]
    
    inline def resolving: "resolving" = "resolving".asInstanceOf["resolving"]
    
    inline def restroom: "restroom" = "restroom".asInstanceOf["restroom"]
    
    inline def `restroom-simple`: "restroom-simple" = "restroom-simple".asInstanceOf["restroom-simple"]
    
    inline def retweet: "retweet" = "retweet".asInstanceOf["retweet"]
    
    inline def `retweet-alt`: "retweet-alt" = "retweet-alt".asInstanceOf["retweet-alt"]
    
    inline def rev: "rev" = "rev".asInstanceOf["rev"]
    
    inline def rhombus: "rhombus" = "rhombus".asInstanceOf["rhombus"]
    
    inline def ribbon: "ribbon" = "ribbon".asInstanceOf["ribbon"]
    
    inline def right: "right" = "right".asInstanceOf["right"]
    
    inline def `right-from-bracket`: "right-from-bracket" = "right-from-bracket".asInstanceOf["right-from-bracket"]
    
    inline def `right-from-line`: "right-from-line" = "right-from-line".asInstanceOf["right-from-line"]
    
    inline def `right-left`: "right-left" = "right-left".asInstanceOf["right-left"]
    
    inline def `right-long`: "right-long" = "right-long".asInstanceOf["right-long"]
    
    inline def `right-long-to-line`: "right-long-to-line" = "right-long-to-line".asInstanceOf["right-long-to-line"]
    
    inline def `right-to-bracket`: "right-to-bracket" = "right-to-bracket".asInstanceOf["right-to-bracket"]
    
    inline def `right-to-line`: "right-to-line" = "right-to-line".asInstanceOf["right-to-line"]
    
    inline def ring: "ring" = "ring".asInstanceOf["ring"]
    
    inline def `ring-diamond`: "ring-diamond" = "ring-diamond".asInstanceOf["ring-diamond"]
    
    inline def `rings-wedding`: "rings-wedding" = "rings-wedding".asInstanceOf["rings-wedding"]
    
    inline def rmb: "rmb" = "rmb".asInstanceOf["rmb"]
    
    inline def road: "road" = "road".asInstanceOf["road"]
    
    inline def `road-barrier`: "road-barrier" = "road-barrier".asInstanceOf["road-barrier"]
    
    inline def `road-bridge`: "road-bridge" = "road-bridge".asInstanceOf["road-bridge"]
    
    inline def `road-circle-check`: "road-circle-check" = "road-circle-check".asInstanceOf["road-circle-check"]
    
    inline def `road-circle-exclamation`: "road-circle-exclamation" = "road-circle-exclamation".asInstanceOf["road-circle-exclamation"]
    
    inline def `road-circle-xmark`: "road-circle-xmark" = "road-circle-xmark".asInstanceOf["road-circle-xmark"]
    
    inline def `road-lock`: "road-lock" = "road-lock".asInstanceOf["road-lock"]
    
    inline def `road-spikes`: "road-spikes" = "road-spikes".asInstanceOf["road-spikes"]
    
    inline def robot: "robot" = "robot".asInstanceOf["robot"]
    
    inline def `robot-astromech`: "robot-astromech" = "robot-astromech".asInstanceOf["robot-astromech"]
    
    inline def rocket: "rocket" = "rocket".asInstanceOf["rocket"]
    
    inline def `rocket-launch`: "rocket-launch" = "rocket-launch".asInstanceOf["rocket-launch"]
    
    inline def rocketchat: "rocketchat" = "rocketchat".asInstanceOf["rocketchat"]
    
    inline def rockrms: "rockrms" = "rockrms".asInstanceOf["rockrms"]
    
    inline def `rod-asclepius`: "rod-asclepius" = "rod-asclepius".asInstanceOf["rod-asclepius"]
    
    inline def `rod-snake`: "rod-snake" = "rod-snake".asInstanceOf["rod-snake"]
    
    inline def `roller-coaster`: "roller-coaster" = "roller-coaster".asInstanceOf["roller-coaster"]
    
    inline def rotate: "rotate" = "rotate".asInstanceOf["rotate"]
    
    inline def `rotate-back`: "rotate-back" = "rotate-back".asInstanceOf["rotate-back"]
    
    inline def `rotate-backward`: "rotate-backward" = "rotate-backward".asInstanceOf["rotate-backward"]
    
    inline def `rotate-exclamation`: "rotate-exclamation" = "rotate-exclamation".asInstanceOf["rotate-exclamation"]
    
    inline def `rotate-forward`: "rotate-forward" = "rotate-forward".asInstanceOf["rotate-forward"]
    
    inline def `rotate-left`: "rotate-left" = "rotate-left".asInstanceOf["rotate-left"]
    
    inline def `rotate-right`: "rotate-right" = "rotate-right".asInstanceOf["rotate-right"]
    
    inline def rouble: "rouble" = "rouble".asInstanceOf["rouble"]
    
    inline def route: "route" = "route".asInstanceOf["route"]
    
    inline def `route-highway`: "route-highway" = "route-highway".asInstanceOf["route-highway"]
    
    inline def `route-interstate`: "route-interstate" = "route-interstate".asInstanceOf["route-interstate"]
    
    inline def router: "router" = "router".asInstanceOf["router"]
    
    inline def rows: "rows" = "rows".asInstanceOf["rows"]
    
    inline def rss: "rss" = "rss".asInstanceOf["rss"]
    
    inline def `rss-square`: "rss-square" = "rss-square".asInstanceOf["rss-square"]
    
    inline def rub: "rub" = "rub".asInstanceOf["rub"]
    
    inline def ruble: "ruble" = "ruble".asInstanceOf["ruble"]
    
    inline def `ruble-sign`: "ruble-sign" = "ruble-sign".asInstanceOf["ruble-sign"]
    
    inline def rug: "rug" = "rug".asInstanceOf["rug"]
    
    inline def `rugby-ball`: "rugby-ball" = "rugby-ball".asInstanceOf["rugby-ball"]
    
    inline def ruler: "ruler" = "ruler".asInstanceOf["ruler"]
    
    inline def `ruler-combined`: "ruler-combined" = "ruler-combined".asInstanceOf["ruler-combined"]
    
    inline def `ruler-horizontal`: "ruler-horizontal" = "ruler-horizontal".asInstanceOf["ruler-horizontal"]
    
    inline def `ruler-triangle`: "ruler-triangle" = "ruler-triangle".asInstanceOf["ruler-triangle"]
    
    inline def `ruler-vertical`: "ruler-vertical" = "ruler-vertical".asInstanceOf["ruler-vertical"]
    
    inline def running: "running" = "running".asInstanceOf["running"]
    
    inline def rupee: "rupee" = "rupee".asInstanceOf["rupee"]
    
    inline def `rupee-sign`: "rupee-sign" = "rupee-sign".asInstanceOf["rupee-sign"]
    
    inline def `rupiah-sign`: "rupiah-sign" = "rupiah-sign".asInstanceOf["rupiah-sign"]
    
    inline def rust: "rust" = "rust".asInstanceOf["rust"]
    
    inline def rv: "rv" = "rv".asInstanceOf["rv"]
    
    inline def s: "s" = "s".asInstanceOf["s"]
    
    inline def sack: "sack" = "sack".asInstanceOf["sack"]
    
    inline def `sack-dollar`: "sack-dollar" = "sack-dollar".asInstanceOf["sack-dollar"]
    
    inline def `sack-xmark`: "sack-xmark" = "sack-xmark".asInstanceOf["sack-xmark"]
    
    inline def `sad-cry`: "sad-cry" = "sad-cry".asInstanceOf["sad-cry"]
    
    inline def `sad-tear`: "sad-tear" = "sad-tear".asInstanceOf["sad-tear"]
    
    inline def safari: "safari" = "safari".asInstanceOf["safari"]
    
    inline def sailboat: "sailboat" = "sailboat".asInstanceOf["sailboat"]
    
    inline def salad: "salad" = "salad".asInstanceOf["salad"]
    
    inline def salesforce: "salesforce" = "salesforce".asInstanceOf["salesforce"]
    
    inline def `salt-shaker`: "salt-shaker" = "salt-shaker".asInstanceOf["salt-shaker"]
    
    inline def sandwich: "sandwich" = "sandwich".asInstanceOf["sandwich"]
    
    inline def sass: "sass" = "sass".asInstanceOf["sass"]
    
    inline def satellite: "satellite" = "satellite".asInstanceOf["satellite"]
    
    inline def `satellite-dish`: "satellite-dish" = "satellite-dish".asInstanceOf["satellite-dish"]
    
    inline def sausage: "sausage" = "sausage".asInstanceOf["sausage"]
    
    inline def save: "save" = "save".asInstanceOf["save"]
    
    inline def `save-circle-arrow-right`: "save-circle-arrow-right" = "save-circle-arrow-right".asInstanceOf["save-circle-arrow-right"]
    
    inline def `save-circle-xmark`: "save-circle-xmark" = "save-circle-xmark".asInstanceOf["save-circle-xmark"]
    
    inline def `save-times`: "save-times" = "save-times".asInstanceOf["save-times"]
    
    inline def `sax-hot`: "sax-hot" = "sax-hot".asInstanceOf["sax-hot"]
    
    inline def saxophone: "saxophone" = "saxophone".asInstanceOf["saxophone"]
    
    inline def `saxophone-fire`: "saxophone-fire" = "saxophone-fire".asInstanceOf["saxophone-fire"]
    
    inline def `scale-balanced`: "scale-balanced" = "scale-balanced".asInstanceOf["scale-balanced"]
    
    inline def `scale-unbalanced`: "scale-unbalanced" = "scale-unbalanced".asInstanceOf["scale-unbalanced"]
    
    inline def `scale-unbalanced-flip`: "scale-unbalanced-flip" = "scale-unbalanced-flip".asInstanceOf["scale-unbalanced-flip"]
    
    inline def scalpel: "scalpel" = "scalpel".asInstanceOf["scalpel"]
    
    inline def `scalpel-line-dashed`: "scalpel-line-dashed" = "scalpel-line-dashed".asInstanceOf["scalpel-line-dashed"]
    
    inline def `scalpel-path`: "scalpel-path" = "scalpel-path".asInstanceOf["scalpel-path"]
    
    inline def scanner: "scanner" = "scanner".asInstanceOf["scanner"]
    
    inline def `scanner-gun`: "scanner-gun" = "scanner-gun".asInstanceOf["scanner-gun"]
    
    inline def `scanner-image`: "scanner-image" = "scanner-image".asInstanceOf["scanner-image"]
    
    inline def `scanner-keyboard`: "scanner-keyboard" = "scanner-keyboard".asInstanceOf["scanner-keyboard"]
    
    inline def `scanner-touchscreen`: "scanner-touchscreen" = "scanner-touchscreen".asInstanceOf["scanner-touchscreen"]
    
    inline def scarecrow: "scarecrow" = "scarecrow".asInstanceOf["scarecrow"]
    
    inline def scarf: "scarf" = "scarf".asInstanceOf["scarf"]
    
    inline def schlix: "schlix" = "schlix".asInstanceOf["schlix"]
    
    inline def school: "school" = "school".asInstanceOf["school"]
    
    inline def `school-circle-check`: "school-circle-check" = "school-circle-check".asInstanceOf["school-circle-check"]
    
    inline def `school-circle-exclamation`: "school-circle-exclamation" = "school-circle-exclamation".asInstanceOf["school-circle-exclamation"]
    
    inline def `school-circle-xmark`: "school-circle-xmark" = "school-circle-xmark".asInstanceOf["school-circle-xmark"]
    
    inline def `school-flag`: "school-flag" = "school-flag".asInstanceOf["school-flag"]
    
    inline def `school-lock`: "school-lock" = "school-lock".asInstanceOf["school-lock"]
    
    inline def scissors: "scissors" = "scissors".asInstanceOf["scissors"]
    
    inline def `screen-users`: "screen-users" = "screen-users".asInstanceOf["screen-users"]
    
    inline def screencast: "screencast" = "screencast".asInstanceOf["screencast"]
    
    inline def screenpal: "screenpal" = "screenpal".asInstanceOf["screenpal"]
    
    inline def screenshot: "screenshot" = "screenshot".asInstanceOf["screenshot"]
    
    inline def screwdriver: "screwdriver" = "screwdriver".asInstanceOf["screwdriver"]
    
    inline def `screwdriver-wrench`: "screwdriver-wrench" = "screwdriver-wrench".asInstanceOf["screwdriver-wrench"]
    
    inline def scribble: "scribble" = "scribble".asInstanceOf["scribble"]
    
    inline def scribd: "scribd" = "scribd".asInstanceOf["scribd"]
    
    inline def scroll: "scroll" = "scroll".asInstanceOf["scroll"]
    
    inline def `scroll-old`: "scroll-old" = "scroll-old".asInstanceOf["scroll-old"]
    
    inline def `scroll-ribbon`: "scroll-ribbon" = "scroll-ribbon".asInstanceOf["scroll-ribbon"]
    
    inline def `scroll-torah`: "scroll-torah" = "scroll-torah".asInstanceOf["scroll-torah"]
    
    inline def scrubber: "scrubber" = "scrubber".asInstanceOf["scrubber"]
    
    inline def scythe: "scythe" = "scythe".asInstanceOf["scythe"]
    
    inline def `sd-card`: "sd-card" = "sd-card".asInstanceOf["sd-card"]
    
    inline def `sd-cards`: "sd-cards" = "sd-cards".asInstanceOf["sd-cards"]
    
    inline def seal: "seal" = "seal".asInstanceOf["seal"]
    
    inline def `seal-exclamation`: "seal-exclamation" = "seal-exclamation".asInstanceOf["seal-exclamation"]
    
    inline def `seal-question`: "seal-question" = "seal-question".asInstanceOf["seal-question"]
    
    inline def search: "search" = "search".asInstanceOf["search"]
    
    inline def `search-dollar`: "search-dollar" = "search-dollar".asInstanceOf["search-dollar"]
    
    inline def `search-location`: "search-location" = "search-location".asInstanceOf["search-location"]
    
    inline def `search-minus`: "search-minus" = "search-minus".asInstanceOf["search-minus"]
    
    inline def `search-plus`: "search-plus" = "search-plus".asInstanceOf["search-plus"]
    
    inline def searchengin: "searchengin" = "searchengin".asInstanceOf["searchengin"]
    
    inline def `seat-airline`: "seat-airline" = "seat-airline".asInstanceOf["seat-airline"]
    
    inline def section: "section" = "section".asInstanceOf["section"]
    
    inline def seedling: "seedling" = "seedling".asInstanceOf["seedling"]
    
    inline def sellcast: "sellcast" = "sellcast".asInstanceOf["sellcast"]
    
    inline def sellsy: "sellsy" = "sellsy".asInstanceOf["sellsy"]
    
    inline def semicolon: "semicolon" = "semicolon".asInstanceOf["semicolon"]
    
    inline def send: "send" = "send".asInstanceOf["send"]
    
    inline def `send-back`: "send-back" = "send-back".asInstanceOf["send-back"]
    
    inline def `send-backward`: "send-backward" = "send-backward".asInstanceOf["send-backward"]
    
    inline def sensor: "sensor" = "sensor".asInstanceOf["sensor"]
    
    inline def `sensor-alert`: "sensor-alert" = "sensor-alert".asInstanceOf["sensor-alert"]
    
    inline def `sensor-cloud`: "sensor-cloud" = "sensor-cloud".asInstanceOf["sensor-cloud"]
    
    inline def `sensor-fire`: "sensor-fire" = "sensor-fire".asInstanceOf["sensor-fire"]
    
    inline def `sensor-on`: "sensor-on" = "sensor-on".asInstanceOf["sensor-on"]
    
    inline def `sensor-smoke`: "sensor-smoke" = "sensor-smoke".asInstanceOf["sensor-smoke"]
    
    inline def `sensor-triangle-exclamation`: "sensor-triangle-exclamation" = "sensor-triangle-exclamation".asInstanceOf["sensor-triangle-exclamation"]
    
    inline def server: "server" = "server".asInstanceOf["server"]
    
    inline def servicestack: "servicestack" = "servicestack".asInstanceOf["servicestack"]
    
    inline def shapes: "shapes" = "shapes".asInstanceOf["shapes"]
    
    inline def share: "share" = "share".asInstanceOf["share"]
    
    inline def `share-all`: "share-all" = "share-all".asInstanceOf["share-all"]
    
    inline def `share-alt`: "share-alt" = "share-alt".asInstanceOf["share-alt"]
    
    inline def `share-alt-square`: "share-alt-square" = "share-alt-square".asInstanceOf["share-alt-square"]
    
    inline def `share-from-square`: "share-from-square" = "share-from-square".asInstanceOf["share-from-square"]
    
    inline def `share-nodes`: "share-nodes" = "share-nodes".asInstanceOf["share-nodes"]
    
    inline def `share-square`: "share-square" = "share-square".asInstanceOf["share-square"]
    
    inline def sheep: "sheep" = "sheep".asInstanceOf["sheep"]
    
    inline def `sheet-plastic`: "sheet-plastic" = "sheet-plastic".asInstanceOf["sheet-plastic"]
    
    inline def shekel: "shekel" = "shekel".asInstanceOf["shekel"]
    
    inline def `shekel-sign`: "shekel-sign" = "shekel-sign".asInstanceOf["shekel-sign"]
    
    inline def shelves: "shelves" = "shelves".asInstanceOf["shelves"]
    
    inline def `shelves-empty`: "shelves-empty" = "shelves-empty".asInstanceOf["shelves-empty"]
    
    inline def sheqel: "sheqel" = "sheqel".asInstanceOf["sheqel"]
    
    inline def `sheqel-sign`: "sheqel-sign" = "sheqel-sign".asInstanceOf["sheqel-sign"]
    
    inline def shield: "shield" = "shield".asInstanceOf["shield"]
    
    inline def `shield-alt`: "shield-alt" = "shield-alt".asInstanceOf["shield-alt"]
    
    inline def `shield-blank`: "shield-blank" = "shield-blank".asInstanceOf["shield-blank"]
    
    inline def `shield-cat`: "shield-cat" = "shield-cat".asInstanceOf["shield-cat"]
    
    inline def `shield-check`: "shield-check" = "shield-check".asInstanceOf["shield-check"]
    
    inline def `shield-cross`: "shield-cross" = "shield-cross".asInstanceOf["shield-cross"]
    
    inline def `shield-dog`: "shield-dog" = "shield-dog".asInstanceOf["shield-dog"]
    
    inline def `shield-exclamation`: "shield-exclamation" = "shield-exclamation".asInstanceOf["shield-exclamation"]
    
    inline def `shield-halved`: "shield-halved" = "shield-halved".asInstanceOf["shield-halved"]
    
    inline def `shield-heart`: "shield-heart" = "shield-heart".asInstanceOf["shield-heart"]
    
    inline def `shield-keyhole`: "shield-keyhole" = "shield-keyhole".asInstanceOf["shield-keyhole"]
    
    inline def `shield-minus`: "shield-minus" = "shield-minus".asInstanceOf["shield-minus"]
    
    inline def `shield-plus`: "shield-plus" = "shield-plus".asInstanceOf["shield-plus"]
    
    inline def `shield-quartered`: "shield-quartered" = "shield-quartered".asInstanceOf["shield-quartered"]
    
    inline def `shield-slash`: "shield-slash" = "shield-slash".asInstanceOf["shield-slash"]
    
    inline def `shield-times`: "shield-times" = "shield-times".asInstanceOf["shield-times"]
    
    inline def `shield-virus`: "shield-virus" = "shield-virus".asInstanceOf["shield-virus"]
    
    inline def `shield-xmark`: "shield-xmark" = "shield-xmark".asInstanceOf["shield-xmark"]
    
    inline def ship: "ship" = "ship".asInstanceOf["ship"]
    
    inline def `shipping-fast`: "shipping-fast" = "shipping-fast".asInstanceOf["shipping-fast"]
    
    inline def `shipping-timed`: "shipping-timed" = "shipping-timed".asInstanceOf["shipping-timed"]
    
    inline def shirt: "shirt" = "shirt".asInstanceOf["shirt"]
    
    inline def `shirt-long-sleeve`: "shirt-long-sleeve" = "shirt-long-sleeve".asInstanceOf["shirt-long-sleeve"]
    
    inline def `shirt-running`: "shirt-running" = "shirt-running".asInstanceOf["shirt-running"]
    
    inline def `shirt-tank-top`: "shirt-tank-top" = "shirt-tank-top".asInstanceOf["shirt-tank-top"]
    
    inline def shirtsinbulk: "shirtsinbulk" = "shirtsinbulk".asInstanceOf["shirtsinbulk"]
    
    inline def `shish-kebab`: "shish-kebab" = "shish-kebab".asInstanceOf["shish-kebab"]
    
    inline def `shoe-prints`: "shoe-prints" = "shoe-prints".asInstanceOf["shoe-prints"]
    
    inline def shop: "shop" = "shop".asInstanceOf["shop"]
    
    inline def `shop-lock`: "shop-lock" = "shop-lock".asInstanceOf["shop-lock"]
    
    inline def `shop-slash`: "shop-slash" = "shop-slash".asInstanceOf["shop-slash"]
    
    inline def shopify: "shopify" = "shopify".asInstanceOf["shopify"]
    
    inline def `shopping-bag`: "shopping-bag" = "shopping-bag".asInstanceOf["shopping-bag"]
    
    inline def `shopping-basket`: "shopping-basket" = "shopping-basket".asInstanceOf["shopping-basket"]
    
    inline def `shopping-basket-alt`: "shopping-basket-alt" = "shopping-basket-alt".asInstanceOf["shopping-basket-alt"]
    
    inline def `shopping-cart`: "shopping-cart" = "shopping-cart".asInstanceOf["shopping-cart"]
    
    inline def shopware: "shopware" = "shopware".asInstanceOf["shopware"]
    
    inline def shortcake: "shortcake" = "shortcake".asInstanceOf["shortcake"]
    
    inline def shovel: "shovel" = "shovel".asInstanceOf["shovel"]
    
    inline def `shovel-snow`: "shovel-snow" = "shovel-snow".asInstanceOf["shovel-snow"]
    
    inline def shower: "shower" = "shower".asInstanceOf["shower"]
    
    inline def `shower-alt`: "shower-alt" = "shower-alt".asInstanceOf["shower-alt"]
    
    inline def `shower-down`: "shower-down" = "shower-down".asInstanceOf["shower-down"]
    
    inline def shredder: "shredder" = "shredder".asInstanceOf["shredder"]
    
    inline def shrimp: "shrimp" = "shrimp".asInstanceOf["shrimp"]
    
    inline def shuffle: "shuffle" = "shuffle".asInstanceOf["shuffle"]
    
    inline def shutters: "shutters" = "shutters".asInstanceOf["shutters"]
    
    inline def `shuttle-space`: "shuttle-space" = "shuttle-space".asInstanceOf["shuttle-space"]
    
    inline def `shuttle-van`: "shuttle-van" = "shuttle-van".asInstanceOf["shuttle-van"]
    
    inline def shuttlecock: "shuttlecock" = "shuttlecock".asInstanceOf["shuttlecock"]
    
    inline def sickle: "sickle" = "sickle".asInstanceOf["sickle"]
    
    inline def sidebar: "sidebar" = "sidebar".asInstanceOf["sidebar"]
    
    inline def `sidebar-flip`: "sidebar-flip" = "sidebar-flip".asInstanceOf["sidebar-flip"]
    
    inline def sigma: "sigma" = "sigma".asInstanceOf["sigma"]
    
    inline def sign: "sign" = "sign".asInstanceOf["sign"]
    
    inline def `sign-hanging`: "sign-hanging" = "sign-hanging".asInstanceOf["sign-hanging"]
    
    inline def `sign-in`: "sign-in" = "sign-in".asInstanceOf["sign-in"]
    
    inline def `sign-in-alt`: "sign-in-alt" = "sign-in-alt".asInstanceOf["sign-in-alt"]
    
    inline def `sign-language`: "sign-language" = "sign-language".asInstanceOf["sign-language"]
    
    inline def `sign-out`: "sign-out" = "sign-out".asInstanceOf["sign-out"]
    
    inline def `sign-out-alt`: "sign-out-alt" = "sign-out-alt".asInstanceOf["sign-out-alt"]
    
    inline def signal: "signal" = "signal".asInstanceOf["signal"]
    
    inline def `signal-alt`: "signal-alt" = "signal-alt".asInstanceOf["signal-alt"]
    
    inline def `signal-alt-slash`: "signal-alt-slash" = "signal-alt-slash".asInstanceOf["signal-alt-slash"]
    
    inline def `signal-alt1`: "signal-alt1" = "signal-alt1".asInstanceOf["signal-alt1"]
    
    inline def `signal-alt2`: "signal-alt2" = "signal-alt2".asInstanceOf["signal-alt2"]
    
    inline def `signal-alt3`: "signal-alt3" = "signal-alt3".asInstanceOf["signal-alt3"]
    
    inline def `signal-alt4`: "signal-alt4" = "signal-alt4".asInstanceOf["signal-alt4"]
    
    inline def `signal-bars`: "signal-bars" = "signal-bars".asInstanceOf["signal-bars"]
    
    inline def `signal-bars-fair`: "signal-bars-fair" = "signal-bars-fair".asInstanceOf["signal-bars-fair"]
    
    inline def `signal-bars-good`: "signal-bars-good" = "signal-bars-good".asInstanceOf["signal-bars-good"]
    
    inline def `signal-bars-slash`: "signal-bars-slash" = "signal-bars-slash".asInstanceOf["signal-bars-slash"]
    
    inline def `signal-bars-strong`: "signal-bars-strong" = "signal-bars-strong".asInstanceOf["signal-bars-strong"]
    
    inline def `signal-bars-weak`: "signal-bars-weak" = "signal-bars-weak".asInstanceOf["signal-bars-weak"]
    
    inline def `signal-fair`: "signal-fair" = "signal-fair".asInstanceOf["signal-fair"]
    
    inline def `signal-good`: "signal-good" = "signal-good".asInstanceOf["signal-good"]
    
    inline def `signal-perfect`: "signal-perfect" = "signal-perfect".asInstanceOf["signal-perfect"]
    
    inline def `signal-slash`: "signal-slash" = "signal-slash".asInstanceOf["signal-slash"]
    
    inline def `signal-stream`: "signal-stream" = "signal-stream".asInstanceOf["signal-stream"]
    
    inline def `signal-stream-slash`: "signal-stream-slash" = "signal-stream-slash".asInstanceOf["signal-stream-slash"]
    
    inline def `signal-strong`: "signal-strong" = "signal-strong".asInstanceOf["signal-strong"]
    
    inline def `signal-weak`: "signal-weak" = "signal-weak".asInstanceOf["signal-weak"]
    
    inline def signal1: "signal1" = "signal1".asInstanceOf["signal1"]
    
    inline def signal2: "signal2" = "signal2".asInstanceOf["signal2"]
    
    inline def signal3: "signal3" = "signal3".asInstanceOf["signal3"]
    
    inline def signal4: "signal4" = "signal4".asInstanceOf["signal4"]
    
    inline def signal5: "signal5" = "signal5".asInstanceOf["signal5"]
    
    inline def signature: "signature" = "signature".asInstanceOf["signature"]
    
    inline def `signature-lock`: "signature-lock" = "signature-lock".asInstanceOf["signature-lock"]
    
    inline def `signature-slash`: "signature-slash" = "signature-slash".asInstanceOf["signature-slash"]
    
    inline def signing: "signing" = "signing".asInstanceOf["signing"]
    
    inline def `signs-post`: "signs-post" = "signs-post".asInstanceOf["signs-post"]
    
    inline def `sim-card`: "sim-card" = "sim-card".asInstanceOf["sim-card"]
    
    inline def `sim-cards`: "sim-cards" = "sim-cards".asInstanceOf["sim-cards"]
    
    inline def simplybuilt: "simplybuilt" = "simplybuilt".asInstanceOf["simplybuilt"]
    
    inline def sink: "sink" = "sink".asInstanceOf["sink"]
    
    inline def siren: "siren" = "siren".asInstanceOf["siren"]
    
    inline def `siren-on`: "siren-on" = "siren-on".asInstanceOf["siren-on"]
    
    inline def sistrix: "sistrix" = "sistrix".asInstanceOf["sistrix"]
    
    inline def sitemap: "sitemap" = "sitemap".asInstanceOf["sitemap"]
    
    inline def sith: "sith" = "sith".asInstanceOf["sith"]
    
    inline def sitrox: "sitrox" = "sitrox".asInstanceOf["sitrox"]
    
    inline def skating: "skating" = "skating".asInstanceOf["skating"]
    
    inline def skeleton: "skeleton" = "skeleton".asInstanceOf["skeleton"]
    
    inline def sketch: "sketch" = "sketch".asInstanceOf["sketch"]
    
    inline def `ski-boot`: "ski-boot" = "ski-boot".asInstanceOf["ski-boot"]
    
    inline def `ski-boot-ski`: "ski-boot-ski" = "ski-boot-ski".asInstanceOf["ski-boot-ski"]
    
    inline def `ski-jump`: "ski-jump" = "ski-jump".asInstanceOf["ski-jump"]
    
    inline def `ski-lift`: "ski-lift" = "ski-lift".asInstanceOf["ski-lift"]
    
    inline def skiing: "skiing" = "skiing".asInstanceOf["skiing"]
    
    inline def `skiing-nordic`: "skiing-nordic" = "skiing-nordic".asInstanceOf["skiing-nordic"]
    
    inline def skull: "skull" = "skull".asInstanceOf["skull"]
    
    inline def `skull-cow`: "skull-cow" = "skull-cow".asInstanceOf["skull-cow"]
    
    inline def `skull-crossbones`: "skull-crossbones" = "skull-crossbones".asInstanceOf["skull-crossbones"]
    
    inline def skyatlas: "skyatlas" = "skyatlas".asInstanceOf["skyatlas"]
    
    inline def skype: "skype" = "skype".asInstanceOf["skype"]
    
    inline def slack: "slack" = "slack".asInstanceOf["slack"]
    
    inline def `slack-hash`: "slack-hash" = "slack-hash".asInstanceOf["slack-hash"]
    
    inline def slash: "slash" = "slash".asInstanceOf["slash"]
    
    inline def `slash-back`: "slash-back" = "slash-back".asInstanceOf["slash-back"]
    
    inline def `slash-forward`: "slash-forward" = "slash-forward".asInstanceOf["slash-forward"]
    
    inline def sledding: "sledding" = "sledding".asInstanceOf["sledding"]
    
    inline def sleigh: "sleigh" = "sleigh".asInstanceOf["sleigh"]
    
    inline def slider: "slider" = "slider".asInstanceOf["slider"]
    
    inline def sliders: "sliders" = "sliders".asInstanceOf["sliders"]
    
    inline def `sliders-h`: "sliders-h" = "sliders-h".asInstanceOf["sliders-h"]
    
    inline def `sliders-h-square`: "sliders-h-square" = "sliders-h-square".asInstanceOf["sliders-h-square"]
    
    inline def `sliders-simple`: "sliders-simple" = "sliders-simple".asInstanceOf["sliders-simple"]
    
    inline def `sliders-up`: "sliders-up" = "sliders-up".asInstanceOf["sliders-up"]
    
    inline def `sliders-v`: "sliders-v" = "sliders-v".asInstanceOf["sliders-v"]
    
    inline def `sliders-v-square`: "sliders-v-square" = "sliders-v-square".asInstanceOf["sliders-v-square"]
    
    inline def slideshare: "slideshare" = "slideshare".asInstanceOf["slideshare"]
    
    inline def `slot-machine`: "slot-machine" = "slot-machine".asInstanceOf["slot-machine"]
    
    inline def smile: "smile" = "smile".asInstanceOf["smile"]
    
    inline def `smile-beam`: "smile-beam" = "smile-beam".asInstanceOf["smile-beam"]
    
    inline def `smile-plus`: "smile-plus" = "smile-plus".asInstanceOf["smile-plus"]
    
    inline def `smile-wink`: "smile-wink" = "smile-wink".asInstanceOf["smile-wink"]
    
    inline def smog: "smog" = "smog".asInstanceOf["smog"]
    
    inline def smoke: "smoke" = "smoke".asInstanceOf["smoke"]
    
    inline def smoking: "smoking" = "smoking".asInstanceOf["smoking"]
    
    inline def `smoking-ban`: "smoking-ban" = "smoking-ban".asInstanceOf["smoking-ban"]
    
    inline def sms: "sms" = "sms".asInstanceOf["sms"]
    
    inline def snake: "snake" = "snake".asInstanceOf["snake"]
    
    inline def snapchat: "snapchat" = "snapchat".asInstanceOf["snapchat"]
    
    inline def `snapchat-ghost`: "snapchat-ghost" = "snapchat-ghost".asInstanceOf["snapchat-ghost"]
    
    inline def `snapchat-square`: "snapchat-square" = "snapchat-square".asInstanceOf["snapchat-square"]
    
    inline def snooze: "snooze" = "snooze".asInstanceOf["snooze"]
    
    inline def `snow-blowing`: "snow-blowing" = "snow-blowing".asInstanceOf["snow-blowing"]
    
    inline def snowboarding: "snowboarding" = "snowboarding".asInstanceOf["snowboarding"]
    
    inline def snowflake: "snowflake" = "snowflake".asInstanceOf["snowflake"]
    
    inline def `snowflake-droplets`: "snowflake-droplets" = "snowflake-droplets".asInstanceOf["snowflake-droplets"]
    
    inline def snowflakes: "snowflakes" = "snowflakes".asInstanceOf["snowflakes"]
    
    inline def snowman: "snowman" = "snowman".asInstanceOf["snowman"]
    
    inline def `snowman-head`: "snowman-head" = "snowman-head".asInstanceOf["snowman-head"]
    
    inline def snowmobile: "snowmobile" = "snowmobile".asInstanceOf["snowmobile"]
    
    inline def snowplow: "snowplow" = "snowplow".asInstanceOf["snowplow"]
    
    inline def soap: "soap" = "soap".asInstanceOf["soap"]
    
    inline def `soccer-ball`: "soccer-ball" = "soccer-ball".asInstanceOf["soccer-ball"]
    
    inline def socks: "socks" = "socks".asInstanceOf["socks"]
    
    inline def `soft-serve`: "soft-serve" = "soft-serve".asInstanceOf["soft-serve"]
    
    inline def `solar-panel`: "solar-panel" = "solar-panel".asInstanceOf["solar-panel"]
    
    inline def `solar-system`: "solar-system" = "solar-system".asInstanceOf["solar-system"]
    
    inline def sort: "sort" = "sort".asInstanceOf["sort"]
    
    inline def `sort-alpha-asc`: "sort-alpha-asc" = "sort-alpha-asc".asInstanceOf["sort-alpha-asc"]
    
    inline def `sort-alpha-desc`: "sort-alpha-desc" = "sort-alpha-desc".asInstanceOf["sort-alpha-desc"]
    
    inline def `sort-alpha-down`: "sort-alpha-down" = "sort-alpha-down".asInstanceOf["sort-alpha-down"]
    
    inline def `sort-alpha-down-alt`: "sort-alpha-down-alt" = "sort-alpha-down-alt".asInstanceOf["sort-alpha-down-alt"]
    
    inline def `sort-alpha-up`: "sort-alpha-up" = "sort-alpha-up".asInstanceOf["sort-alpha-up"]
    
    inline def `sort-alpha-up-alt`: "sort-alpha-up-alt" = "sort-alpha-up-alt".asInstanceOf["sort-alpha-up-alt"]
    
    inline def `sort-alt`: "sort-alt" = "sort-alt".asInstanceOf["sort-alt"]
    
    inline def `sort-amount-asc`: "sort-amount-asc" = "sort-amount-asc".asInstanceOf["sort-amount-asc"]
    
    inline def `sort-amount-desc`: "sort-amount-desc" = "sort-amount-desc".asInstanceOf["sort-amount-desc"]
    
    inline def `sort-amount-down`: "sort-amount-down" = "sort-amount-down".asInstanceOf["sort-amount-down"]
    
    inline def `sort-amount-down-alt`: "sort-amount-down-alt" = "sort-amount-down-alt".asInstanceOf["sort-amount-down-alt"]
    
    inline def `sort-amount-up`: "sort-amount-up" = "sort-amount-up".asInstanceOf["sort-amount-up"]
    
    inline def `sort-amount-up-alt`: "sort-amount-up-alt" = "sort-amount-up-alt".asInstanceOf["sort-amount-up-alt"]
    
    inline def `sort-asc`: "sort-asc" = "sort-asc".asInstanceOf["sort-asc"]
    
    inline def `sort-circle`: "sort-circle" = "sort-circle".asInstanceOf["sort-circle"]
    
    inline def `sort-circle-down`: "sort-circle-down" = "sort-circle-down".asInstanceOf["sort-circle-down"]
    
    inline def `sort-circle-up`: "sort-circle-up" = "sort-circle-up".asInstanceOf["sort-circle-up"]
    
    inline def `sort-desc`: "sort-desc" = "sort-desc".asInstanceOf["sort-desc"]
    
    inline def `sort-down`: "sort-down" = "sort-down".asInstanceOf["sort-down"]
    
    inline def `sort-numeric-asc`: "sort-numeric-asc" = "sort-numeric-asc".asInstanceOf["sort-numeric-asc"]
    
    inline def `sort-numeric-desc`: "sort-numeric-desc" = "sort-numeric-desc".asInstanceOf["sort-numeric-desc"]
    
    inline def `sort-numeric-down`: "sort-numeric-down" = "sort-numeric-down".asInstanceOf["sort-numeric-down"]
    
    inline def `sort-numeric-down-alt`: "sort-numeric-down-alt" = "sort-numeric-down-alt".asInstanceOf["sort-numeric-down-alt"]
    
    inline def `sort-numeric-up`: "sort-numeric-up" = "sort-numeric-up".asInstanceOf["sort-numeric-up"]
    
    inline def `sort-numeric-up-alt`: "sort-numeric-up-alt" = "sort-numeric-up-alt".asInstanceOf["sort-numeric-up-alt"]
    
    inline def `sort-shapes-down`: "sort-shapes-down" = "sort-shapes-down".asInstanceOf["sort-shapes-down"]
    
    inline def `sort-shapes-down-alt`: "sort-shapes-down-alt" = "sort-shapes-down-alt".asInstanceOf["sort-shapes-down-alt"]
    
    inline def `sort-shapes-up`: "sort-shapes-up" = "sort-shapes-up".asInstanceOf["sort-shapes-up"]
    
    inline def `sort-shapes-up-alt`: "sort-shapes-up-alt" = "sort-shapes-up-alt".asInstanceOf["sort-shapes-up-alt"]
    
    inline def `sort-size-down`: "sort-size-down" = "sort-size-down".asInstanceOf["sort-size-down"]
    
    inline def `sort-size-down-alt`: "sort-size-down-alt" = "sort-size-down-alt".asInstanceOf["sort-size-down-alt"]
    
    inline def `sort-size-up`: "sort-size-up" = "sort-size-up".asInstanceOf["sort-size-up"]
    
    inline def `sort-size-up-alt`: "sort-size-up-alt" = "sort-size-up-alt".asInstanceOf["sort-size-up-alt"]
    
    inline def `sort-up`: "sort-up" = "sort-up".asInstanceOf["sort-up"]
    
    inline def `sort-up-down`: "sort-up-down" = "sort-up-down".asInstanceOf["sort-up-down"]
    
    inline def soundcloud: "soundcloud" = "soundcloud".asInstanceOf["soundcloud"]
    
    inline def soup: "soup" = "soup".asInstanceOf["soup"]
    
    inline def sourcetree: "sourcetree" = "sourcetree".asInstanceOf["sourcetree"]
    
    inline def spa: "spa" = "spa".asInstanceOf["spa"]
    
    inline def `space-awesome`: "space-awesome" = "space-awesome".asInstanceOf["space-awesome"]
    
    inline def `space-shuttle`: "space-shuttle" = "space-shuttle".asInstanceOf["space-shuttle"]
    
    inline def `space-station-moon`: "space-station-moon" = "space-station-moon".asInstanceOf["space-station-moon"]
    
    inline def `space-station-moon-alt`: "space-station-moon-alt" = "space-station-moon-alt".asInstanceOf["space-station-moon-alt"]
    
    inline def `space-station-moon-construction`: "space-station-moon-construction" = "space-station-moon-construction".asInstanceOf["space-station-moon-construction"]
    
    inline def spade: "spade" = "spade".asInstanceOf["spade"]
    
    inline def `spaghetti-monster-flying`: "spaghetti-monster-flying" = "spaghetti-monster-flying".asInstanceOf["spaghetti-monster-flying"]
    
    inline def sparkles: "sparkles" = "sparkles".asInstanceOf["sparkles"]
    
    inline def speakap: "speakap" = "speakap".asInstanceOf["speakap"]
    
    inline def speaker: "speaker" = "speaker".asInstanceOf["speaker"]
    
    inline def `speaker-deck`: "speaker-deck" = "speaker-deck".asInstanceOf["speaker-deck"]
    
    inline def speakers: "speakers" = "speakers".asInstanceOf["speakers"]
    
    inline def `spell-check`: "spell-check" = "spell-check".asInstanceOf["spell-check"]
    
    inline def spider: "spider" = "spider".asInstanceOf["spider"]
    
    inline def `spider-black-widow`: "spider-black-widow" = "spider-black-widow".asInstanceOf["spider-black-widow"]
    
    inline def `spider-web`: "spider-web" = "spider-web".asInstanceOf["spider-web"]
    
    inline def spinner: "spinner" = "spinner".asInstanceOf["spinner"]
    
    inline def `spinner-third`: "spinner-third" = "spinner-third".asInstanceOf["spinner-third"]
    
    inline def split: "split" = "split".asInstanceOf["split"]
    
    inline def splotch: "splotch" = "splotch".asInstanceOf["splotch"]
    
    inline def spoon: "spoon" = "spoon".asInstanceOf["spoon"]
    
    inline def sportsball: "sportsball" = "sportsball".asInstanceOf["sportsball"]
    
    inline def spotify: "spotify" = "spotify".asInstanceOf["spotify"]
    
    inline def `spray-can`: "spray-can" = "spray-can".asInstanceOf["spray-can"]
    
    inline def `spray-can-sparkles`: "spray-can-sparkles" = "spray-can-sparkles".asInstanceOf["spray-can-sparkles"]
    
    inline def sprinkler: "sprinkler" = "sprinkler".asInstanceOf["sprinkler"]
    
    inline def `sprinkler-ceiling`: "sprinkler-ceiling" = "sprinkler-ceiling".asInstanceOf["sprinkler-ceiling"]
    
    inline def sprout: "sprout" = "sprout".asInstanceOf["sprout"]
    
    inline def square: "square" = "square".asInstanceOf["square"]
    
    inline def `square-0`: "square-0" = "square-0".asInstanceOf["square-0"]
    
    inline def `square-1`: "square-1" = "square-1".asInstanceOf["square-1"]
    
    inline def `square-2`: "square-2" = "square-2".asInstanceOf["square-2"]
    
    inline def `square-3`: "square-3" = "square-3".asInstanceOf["square-3"]
    
    inline def `square-4`: "square-4" = "square-4".asInstanceOf["square-4"]
    
    inline def `square-5`: "square-5" = "square-5".asInstanceOf["square-5"]
    
    inline def `square-6`: "square-6" = "square-6".asInstanceOf["square-6"]
    
    inline def `square-7`: "square-7" = "square-7".asInstanceOf["square-7"]
    
    inline def `square-8`: "square-8" = "square-8".asInstanceOf["square-8"]
    
    inline def `square-9`: "square-9" = "square-9".asInstanceOf["square-9"]
    
    inline def `square-a`: "square-a" = "square-a".asInstanceOf["square-a"]
    
    inline def `square-a-lock`: "square-a-lock" = "square-a-lock".asInstanceOf["square-a-lock"]
    
    inline def `square-ampersand`: "square-ampersand" = "square-ampersand".asInstanceOf["square-ampersand"]
    
    inline def `square-arrow-down`: "square-arrow-down" = "square-arrow-down".asInstanceOf["square-arrow-down"]
    
    inline def `square-arrow-down-left`: "square-arrow-down-left" = "square-arrow-down-left".asInstanceOf["square-arrow-down-left"]
    
    inline def `square-arrow-down-right`: "square-arrow-down-right" = "square-arrow-down-right".asInstanceOf["square-arrow-down-right"]
    
    inline def `square-arrow-left`: "square-arrow-left" = "square-arrow-left".asInstanceOf["square-arrow-left"]
    
    inline def `square-arrow-right`: "square-arrow-right" = "square-arrow-right".asInstanceOf["square-arrow-right"]
    
    inline def `square-arrow-up`: "square-arrow-up" = "square-arrow-up".asInstanceOf["square-arrow-up"]
    
    inline def `square-arrow-up-left`: "square-arrow-up-left" = "square-arrow-up-left".asInstanceOf["square-arrow-up-left"]
    
    inline def `square-arrow-up-right`: "square-arrow-up-right" = "square-arrow-up-right".asInstanceOf["square-arrow-up-right"]
    
    inline def `square-b`: "square-b" = "square-b".asInstanceOf["square-b"]
    
    inline def `square-behance`: "square-behance" = "square-behance".asInstanceOf["square-behance"]
    
    inline def `square-bolt`: "square-bolt" = "square-bolt".asInstanceOf["square-bolt"]
    
    inline def `square-c`: "square-c" = "square-c".asInstanceOf["square-c"]
    
    inline def `square-caret-down`: "square-caret-down" = "square-caret-down".asInstanceOf["square-caret-down"]
    
    inline def `square-caret-left`: "square-caret-left" = "square-caret-left".asInstanceOf["square-caret-left"]
    
    inline def `square-caret-right`: "square-caret-right" = "square-caret-right".asInstanceOf["square-caret-right"]
    
    inline def `square-caret-up`: "square-caret-up" = "square-caret-up".asInstanceOf["square-caret-up"]
    
    inline def `square-check`: "square-check" = "square-check".asInstanceOf["square-check"]
    
    inline def `square-chevron-down`: "square-chevron-down" = "square-chevron-down".asInstanceOf["square-chevron-down"]
    
    inline def `square-chevron-left`: "square-chevron-left" = "square-chevron-left".asInstanceOf["square-chevron-left"]
    
    inline def `square-chevron-right`: "square-chevron-right" = "square-chevron-right".asInstanceOf["square-chevron-right"]
    
    inline def `square-chevron-up`: "square-chevron-up" = "square-chevron-up".asInstanceOf["square-chevron-up"]
    
    inline def `square-code`: "square-code" = "square-code".asInstanceOf["square-code"]
    
    inline def `square-d`: "square-d" = "square-d".asInstanceOf["square-d"]
    
    inline def `square-dashed`: "square-dashed" = "square-dashed".asInstanceOf["square-dashed"]
    
    inline def `square-dashed-circle-plus`: "square-dashed-circle-plus" = "square-dashed-circle-plus".asInstanceOf["square-dashed-circle-plus"]
    
    inline def `square-divide`: "square-divide" = "square-divide".asInstanceOf["square-divide"]
    
    inline def `square-dollar`: "square-dollar" = "square-dollar".asInstanceOf["square-dollar"]
    
    inline def `square-down`: "square-down" = "square-down".asInstanceOf["square-down"]
    
    inline def `square-down-left`: "square-down-left" = "square-down-left".asInstanceOf["square-down-left"]
    
    inline def `square-down-right`: "square-down-right" = "square-down-right".asInstanceOf["square-down-right"]
    
    inline def `square-dribbble`: "square-dribbble" = "square-dribbble".asInstanceOf["square-dribbble"]
    
    inline def `square-e`: "square-e" = "square-e".asInstanceOf["square-e"]
    
    inline def `square-ellipsis`: "square-ellipsis" = "square-ellipsis".asInstanceOf["square-ellipsis"]
    
    inline def `square-ellipsis-vertical`: "square-ellipsis-vertical" = "square-ellipsis-vertical".asInstanceOf["square-ellipsis-vertical"]
    
    inline def `square-envelope`: "square-envelope" = "square-envelope".asInstanceOf["square-envelope"]
    
    inline def `square-exclamation`: "square-exclamation" = "square-exclamation".asInstanceOf["square-exclamation"]
    
    inline def `square-f`: "square-f" = "square-f".asInstanceOf["square-f"]
    
    inline def `square-facebook`: "square-facebook" = "square-facebook".asInstanceOf["square-facebook"]
    
    inline def `square-font-awesome`: "square-font-awesome" = "square-font-awesome".asInstanceOf["square-font-awesome"]
    
    inline def `square-font-awesome-stroke`: "square-font-awesome-stroke" = "square-font-awesome-stroke".asInstanceOf["square-font-awesome-stroke"]
    
    inline def `square-fragile`: "square-fragile" = "square-fragile".asInstanceOf["square-fragile"]
    
    inline def `square-full`: "square-full" = "square-full".asInstanceOf["square-full"]
    
    inline def `square-g`: "square-g" = "square-g".asInstanceOf["square-g"]
    
    inline def `square-git`: "square-git" = "square-git".asInstanceOf["square-git"]
    
    inline def `square-github`: "square-github" = "square-github".asInstanceOf["square-github"]
    
    inline def `square-gitlab`: "square-gitlab" = "square-gitlab".asInstanceOf["square-gitlab"]
    
    inline def `square-google-plus`: "square-google-plus" = "square-google-plus".asInstanceOf["square-google-plus"]
    
    inline def `square-h`: "square-h" = "square-h".asInstanceOf["square-h"]
    
    inline def `square-hacker-news`: "square-hacker-news" = "square-hacker-news".asInstanceOf["square-hacker-news"]
    
    inline def `square-heart`: "square-heart" = "square-heart".asInstanceOf["square-heart"]
    
    inline def `square-i`: "square-i" = "square-i".asInstanceOf["square-i"]
    
    inline def `square-info`: "square-info" = "square-info".asInstanceOf["square-info"]
    
    inline def `square-instagram`: "square-instagram" = "square-instagram".asInstanceOf["square-instagram"]
    
    inline def `square-j`: "square-j" = "square-j".asInstanceOf["square-j"]
    
    inline def `square-js`: "square-js" = "square-js".asInstanceOf["square-js"]
    
    inline def `square-k`: "square-k" = "square-k".asInstanceOf["square-k"]
    
    inline def `square-kanban`: "square-kanban" = "square-kanban".asInstanceOf["square-kanban"]
    
    inline def `square-l`: "square-l" = "square-l".asInstanceOf["square-l"]
    
    inline def `square-lastfm`: "square-lastfm" = "square-lastfm".asInstanceOf["square-lastfm"]
    
    inline def `square-left`: "square-left" = "square-left".asInstanceOf["square-left"]
    
    inline def `square-list`: "square-list" = "square-list".asInstanceOf["square-list"]
    
    inline def `square-m`: "square-m" = "square-m".asInstanceOf["square-m"]
    
    inline def `square-minus`: "square-minus" = "square-minus".asInstanceOf["square-minus"]
    
    inline def `square-n`: "square-n" = "square-n".asInstanceOf["square-n"]
    
    inline def `square-nfi`: "square-nfi" = "square-nfi".asInstanceOf["square-nfi"]
    
    inline def `square-o`: "square-o" = "square-o".asInstanceOf["square-o"]
    
    inline def `square-odnoklassniki`: "square-odnoklassniki" = "square-odnoklassniki".asInstanceOf["square-odnoklassniki"]
    
    inline def `square-p`: "square-p" = "square-p".asInstanceOf["square-p"]
    
    inline def `square-parking`: "square-parking" = "square-parking".asInstanceOf["square-parking"]
    
    inline def `square-parking-slash`: "square-parking-slash" = "square-parking-slash".asInstanceOf["square-parking-slash"]
    
    inline def `square-pen`: "square-pen" = "square-pen".asInstanceOf["square-pen"]
    
    inline def `square-person-confined`: "square-person-confined" = "square-person-confined".asInstanceOf["square-person-confined"]
    
    inline def `square-phone`: "square-phone" = "square-phone".asInstanceOf["square-phone"]
    
    inline def `square-phone-flip`: "square-phone-flip" = "square-phone-flip".asInstanceOf["square-phone-flip"]
    
    inline def `square-phone-hangup`: "square-phone-hangup" = "square-phone-hangup".asInstanceOf["square-phone-hangup"]
    
    inline def `square-pied-piper`: "square-pied-piper" = "square-pied-piper".asInstanceOf["square-pied-piper"]
    
    inline def `square-pinterest`: "square-pinterest" = "square-pinterest".asInstanceOf["square-pinterest"]
    
    inline def `square-plus`: "square-plus" = "square-plus".asInstanceOf["square-plus"]
    
    inline def `square-poll-horizontal`: "square-poll-horizontal" = "square-poll-horizontal".asInstanceOf["square-poll-horizontal"]
    
    inline def `square-poll-vertical`: "square-poll-vertical" = "square-poll-vertical".asInstanceOf["square-poll-vertical"]
    
    inline def `square-q`: "square-q" = "square-q".asInstanceOf["square-q"]
    
    inline def `square-quarters`: "square-quarters" = "square-quarters".asInstanceOf["square-quarters"]
    
    inline def `square-question`: "square-question" = "square-question".asInstanceOf["square-question"]
    
    inline def `square-quote`: "square-quote" = "square-quote".asInstanceOf["square-quote"]
    
    inline def `square-r`: "square-r" = "square-r".asInstanceOf["square-r"]
    
    inline def `square-reddit`: "square-reddit" = "square-reddit".asInstanceOf["square-reddit"]
    
    inline def `square-right`: "square-right" = "square-right".asInstanceOf["square-right"]
    
    inline def `square-ring`: "square-ring" = "square-ring".asInstanceOf["square-ring"]
    
    inline def `square-root`: "square-root" = "square-root".asInstanceOf["square-root"]
    
    inline def `square-root-alt`: "square-root-alt" = "square-root-alt".asInstanceOf["square-root-alt"]
    
    inline def `square-root-variable`: "square-root-variable" = "square-root-variable".asInstanceOf["square-root-variable"]
    
    inline def `square-rss`: "square-rss" = "square-rss".asInstanceOf["square-rss"]
    
    inline def `square-s`: "square-s" = "square-s".asInstanceOf["square-s"]
    
    inline def `square-share-nodes`: "square-share-nodes" = "square-share-nodes".asInstanceOf["square-share-nodes"]
    
    inline def `square-sliders`: "square-sliders" = "square-sliders".asInstanceOf["square-sliders"]
    
    inline def `square-sliders-vertical`: "square-sliders-vertical" = "square-sliders-vertical".asInstanceOf["square-sliders-vertical"]
    
    inline def `square-small`: "square-small" = "square-small".asInstanceOf["square-small"]
    
    inline def `square-snapchat`: "square-snapchat" = "square-snapchat".asInstanceOf["square-snapchat"]
    
    inline def `square-star`: "square-star" = "square-star".asInstanceOf["square-star"]
    
    inline def `square-steam`: "square-steam" = "square-steam".asInstanceOf["square-steam"]
    
    inline def `square-t`: "square-t" = "square-t".asInstanceOf["square-t"]
    
    inline def `square-terminal`: "square-terminal" = "square-terminal".asInstanceOf["square-terminal"]
    
    inline def `square-this-way-up`: "square-this-way-up" = "square-this-way-up".asInstanceOf["square-this-way-up"]
    
    inline def `square-tumblr`: "square-tumblr" = "square-tumblr".asInstanceOf["square-tumblr"]
    
    inline def `square-twitter`: "square-twitter" = "square-twitter".asInstanceOf["square-twitter"]
    
    inline def `square-u`: "square-u" = "square-u".asInstanceOf["square-u"]
    
    inline def `square-up`: "square-up" = "square-up".asInstanceOf["square-up"]
    
    inline def `square-up-left`: "square-up-left" = "square-up-left".asInstanceOf["square-up-left"]
    
    inline def `square-up-right`: "square-up-right" = "square-up-right".asInstanceOf["square-up-right"]
    
    inline def `square-user`: "square-user" = "square-user".asInstanceOf["square-user"]
    
    inline def `square-v`: "square-v" = "square-v".asInstanceOf["square-v"]
    
    inline def `square-viadeo`: "square-viadeo" = "square-viadeo".asInstanceOf["square-viadeo"]
    
    inline def `square-vimeo`: "square-vimeo" = "square-vimeo".asInstanceOf["square-vimeo"]
    
    inline def `square-virus`: "square-virus" = "square-virus".asInstanceOf["square-virus"]
    
    inline def `square-w`: "square-w" = "square-w".asInstanceOf["square-w"]
    
    inline def `square-whatsapp`: "square-whatsapp" = "square-whatsapp".asInstanceOf["square-whatsapp"]
    
    inline def `square-wine-glass-crack`: "square-wine-glass-crack" = "square-wine-glass-crack".asInstanceOf["square-wine-glass-crack"]
    
    inline def `square-x`: "square-x" = "square-x".asInstanceOf["square-x"]
    
    inline def `square-xing`: "square-xing" = "square-xing".asInstanceOf["square-xing"]
    
    inline def `square-xmark`: "square-xmark" = "square-xmark".asInstanceOf["square-xmark"]
    
    inline def `square-y`: "square-y" = "square-y".asInstanceOf["square-y"]
    
    inline def `square-youtube`: "square-youtube" = "square-youtube".asInstanceOf["square-youtube"]
    
    inline def `square-z`: "square-z" = "square-z".asInstanceOf["square-z"]
    
    inline def squarespace: "squarespace" = "squarespace".asInstanceOf["squarespace"]
    
    inline def squid: "squid" = "squid".asInstanceOf["squid"]
    
    inline def squirrel: "squirrel" = "squirrel".asInstanceOf["squirrel"]
    
    inline def `stack-exchange`: "stack-exchange" = "stack-exchange".asInstanceOf["stack-exchange"]
    
    inline def `stack-overflow`: "stack-overflow" = "stack-overflow".asInstanceOf["stack-overflow"]
    
    inline def stackpath: "stackpath" = "stackpath".asInstanceOf["stackpath"]
    
    inline def staff: "staff" = "staff".asInstanceOf["staff"]
    
    inline def `staff-aesculapius`: "staff-aesculapius" = "staff-aesculapius".asInstanceOf["staff-aesculapius"]
    
    inline def `staff-snake`: "staff-snake" = "staff-snake".asInstanceOf["staff-snake"]
    
    inline def stairs: "stairs" = "stairs".asInstanceOf["stairs"]
    
    inline def stamp: "stamp" = "stamp".asInstanceOf["stamp"]
    
    inline def `standard-definition`: "standard-definition" = "standard-definition".asInstanceOf["standard-definition"]
    
    inline def stapler: "stapler" = "stapler".asInstanceOf["stapler"]
    
    inline def star: "star" = "star".asInstanceOf["star"]
    
    inline def `star-and-crescent`: "star-and-crescent" = "star-and-crescent".asInstanceOf["star-and-crescent"]
    
    inline def `star-christmas`: "star-christmas" = "star-christmas".asInstanceOf["star-christmas"]
    
    inline def `star-circle`: "star-circle" = "star-circle".asInstanceOf["star-circle"]
    
    inline def `star-exclamation`: "star-exclamation" = "star-exclamation".asInstanceOf["star-exclamation"]
    
    inline def `star-half`: "star-half" = "star-half".asInstanceOf["star-half"]
    
    inline def `star-half-alt`: "star-half-alt" = "star-half-alt".asInstanceOf["star-half-alt"]
    
    inline def `star-half-stroke`: "star-half-stroke" = "star-half-stroke".asInstanceOf["star-half-stroke"]
    
    inline def `star-of-david`: "star-of-david" = "star-of-david".asInstanceOf["star-of-david"]
    
    inline def `star-of-life`: "star-of-life" = "star-of-life".asInstanceOf["star-of-life"]
    
    inline def `star-sharp`: "star-sharp" = "star-sharp".asInstanceOf["star-sharp"]
    
    inline def `star-sharp-half`: "star-sharp-half" = "star-sharp-half".asInstanceOf["star-sharp-half"]
    
    inline def `star-sharp-half-alt`: "star-sharp-half-alt" = "star-sharp-half-alt".asInstanceOf["star-sharp-half-alt"]
    
    inline def `star-sharp-half-stroke`: "star-sharp-half-stroke" = "star-sharp-half-stroke".asInstanceOf["star-sharp-half-stroke"]
    
    inline def `star-shooting`: "star-shooting" = "star-shooting".asInstanceOf["star-shooting"]
    
    inline def starfighter: "starfighter" = "starfighter".asInstanceOf["starfighter"]
    
    inline def `starfighter-alt`: "starfighter-alt" = "starfighter-alt".asInstanceOf["starfighter-alt"]
    
    inline def `starfighter-alt-advanced`: "starfighter-alt-advanced" = "starfighter-alt-advanced".asInstanceOf["starfighter-alt-advanced"]
    
    inline def `starfighter-twin-ion-engine`: "starfighter-twin-ion-engine" = "starfighter-twin-ion-engine".asInstanceOf["starfighter-twin-ion-engine"]
    
    inline def `starfighter-twin-ion-engine-advanced`: "starfighter-twin-ion-engine-advanced" = "starfighter-twin-ion-engine-advanced".asInstanceOf["starfighter-twin-ion-engine-advanced"]
    
    inline def stars: "stars" = "stars".asInstanceOf["stars"]
    
    inline def starship: "starship" = "starship".asInstanceOf["starship"]
    
    inline def `starship-freighter`: "starship-freighter" = "starship-freighter".asInstanceOf["starship-freighter"]
    
    inline def staylinked: "staylinked" = "staylinked".asInstanceOf["staylinked"]
    
    inline def steak: "steak" = "steak".asInstanceOf["steak"]
    
    inline def steam: "steam" = "steam".asInstanceOf["steam"]
    
    inline def `steam-square`: "steam-square" = "steam-square".asInstanceOf["steam-square"]
    
    inline def `steam-symbol`: "steam-symbol" = "steam-symbol".asInstanceOf["steam-symbol"]
    
    inline def `steering-wheel`: "steering-wheel" = "steering-wheel".asInstanceOf["steering-wheel"]
    
    inline def `step-backward`: "step-backward" = "step-backward".asInstanceOf["step-backward"]
    
    inline def `step-forward`: "step-forward" = "step-forward".asInstanceOf["step-forward"]
    
    inline def `sterling-sign`: "sterling-sign" = "sterling-sign".asInstanceOf["sterling-sign"]
    
    inline def stethoscope: "stethoscope" = "stethoscope".asInstanceOf["stethoscope"]
    
    inline def `sticker-mule`: "sticker-mule" = "sticker-mule".asInstanceOf["sticker-mule"]
    
    inline def `sticky-note`: "sticky-note" = "sticky-note".asInstanceOf["sticky-note"]
    
    inline def stocking: "stocking" = "stocking".asInstanceOf["stocking"]
    
    inline def stomach: "stomach" = "stomach".asInstanceOf["stomach"]
    
    inline def stop: "stop" = "stop".asInstanceOf["stop"]
    
    inline def `stop-circle`: "stop-circle" = "stop-circle".asInstanceOf["stop-circle"]
    
    inline def stopwatch: "stopwatch" = "stopwatch".asInstanceOf["stopwatch"]
    
    inline def `stopwatch-20`: "stopwatch-20" = "stopwatch-20".asInstanceOf["stopwatch-20"]
    
    inline def store: "store" = "store".asInstanceOf["store"]
    
    inline def `store-alt`: "store-alt" = "store-alt".asInstanceOf["store-alt"]
    
    inline def `store-alt-slash`: "store-alt-slash" = "store-alt-slash".asInstanceOf["store-alt-slash"]
    
    inline def `store-lock`: "store-lock" = "store-lock".asInstanceOf["store-lock"]
    
    inline def `store-slash`: "store-slash" = "store-slash".asInstanceOf["store-slash"]
    
    inline def strava: "strava" = "strava".asInstanceOf["strava"]
    
    inline def strawberry: "strawberry" = "strawberry".asInstanceOf["strawberry"]
    
    inline def stream: "stream" = "stream".asInstanceOf["stream"]
    
    inline def `street-view`: "street-view" = "street-view".asInstanceOf["street-view"]
    
    inline def stretcher: "stretcher" = "stretcher".asInstanceOf["stretcher"]
    
    inline def strikethrough: "strikethrough" = "strikethrough".asInstanceOf["strikethrough"]
    
    inline def stripe: "stripe" = "stripe".asInstanceOf["stripe"]
    
    inline def `stripe-s`: "stripe-s" = "stripe-s".asInstanceOf["stripe-s"]
    
    inline def stroopwafel: "stroopwafel" = "stroopwafel".asInstanceOf["stroopwafel"]
    
    inline def stubber: "stubber" = "stubber".asInstanceOf["stubber"]
    
    inline def studiovinari: "studiovinari" = "studiovinari".asInstanceOf["studiovinari"]
    
    inline def stumbleupon: "stumbleupon" = "stumbleupon".asInstanceOf["stumbleupon"]
    
    inline def `stumbleupon-circle`: "stumbleupon-circle" = "stumbleupon-circle".asInstanceOf["stumbleupon-circle"]
    
    inline def subscript: "subscript" = "subscript".asInstanceOf["subscript"]
    
    inline def subtract: "subtract" = "subtract".asInstanceOf["subtract"]
    
    inline def subway: "subway" = "subway".asInstanceOf["subway"]
    
    inline def `subway-tunnel`: "subway-tunnel" = "subway-tunnel".asInstanceOf["subway-tunnel"]
    
    inline def suitcase: "suitcase" = "suitcase".asInstanceOf["suitcase"]
    
    inline def `suitcase-medical`: "suitcase-medical" = "suitcase-medical".asInstanceOf["suitcase-medical"]
    
    inline def `suitcase-rolling`: "suitcase-rolling" = "suitcase-rolling".asInstanceOf["suitcase-rolling"]
    
    inline def sun: "sun" = "sun".asInstanceOf["sun"]
    
    inline def `sun-alt`: "sun-alt" = "sun-alt".asInstanceOf["sun-alt"]
    
    inline def `sun-bright`: "sun-bright" = "sun-bright".asInstanceOf["sun-bright"]
    
    inline def `sun-cloud`: "sun-cloud" = "sun-cloud".asInstanceOf["sun-cloud"]
    
    inline def `sun-dust`: "sun-dust" = "sun-dust".asInstanceOf["sun-dust"]
    
    inline def `sun-haze`: "sun-haze" = "sun-haze".asInstanceOf["sun-haze"]
    
    inline def `sun-plant-wilt`: "sun-plant-wilt" = "sun-plant-wilt".asInstanceOf["sun-plant-wilt"]
    
    inline def sunglasses: "sunglasses" = "sunglasses".asInstanceOf["sunglasses"]
    
    inline def sunrise: "sunrise" = "sunrise".asInstanceOf["sunrise"]
    
    inline def sunset: "sunset" = "sunset".asInstanceOf["sunset"]
    
    inline def superpowers: "superpowers" = "superpowers".asInstanceOf["superpowers"]
    
    inline def superscript: "superscript" = "superscript".asInstanceOf["superscript"]
    
    inline def supple: "supple" = "supple".asInstanceOf["supple"]
    
    inline def surprise: "surprise" = "surprise".asInstanceOf["surprise"]
    
    inline def suse: "suse" = "suse".asInstanceOf["suse"]
    
    inline def sushi: "sushi" = "sushi".asInstanceOf["sushi"]
    
    inline def `sushi-roll`: "sushi-roll" = "sushi-roll".asInstanceOf["sushi-roll"]
    
    inline def swatchbook: "swatchbook" = "swatchbook".asInstanceOf["swatchbook"]
    
    inline def swift: "swift" = "swift".asInstanceOf["swift"]
    
    inline def swimmer: "swimmer" = "swimmer".asInstanceOf["swimmer"]
    
    inline def `swimming-pool`: "swimming-pool" = "swimming-pool".asInstanceOf["swimming-pool"]
    
    inline def sword: "sword" = "sword".asInstanceOf["sword"]
    
    inline def `sword-laser`: "sword-laser" = "sword-laser".asInstanceOf["sword-laser"]
    
    inline def `sword-laser-alt`: "sword-laser-alt" = "sword-laser-alt".asInstanceOf["sword-laser-alt"]
    
    inline def swords: "swords" = "swords".asInstanceOf["swords"]
    
    inline def `swords-laser`: "swords-laser" = "swords-laser".asInstanceOf["swords-laser"]
    
    inline def symbols: "symbols" = "symbols".asInstanceOf["symbols"]
    
    inline def symfony: "symfony" = "symfony".asInstanceOf["symfony"]
    
    inline def synagogue: "synagogue" = "synagogue".asInstanceOf["synagogue"]
    
    inline def sync: "sync" = "sync".asInstanceOf["sync"]
    
    inline def `sync-alt`: "sync-alt" = "sync-alt".asInstanceOf["sync-alt"]
    
    inline def syringe: "syringe" = "syringe".asInstanceOf["syringe"]
    
    inline def t: "t" = "t".asInstanceOf["t"]
    
    inline def `t-shirt`: "t-shirt" = "t-shirt".asInstanceOf["t-shirt"]
    
    inline def table: "table" = "table".asInstanceOf["table"]
    
    inline def `table-cells`: "table-cells" = "table-cells".asInstanceOf["table-cells"]
    
    inline def `table-cells-large`: "table-cells-large" = "table-cells-large".asInstanceOf["table-cells-large"]
    
    inline def `table-columns`: "table-columns" = "table-columns".asInstanceOf["table-columns"]
    
    inline def `table-layout`: "table-layout" = "table-layout".asInstanceOf["table-layout"]
    
    inline def `table-list`: "table-list" = "table-list".asInstanceOf["table-list"]
    
    inline def `table-picnic`: "table-picnic" = "table-picnic".asInstanceOf["table-picnic"]
    
    inline def `table-pivot`: "table-pivot" = "table-pivot".asInstanceOf["table-pivot"]
    
    inline def `table-rows`: "table-rows" = "table-rows".asInstanceOf["table-rows"]
    
    inline def `table-tennis`: "table-tennis" = "table-tennis".asInstanceOf["table-tennis"]
    
    inline def `table-tennis-paddle-ball`: "table-tennis-paddle-ball" = "table-tennis-paddle-ball".asInstanceOf["table-tennis-paddle-ball"]
    
    inline def `table-tree`: "table-tree" = "table-tree".asInstanceOf["table-tree"]
    
    inline def tablet: "tablet" = "tablet".asInstanceOf["tablet"]
    
    inline def `tablet-alt`: "tablet-alt" = "tablet-alt".asInstanceOf["tablet-alt"]
    
    inline def `tablet-android`: "tablet-android" = "tablet-android".asInstanceOf["tablet-android"]
    
    inline def `tablet-android-alt`: "tablet-android-alt" = "tablet-android-alt".asInstanceOf["tablet-android-alt"]
    
    inline def `tablet-button`: "tablet-button" = "tablet-button".asInstanceOf["tablet-button"]
    
    inline def `tablet-rugged`: "tablet-rugged" = "tablet-rugged".asInstanceOf["tablet-rugged"]
    
    inline def `tablet-screen`: "tablet-screen" = "tablet-screen".asInstanceOf["tablet-screen"]
    
    inline def `tablet-screen-button`: "tablet-screen-button" = "tablet-screen-button".asInstanceOf["tablet-screen-button"]
    
    inline def tablets: "tablets" = "tablets".asInstanceOf["tablets"]
    
    inline def `tachograph-digital`: "tachograph-digital" = "tachograph-digital".asInstanceOf["tachograph-digital"]
    
    inline def tachometer: "tachometer" = "tachometer".asInstanceOf["tachometer"]
    
    inline def `tachometer-alt`: "tachometer-alt" = "tachometer-alt".asInstanceOf["tachometer-alt"]
    
    inline def `tachometer-alt-average`: "tachometer-alt-average" = "tachometer-alt-average".asInstanceOf["tachometer-alt-average"]
    
    inline def `tachometer-alt-fast`: "tachometer-alt-fast" = "tachometer-alt-fast".asInstanceOf["tachometer-alt-fast"]
    
    inline def `tachometer-alt-fastest`: "tachometer-alt-fastest" = "tachometer-alt-fastest".asInstanceOf["tachometer-alt-fastest"]
    
    inline def `tachometer-alt-slow`: "tachometer-alt-slow" = "tachometer-alt-slow".asInstanceOf["tachometer-alt-slow"]
    
    inline def `tachometer-alt-slowest`: "tachometer-alt-slowest" = "tachometer-alt-slowest".asInstanceOf["tachometer-alt-slowest"]
    
    inline def `tachometer-average`: "tachometer-average" = "tachometer-average".asInstanceOf["tachometer-average"]
    
    inline def `tachometer-fast`: "tachometer-fast" = "tachometer-fast".asInstanceOf["tachometer-fast"]
    
    inline def `tachometer-fastest`: "tachometer-fastest" = "tachometer-fastest".asInstanceOf["tachometer-fastest"]
    
    inline def `tachometer-slow`: "tachometer-slow" = "tachometer-slow".asInstanceOf["tachometer-slow"]
    
    inline def `tachometer-slowest`: "tachometer-slowest" = "tachometer-slowest".asInstanceOf["tachometer-slowest"]
    
    inline def taco: "taco" = "taco".asInstanceOf["taco"]
    
    inline def tag: "tag" = "tag".asInstanceOf["tag"]
    
    inline def tags: "tags" = "tags".asInstanceOf["tags"]
    
    inline def tally: "tally" = "tally".asInstanceOf["tally"]
    
    inline def `tally-1`: "tally-1" = "tally-1".asInstanceOf["tally-1"]
    
    inline def `tally-2`: "tally-2" = "tally-2".asInstanceOf["tally-2"]
    
    inline def `tally-3`: "tally-3" = "tally-3".asInstanceOf["tally-3"]
    
    inline def `tally-4`: "tally-4" = "tally-4".asInstanceOf["tally-4"]
    
    inline def tally5: "tally5" = "tally5".asInstanceOf["tally5"]
    
    inline def tamale: "tamale" = "tamale".asInstanceOf["tamale"]
    
    inline def tanakh: "tanakh" = "tanakh".asInstanceOf["tanakh"]
    
    inline def `tank-water`: "tank-water" = "tank-water".asInstanceOf["tank-water"]
    
    inline def tape: "tape" = "tape".asInstanceOf["tape"]
    
    inline def tarp: "tarp" = "tarp".asInstanceOf["tarp"]
    
    inline def `tarp-droplet`: "tarp-droplet" = "tarp-droplet".asInstanceOf["tarp-droplet"]
    
    inline def tasks: "tasks" = "tasks".asInstanceOf["tasks"]
    
    inline def `tasks-alt`: "tasks-alt" = "tasks-alt".asInstanceOf["tasks-alt"]
    
    inline def taxi: "taxi" = "taxi".asInstanceOf["taxi"]
    
    inline def `taxi-bus`: "taxi-bus" = "taxi-bus".asInstanceOf["taxi-bus"]
    
    inline def teamspeak: "teamspeak" = "teamspeak".asInstanceOf["teamspeak"]
    
    inline def `teddy-bear`: "teddy-bear" = "teddy-bear".asInstanceOf["teddy-bear"]
    
    inline def teeth: "teeth" = "teeth".asInstanceOf["teeth"]
    
    inline def `teeth-open`: "teeth-open" = "teeth-open".asInstanceOf["teeth-open"]
    
    inline def telegram: "telegram" = "telegram".asInstanceOf["telegram"]
    
    inline def `telegram-plane`: "telegram-plane" = "telegram-plane".asInstanceOf["telegram-plane"]
    
    inline def telescope: "telescope" = "telescope".asInstanceOf["telescope"]
    
    inline def teletype: "teletype" = "teletype".asInstanceOf["teletype"]
    
    inline def `teletype-answer`: "teletype-answer" = "teletype-answer".asInstanceOf["teletype-answer"]
    
    inline def television: "television" = "television".asInstanceOf["television"]
    
    inline def `temperature-arrow-down`: "temperature-arrow-down" = "temperature-arrow-down".asInstanceOf["temperature-arrow-down"]
    
    inline def `temperature-arrow-up`: "temperature-arrow-up" = "temperature-arrow-up".asInstanceOf["temperature-arrow-up"]
    
    inline def `temperature-down`: "temperature-down" = "temperature-down".asInstanceOf["temperature-down"]
    
    inline def `temperature-empty`: "temperature-empty" = "temperature-empty".asInstanceOf["temperature-empty"]
    
    inline def `temperature-frigid`: "temperature-frigid" = "temperature-frigid".asInstanceOf["temperature-frigid"]
    
    inline def `temperature-full`: "temperature-full" = "temperature-full".asInstanceOf["temperature-full"]
    
    inline def `temperature-half`: "temperature-half" = "temperature-half".asInstanceOf["temperature-half"]
    
    inline def `temperature-high`: "temperature-high" = "temperature-high".asInstanceOf["temperature-high"]
    
    inline def `temperature-hot`: "temperature-hot" = "temperature-hot".asInstanceOf["temperature-hot"]
    
    inline def `temperature-list`: "temperature-list" = "temperature-list".asInstanceOf["temperature-list"]
    
    inline def `temperature-low`: "temperature-low" = "temperature-low".asInstanceOf["temperature-low"]
    
    inline def `temperature-quarter`: "temperature-quarter" = "temperature-quarter".asInstanceOf["temperature-quarter"]
    
    inline def `temperature-snow`: "temperature-snow" = "temperature-snow".asInstanceOf["temperature-snow"]
    
    inline def `temperature-sun`: "temperature-sun" = "temperature-sun".asInstanceOf["temperature-sun"]
    
    inline def `temperature-three-quarters`: "temperature-three-quarters" = "temperature-three-quarters".asInstanceOf["temperature-three-quarters"]
    
    inline def `temperature-up`: "temperature-up" = "temperature-up".asInstanceOf["temperature-up"]
    
    inline def temperature0: "temperature0" = "temperature0".asInstanceOf["temperature0"]
    
    inline def temperature1: "temperature1" = "temperature1".asInstanceOf["temperature1"]
    
    inline def temperature2: "temperature2" = "temperature2".asInstanceOf["temperature2"]
    
    inline def temperature3: "temperature3" = "temperature3".asInstanceOf["temperature3"]
    
    inline def temperature4: "temperature4" = "temperature4".asInstanceOf["temperature4"]
    
    inline def `tencent-weibo`: "tencent-weibo" = "tencent-weibo".asInstanceOf["tencent-weibo"]
    
    inline def tenge: "tenge" = "tenge".asInstanceOf["tenge"]
    
    inline def `tenge-sign`: "tenge-sign" = "tenge-sign".asInstanceOf["tenge-sign"]
    
    inline def `tennis-ball`: "tennis-ball" = "tennis-ball".asInstanceOf["tennis-ball"]
    
    inline def tent: "tent" = "tent".asInstanceOf["tent"]
    
    inline def `tent-arrow-down-to-line`: "tent-arrow-down-to-line" = "tent-arrow-down-to-line".asInstanceOf["tent-arrow-down-to-line"]
    
    inline def `tent-arrow-left-right`: "tent-arrow-left-right" = "tent-arrow-left-right".asInstanceOf["tent-arrow-left-right"]
    
    inline def `tent-arrow-turn-left`: "tent-arrow-turn-left" = "tent-arrow-turn-left".asInstanceOf["tent-arrow-turn-left"]
    
    inline def `tent-arrows-down`: "tent-arrows-down" = "tent-arrows-down".asInstanceOf["tent-arrows-down"]
    
    inline def tents: "tents" = "tents".asInstanceOf["tents"]
    
    inline def terminal: "terminal" = "terminal".asInstanceOf["terminal"]
    
    inline def text: "text" = "text".asInstanceOf["text"]
    
    inline def `text-height`: "text-height" = "text-height".asInstanceOf["text-height"]
    
    inline def `text-size`: "text-size" = "text-size".asInstanceOf["text-size"]
    
    inline def `text-slash`: "text-slash" = "text-slash".asInstanceOf["text-slash"]
    
    inline def `text-width`: "text-width" = "text-width".asInstanceOf["text-width"]
    
    inline def th: "th" = "th".asInstanceOf["th"]
    
    inline def `th-large`: "th-large" = "th-large".asInstanceOf["th-large"]
    
    inline def `th-list`: "th-list" = "th-list".asInstanceOf["th-list"]
    
    inline def `the-red-yeti`: "the-red-yeti" = "the-red-yeti".asInstanceOf["the-red-yeti"]
    
    inline def `theater-masks`: "theater-masks" = "theater-masks".asInstanceOf["theater-masks"]
    
    inline def themeco: "themeco" = "themeco".asInstanceOf["themeco"]
    
    inline def themeisle: "themeisle" = "themeisle".asInstanceOf["themeisle"]
    
    inline def thermometer: "thermometer" = "thermometer".asInstanceOf["thermometer"]
    
    inline def `thermometer-empty`: "thermometer-empty" = "thermometer-empty".asInstanceOf["thermometer-empty"]
    
    inline def `thermometer-full`: "thermometer-full" = "thermometer-full".asInstanceOf["thermometer-full"]
    
    inline def `thermometer-half`: "thermometer-half" = "thermometer-half".asInstanceOf["thermometer-half"]
    
    inline def `thermometer-quarter`: "thermometer-quarter" = "thermometer-quarter".asInstanceOf["thermometer-quarter"]
    
    inline def `thermometer-three-quarters`: "thermometer-three-quarters" = "thermometer-three-quarters".asInstanceOf["thermometer-three-quarters"]
    
    inline def thermometer0: "thermometer0" = "thermometer0".asInstanceOf["thermometer0"]
    
    inline def thermometer1: "thermometer1" = "thermometer1".asInstanceOf["thermometer1"]
    
    inline def thermometer2: "thermometer2" = "thermometer2".asInstanceOf["thermometer2"]
    
    inline def thermometer3: "thermometer3" = "thermometer3".asInstanceOf["thermometer3"]
    
    inline def thermometer4: "thermometer4" = "thermometer4".asInstanceOf["thermometer4"]
    
    inline def theta: "theta" = "theta".asInstanceOf["theta"]
    
    inline def `think-peaks`: "think-peaks" = "think-peaks".asInstanceOf["think-peaks"]
    
    inline def `thought-bubble`: "thought-bubble" = "thought-bubble".asInstanceOf["thought-bubble"]
    
    inline def `thumb-tack`: "thumb-tack" = "thumb-tack".asInstanceOf["thumb-tack"]
    
    inline def `thumbs-down`: "thumbs-down" = "thumbs-down".asInstanceOf["thumbs-down"]
    
    inline def `thumbs-up`: "thumbs-up" = "thumbs-up".asInstanceOf["thumbs-up"]
    
    inline def thumbtack: "thumbtack" = "thumbtack".asInstanceOf["thumbtack"]
    
    inline def thunderstorm: "thunderstorm" = "thunderstorm".asInstanceOf["thunderstorm"]
    
    inline def `thunderstorm-moon`: "thunderstorm-moon" = "thunderstorm-moon".asInstanceOf["thunderstorm-moon"]
    
    inline def `thunderstorm-sun`: "thunderstorm-sun" = "thunderstorm-sun".asInstanceOf["thunderstorm-sun"]
    
    inline def tick: "tick" = "tick".asInstanceOf["tick"]
    
    inline def ticket: "ticket" = "ticket".asInstanceOf["ticket"]
    
    inline def `ticket-airline`: "ticket-airline" = "ticket-airline".asInstanceOf["ticket-airline"]
    
    inline def `ticket-alt`: "ticket-alt" = "ticket-alt".asInstanceOf["ticket-alt"]
    
    inline def `ticket-simple`: "ticket-simple" = "ticket-simple".asInstanceOf["ticket-simple"]
    
    inline def `tickets-airline`: "tickets-airline" = "tickets-airline".asInstanceOf["tickets-airline"]
    
    inline def tiktok: "tiktok" = "tiktok".asInstanceOf["tiktok"]
    
    inline def tilde: "tilde" = "tilde".asInstanceOf["tilde"]
    
    inline def timeline: "timeline" = "timeline".asInstanceOf["timeline"]
    
    inline def `timeline-arrow`: "timeline-arrow" = "timeline-arrow".asInstanceOf["timeline-arrow"]
    
    inline def timer: "timer" = "timer".asInstanceOf["timer"]
    
    inline def times: "times" = "times".asInstanceOf["times"]
    
    inline def `times-circle`: "times-circle" = "times-circle".asInstanceOf["times-circle"]
    
    inline def `times-hexagon`: "times-hexagon" = "times-hexagon".asInstanceOf["times-hexagon"]
    
    inline def `times-octagon`: "times-octagon" = "times-octagon".asInstanceOf["times-octagon"]
    
    inline def `times-rectangle`: "times-rectangle" = "times-rectangle".asInstanceOf["times-rectangle"]
    
    inline def `times-square`: "times-square" = "times-square".asInstanceOf["times-square"]
    
    inline def `times-to-slot`: "times-to-slot" = "times-to-slot".asInstanceOf["times-to-slot"]
    
    inline def tint: "tint" = "tint".asInstanceOf["tint"]
    
    inline def `tint-slash`: "tint-slash" = "tint-slash".asInstanceOf["tint-slash"]
    
    inline def tire: "tire" = "tire".asInstanceOf["tire"]
    
    inline def `tire-flat`: "tire-flat" = "tire-flat".asInstanceOf["tire-flat"]
    
    inline def `tire-pressure-warning`: "tire-pressure-warning" = "tire-pressure-warning".asInstanceOf["tire-pressure-warning"]
    
    inline def `tire-rugged`: "tire-rugged" = "tire-rugged".asInstanceOf["tire-rugged"]
    
    inline def tired: "tired" = "tired".asInstanceOf["tired"]
    
    inline def `toggle-large-off`: "toggle-large-off" = "toggle-large-off".asInstanceOf["toggle-large-off"]
    
    inline def `toggle-large-on`: "toggle-large-on" = "toggle-large-on".asInstanceOf["toggle-large-on"]
    
    inline def `toggle-off`: "toggle-off" = "toggle-off".asInstanceOf["toggle-off"]
    
    inline def `toggle-on`: "toggle-on" = "toggle-on".asInstanceOf["toggle-on"]
    
    inline def toilet: "toilet" = "toilet".asInstanceOf["toilet"]
    
    inline def `toilet-paper`: "toilet-paper" = "toilet-paper".asInstanceOf["toilet-paper"]
    
    inline def `toilet-paper-alt`: "toilet-paper-alt" = "toilet-paper-alt".asInstanceOf["toilet-paper-alt"]
    
    inline def `toilet-paper-blank`: "toilet-paper-blank" = "toilet-paper-blank".asInstanceOf["toilet-paper-blank"]
    
    inline def `toilet-paper-blank-under`: "toilet-paper-blank-under" = "toilet-paper-blank-under".asInstanceOf["toilet-paper-blank-under"]
    
    inline def `toilet-paper-check`: "toilet-paper-check" = "toilet-paper-check".asInstanceOf["toilet-paper-check"]
    
    inline def `toilet-paper-reverse`: "toilet-paper-reverse" = "toilet-paper-reverse".asInstanceOf["toilet-paper-reverse"]
    
    inline def `toilet-paper-reverse-alt`: "toilet-paper-reverse-alt" = "toilet-paper-reverse-alt".asInstanceOf["toilet-paper-reverse-alt"]
    
    inline def `toilet-paper-reverse-slash`: "toilet-paper-reverse-slash" = "toilet-paper-reverse-slash".asInstanceOf["toilet-paper-reverse-slash"]
    
    inline def `toilet-paper-slash`: "toilet-paper-slash" = "toilet-paper-slash".asInstanceOf["toilet-paper-slash"]
    
    inline def `toilet-paper-under`: "toilet-paper-under" = "toilet-paper-under".asInstanceOf["toilet-paper-under"]
    
    inline def `toilet-paper-under-slash`: "toilet-paper-under-slash" = "toilet-paper-under-slash".asInstanceOf["toilet-paper-under-slash"]
    
    inline def `toilet-paper-xmark`: "toilet-paper-xmark" = "toilet-paper-xmark".asInstanceOf["toilet-paper-xmark"]
    
    inline def `toilet-portable`: "toilet-portable" = "toilet-portable".asInstanceOf["toilet-portable"]
    
    inline def `toilets-portable`: "toilets-portable" = "toilets-portable".asInstanceOf["toilets-portable"]
    
    inline def tomato: "tomato" = "tomato".asInstanceOf["tomato"]
    
    inline def tombstone: "tombstone" = "tombstone".asInstanceOf["tombstone"]
    
    inline def `tombstone-alt`: "tombstone-alt" = "tombstone-alt".asInstanceOf["tombstone-alt"]
    
    inline def `tombstone-blank`: "tombstone-blank" = "tombstone-blank".asInstanceOf["tombstone-blank"]
    
    inline def toolbox: "toolbox" = "toolbox".asInstanceOf["toolbox"]
    
    inline def tools: "tools" = "tools".asInstanceOf["tools"]
    
    inline def tooth: "tooth" = "tooth".asInstanceOf["tooth"]
    
    inline def toothbrush: "toothbrush" = "toothbrush".asInstanceOf["toothbrush"]
    
    inline def torah: "torah" = "torah".asInstanceOf["torah"]
    
    inline def `torii-gate`: "torii-gate" = "torii-gate".asInstanceOf["torii-gate"]
    
    inline def tornado: "tornado" = "tornado".asInstanceOf["tornado"]
    
    inline def `tower-broadcast`: "tower-broadcast" = "tower-broadcast".asInstanceOf["tower-broadcast"]
    
    inline def `tower-cell`: "tower-cell" = "tower-cell".asInstanceOf["tower-cell"]
    
    inline def `tower-control`: "tower-control" = "tower-control".asInstanceOf["tower-control"]
    
    inline def `tower-observation`: "tower-observation" = "tower-observation".asInstanceOf["tower-observation"]
    
    inline def tractor: "tractor" = "tractor".asInstanceOf["tractor"]
    
    inline def `trade-federation`: "trade-federation" = "trade-federation".asInstanceOf["trade-federation"]
    
    inline def trademark: "trademark" = "trademark".asInstanceOf["trademark"]
    
    inline def `traffic-cone`: "traffic-cone" = "traffic-cone".asInstanceOf["traffic-cone"]
    
    inline def `traffic-light`: "traffic-light" = "traffic-light".asInstanceOf["traffic-light"]
    
    inline def `traffic-light-go`: "traffic-light-go" = "traffic-light-go".asInstanceOf["traffic-light-go"]
    
    inline def `traffic-light-slow`: "traffic-light-slow" = "traffic-light-slow".asInstanceOf["traffic-light-slow"]
    
    inline def `traffic-light-stop`: "traffic-light-stop" = "traffic-light-stop".asInstanceOf["traffic-light-stop"]
    
    inline def trailer: "trailer" = "trailer".asInstanceOf["trailer"]
    
    inline def train: "train" = "train".asInstanceOf["train"]
    
    inline def `train-subway`: "train-subway" = "train-subway".asInstanceOf["train-subway"]
    
    inline def `train-subway-tunnel`: "train-subway-tunnel" = "train-subway-tunnel".asInstanceOf["train-subway-tunnel"]
    
    inline def `train-track`: "train-track" = "train-track".asInstanceOf["train-track"]
    
    inline def `train-tram`: "train-tram" = "train-tram".asInstanceOf["train-tram"]
    
    inline def `train-tunnel`: "train-tunnel" = "train-tunnel".asInstanceOf["train-tunnel"]
    
    inline def tram: "tram" = "tram".asInstanceOf["tram"]
    
    inline def `transformer-bolt`: "transformer-bolt" = "transformer-bolt".asInstanceOf["transformer-bolt"]
    
    inline def transgender: "transgender" = "transgender".asInstanceOf["transgender"]
    
    inline def `transgender-alt`: "transgender-alt" = "transgender-alt".asInstanceOf["transgender-alt"]
    
    inline def transporter: "transporter" = "transporter".asInstanceOf["transporter"]
    
    inline def `transporter-1`: "transporter-1" = "transporter-1".asInstanceOf["transporter-1"]
    
    inline def `transporter-2`: "transporter-2" = "transporter-2".asInstanceOf["transporter-2"]
    
    inline def `transporter-3`: "transporter-3" = "transporter-3".asInstanceOf["transporter-3"]
    
    inline def `transporter-4`: "transporter-4" = "transporter-4".asInstanceOf["transporter-4"]
    
    inline def `transporter-5`: "transporter-5" = "transporter-5".asInstanceOf["transporter-5"]
    
    inline def `transporter-6`: "transporter-6" = "transporter-6".asInstanceOf["transporter-6"]
    
    inline def `transporter-7`: "transporter-7" = "transporter-7".asInstanceOf["transporter-7"]
    
    inline def `transporter-empty`: "transporter-empty" = "transporter-empty".asInstanceOf["transporter-empty"]
    
    inline def trash: "trash" = "trash".asInstanceOf["trash"]
    
    inline def `trash-alt`: "trash-alt" = "trash-alt".asInstanceOf["trash-alt"]
    
    inline def `trash-alt-slash`: "trash-alt-slash" = "trash-alt-slash".asInstanceOf["trash-alt-slash"]
    
    inline def `trash-arrow-turn-left`: "trash-arrow-turn-left" = "trash-arrow-turn-left".asInstanceOf["trash-arrow-turn-left"]
    
    inline def `trash-arrow-up`: "trash-arrow-up" = "trash-arrow-up".asInstanceOf["trash-arrow-up"]
    
    inline def `trash-can`: "trash-can" = "trash-can".asInstanceOf["trash-can"]
    
    inline def `trash-can-arrow-turn-left`: "trash-can-arrow-turn-left" = "trash-can-arrow-turn-left".asInstanceOf["trash-can-arrow-turn-left"]
    
    inline def `trash-can-arrow-up`: "trash-can-arrow-up" = "trash-can-arrow-up".asInstanceOf["trash-can-arrow-up"]
    
    inline def `trash-can-check`: "trash-can-check" = "trash-can-check".asInstanceOf["trash-can-check"]
    
    inline def `trash-can-clock`: "trash-can-clock" = "trash-can-clock".asInstanceOf["trash-can-clock"]
    
    inline def `trash-can-list`: "trash-can-list" = "trash-can-list".asInstanceOf["trash-can-list"]
    
    inline def `trash-can-plus`: "trash-can-plus" = "trash-can-plus".asInstanceOf["trash-can-plus"]
    
    inline def `trash-can-slash`: "trash-can-slash" = "trash-can-slash".asInstanceOf["trash-can-slash"]
    
    inline def `trash-can-undo`: "trash-can-undo" = "trash-can-undo".asInstanceOf["trash-can-undo"]
    
    inline def `trash-can-xmark`: "trash-can-xmark" = "trash-can-xmark".asInstanceOf["trash-can-xmark"]
    
    inline def `trash-check`: "trash-check" = "trash-check".asInstanceOf["trash-check"]
    
    inline def `trash-circle`: "trash-circle" = "trash-circle".asInstanceOf["trash-circle"]
    
    inline def `trash-clock`: "trash-clock" = "trash-clock".asInstanceOf["trash-clock"]
    
    inline def `trash-list`: "trash-list" = "trash-list".asInstanceOf["trash-list"]
    
    inline def `trash-plus`: "trash-plus" = "trash-plus".asInstanceOf["trash-plus"]
    
    inline def `trash-restore`: "trash-restore" = "trash-restore".asInstanceOf["trash-restore"]
    
    inline def `trash-restore-alt`: "trash-restore-alt" = "trash-restore-alt".asInstanceOf["trash-restore-alt"]
    
    inline def `trash-slash`: "trash-slash" = "trash-slash".asInstanceOf["trash-slash"]
    
    inline def `trash-undo`: "trash-undo" = "trash-undo".asInstanceOf["trash-undo"]
    
    inline def `trash-undo-alt`: "trash-undo-alt" = "trash-undo-alt".asInstanceOf["trash-undo-alt"]
    
    inline def `trash-xmark`: "trash-xmark" = "trash-xmark".asInstanceOf["trash-xmark"]
    
    inline def `treasure-chest`: "treasure-chest" = "treasure-chest".asInstanceOf["treasure-chest"]
    
    inline def tree: "tree" = "tree".asInstanceOf["tree"]
    
    inline def `tree-alt`: "tree-alt" = "tree-alt".asInstanceOf["tree-alt"]
    
    inline def `tree-christmas`: "tree-christmas" = "tree-christmas".asInstanceOf["tree-christmas"]
    
    inline def `tree-city`: "tree-city" = "tree-city".asInstanceOf["tree-city"]
    
    inline def `tree-deciduous`: "tree-deciduous" = "tree-deciduous".asInstanceOf["tree-deciduous"]
    
    inline def `tree-decorated`: "tree-decorated" = "tree-decorated".asInstanceOf["tree-decorated"]
    
    inline def `tree-large`: "tree-large" = "tree-large".asInstanceOf["tree-large"]
    
    inline def `tree-palm`: "tree-palm" = "tree-palm".asInstanceOf["tree-palm"]
    
    inline def trees: "trees" = "trees".asInstanceOf["trees"]
    
    inline def trello: "trello" = "trello".asInstanceOf["trello"]
    
    inline def `trian-balbot`: "trian-balbot" = "trian-balbot".asInstanceOf["trian-balbot"]
    
    inline def triangle: "triangle" = "triangle".asInstanceOf["triangle"]
    
    inline def `triangle-circle-square`: "triangle-circle-square" = "triangle-circle-square".asInstanceOf["triangle-circle-square"]
    
    inline def `triangle-exclamation`: "triangle-exclamation" = "triangle-exclamation".asInstanceOf["triangle-exclamation"]
    
    inline def `triangle-instrument`: "triangle-instrument" = "triangle-instrument".asInstanceOf["triangle-instrument"]
    
    inline def `triangle-music`: "triangle-music" = "triangle-music".asInstanceOf["triangle-music"]
    
    inline def `triangle-person-digging`: "triangle-person-digging" = "triangle-person-digging".asInstanceOf["triangle-person-digging"]
    
    inline def tricycle: "tricycle" = "tricycle".asInstanceOf["tricycle"]
    
    inline def `tricycle-adult`: "tricycle-adult" = "tricycle-adult".asInstanceOf["tricycle-adult"]
    
    inline def trillium: "trillium" = "trillium".asInstanceOf["trillium"]
    
    inline def trophy: "trophy" = "trophy".asInstanceOf["trophy"]
    
    inline def `trophy-alt`: "trophy-alt" = "trophy-alt".asInstanceOf["trophy-alt"]
    
    inline def `trophy-star`: "trophy-star" = "trophy-star".asInstanceOf["trophy-star"]
    
    inline def trowel: "trowel" = "trowel".asInstanceOf["trowel"]
    
    inline def `trowel-bricks`: "trowel-bricks" = "trowel-bricks".asInstanceOf["trowel-bricks"]
    
    inline def truck: "truck" = "truck".asInstanceOf["truck"]
    
    inline def `truck-arrow-right`: "truck-arrow-right" = "truck-arrow-right".asInstanceOf["truck-arrow-right"]
    
    inline def `truck-bolt`: "truck-bolt" = "truck-bolt".asInstanceOf["truck-bolt"]
    
    inline def `truck-clock`: "truck-clock" = "truck-clock".asInstanceOf["truck-clock"]
    
    inline def `truck-container`: "truck-container" = "truck-container".asInstanceOf["truck-container"]
    
    inline def `truck-container-empty`: "truck-container-empty" = "truck-container-empty".asInstanceOf["truck-container-empty"]
    
    inline def `truck-couch`: "truck-couch" = "truck-couch".asInstanceOf["truck-couch"]
    
    inline def `truck-droplet`: "truck-droplet" = "truck-droplet".asInstanceOf["truck-droplet"]
    
    inline def `truck-fast`: "truck-fast" = "truck-fast".asInstanceOf["truck-fast"]
    
    inline def `truck-field`: "truck-field" = "truck-field".asInstanceOf["truck-field"]
    
    inline def `truck-field-un`: "truck-field-un" = "truck-field-un".asInstanceOf["truck-field-un"]
    
    inline def `truck-flatbed`: "truck-flatbed" = "truck-flatbed".asInstanceOf["truck-flatbed"]
    
    inline def `truck-front`: "truck-front" = "truck-front".asInstanceOf["truck-front"]
    
    inline def `truck-loading`: "truck-loading" = "truck-loading".asInstanceOf["truck-loading"]
    
    inline def `truck-medical`: "truck-medical" = "truck-medical".asInstanceOf["truck-medical"]
    
    inline def `truck-monster`: "truck-monster" = "truck-monster".asInstanceOf["truck-monster"]
    
    inline def `truck-moving`: "truck-moving" = "truck-moving".asInstanceOf["truck-moving"]
    
    inline def `truck-pickup`: "truck-pickup" = "truck-pickup".asInstanceOf["truck-pickup"]
    
    inline def `truck-plane`: "truck-plane" = "truck-plane".asInstanceOf["truck-plane"]
    
    inline def `truck-plow`: "truck-plow" = "truck-plow".asInstanceOf["truck-plow"]
    
    inline def `truck-ramp`: "truck-ramp" = "truck-ramp".asInstanceOf["truck-ramp"]
    
    inline def `truck-ramp-box`: "truck-ramp-box" = "truck-ramp-box".asInstanceOf["truck-ramp-box"]
    
    inline def `truck-ramp-couch`: "truck-ramp-couch" = "truck-ramp-couch".asInstanceOf["truck-ramp-couch"]
    
    inline def `truck-tow`: "truck-tow" = "truck-tow".asInstanceOf["truck-tow"]
    
    inline def trumpet: "trumpet" = "trumpet".asInstanceOf["trumpet"]
    
    inline def `try`: "try" = "try".asInstanceOf["try"]
    
    inline def tshirt: "tshirt" = "tshirt".asInstanceOf["tshirt"]
    
    inline def tty: "tty" = "tty".asInstanceOf["tty"]
    
    inline def `tty-answer`: "tty-answer" = "tty-answer".asInstanceOf["tty-answer"]
    
    inline def `tugrik-sign`: "tugrik-sign" = "tugrik-sign".asInstanceOf["tugrik-sign"]
    
    inline def tumblr: "tumblr" = "tumblr".asInstanceOf["tumblr"]
    
    inline def `tumblr-square`: "tumblr-square" = "tumblr-square".asInstanceOf["tumblr-square"]
    
    inline def turkey: "turkey" = "turkey".asInstanceOf["turkey"]
    
    inline def `turkish-lira`: "turkish-lira" = "turkish-lira".asInstanceOf["turkish-lira"]
    
    inline def `turkish-lira-sign`: "turkish-lira-sign" = "turkish-lira-sign".asInstanceOf["turkish-lira-sign"]
    
    inline def `turn-down`: "turn-down" = "turn-down".asInstanceOf["turn-down"]
    
    inline def `turn-down-left`: "turn-down-left" = "turn-down-left".asInstanceOf["turn-down-left"]
    
    inline def `turn-down-right`: "turn-down-right" = "turn-down-right".asInstanceOf["turn-down-right"]
    
    inline def `turn-up`: "turn-up" = "turn-up".asInstanceOf["turn-up"]
    
    inline def turntable: "turntable" = "turntable".asInstanceOf["turntable"]
    
    inline def turtle: "turtle" = "turtle".asInstanceOf["turtle"]
    
    inline def tv: "tv" = "tv".asInstanceOf["tv"]
    
    inline def `tv-alt`: "tv-alt" = "tv-alt".asInstanceOf["tv-alt"]
    
    inline def `tv-music`: "tv-music" = "tv-music".asInstanceOf["tv-music"]
    
    inline def `tv-retro`: "tv-retro" = "tv-retro".asInstanceOf["tv-retro"]
    
    inline def twitch: "twitch" = "twitch".asInstanceOf["twitch"]
    
    inline def twitter: "twitter" = "twitter".asInstanceOf["twitter"]
    
    inline def `twitter-square`: "twitter-square" = "twitter-square".asInstanceOf["twitter-square"]
    
    inline def typewriter: "typewriter" = "typewriter".asInstanceOf["typewriter"]
    
    inline def typo3: "typo3" = "typo3".asInstanceOf["typo3"]
    
    inline def u: "u" = "u".asInstanceOf["u"]
    
    inline def uber: "uber" = "uber".asInstanceOf["uber"]
    
    inline def ubuntu: "ubuntu" = "ubuntu".asInstanceOf["ubuntu"]
    
    inline def ufo: "ufo" = "ufo".asInstanceOf["ufo"]
    
    inline def `ufo-beam`: "ufo-beam" = "ufo-beam".asInstanceOf["ufo-beam"]
    
    inline def uikit: "uikit" = "uikit".asInstanceOf["uikit"]
    
    inline def umbraco: "umbraco" = "umbraco".asInstanceOf["umbraco"]
    
    inline def umbrella: "umbrella" = "umbrella".asInstanceOf["umbrella"]
    
    inline def `umbrella-alt`: "umbrella-alt" = "umbrella-alt".asInstanceOf["umbrella-alt"]
    
    inline def `umbrella-beach`: "umbrella-beach" = "umbrella-beach".asInstanceOf["umbrella-beach"]
    
    inline def `umbrella-simple`: "umbrella-simple" = "umbrella-simple".asInstanceOf["umbrella-simple"]
    
    inline def uncharted: "uncharted" = "uncharted".asInstanceOf["uncharted"]
    
    inline def underline: "underline" = "underline".asInstanceOf["underline"]
    
    inline def undo: "undo" = "undo".asInstanceOf["undo"]
    
    inline def `undo-alt`: "undo-alt" = "undo-alt".asInstanceOf["undo-alt"]
    
    inline def unicorn: "unicorn" = "unicorn".asInstanceOf["unicorn"]
    
    inline def `uniform-martial-arts`: "uniform-martial-arts" = "uniform-martial-arts".asInstanceOf["uniform-martial-arts"]
    
    inline def union: "union" = "union".asInstanceOf["union"]
    
    inline def uniregistry: "uniregistry" = "uniregistry".asInstanceOf["uniregistry"]
    
    inline def unity: "unity" = "unity".asInstanceOf["unity"]
    
    inline def `universal-access`: "universal-access" = "universal-access".asInstanceOf["universal-access"]
    
    inline def university: "university" = "university".asInstanceOf["university"]
    
    inline def unlink: "unlink" = "unlink".asInstanceOf["unlink"]
    
    inline def unlock: "unlock" = "unlock".asInstanceOf["unlock"]
    
    inline def `unlock-alt`: "unlock-alt" = "unlock-alt".asInstanceOf["unlock-alt"]
    
    inline def `unlock-keyhole`: "unlock-keyhole" = "unlock-keyhole".asInstanceOf["unlock-keyhole"]
    
    inline def unsorted: "unsorted" = "unsorted".asInstanceOf["unsorted"]
    
    inline def unsplash: "unsplash" = "unsplash".asInstanceOf["unsplash"]
    
    inline def untappd: "untappd" = "untappd".asInstanceOf["untappd"]
    
    inline def up: "up" = "up".asInstanceOf["up"]
    
    inline def `up-down`: "up-down" = "up-down".asInstanceOf["up-down"]
    
    inline def `up-down-left-right`: "up-down-left-right" = "up-down-left-right".asInstanceOf["up-down-left-right"]
    
    inline def `up-from-bracket`: "up-from-bracket" = "up-from-bracket".asInstanceOf["up-from-bracket"]
    
    inline def `up-from-dotted-line`: "up-from-dotted-line" = "up-from-dotted-line".asInstanceOf["up-from-dotted-line"]
    
    inline def `up-from-line`: "up-from-line" = "up-from-line".asInstanceOf["up-from-line"]
    
    inline def `up-left`: "up-left" = "up-left".asInstanceOf["up-left"]
    
    inline def `up-long`: "up-long" = "up-long".asInstanceOf["up-long"]
    
    inline def `up-right`: "up-right" = "up-right".asInstanceOf["up-right"]
    
    inline def `up-right-and-down-left-from-center`: "up-right-and-down-left-from-center" = "up-right-and-down-left-from-center".asInstanceOf["up-right-and-down-left-from-center"]
    
    inline def `up-right-from-square`: "up-right-from-square" = "up-right-from-square".asInstanceOf["up-right-from-square"]
    
    inline def `up-to-dotted-line`: "up-to-dotted-line" = "up-to-dotted-line".asInstanceOf["up-to-dotted-line"]
    
    inline def `up-to-line`: "up-to-line" = "up-to-line".asInstanceOf["up-to-line"]
    
    inline def upload: "upload" = "upload".asInstanceOf["upload"]
    
    inline def ups: "ups" = "ups".asInstanceOf["ups"]
    
    inline def usb: "usb" = "usb".asInstanceOf["usb"]
    
    inline def `usb-drive`: "usb-drive" = "usb-drive".asInstanceOf["usb-drive"]
    
    inline def usd: "usd" = "usd".asInstanceOf["usd"]
    
    inline def `usd-circle`: "usd-circle" = "usd-circle".asInstanceOf["usd-circle"]
    
    inline def `usd-square`: "usd-square" = "usd-square".asInstanceOf["usd-square"]
    
    inline def user: "user" = "user".asInstanceOf["user"]
    
    inline def `user-alien`: "user-alien" = "user-alien".asInstanceOf["user-alien"]
    
    inline def `user-alt`: "user-alt" = "user-alt".asInstanceOf["user-alt"]
    
    inline def `user-alt-slash`: "user-alt-slash" = "user-alt-slash".asInstanceOf["user-alt-slash"]
    
    inline def `user-astronaut`: "user-astronaut" = "user-astronaut".asInstanceOf["user-astronaut"]
    
    inline def `user-bounty-hunter`: "user-bounty-hunter" = "user-bounty-hunter".asInstanceOf["user-bounty-hunter"]
    
    inline def `user-chart`: "user-chart" = "user-chart".asInstanceOf["user-chart"]
    
    inline def `user-check`: "user-check" = "user-check".asInstanceOf["user-check"]
    
    inline def `user-chef`: "user-chef" = "user-chef".asInstanceOf["user-chef"]
    
    inline def `user-circle`: "user-circle" = "user-circle".asInstanceOf["user-circle"]
    
    inline def `user-clock`: "user-clock" = "user-clock".asInstanceOf["user-clock"]
    
    inline def `user-cog`: "user-cog" = "user-cog".asInstanceOf["user-cog"]
    
    inline def `user-construction`: "user-construction" = "user-construction".asInstanceOf["user-construction"]
    
    inline def `user-cowboy`: "user-cowboy" = "user-cowboy".asInstanceOf["user-cowboy"]
    
    inline def `user-crown`: "user-crown" = "user-crown".asInstanceOf["user-crown"]
    
    inline def `user-doctor`: "user-doctor" = "user-doctor".asInstanceOf["user-doctor"]
    
    inline def `user-doctor-hair`: "user-doctor-hair" = "user-doctor-hair".asInstanceOf["user-doctor-hair"]
    
    inline def `user-doctor-hair-long`: "user-doctor-hair-long" = "user-doctor-hair-long".asInstanceOf["user-doctor-hair-long"]
    
    inline def `user-doctor-message`: "user-doctor-message" = "user-doctor-message".asInstanceOf["user-doctor-message"]
    
    inline def `user-edit`: "user-edit" = "user-edit".asInstanceOf["user-edit"]
    
    inline def `user-friends`: "user-friends" = "user-friends".asInstanceOf["user-friends"]
    
    inline def `user-gear`: "user-gear" = "user-gear".asInstanceOf["user-gear"]
    
    inline def `user-graduate`: "user-graduate" = "user-graduate".asInstanceOf["user-graduate"]
    
    inline def `user-group`: "user-group" = "user-group".asInstanceOf["user-group"]
    
    inline def `user-group-crown`: "user-group-crown" = "user-group-crown".asInstanceOf["user-group-crown"]
    
    inline def `user-hair`: "user-hair" = "user-hair".asInstanceOf["user-hair"]
    
    inline def `user-hair-buns`: "user-hair-buns" = "user-hair-buns".asInstanceOf["user-hair-buns"]
    
    inline def `user-hair-long`: "user-hair-long" = "user-hair-long".asInstanceOf["user-hair-long"]
    
    inline def `user-hair-mullet`: "user-hair-mullet" = "user-hair-mullet".asInstanceOf["user-hair-mullet"]
    
    inline def `user-hard-hat`: "user-hard-hat" = "user-hard-hat".asInstanceOf["user-hard-hat"]
    
    inline def `user-headset`: "user-headset" = "user-headset".asInstanceOf["user-headset"]
    
    inline def `user-helmet-safety`: "user-helmet-safety" = "user-helmet-safety".asInstanceOf["user-helmet-safety"]
    
    inline def `user-injured`: "user-injured" = "user-injured".asInstanceOf["user-injured"]
    
    inline def `user-large`: "user-large" = "user-large".asInstanceOf["user-large"]
    
    inline def `user-large-slash`: "user-large-slash" = "user-large-slash".asInstanceOf["user-large-slash"]
    
    inline def `user-lock`: "user-lock" = "user-lock".asInstanceOf["user-lock"]
    
    inline def `user-magnifying-glass`: "user-magnifying-glass" = "user-magnifying-glass".asInstanceOf["user-magnifying-glass"]
    
    inline def `user-md`: "user-md" = "user-md".asInstanceOf["user-md"]
    
    inline def `user-md-chat`: "user-md-chat" = "user-md-chat".asInstanceOf["user-md-chat"]
    
    inline def `user-minus`: "user-minus" = "user-minus".asInstanceOf["user-minus"]
    
    inline def `user-music`: "user-music" = "user-music".asInstanceOf["user-music"]
    
    inline def `user-ninja`: "user-ninja" = "user-ninja".asInstanceOf["user-ninja"]
    
    inline def `user-nurse`: "user-nurse" = "user-nurse".asInstanceOf["user-nurse"]
    
    inline def `user-nurse-hair`: "user-nurse-hair" = "user-nurse-hair".asInstanceOf["user-nurse-hair"]
    
    inline def `user-nurse-hair-long`: "user-nurse-hair-long" = "user-nurse-hair-long".asInstanceOf["user-nurse-hair-long"]
    
    inline def `user-pen`: "user-pen" = "user-pen".asInstanceOf["user-pen"]
    
    inline def `user-pilot`: "user-pilot" = "user-pilot".asInstanceOf["user-pilot"]
    
    inline def `user-pilot-tie`: "user-pilot-tie" = "user-pilot-tie".asInstanceOf["user-pilot-tie"]
    
    inline def `user-plus`: "user-plus" = "user-plus".asInstanceOf["user-plus"]
    
    inline def `user-police`: "user-police" = "user-police".asInstanceOf["user-police"]
    
    inline def `user-police-tie`: "user-police-tie" = "user-police-tie".asInstanceOf["user-police-tie"]
    
    inline def `user-robot`: "user-robot" = "user-robot".asInstanceOf["user-robot"]
    
    inline def `user-robot-xmarks`: "user-robot-xmarks" = "user-robot-xmarks".asInstanceOf["user-robot-xmarks"]
    
    inline def `user-secret`: "user-secret" = "user-secret".asInstanceOf["user-secret"]
    
    inline def `user-shakespeare`: "user-shakespeare" = "user-shakespeare".asInstanceOf["user-shakespeare"]
    
    inline def `user-shield`: "user-shield" = "user-shield".asInstanceOf["user-shield"]
    
    inline def `user-slash`: "user-slash" = "user-slash".asInstanceOf["user-slash"]
    
    inline def `user-tag`: "user-tag" = "user-tag".asInstanceOf["user-tag"]
    
    inline def `user-tie`: "user-tie" = "user-tie".asInstanceOf["user-tie"]
    
    inline def `user-tie-hair`: "user-tie-hair" = "user-tie-hair".asInstanceOf["user-tie-hair"]
    
    inline def `user-tie-hair-long`: "user-tie-hair-long" = "user-tie-hair-long".asInstanceOf["user-tie-hair-long"]
    
    inline def `user-times`: "user-times" = "user-times".asInstanceOf["user-times"]
    
    inline def `user-unlock`: "user-unlock" = "user-unlock".asInstanceOf["user-unlock"]
    
    inline def `user-visor`: "user-visor" = "user-visor".asInstanceOf["user-visor"]
    
    inline def `user-vneck`: "user-vneck" = "user-vneck".asInstanceOf["user-vneck"]
    
    inline def `user-vneck-hair`: "user-vneck-hair" = "user-vneck-hair".asInstanceOf["user-vneck-hair"]
    
    inline def `user-vneck-hair-long`: "user-vneck-hair-long" = "user-vneck-hair-long".asInstanceOf["user-vneck-hair-long"]
    
    inline def `user-xmark`: "user-xmark" = "user-xmark".asInstanceOf["user-xmark"]
    
    inline def users: "users" = "users".asInstanceOf["users"]
    
    inline def `users-between-lines`: "users-between-lines" = "users-between-lines".asInstanceOf["users-between-lines"]
    
    inline def `users-class`: "users-class" = "users-class".asInstanceOf["users-class"]
    
    inline def `users-cog`: "users-cog" = "users-cog".asInstanceOf["users-cog"]
    
    inline def `users-crown`: "users-crown" = "users-crown".asInstanceOf["users-crown"]
    
    inline def `users-gear`: "users-gear" = "users-gear".asInstanceOf["users-gear"]
    
    inline def `users-line`: "users-line" = "users-line".asInstanceOf["users-line"]
    
    inline def `users-medical`: "users-medical" = "users-medical".asInstanceOf["users-medical"]
    
    inline def `users-rays`: "users-rays" = "users-rays".asInstanceOf["users-rays"]
    
    inline def `users-rectangle`: "users-rectangle" = "users-rectangle".asInstanceOf["users-rectangle"]
    
    inline def `users-slash`: "users-slash" = "users-slash".asInstanceOf["users-slash"]
    
    inline def `users-viewfinder`: "users-viewfinder" = "users-viewfinder".asInstanceOf["users-viewfinder"]
    
    inline def usps: "usps" = "usps".asInstanceOf["usps"]
    
    inline def ussunnah: "ussunnah" = "ussunnah".asInstanceOf["ussunnah"]
    
    inline def `utensil-fork`: "utensil-fork" = "utensil-fork".asInstanceOf["utensil-fork"]
    
    inline def `utensil-knife`: "utensil-knife" = "utensil-knife".asInstanceOf["utensil-knife"]
    
    inline def `utensil-spoon`: "utensil-spoon" = "utensil-spoon".asInstanceOf["utensil-spoon"]
    
    inline def utensils: "utensils" = "utensils".asInstanceOf["utensils"]
    
    inline def `utensils-alt`: "utensils-alt" = "utensils-alt".asInstanceOf["utensils-alt"]
    
    inline def `utensils-slash`: "utensils-slash" = "utensils-slash".asInstanceOf["utensils-slash"]
    
    inline def `utility-pole`: "utility-pole" = "utility-pole".asInstanceOf["utility-pole"]
    
    inline def `utility-pole-double`: "utility-pole-double" = "utility-pole-double".asInstanceOf["utility-pole-double"]
    
    inline def v: "v" = "v".asInstanceOf["v"]
    
    inline def vaadin: "vaadin" = "vaadin".asInstanceOf["vaadin"]
    
    inline def vacuum: "vacuum" = "vacuum".asInstanceOf["vacuum"]
    
    inline def `vacuum-robot`: "vacuum-robot" = "vacuum-robot".asInstanceOf["vacuum-robot"]
    
    inline def `value-absolute`: "value-absolute" = "value-absolute".asInstanceOf["value-absolute"]
    
    inline def `van-shuttle`: "van-shuttle" = "van-shuttle".asInstanceOf["van-shuttle"]
    
    inline def vault: "vault" = "vault".asInstanceOf["vault"]
    
    inline def vcard: "vcard" = "vcard".asInstanceOf["vcard"]
    
    inline def `vector-circle`: "vector-circle" = "vector-circle".asInstanceOf["vector-circle"]
    
    inline def `vector-polygon`: "vector-polygon" = "vector-polygon".asInstanceOf["vector-polygon"]
    
    inline def `vector-square`: "vector-square" = "vector-square".asInstanceOf["vector-square"]
    
    inline def `vent-damper`: "vent-damper" = "vent-damper".asInstanceOf["vent-damper"]
    
    inline def venus: "venus" = "venus".asInstanceOf["venus"]
    
    inline def `venus-double`: "venus-double" = "venus-double".asInstanceOf["venus-double"]
    
    inline def `venus-mars`: "venus-mars" = "venus-mars".asInstanceOf["venus-mars"]
    
    inline def vest: "vest" = "vest".asInstanceOf["vest"]
    
    inline def `vest-patches`: "vest-patches" = "vest-patches".asInstanceOf["vest-patches"]
    
    inline def vhs: "vhs" = "vhs".asInstanceOf["vhs"]
    
    inline def viacoin: "viacoin" = "viacoin".asInstanceOf["viacoin"]
    
    inline def viadeo: "viadeo" = "viadeo".asInstanceOf["viadeo"]
    
    inline def `viadeo-square`: "viadeo-square" = "viadeo-square".asInstanceOf["viadeo-square"]
    
    inline def vial: "vial" = "vial".asInstanceOf["vial"]
    
    inline def `vial-circle-check`: "vial-circle-check" = "vial-circle-check".asInstanceOf["vial-circle-check"]
    
    inline def `vial-virus`: "vial-virus" = "vial-virus".asInstanceOf["vial-virus"]
    
    inline def vials: "vials" = "vials".asInstanceOf["vials"]
    
    inline def viber: "viber" = "viber".asInstanceOf["viber"]
    
    inline def video: "video" = "video".asInstanceOf["video"]
    
    inline def `video-arrow-down-left`: "video-arrow-down-left" = "video-arrow-down-left".asInstanceOf["video-arrow-down-left"]
    
    inline def `video-arrow-up-right`: "video-arrow-up-right" = "video-arrow-up-right".asInstanceOf["video-arrow-up-right"]
    
    inline def `video-camera`: "video-camera" = "video-camera".asInstanceOf["video-camera"]
    
    inline def `video-circle`: "video-circle" = "video-circle".asInstanceOf["video-circle"]
    
    inline def `video-handheld`: "video-handheld" = "video-handheld".asInstanceOf["video-handheld"]
    
    inline def `video-plus`: "video-plus" = "video-plus".asInstanceOf["video-plus"]
    
    inline def `video-slash`: "video-slash" = "video-slash".asInstanceOf["video-slash"]
    
    inline def vihara: "vihara" = "vihara".asInstanceOf["vihara"]
    
    inline def vimeo: "vimeo" = "vimeo".asInstanceOf["vimeo"]
    
    inline def `vimeo-square`: "vimeo-square" = "vimeo-square".asInstanceOf["vimeo-square"]
    
    inline def `vimeo-v`: "vimeo-v" = "vimeo-v".asInstanceOf["vimeo-v"]
    
    inline def vine: "vine" = "vine".asInstanceOf["vine"]
    
    inline def violin: "violin" = "violin".asInstanceOf["violin"]
    
    inline def virus: "virus" = "virus".asInstanceOf["virus"]
    
    inline def `virus-covid`: "virus-covid" = "virus-covid".asInstanceOf["virus-covid"]
    
    inline def `virus-covid-slash`: "virus-covid-slash" = "virus-covid-slash".asInstanceOf["virus-covid-slash"]
    
    inline def `virus-slash`: "virus-slash" = "virus-slash".asInstanceOf["virus-slash"]
    
    inline def viruses: "viruses" = "viruses".asInstanceOf["viruses"]
    
    inline def vk: "vk" = "vk".asInstanceOf["vk"]
    
    inline def vnv: "vnv" = "vnv".asInstanceOf["vnv"]
    
    inline def voicemail: "voicemail" = "voicemail".asInstanceOf["voicemail"]
    
    inline def volcano: "volcano" = "volcano".asInstanceOf["volcano"]
    
    inline def volleyball: "volleyball" = "volleyball".asInstanceOf["volleyball"]
    
    inline def `volleyball-ball`: "volleyball-ball" = "volleyball-ball".asInstanceOf["volleyball-ball"]
    
    inline def volume: "volume" = "volume".asInstanceOf["volume"]
    
    inline def `volume-control-phone`: "volume-control-phone" = "volume-control-phone".asInstanceOf["volume-control-phone"]
    
    inline def `volume-down`: "volume-down" = "volume-down".asInstanceOf["volume-down"]
    
    inline def `volume-high`: "volume-high" = "volume-high".asInstanceOf["volume-high"]
    
    inline def `volume-low`: "volume-low" = "volume-low".asInstanceOf["volume-low"]
    
    inline def `volume-medium`: "volume-medium" = "volume-medium".asInstanceOf["volume-medium"]
    
    inline def `volume-mute`: "volume-mute" = "volume-mute".asInstanceOf["volume-mute"]
    
    inline def `volume-off`: "volume-off" = "volume-off".asInstanceOf["volume-off"]
    
    inline def `volume-slash`: "volume-slash" = "volume-slash".asInstanceOf["volume-slash"]
    
    inline def `volume-times`: "volume-times" = "volume-times".asInstanceOf["volume-times"]
    
    inline def `volume-up`: "volume-up" = "volume-up".asInstanceOf["volume-up"]
    
    inline def `volume-xmark`: "volume-xmark" = "volume-xmark".asInstanceOf["volume-xmark"]
    
    inline def `vote-nay`: "vote-nay" = "vote-nay".asInstanceOf["vote-nay"]
    
    inline def `vote-yea`: "vote-yea" = "vote-yea".asInstanceOf["vote-yea"]
    
    inline def `vr-cardboard`: "vr-cardboard" = "vr-cardboard".asInstanceOf["vr-cardboard"]
    
    inline def vuejs: "vuejs" = "vuejs".asInstanceOf["vuejs"]
    
    inline def w: "w" = "w".asInstanceOf["w"]
    
    inline def waffle: "waffle" = "waffle".asInstanceOf["waffle"]
    
    inline def `wagon-covered`: "wagon-covered" = "wagon-covered".asInstanceOf["wagon-covered"]
    
    inline def walker: "walker" = "walker".asInstanceOf["walker"]
    
    inline def `walkie-talkie`: "walkie-talkie" = "walkie-talkie".asInstanceOf["walkie-talkie"]
    
    inline def walking: "walking" = "walking".asInstanceOf["walking"]
    
    inline def `wall-brick`: "wall-brick" = "wall-brick".asInstanceOf["wall-brick"]
    
    inline def wallet: "wallet" = "wallet".asInstanceOf["wallet"]
    
    inline def wand: "wand" = "wand".asInstanceOf["wand"]
    
    inline def `wand-magic`: "wand-magic" = "wand-magic".asInstanceOf["wand-magic"]
    
    inline def `wand-magic-sparkles`: "wand-magic-sparkles" = "wand-magic-sparkles".asInstanceOf["wand-magic-sparkles"]
    
    inline def `wand-sparkles`: "wand-sparkles" = "wand-sparkles".asInstanceOf["wand-sparkles"]
    
    inline def warehouse: "warehouse" = "warehouse".asInstanceOf["warehouse"]
    
    inline def `warehouse-alt`: "warehouse-alt" = "warehouse-alt".asInstanceOf["warehouse-alt"]
    
    inline def `warehouse-full`: "warehouse-full" = "warehouse-full".asInstanceOf["warehouse-full"]
    
    inline def warning: "warning" = "warning".asInstanceOf["warning"]
    
    inline def washer: "washer" = "washer".asInstanceOf["washer"]
    
    inline def `washing-machine`: "washing-machine" = "washing-machine".asInstanceOf["washing-machine"]
    
    inline def watch: "watch" = "watch".asInstanceOf["watch"]
    
    inline def `watch-apple`: "watch-apple" = "watch-apple".asInstanceOf["watch-apple"]
    
    inline def `watch-calculator`: "watch-calculator" = "watch-calculator".asInstanceOf["watch-calculator"]
    
    inline def `watch-fitness`: "watch-fitness" = "watch-fitness".asInstanceOf["watch-fitness"]
    
    inline def `watch-smart`: "watch-smart" = "watch-smart".asInstanceOf["watch-smart"]
    
    inline def `watchman-monitoring`: "watchman-monitoring" = "watchman-monitoring".asInstanceOf["watchman-monitoring"]
    
    inline def water: "water" = "water".asInstanceOf["water"]
    
    inline def `water-arrow-down`: "water-arrow-down" = "water-arrow-down".asInstanceOf["water-arrow-down"]
    
    inline def `water-arrow-up`: "water-arrow-up" = "water-arrow-up".asInstanceOf["water-arrow-up"]
    
    inline def `water-ladder`: "water-ladder" = "water-ladder".asInstanceOf["water-ladder"]
    
    inline def `water-lower`: "water-lower" = "water-lower".asInstanceOf["water-lower"]
    
    inline def `water-rise`: "water-rise" = "water-rise".asInstanceOf["water-rise"]
    
    inline def `watermelon-slice`: "watermelon-slice" = "watermelon-slice".asInstanceOf["watermelon-slice"]
    
    inline def `wave-pulse`: "wave-pulse" = "wave-pulse".asInstanceOf["wave-pulse"]
    
    inline def `wave-sine`: "wave-sine" = "wave-sine".asInstanceOf["wave-sine"]
    
    inline def `wave-square`: "wave-square" = "wave-square".asInstanceOf["wave-square"]
    
    inline def `wave-triangle`: "wave-triangle" = "wave-triangle".asInstanceOf["wave-triangle"]
    
    inline def waveform: "waveform" = "waveform".asInstanceOf["waveform"]
    
    inline def `waveform-circle`: "waveform-circle" = "waveform-circle".asInstanceOf["waveform-circle"]
    
    inline def `waveform-lines`: "waveform-lines" = "waveform-lines".asInstanceOf["waveform-lines"]
    
    inline def `waveform-path`: "waveform-path" = "waveform-path".asInstanceOf["waveform-path"]
    
    inline def waze: "waze" = "waze".asInstanceOf["waze"]
    
    inline def webcam: "webcam" = "webcam".asInstanceOf["webcam"]
    
    inline def `webcam-slash`: "webcam-slash" = "webcam-slash".asInstanceOf["webcam-slash"]
    
    inline def weebly: "weebly" = "weebly".asInstanceOf["weebly"]
    
    inline def weibo: "weibo" = "weibo".asInstanceOf["weibo"]
    
    inline def weight: "weight" = "weight".asInstanceOf["weight"]
    
    inline def `weight-hanging`: "weight-hanging" = "weight-hanging".asInstanceOf["weight-hanging"]
    
    inline def `weight-scale`: "weight-scale" = "weight-scale".asInstanceOf["weight-scale"]
    
    inline def weixin: "weixin" = "weixin".asInstanceOf["weixin"]
    
    inline def whale: "whale" = "whale".asInstanceOf["whale"]
    
    inline def whatsapp: "whatsapp" = "whatsapp".asInstanceOf["whatsapp"]
    
    inline def `whatsapp-square`: "whatsapp-square" = "whatsapp-square".asInstanceOf["whatsapp-square"]
    
    inline def wheat: "wheat" = "wheat".asInstanceOf["wheat"]
    
    inline def `wheat-alt`: "wheat-alt" = "wheat-alt".asInstanceOf["wheat-alt"]
    
    inline def `wheat-awn`: "wheat-awn" = "wheat-awn".asInstanceOf["wheat-awn"]
    
    inline def `wheat-awn-circle-exclamation`: "wheat-awn-circle-exclamation" = "wheat-awn-circle-exclamation".asInstanceOf["wheat-awn-circle-exclamation"]
    
    inline def `wheat-awn-slash`: "wheat-awn-slash" = "wheat-awn-slash".asInstanceOf["wheat-awn-slash"]
    
    inline def `wheat-slash`: "wheat-slash" = "wheat-slash".asInstanceOf["wheat-slash"]
    
    inline def wheelchair: "wheelchair" = "wheelchair".asInstanceOf["wheelchair"]
    
    inline def `wheelchair-alt`: "wheelchair-alt" = "wheelchair-alt".asInstanceOf["wheelchair-alt"]
    
    inline def `wheelchair-move`: "wheelchair-move" = "wheelchair-move".asInstanceOf["wheelchair-move"]
    
    inline def `whiskey-glass`: "whiskey-glass" = "whiskey-glass".asInstanceOf["whiskey-glass"]
    
    inline def `whiskey-glass-ice`: "whiskey-glass-ice" = "whiskey-glass-ice".asInstanceOf["whiskey-glass-ice"]
    
    inline def whistle: "whistle" = "whistle".asInstanceOf["whistle"]
    
    inline def whmcs: "whmcs" = "whmcs".asInstanceOf["whmcs"]
    
    inline def wifi: "wifi" = "wifi".asInstanceOf["wifi"]
    
    inline def `wifi-exclamation`: "wifi-exclamation" = "wifi-exclamation".asInstanceOf["wifi-exclamation"]
    
    inline def `wifi-fair`: "wifi-fair" = "wifi-fair".asInstanceOf["wifi-fair"]
    
    inline def `wifi-slash`: "wifi-slash" = "wifi-slash".asInstanceOf["wifi-slash"]
    
    inline def `wifi-strong`: "wifi-strong" = "wifi-strong".asInstanceOf["wifi-strong"]
    
    inline def `wifi-weak`: "wifi-weak" = "wifi-weak".asInstanceOf["wifi-weak"]
    
    inline def wifi1: "wifi1" = "wifi1".asInstanceOf["wifi1"]
    
    inline def wifi2: "wifi2" = "wifi2".asInstanceOf["wifi2"]
    
    inline def wifi3: "wifi3" = "wifi3".asInstanceOf["wifi3"]
    
    inline def `wikipedia-w`: "wikipedia-w" = "wikipedia-w".asInstanceOf["wikipedia-w"]
    
    inline def wind: "wind" = "wind".asInstanceOf["wind"]
    
    inline def `wind-circle-exclamation`: "wind-circle-exclamation" = "wind-circle-exclamation".asInstanceOf["wind-circle-exclamation"]
    
    inline def `wind-turbine`: "wind-turbine" = "wind-turbine".asInstanceOf["wind-turbine"]
    
    inline def `wind-warning`: "wind-warning" = "wind-warning".asInstanceOf["wind-warning"]
    
    inline def window: "window" = "window".asInstanceOf["window"]
    
    inline def `window-alt`: "window-alt" = "window-alt".asInstanceOf["window-alt"]
    
    inline def `window-close`: "window-close" = "window-close".asInstanceOf["window-close"]
    
    inline def `window-flip`: "window-flip" = "window-flip".asInstanceOf["window-flip"]
    
    inline def `window-frame`: "window-frame" = "window-frame".asInstanceOf["window-frame"]
    
    inline def `window-frame-open`: "window-frame-open" = "window-frame-open".asInstanceOf["window-frame-open"]
    
    inline def `window-maximize`: "window-maximize" = "window-maximize".asInstanceOf["window-maximize"]
    
    inline def `window-minimize`: "window-minimize" = "window-minimize".asInstanceOf["window-minimize"]
    
    inline def `window-restore`: "window-restore" = "window-restore".asInstanceOf["window-restore"]
    
    inline def windows: "windows" = "windows".asInstanceOf["windows"]
    
    inline def windsock: "windsock" = "windsock".asInstanceOf["windsock"]
    
    inline def `wine-bottle`: "wine-bottle" = "wine-bottle".asInstanceOf["wine-bottle"]
    
    inline def `wine-glass`: "wine-glass" = "wine-glass".asInstanceOf["wine-glass"]
    
    inline def `wine-glass-alt`: "wine-glass-alt" = "wine-glass-alt".asInstanceOf["wine-glass-alt"]
    
    inline def `wine-glass-crack`: "wine-glass-crack" = "wine-glass-crack".asInstanceOf["wine-glass-crack"]
    
    inline def `wine-glass-empty`: "wine-glass-empty" = "wine-glass-empty".asInstanceOf["wine-glass-empty"]
    
    inline def wirsindhandwerk: "wirsindhandwerk" = "wirsindhandwerk".asInstanceOf["wirsindhandwerk"]
    
    inline def wix: "wix" = "wix".asInstanceOf["wix"]
    
    inline def `wizards-of-the-coast`: "wizards-of-the-coast" = "wizards-of-the-coast".asInstanceOf["wizards-of-the-coast"]
    
    inline def wodu: "wodu" = "wodu".asInstanceOf["wodu"]
    
    inline def `wolf-pack-battalion`: "wolf-pack-battalion" = "wolf-pack-battalion".asInstanceOf["wolf-pack-battalion"]
    
    inline def won: "won" = "won".asInstanceOf["won"]
    
    inline def `won-sign`: "won-sign" = "won-sign".asInstanceOf["won-sign"]
    
    inline def wordpress: "wordpress" = "wordpress".asInstanceOf["wordpress"]
    
    inline def `wordpress-simple`: "wordpress-simple" = "wordpress-simple".asInstanceOf["wordpress-simple"]
    
    inline def worm: "worm" = "worm".asInstanceOf["worm"]
    
    inline def wpbeginner: "wpbeginner" = "wpbeginner".asInstanceOf["wpbeginner"]
    
    inline def wpexplorer: "wpexplorer" = "wpexplorer".asInstanceOf["wpexplorer"]
    
    inline def wpforms: "wpforms" = "wpforms".asInstanceOf["wpforms"]
    
    inline def wpressr: "wpressr" = "wpressr".asInstanceOf["wpressr"]
    
    inline def wreath: "wreath" = "wreath".asInstanceOf["wreath"]
    
    inline def wrench: "wrench" = "wrench".asInstanceOf["wrench"]
    
    inline def `wrench-simple`: "wrench-simple" = "wrench-simple".asInstanceOf["wrench-simple"]
    
    inline def wsh: "wsh" = "wsh".asInstanceOf["wsh"]
    
    inline def x: "x" = "x".asInstanceOf["x"]
    
    inline def `x-ray`: "x-ray" = "x-ray".asInstanceOf["x-ray"]
    
    inline def xbox: "xbox" = "xbox".asInstanceOf["xbox"]
    
    inline def xing: "xing" = "xing".asInstanceOf["xing"]
    
    inline def `xing-square`: "xing-square" = "xing-square".asInstanceOf["xing-square"]
    
    inline def xmark: "xmark" = "xmark".asInstanceOf["xmark"]
    
    inline def `xmark-circle`: "xmark-circle" = "xmark-circle".asInstanceOf["xmark-circle"]
    
    inline def `xmark-hexagon`: "xmark-hexagon" = "xmark-hexagon".asInstanceOf["xmark-hexagon"]
    
    inline def `xmark-large`: "xmark-large" = "xmark-large".asInstanceOf["xmark-large"]
    
    inline def `xmark-octagon`: "xmark-octagon" = "xmark-octagon".asInstanceOf["xmark-octagon"]
    
    inline def `xmark-square`: "xmark-square" = "xmark-square".asInstanceOf["xmark-square"]
    
    inline def `xmark-to-slot`: "xmark-to-slot" = "xmark-to-slot".asInstanceOf["xmark-to-slot"]
    
    inline def `xmarks-lines`: "xmarks-lines" = "xmarks-lines".asInstanceOf["xmarks-lines"]
    
    inline def y: "y" = "y".asInstanceOf["y"]
    
    inline def `y-combinator`: "y-combinator" = "y-combinator".asInstanceOf["y-combinator"]
    
    inline def yahoo: "yahoo" = "yahoo".asInstanceOf["yahoo"]
    
    inline def yammer: "yammer" = "yammer".asInstanceOf["yammer"]
    
    inline def yandex: "yandex" = "yandex".asInstanceOf["yandex"]
    
    inline def `yandex-international`: "yandex-international" = "yandex-international".asInstanceOf["yandex-international"]
    
    inline def yarn: "yarn" = "yarn".asInstanceOf["yarn"]
    
    inline def yelp: "yelp" = "yelp".asInstanceOf["yelp"]
    
    inline def yen: "yen" = "yen".asInstanceOf["yen"]
    
    inline def `yen-sign`: "yen-sign" = "yen-sign".asInstanceOf["yen-sign"]
    
    inline def `yin-yang`: "yin-yang" = "yin-yang".asInstanceOf["yin-yang"]
    
    inline def yoast: "yoast" = "yoast".asInstanceOf["yoast"]
    
    inline def youtube: "youtube" = "youtube".asInstanceOf["youtube"]
    
    inline def `youtube-square`: "youtube-square" = "youtube-square".asInstanceOf["youtube-square"]
    
    inline def z: "z" = "z".asInstanceOf["z"]
    
    inline def zap: "zap" = "zap".asInstanceOf["zap"]
    
    inline def zhihu: "zhihu" = "zhihu".asInstanceOf["zhihu"]
    
    inline def zzz: "zzz" = "zzz".asInstanceOf["zzz"]
  }
  type IconName = /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 4635, starting with "monero", "hooli", "yelp" */ String
  
  type IconPack = StringDictionary[IconDefinition]
  
  type IconPathData = String | js.Array[String]
  
  object IconPrefix {
    
    inline def fab: "fab" = "fab".asInstanceOf["fab"]
    
    inline def fad: "fad" = "fad".asInstanceOf["fad"]
    
    inline def fak: "fak" = "fak".asInstanceOf["fak"]
    
    inline def fal: "fal" = "fal".asInstanceOf["fal"]
    
    inline def far: "far" = "far".asInstanceOf["far"]
    
    inline def fas: "fas" = "fas".asInstanceOf["fas"]
    
    inline def fass: "fass" = "fass".asInstanceOf["fass"]
    
    inline def fat: "fat" = "fat".asInstanceOf["fat"]
  }
  type IconPrefix = "fas" | "far" | "fal" | "fat" | "fad" | "fab" | "fak" | "fass"
  
  object IconStyle {
    
    inline def brands: "brands" = "brands".asInstanceOf["brands"]
    
    inline def duotone: "duotone" = "duotone".asInstanceOf["duotone"]
    
    inline def light: "light" = "light".asInstanceOf["light"]
    
    inline def regular: "regular" = "regular".asInstanceOf["regular"]
    
    inline def solid: "solid" = "solid".asInstanceOf["solid"]
    
    inline def thin: "thin" = "thin".asInstanceOf["thin"]
  }
  type IconStyle = "solid" | "regular" | "light" | "thin" | "duotone" | "brands"
}
