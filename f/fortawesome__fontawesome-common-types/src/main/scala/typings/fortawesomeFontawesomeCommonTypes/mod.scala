package typings.fortawesomeFontawesomeCommonTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  trait IconLookup extends StObject {
    
    // IconName is defined in the code that will be generated at build time and bundled with this file.
    var iconName: IconName
    
    var prefix: IconPrefix
  }
  object IconLookup {
    
    extension [Self <: IconLookup](x: Self) {
      
      inline def setIconName(value: IconName): Self = StObject.set(x, "iconName", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: IconPrefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`500px`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`accessible-icon`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.accusoft
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`acquisitions-incorporated`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.adn
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.adversal
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.affiliatetheme
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.airbnb
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.algolia
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.alipay
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.amazon
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`amazon-pay`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.amilia
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.android
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angellist
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angrycreative
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angular
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`app-store`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`app-store-ios`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.apper
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.apple
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`apple-pay`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.artstation
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.asymmetrik
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.atlassian
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.audible
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.autoprefixer
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.avianex
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.aviato
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.aws
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bandcamp
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battle-net`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.behance
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`behance-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bimobject
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bitbucket
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bitcoin
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bity
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`black-tie`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blackberry
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blogger
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`blogger-b`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bluetooth
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bluetooth-b`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bootstrap
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.btc
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.buffer
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.buromobelexperte
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`buy-n-large`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.buysellads
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`canadian-maple-leaf`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-amazon-pay`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-amex`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-apple-pay`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-diners-club`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-discover`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-jcb`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-mastercard`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-paypal`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-stripe`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-visa`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.centercode
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.centos
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chrome
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chromecast
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloudflare
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloudscale
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloudsmith
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloudversify
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.codepen
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.codiepie
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.confluence
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.connectdevelop
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.contao
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cotton-bureau`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cpanel
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-by`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-nc`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-nc-eu`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-nc-jp`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-nd`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-pd`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-pd-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-remix`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-sa`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-sampling`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-sampling-plus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-share`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-zero`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`critical-role`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.css3
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`css3-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cuttlefish
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`d-and-d`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`d-and-d-beyond`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dailymotion
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dashcube
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deezer
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.delicious
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deploydog
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deskpro
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dev
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deviantart
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dhl
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.diaspora
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.digg
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`digital-ocean`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.discord
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.discourse
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dochub
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.docker
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.draft2digital
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dribbble
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dribbble-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dropbox
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.drupal
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dyalog
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.earlybirds
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ebay
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.edge
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`edge-legacy`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.elementor
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ello
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ember
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.empire
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.envira
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.erlang
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ethereum
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.etsy
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.evernote
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.expeditedssl
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.facebook
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`facebook-f`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`facebook-messenger`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`facebook-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fantasy-flight-games`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fedex
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fedora
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.figma
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.firefox
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`firefox-browser`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`first-order`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`first-order-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.firstdraft
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flickr
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flipboard
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fly
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-awesome`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-awesome-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-awesome-flag`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-awesome-logo-full`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fonticons
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fonticons-fi`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fort-awesome`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fort-awesome-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.forumbee
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.foursquare
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`free-code-camp`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.freebsd
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fulcrum
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`galactic-republic`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`galactic-senate`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`get-pocket`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gg
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gg-circle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.git
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`git-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`git-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.github
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`github-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`github-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gitkraken
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gitlab
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gitter
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.glide
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glide-g`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gofore
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.goodreads
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`goodreads-g`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.google
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-drive`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-pay`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-play`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-plus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-plus-g`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-plus-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-wallet`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gratipay
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.grav
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gripfire
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.grunt
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.guilded
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gulp
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hacker-news`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hacker-news-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hackerrank
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hips
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hire-a-helper`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hive
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hooli
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hornbill
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hotjar
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.houzz
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.html5
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hubspot
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ideal
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.imdb
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.innosoft
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.instagram
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`instagram-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.instalod
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.intercom
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`internet-explorer`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.invision
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ioxhost
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`itch-io`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.itunes
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`itunes-note`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.java_
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`jedi-order`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jenkins
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jira
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.joget
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.joomla
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.js_
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`js-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jsfiddle
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kaggle
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.keybase
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.keycdn
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kickstarter
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`kickstarter-k`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.korvue
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.laravel
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lastfm
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lastfm-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.leanpub
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.less
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.line
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.linkedin
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`linkedin-in`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.linode
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.linux
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lyft
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.magento
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mailchimp
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mandalorian
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.markdown
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mastodon
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.maxcdn
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mdb
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medapps
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medium
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`medium-m`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medrt
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.meetup
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.megaport
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mendeley
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microblog
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microsoft
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mix
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mixcloud
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mixer
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mizuni
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.modx
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.monero
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.napster
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.neos
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.nimblr
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.node
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`node-js`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.npm
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ns8
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.nutritionix
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`octopus-deploy`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.odnoklassniki
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`odnoklassniki-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`old-republic`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.opencart
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.openid
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.opera
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`optin-monster`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.orcid
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.osi
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.page4
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pagelines
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.palfed
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.patreon
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paypal
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`penny-arcade`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.perbyte
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.periscope
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.phabricator
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phoenix-framework`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phoenix-squadron`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.php
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper-hat`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper-pp`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pinterest
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pinterest-p`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pinterest-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.playstation
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`product-hunt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pushed
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.python
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.qq
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.quinscape
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.quora
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`r-project`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`raspberry-pi`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ravelry
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.react
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.reacteurope
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.readme
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rebel
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`red-river`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.reddit
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`reddit-alien`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`reddit-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.redhat
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.renren
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.replyd
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.researchgate
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.resolving
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rev
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rocketchat
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rockrms
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rust
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.safari
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.salesforce
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sass
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.schlix
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scribd
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.searchengin
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sellcast
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sellsy
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.servicestack
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shirtsinbulk
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shopify
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shopware
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.simplybuilt
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sistrix
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sith
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sketch
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skyatlas
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skype
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.slack
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`slack-hash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.slideshare
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snapchat
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`snapchat-ghost`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`snapchat-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.soundcloud
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sourcetree
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.speakap
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`speaker-deck`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spotify
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.squarespace
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stack-exchange`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stack-overflow`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stackpath
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.staylinked
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.steam
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`steam-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`steam-symbol`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sticker-mule`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.strava
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stripe
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stripe-s`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.studiovinari
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stumbleupon
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stumbleupon-circle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.superpowers
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.supple
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.suse
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.swift
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.symfony
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.teamspeak
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.telegram
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`telegram-plane`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tencent-weibo`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`the-red-yeti`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.themeco
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.themeisle
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`think-peaks`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tiktok
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trade-federation`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trello
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tripadvisor
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tumblr
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tumblr-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.twitch
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.twitter
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`twitter-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.typo3
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.uber
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ubuntu
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.uikit
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.umbraco
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.uncharted
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.uniregistry
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unity
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unsplash
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.untappd
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ups
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.usb
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.usps
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ussunnah
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vaadin
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.viacoin
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.viadeo
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`viadeo-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.viber
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vimeo
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vimeo-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vimeo-v`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vine
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vk
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vnv
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vuejs
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`watchman-monitoring`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.waze
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.weebly
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.weibo
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.weixin
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.whatsapp
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`whatsapp-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.whmcs
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wikipedia-w`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.windows
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wix
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wizards-of-the-coast`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wodu
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wolf-pack-battalion`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wordpress
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wordpress-simple`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wpbeginner
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wpexplorer
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wpforms
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wpressr
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.xbox
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.xing
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`xing-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`y-combinator`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yahoo
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yammer
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yandex
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`yandex-international`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yarn
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yelp
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yoast
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.youtube
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`youtube-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.zhihu
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.abacus
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.acorn
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ad
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`address-book`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`address-card`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.adjust
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`air-conditioner`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`air-freshener`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alarm-clock`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alarm-exclamation`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alarm-plus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alarm-snooze`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.album
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`album-collection`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.alicorn
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.alien
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alien-monster`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-center`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-justify`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.allergies
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ambulance
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`american-sign-language-interpreting`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`amp-guitar`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.analytics
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.anchor
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angel
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-double-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-double-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-double-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-double-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angry
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ankh
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`apple-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`apple-crate`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.archive
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.archway
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-circle-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-circle-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-circle-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-circle-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-from-bottom`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-from-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-from-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-from-top`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-square-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-square-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-square-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-square-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-to-bottom`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-to-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-to-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-to-top`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-circle-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-circle-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-circle-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-circle-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-from-bottom`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-from-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-from-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-from-top`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-square-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-square-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-square-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-square-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-to-bottom`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-to-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-to-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-to-top`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.arrows
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-alt-h`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-alt-v`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-h`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-v`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`assistive-listening-systems`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.asterisk
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.at
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.atlas
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.atom
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`atom-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`audio-description`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.award
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.axe
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`axe-battle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.baby
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`baby-carriage`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.backpack
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.backspace
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.backward
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bacon
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bacteria
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bacterium
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.badge
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badge-check`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badge-dollar`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badge-percent`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badge-sheriff`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badger-honey`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bags-shopping`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bahai
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`balance-scale`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`balance-scale-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`balance-scale-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ball-pile`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ballot
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ballot-check`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ban
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`band-aid`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.banjo
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.barcode
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`barcode-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`barcode-read`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`barcode-scan`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bars
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.baseball
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`baseball-ball`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`basketball-ball`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`basketball-hoop`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bat
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bath
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-bolt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-empty`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-full`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-half`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-quarter`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-three-quarters`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bed
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bed-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bed-bunk`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bed-empty`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.beer
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bell
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-exclamation`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-on`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-plus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-school`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-school-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bells
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.betamax
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bezier-curve`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bible
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bicycle
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.biking
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`biking-mountain`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.binoculars
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.biohazard
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`birthday-cake`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blanket
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blender
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`blender-phone`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blind
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blinds
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`blinds-open`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`blinds-raised`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blog
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bold
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bolt
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bomb
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bone
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bone-break`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bong
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.book
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-dead`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-heart`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-medical`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-open`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-reader`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-spells`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-user`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bookmark
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.books
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`books-medical`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.boombox
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.boot
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`booth-curtain`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-all`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-bottom`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-center-h`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-center-v`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-inner`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-none`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-outer`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-style`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-style-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-top`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bow-arrow`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bowling-ball`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bowling-pins`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.box
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-ballot`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-check`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-fragile`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-full`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-heart`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-open`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-tissue`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-usd`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.boxes
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`boxes-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`boxing-glove`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.brackets
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`brackets-curly`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.braille
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.brain
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bread-loaf`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bread-slice`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.briefcase
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`briefcase-medical`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bring-forward`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bring-front`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`broadcast-tower`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.broom
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.browser
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.brush
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bug
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.building
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bullhorn
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bullseye
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bullseye-arrow`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bullseye-pointer`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`burger-soda`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.burn
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.burrito
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bus
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bus-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bus-school`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`business-time`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cabinet-filing`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cactus
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.calculator
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calculator-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.calendar
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-check`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-day`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-edit`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-exclamation`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-minus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-plus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-star`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-times`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-week`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.camcorder
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.camera
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-home`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-movie`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-polaroid`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-retro`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.campfire
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.campground
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`candle-holder`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`candy-cane`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`candy-corn`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cannabis
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.capsules
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.car
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-battery`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-building`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-bump`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-bus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-crash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-garage`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-mechanic`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-side`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-tilt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-wash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.caravan
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caravan-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-circle-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-circle-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-circle-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-circle-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-square-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-square-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-square-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-square-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.carrot
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cars
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cart-arrow-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cart-plus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cash-register`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cassette-tape`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cat
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cat-space`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cauldron
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cctv
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.certificate
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chair
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chair-office`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chalkboard
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chalkboard-teacher`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`charging-station`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-area`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-bar`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-line`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-line-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-network`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-pie`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-pie-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-scatter`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.check
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`check-circle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`check-double`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`check-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cheese
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cheese-swiss`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cheeseburger
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chess
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-bishop`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-bishop-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-board`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-clock`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-clock-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-king`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-king-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-knight`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-knight-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-pawn`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-pawn-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-queen`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-queen-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-rook`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-rook-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-circle-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-circle-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-circle-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-circle-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-double-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-double-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-double-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-double-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-square-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-square-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-square-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-square-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.child
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chimney
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.church
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.circle
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`circle-notch`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.city
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.clarinet
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`claw-marks`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clinic-medical`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.clipboard
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-check`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-list`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-list-check`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-prescription`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-user`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.clock
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.clone
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`closed-captioning`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloud
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-download`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-download-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-drizzle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-hail`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-hail-mixed`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-meatball`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-moon`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-moon-rain`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-music`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-rain`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-rainbow`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-showers`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-showers-heavy`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-sleet`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-snow`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-sun`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-sun-rain`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-upload`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-upload-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.clouds
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clouds-moon`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clouds-sun`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.club
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cocktail
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.code
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`code-branch`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`code-commit`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`code-merge`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.coffee
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`coffee-pot`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`coffee-togo`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.coffin
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`coffin-cross`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cog
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cogs
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.coin
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.coins
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.columns
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.comet
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.comment
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-check`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-dollar`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-dots`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-edit`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-exclamation`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-lines`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-medical`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-minus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-music`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-plus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-smile`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-times`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-check`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-dollar`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-dots`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-edit`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-exclamation`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-lines`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-medical`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-minus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-music`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-plus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-smile`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-times`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.comments
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comments-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comments-alt-dollar`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comments-dollar`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compact-disc`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.compass
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compass-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.compress
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compress-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compress-arrows-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compress-wide`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`computer-classic`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`computer-speaker`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`concierge-bell`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.construction
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`container-storage`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`conveyor-belt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`conveyor-belt-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cookie
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cookie-bite`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.copy
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.copyright
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.corn
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.couch
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cow
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cowbell
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cowbell-more`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`credit-card`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`credit-card-blank`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`credit-card-front`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cricket
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.croissant
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crop
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`crop-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cross
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crosshairs
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crow
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crown
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crutch
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crutches
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cube
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cubes
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.curling
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cut
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dagger
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.database
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deaf
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.debug
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deer
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`deer-rudolph`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.democrat
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.desktop
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`desktop-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dewpoint
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dharmachakra
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.diagnoses
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.diamond
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dice
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d10`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d12`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d20`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d4`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d6`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d8`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-five`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-four`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-one`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-six`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-three`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-two`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.digging
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`digital-tachograph`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.diploma
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.directions
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`disc-drive`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.disease
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.divide
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dizzy
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dna
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`do-not-enter`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dog
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dog-leashed`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dollar-sign`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dolly
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dolly-empty`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dolly-flatbed`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dolly-flatbed-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dolly-flatbed-empty`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.donate
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`door-closed`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`door-open`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dot-circle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dove
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.download
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`drafting-compass`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dragon
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`draw-circle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`draw-polygon`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`draw-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dreidel
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.drone
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`drone-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.drum
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`drum-steelpan`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.drumstick
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`drumstick-bite`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dryer
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dryer-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.duck
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dumbbell
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dumpster
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dumpster-fire`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dungeon
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ear
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ear-muffs`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.eclipse
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`eclipse-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.edit
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.egg
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`egg-fried`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.eject
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.elephant
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ellipsis-h`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ellipsis-h-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ellipsis-v`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ellipsis-v-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`empty-set`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`engine-warning`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.envelope
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`envelope-open`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`envelope-open-dollar`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`envelope-open-text`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`envelope-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.equals
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.eraser
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ethernet
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`euro-sign`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.exchange
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`exchange-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.exclamation
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`exclamation-circle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`exclamation-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`exclamation-triangle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.expand
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`expand-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`expand-arrows`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`expand-arrows-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`expand-wide`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`external-link`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`external-link-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`external-link-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`external-link-square-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.eye
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`eye-dropper`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`eye-evil`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`eye-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fan
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fan-table`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.farm
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fast-backward`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fast-forward`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.faucet
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`faucet-drip`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fax
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.feather
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`feather-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.female
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`field-hockey`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fighter-jet`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.file
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-archive`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-audio`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-certificate`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-chart-line`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-chart-pie`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-check`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-code`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-contract`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-csv`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-download`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-edit`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-excel`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-exclamation`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-export`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-image`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-import`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-invoice`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-invoice-dollar`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-medical`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-medical-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-minus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-music`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-pdf`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-plus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-powerpoint`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-prescription`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-search`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-signature`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-spreadsheet`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-times`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-upload`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-user`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-video`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-word`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`files-medical`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fill
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fill-drip`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.film
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`film-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`film-canister`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.filter
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fingerprint
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fire
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fire-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fire-extinguisher`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fire-smoke`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fireplace
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`first-aid`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fish
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fish-cooked`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fist-raised`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flag
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flag-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flag-checkered`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flag-usa`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flame
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flashlight
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flask
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flask-poison`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flask-potion`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flower
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flower-daffodil`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flower-tulip`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flushed
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flute
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flux-capacitor`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fog
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.folder
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-download`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-minus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-open`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-plus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-times`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-tree`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-upload`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.folders
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.font
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-case`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`football-ball`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`football-helmet`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.forklift
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.forward
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fragile
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`french-fries`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.frog
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`frosty-head`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.frown
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`frown-open`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.function
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`funnel-dollar`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.futbol
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.galaxy
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`game-board`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`game-board-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`game-console-handheld`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gamepad
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gamepad-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.garage
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`garage-car`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`garage-open`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gas-pump`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gas-pump-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gavel
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gem
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.genderless
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ghost
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gift
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gift-card`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gifts
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gingerbread-man`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.glass
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-champagne`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-cheers`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-citrus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-martini`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-martini-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-whiskey`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-whiskey-rocks`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.glasses
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glasses-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.globe
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-africa`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-americas`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-asia`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-europe`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-snow`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-stand`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`golf-ball`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`golf-club`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gopuram
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`graduation-cap`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gramophone
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`greater-than`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`greater-than-equal`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.grimace
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.grin
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-beam`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-beam-sweat`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-hearts`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-squint`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-squint-tears`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-stars`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-tears`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-tongue`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-tongue-squint`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-tongue-wink`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-wink`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grip-horizontal`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grip-lines`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grip-lines-vertical`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grip-vertical`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.guitar
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`guitar-electric`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.guitars
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`h-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.h1
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.h2
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.h3
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.h4
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hamburger
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hammer
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hammer-war`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hamsa
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-heart`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-box`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-heart`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-magic`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-medical`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-seedling`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-usd`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-water`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-lizard`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-middle-finger`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-paper`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-peace`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-point-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-point-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-point-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-point-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-pointer`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-receiving`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-rock`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-scissors`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-sparkles`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-spock`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hands
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hands-heart`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hands-helping`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hands-usd`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hands-wash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.handshake
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`handshake-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`handshake-alt-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`handshake-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hanukiah
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hard-hat`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hashtag
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-chef`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-cowboy`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-cowboy-side`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-santa`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-winter`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-witch`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-wizard`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hdd
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-brain`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-cough`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-cough-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-headphones`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-mask`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-medical`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-virus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-vr`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.heading
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.headphones
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`headphones-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.headset
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.heart
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`heart-broken`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`heart-circle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`heart-rate`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`heart-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.heartbeat
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.heat
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.helicopter
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`helmet-battle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hexagon
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.highlighter
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hiking
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hippo
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.history
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hockey-mask`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hockey-puck`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hockey-sticks`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`holly-berry`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.home
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`home-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`home-heart`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`home-lg`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`home-lg-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hood-cloak`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`horizontal-rule`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.horse
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`horse-head`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`horse-saddle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hospital
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hospital-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hospital-symbol`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hospital-user`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hospitals
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hot-tub`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hotdog
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hotel
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hourglass
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hourglass-end`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hourglass-half`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hourglass-start`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.house
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-damage`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-day`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-flood`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-leave`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-night`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-return`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-signal`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-user`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hryvnia
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.humidity
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hurricane
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`i-cursor`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ice-cream`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ice-skate`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.icicles
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.icons
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`icons-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`id-badge`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`id-card`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`id-card-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.igloo
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.image
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`image-polaroid`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.images
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.inbox
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`inbox-in`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`inbox-out`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.indent
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.industry
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`industry-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.infinity
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.info
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`info-circle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`info-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.inhaler
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.integral
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.intersection
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.inventory
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`island-tropical`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.italic
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`jack-o-lantern`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jedi
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.joint
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`journal-whills`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.joystick
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jug
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kaaba
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kazoo
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kerning
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.key
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`key-skeleton`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.keyboard
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.keynote
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.khanda
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kidneys
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kiss
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`kiss-beam`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`kiss-wink-heart`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kite
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`kiwi-bird`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`knife-kitchen`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lambda
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lamp
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lamp-desk`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lamp-floor`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.landmark
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`landmark-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.language
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.laptop
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laptop-code`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laptop-house`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laptop-medical`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lasso
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.laugh
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laugh-beam`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laugh-squint`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laugh-wink`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`layer-group`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`layer-minus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`layer-plus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.leaf
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`leaf-heart`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`leaf-maple`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`leaf-oak`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lemon
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`less-than`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`less-than-equal`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`level-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`level-down-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`level-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`level-up-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`life-ring`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`light-ceiling`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`light-switch`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`light-switch-off`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`light-switch-on`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lightbulb
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lightbulb-dollar`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lightbulb-exclamation`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lightbulb-on`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lightbulb-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lights-holiday`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`line-columns`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`line-height`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.link
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lips
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lira-sign`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.list
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`list-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`list-music`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`list-ol`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`list-ul`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.location
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`location-arrow`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`location-circle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`location-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lock
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lock-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lock-open`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lock-open-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-alt-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-alt-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-alt-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-alt-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.loveseat
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`low-vision`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.luchador
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`luggage-cart`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lungs
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lungs-virus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mace
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.magic
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.magnet
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mail-bulk`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mailbox
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.male
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mandolin
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.map
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marked`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marked-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-alt-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-check`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-edit`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-exclamation`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-minus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-plus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-question`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-smile`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-times`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-pin`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-signs`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.marker
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mars
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mars-double`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mars-stroke`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mars-stroke-h`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mars-stroke-v`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mask
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.meat
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medal
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medkit
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.megaphone
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.meh
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`meh-blank`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`meh-rolling-eyes`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.memory
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.menorah
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mercury
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.meteor
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microchip
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microphone
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`microphone-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`microphone-alt-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`microphone-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`microphone-stand`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microscope
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microwave
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mind-share`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.minus
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`minus-circle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`minus-hexagon`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`minus-octagon`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`minus-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mistletoe
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mitten
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mobile
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mobile-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mobile-android`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mobile-android-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-bill`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-bill-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-bill-wave`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-bill-wave-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-check`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-check-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-check-edit`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-check-edit-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`monitor-heart-rate`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.monkey
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.monument
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.moon
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`moon-cloud`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`moon-stars`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mortar-pestle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mosque
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.motorcycle
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mountain
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mountains
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mouse
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mouse-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mouse-pointer`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mp3-player`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mug
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mug-hot`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mug-marshmallows`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mug-tea`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.music
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`music-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`music-alt-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`music-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.narwhal
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`network-wired`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.neuter
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.newspaper
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`not-equal`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`notes-medical`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`object-group`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`object-ungroup`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.octagon
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`oil-can`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`oil-temp`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.om
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.omega
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ornament
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.otter
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.outdent
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.outlet
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.oven
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.overline
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`page-break`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pager
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paint-brush`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paint-brush-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paint-roller`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.palette
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pallet
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pallet-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paper-plane`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paperclip
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`parachute-box`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paragraph
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paragraph-rtl`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.parking
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`parking-circle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`parking-circle-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`parking-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.passport
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pastafarianism
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paste
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pause
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pause-circle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paw
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paw-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paw-claws`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.peace
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pegasus
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pen
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pen-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pen-fancy`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pen-nib`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pen-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pencil
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pencil-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pencil-paintbrush`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pencil-ruler`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pennant
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`people-arrows`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`people-carry`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pepper-hot`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.percent
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.percentage
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-booth`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-carry`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-dolly`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-dolly-empty`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-sign`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.phone
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-laptop`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-office`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-plus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-rotary`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-square-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-volume`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`photo-video`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pi
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.piano
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`piano-keyboard`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pie
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pig
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`piggy-bank`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pills
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pizza
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pizza-slice`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`place-of-worship`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.plane
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plane-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plane-arrival`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plane-departure`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plane-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`planet-moon`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`planet-ringed`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.play
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`play-circle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.plug
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.plus
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plus-circle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plus-hexagon`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plus-octagon`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plus-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.podcast
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.podium
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`podium-star`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`police-box`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.poll
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`poll-h`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`poll-people`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.poo
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`poo-storm`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.poop
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.popcorn
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`portal-enter`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`portal-exit`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.portrait
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pound-sign`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`power-off`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pray
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`praying-hands`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.prescription
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`prescription-bottle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`prescription-bottle-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.presentation
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.print
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`print-search`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`print-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.procedures
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`project-diagram`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.projector
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pump-medical`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pump-soap`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pumpkin
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`puzzle-piece`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.qrcode
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.question
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`question-circle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`question-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.quidditch
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`quote-left`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`quote-right`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.quran
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rabbit
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rabbit-fast`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.racquet
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.radar
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.radiation
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`radiation-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.radio
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`radio-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rainbow
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.raindrops
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ram
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ramp-loading`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.random
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.raygun
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.receipt
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`record-vinyl`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rectangle-landscape`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rectangle-portrait`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rectangle-wide`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.recycle
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.redo
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`redo-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.refrigerator
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.registered
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`remove-format`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.repeat
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`repeat-1`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`repeat-1-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`repeat-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.reply
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`reply-all`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.republican
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.restroom
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.retweet
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`retweet-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ribbon
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ring
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rings-wedding`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.road
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.robot
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rocket
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rocket-launch`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.route
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`route-highway`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`route-interstate`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.router
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rss
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rss-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruble-sign`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ruler
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruler-combined`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruler-horizontal`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruler-triangle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruler-vertical`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.running
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rupee-sign`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rv
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sack
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sack-dollar`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sad-cry`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sad-tear`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.salad
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sandwich
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.satellite
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`satellite-dish`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sausage
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.save
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sax-hot`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.saxophone
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scalpel
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scalpel-path`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scanner
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scanner-image`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scanner-keyboard`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scanner-touchscreen`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scarecrow
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scarf
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.school
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.screwdriver
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scroll
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scroll-old`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scrubber
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scythe
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sd-card`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.search
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`search-dollar`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`search-location`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`search-minus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`search-plus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.seedling
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`send-back`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`send-backward`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sensor
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sensor-alert`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sensor-fire`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sensor-on`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sensor-smoke`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.server
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shapes
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.share
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`share-all`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`share-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`share-alt-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`share-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sheep
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shekel-sign`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shield
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shield-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shield-check`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shield-cross`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shield-virus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ship
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shipping-fast`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shipping-timed`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shish-kebab`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shoe-prints`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shopping-bag`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shopping-basket`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shopping-cart`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shovel
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shovel-snow`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shower
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shredder
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shuttle-van`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shuttlecock
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sickle
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sigma
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sign
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-in`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-in-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-language`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-out`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-out-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.signal
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-1`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-2`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-3`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-4`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt-1`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt-2`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt-3`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-stream`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.signature
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sim-card`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sink
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.siren
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`siren-on`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sitemap
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skating
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skeleton
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ski-jump`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ski-lift`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skiing
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`skiing-nordic`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skull
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`skull-cow`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`skull-crossbones`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.slash
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sledding
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sleigh
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sliders-h`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sliders-h-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sliders-v`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sliders-v-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.smile
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`smile-beam`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`smile-plus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`smile-wink`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.smog
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.smoke
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.smoking
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`smoking-ban`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sms
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snake
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snooze
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`snow-blowing`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowboarding
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowflake
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowflakes
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowman
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowmobile
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowplow
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.soap
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.socks
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`solar-panel`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`solar-system`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sort
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alpha-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alpha-down-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alpha-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alpha-up-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-amount-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-amount-down-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-amount-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-amount-up-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-circle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-circle-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-circle-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-numeric-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-numeric-down-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-numeric-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-numeric-up-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-shapes-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-shapes-down-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-shapes-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-shapes-up-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-size-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-size-down-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-size-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-size-up-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.soup
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spa
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`space-shuttle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`space-station-moon`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`space-station-moon-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spade
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sparkles
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.speaker
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.speakers
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spell-check`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spider
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spider-black-widow`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spider-web`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spinner
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spinner-third`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.splotch
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spray-can`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sprinkler
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.square
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`square-full`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`square-root`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`square-root-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.squirrel
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.staff
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stamp
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.star
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-and-crescent`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-christmas`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-exclamation`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-half`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-half-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-of-david`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-of-life`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-shooting`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.starfighter
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`starfighter-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stars
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.starship
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`starship-freighter`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.steak
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`steering-wheel`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`step-backward`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`step-forward`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stethoscope
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sticky-note`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stocking
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stomach
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stop
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stop-circle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stopwatch
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stopwatch-20`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.store
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`store-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`store-alt-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`store-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stream
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`street-view`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stretcher
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.strikethrough
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stroopwafel
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.subscript
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.subway
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.suitcase
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`suitcase-rolling`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sun
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sun-cloud`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sun-dust`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sun-haze`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sunglasses
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sunrise
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sunset
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.superscript
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.surprise
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.swatchbook
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.swimmer
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`swimming-pool`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sword
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sword-laser`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sword-laser-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.swords
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`swords-laser`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.synagogue
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sync
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sync-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.syringe
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.table
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`table-tennis`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tablet
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tablet-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tablet-android`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tablet-android-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tablet-rugged`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tablets
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tachometer
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-average`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-fast`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-fastest`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-slow`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-slowest`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-average`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-fast`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-fastest`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-slow`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-slowest`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.taco
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tag
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tags
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tally
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tanakh
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tape
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tasks
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tasks-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.taxi
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.teeth
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`teeth-open`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.telescope
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-frigid`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-high`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-hot`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-low`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tenge
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tennis-ball`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.terminal
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.text
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`text-height`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`text-size`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`text-width`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.th
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`th-large`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`th-list`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`theater-masks`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.thermometer
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-empty`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-full`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-half`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-quarter`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-three-quarters`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.theta
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thumbs-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thumbs-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.thumbtack
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.thunderstorm
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thunderstorm-moon`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thunderstorm-sun`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ticket
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ticket-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tilde
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.times
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`times-circle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`times-hexagon`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`times-octagon`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`times-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tint
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tint-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tire
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tire-flat`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tire-pressure-warning`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tire-rugged`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tired
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toggle-off`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toggle-on`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.toilet
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toilet-paper`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toilet-paper-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toilet-paper-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tombstone
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tombstone-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.toolbox
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tools
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tooth
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.toothbrush
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.torah
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`torii-gate`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tornado
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tractor
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trademark
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-cone`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-light`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-light-go`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-light-slow`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-light-stop`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trailer
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.train
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tram
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.transgender
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transgender-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.transporter
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transporter-1`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transporter-2`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transporter-3`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transporter-empty`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trash
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-restore`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-restore-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-undo`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-undo-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`treasure-chest`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tree
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-christmas`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-decorated`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-large`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-palm`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trees
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.triangle
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`triangle-music`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trophy
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trophy-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.truck
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-container`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-couch`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-loading`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-monster`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-moving`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-pickup`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-plow`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-ramp`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trumpet
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tshirt
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tty
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.turkey
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.turntable
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.turtle
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tv
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tv-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tv-music`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tv-retro`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.typewriter
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ufo
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ufo-beam`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.umbrella
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`umbrella-beach`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.underline
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.undo
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`undo-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unicorn
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.union
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`universal-access`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.university
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unlink
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unlock
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`unlock-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.upload
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`usb-drive`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`usd-circle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`usd-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.user
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-alien`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-alt-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-astronaut`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-chart`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-check`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-circle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-clock`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-cog`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-cowboy`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-crown`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-edit`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-friends`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-graduate`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-hard-hat`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-headset`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-injured`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-lock`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-md`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-md-chat`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-minus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-music`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-ninja`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-nurse`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-plus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-robot`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-secret`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-shield`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-tag`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-tie`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-times`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-unlock`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-visor`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.users
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-class`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-cog`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-crown`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-medical`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`utensil-fork`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`utensil-knife`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`utensil-spoon`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.utensils
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`utensils-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vacuum
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vacuum-robot`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`value-absolute`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vector-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.venus
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`venus-double`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`venus-mars`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vest
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vest-patches`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vhs
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vial
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vials
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.video
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`video-plus`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`video-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vihara
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.violin
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.virus
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`virus-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.viruses
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.voicemail
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.volcano
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volleyball-ball`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.volume
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-down`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-mute`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-off`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-up`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vote-nay`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vote-yea`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vr-cardboard`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wagon-covered`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.walker
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`walkie-talkie`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.walking
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wallet
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wand
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wand-magic`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.warehouse
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`warehouse-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.washer
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.watch
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`watch-calculator`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`watch-fitness`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.water
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`water-lower`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`water-rise`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wave-sine`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wave-square`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wave-triangle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.waveform
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`waveform-path`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.webcam
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`webcam-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.weight
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`weight-hanging`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.whale
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wheat
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wheelchair
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.whistle
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wifi
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wifi-1`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wifi-2`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wifi-slash`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wind
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wind-turbine`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wind-warning`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.window
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-close`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-frame`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-frame-open`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-maximize`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-minimize`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-restore`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.windsock
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wine-bottle`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wine-glass`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wine-glass-alt`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`won-sign`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wreath
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wrench
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`x-ray`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`yen-sign`
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`yin-yang`
  */
  trait IconName extends StObject
  object IconName {
    
    inline def `500px`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`500px` = "500px".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`500px`]
    
    inline def abacus: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.abacus = "abacus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.abacus]
    
    inline def `accessible-icon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`accessible-icon` = "accessible-icon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`accessible-icon`]
    
    inline def accusoft: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.accusoft = "accusoft".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.accusoft]
    
    inline def acorn: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.acorn = "acorn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.acorn]
    
    inline def `acquisitions-incorporated`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`acquisitions-incorporated` = "acquisitions-incorporated".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`acquisitions-incorporated`]
    
    inline def ad: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ad = "ad".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ad]
    
    inline def `address-book`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`address-book` = "address-book".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`address-book`]
    
    inline def `address-card`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`address-card` = "address-card".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`address-card`]
    
    inline def adjust: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.adjust = "adjust".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.adjust]
    
    inline def adn: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.adn = "adn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.adn]
    
    inline def adversal: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.adversal = "adversal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.adversal]
    
    inline def affiliatetheme: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.affiliatetheme = "affiliatetheme".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.affiliatetheme]
    
    inline def `air-conditioner`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`air-conditioner` = "air-conditioner".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`air-conditioner`]
    
    inline def `air-freshener`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`air-freshener` = "air-freshener".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`air-freshener`]
    
    inline def airbnb: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.airbnb = "airbnb".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.airbnb]
    
    inline def `alarm-clock`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alarm-clock` = "alarm-clock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alarm-clock`]
    
    inline def `alarm-exclamation`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alarm-exclamation` = "alarm-exclamation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alarm-exclamation`]
    
    inline def `alarm-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alarm-plus` = "alarm-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alarm-plus`]
    
    inline def `alarm-snooze`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alarm-snooze` = "alarm-snooze".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alarm-snooze`]
    
    inline def album: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.album = "album".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.album]
    
    inline def `album-collection`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`album-collection` = "album-collection".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`album-collection`]
    
    inline def algolia: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.algolia = "algolia".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.algolia]
    
    inline def alicorn: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.alicorn = "alicorn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.alicorn]
    
    inline def alien: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.alien = "alien".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.alien]
    
    inline def `alien-monster`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alien-monster` = "alien-monster".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alien-monster`]
    
    inline def `align-center`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-center` = "align-center".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-center`]
    
    inline def `align-justify`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-justify` = "align-justify".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-justify`]
    
    inline def `align-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-left` = "align-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-left`]
    
    inline def `align-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-right` = "align-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-right`]
    
    inline def `align-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-slash` = "align-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-slash`]
    
    inline def alipay: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.alipay = "alipay".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.alipay]
    
    inline def allergies: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.allergies = "allergies".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.allergies]
    
    inline def amazon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.amazon = "amazon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.amazon]
    
    inline def `amazon-pay`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`amazon-pay` = "amazon-pay".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`amazon-pay`]
    
    inline def ambulance: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ambulance = "ambulance".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ambulance]
    
    inline def `american-sign-language-interpreting`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`american-sign-language-interpreting` = "american-sign-language-interpreting".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`american-sign-language-interpreting`]
    
    inline def amilia: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.amilia = "amilia".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.amilia]
    
    inline def `amp-guitar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`amp-guitar` = "amp-guitar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`amp-guitar`]
    
    inline def analytics: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.analytics = "analytics".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.analytics]
    
    inline def anchor: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.anchor = "anchor".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.anchor]
    
    inline def android: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.android = "android".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.android]
    
    inline def angel: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angel = "angel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angel]
    
    inline def angellist: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angellist = "angellist".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angellist]
    
    inline def `angle-double-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-double-down` = "angle-double-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-double-down`]
    
    inline def `angle-double-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-double-left` = "angle-double-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-double-left`]
    
    inline def `angle-double-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-double-right` = "angle-double-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-double-right`]
    
    inline def `angle-double-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-double-up` = "angle-double-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-double-up`]
    
    inline def `angle-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-down` = "angle-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-down`]
    
    inline def `angle-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-left` = "angle-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-left`]
    
    inline def `angle-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-right` = "angle-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-right`]
    
    inline def `angle-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-up` = "angle-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-up`]
    
    inline def angry: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angry = "angry".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angry]
    
    inline def angrycreative: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angrycreative = "angrycreative".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angrycreative]
    
    inline def angular: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angular = "angular".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angular]
    
    inline def ankh: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ankh = "ankh".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ankh]
    
    inline def `app-store`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`app-store` = "app-store".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`app-store`]
    
    inline def `app-store-ios`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`app-store-ios` = "app-store-ios".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`app-store-ios`]
    
    inline def apper: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.apper = "apper".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.apper]
    
    inline def apple: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.apple = "apple".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.apple]
    
    inline def `apple-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`apple-alt` = "apple-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`apple-alt`]
    
    inline def `apple-crate`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`apple-crate` = "apple-crate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`apple-crate`]
    
    inline def `apple-pay`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`apple-pay` = "apple-pay".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`apple-pay`]
    
    inline def archive: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.archive = "archive".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.archive]
    
    inline def archway: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.archway = "archway".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.archway]
    
    inline def `arrow-alt-circle-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-circle-down` = "arrow-alt-circle-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-circle-down`]
    
    inline def `arrow-alt-circle-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-circle-left` = "arrow-alt-circle-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-circle-left`]
    
    inline def `arrow-alt-circle-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-circle-right` = "arrow-alt-circle-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-circle-right`]
    
    inline def `arrow-alt-circle-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-circle-up` = "arrow-alt-circle-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-circle-up`]
    
    inline def `arrow-alt-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-down` = "arrow-alt-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-down`]
    
    inline def `arrow-alt-from-bottom`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-from-bottom` = "arrow-alt-from-bottom".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-from-bottom`]
    
    inline def `arrow-alt-from-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-from-left` = "arrow-alt-from-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-from-left`]
    
    inline def `arrow-alt-from-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-from-right` = "arrow-alt-from-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-from-right`]
    
    inline def `arrow-alt-from-top`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-from-top` = "arrow-alt-from-top".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-from-top`]
    
    inline def `arrow-alt-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-left` = "arrow-alt-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-left`]
    
    inline def `arrow-alt-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-right` = "arrow-alt-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-right`]
    
    inline def `arrow-alt-square-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-square-down` = "arrow-alt-square-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-square-down`]
    
    inline def `arrow-alt-square-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-square-left` = "arrow-alt-square-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-square-left`]
    
    inline def `arrow-alt-square-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-square-right` = "arrow-alt-square-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-square-right`]
    
    inline def `arrow-alt-square-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-square-up` = "arrow-alt-square-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-square-up`]
    
    inline def `arrow-alt-to-bottom`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-to-bottom` = "arrow-alt-to-bottom".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-to-bottom`]
    
    inline def `arrow-alt-to-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-to-left` = "arrow-alt-to-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-to-left`]
    
    inline def `arrow-alt-to-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-to-right` = "arrow-alt-to-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-to-right`]
    
    inline def `arrow-alt-to-top`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-to-top` = "arrow-alt-to-top".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-to-top`]
    
    inline def `arrow-alt-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-up` = "arrow-alt-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-up`]
    
    inline def `arrow-circle-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-circle-down` = "arrow-circle-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-circle-down`]
    
    inline def `arrow-circle-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-circle-left` = "arrow-circle-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-circle-left`]
    
    inline def `arrow-circle-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-circle-right` = "arrow-circle-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-circle-right`]
    
    inline def `arrow-circle-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-circle-up` = "arrow-circle-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-circle-up`]
    
    inline def `arrow-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-down` = "arrow-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-down`]
    
    inline def `arrow-from-bottom`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-from-bottom` = "arrow-from-bottom".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-from-bottom`]
    
    inline def `arrow-from-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-from-left` = "arrow-from-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-from-left`]
    
    inline def `arrow-from-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-from-right` = "arrow-from-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-from-right`]
    
    inline def `arrow-from-top`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-from-top` = "arrow-from-top".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-from-top`]
    
    inline def `arrow-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-left` = "arrow-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-left`]
    
    inline def `arrow-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-right` = "arrow-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-right`]
    
    inline def `arrow-square-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-square-down` = "arrow-square-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-square-down`]
    
    inline def `arrow-square-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-square-left` = "arrow-square-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-square-left`]
    
    inline def `arrow-square-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-square-right` = "arrow-square-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-square-right`]
    
    inline def `arrow-square-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-square-up` = "arrow-square-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-square-up`]
    
    inline def `arrow-to-bottom`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-to-bottom` = "arrow-to-bottom".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-to-bottom`]
    
    inline def `arrow-to-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-to-left` = "arrow-to-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-to-left`]
    
    inline def `arrow-to-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-to-right` = "arrow-to-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-to-right`]
    
    inline def `arrow-to-top`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-to-top` = "arrow-to-top".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-to-top`]
    
    inline def `arrow-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-up` = "arrow-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-up`]
    
    inline def arrows: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.arrows = "arrows".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.arrows]
    
    inline def `arrows-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-alt` = "arrows-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-alt`]
    
    inline def `arrows-alt-h`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-alt-h` = "arrows-alt-h".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-alt-h`]
    
    inline def `arrows-alt-v`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-alt-v` = "arrows-alt-v".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-alt-v`]
    
    inline def `arrows-h`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-h` = "arrows-h".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-h`]
    
    inline def `arrows-v`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-v` = "arrows-v".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-v`]
    
    inline def artstation: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.artstation = "artstation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.artstation]
    
    inline def `assistive-listening-systems`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`assistive-listening-systems` = "assistive-listening-systems".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`assistive-listening-systems`]
    
    inline def asterisk: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.asterisk = "asterisk".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.asterisk]
    
    inline def asymmetrik: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.asymmetrik = "asymmetrik".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.asymmetrik]
    
    inline def at: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.at = "at".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.at]
    
    inline def atlas: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.atlas = "atlas".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.atlas]
    
    inline def atlassian: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.atlassian = "atlassian".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.atlassian]
    
    inline def atom: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.atom = "atom".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.atom]
    
    inline def `atom-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`atom-alt` = "atom-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`atom-alt`]
    
    inline def audible: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.audible = "audible".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.audible]
    
    inline def `audio-description`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`audio-description` = "audio-description".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`audio-description`]
    
    inline def autoprefixer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.autoprefixer = "autoprefixer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.autoprefixer]
    
    inline def avianex: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.avianex = "avianex".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.avianex]
    
    inline def aviato: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.aviato = "aviato".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.aviato]
    
    inline def award: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.award = "award".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.award]
    
    inline def aws: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.aws = "aws".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.aws]
    
    inline def axe: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.axe = "axe".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.axe]
    
    inline def `axe-battle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`axe-battle` = "axe-battle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`axe-battle`]
    
    inline def baby: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.baby = "baby".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.baby]
    
    inline def `baby-carriage`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`baby-carriage` = "baby-carriage".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`baby-carriage`]
    
    inline def backpack: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.backpack = "backpack".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.backpack]
    
    inline def backspace: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.backspace = "backspace".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.backspace]
    
    inline def backward: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.backward = "backward".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.backward]
    
    inline def bacon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bacon = "bacon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bacon]
    
    inline def bacteria: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bacteria = "bacteria".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bacteria]
    
    inline def bacterium: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bacterium = "bacterium".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bacterium]
    
    inline def badge: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.badge = "badge".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.badge]
    
    inline def `badge-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badge-check` = "badge-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badge-check`]
    
    inline def `badge-dollar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badge-dollar` = "badge-dollar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badge-dollar`]
    
    inline def `badge-percent`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badge-percent` = "badge-percent".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badge-percent`]
    
    inline def `badge-sheriff`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badge-sheriff` = "badge-sheriff".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badge-sheriff`]
    
    inline def `badger-honey`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badger-honey` = "badger-honey".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badger-honey`]
    
    inline def `bags-shopping`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bags-shopping` = "bags-shopping".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bags-shopping`]
    
    inline def bahai: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bahai = "bahai".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bahai]
    
    inline def `balance-scale`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`balance-scale` = "balance-scale".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`balance-scale`]
    
    inline def `balance-scale-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`balance-scale-left` = "balance-scale-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`balance-scale-left`]
    
    inline def `balance-scale-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`balance-scale-right` = "balance-scale-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`balance-scale-right`]
    
    inline def `ball-pile`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ball-pile` = "ball-pile".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ball-pile`]
    
    inline def ballot: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ballot = "ballot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ballot]
    
    inline def `ballot-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ballot-check` = "ballot-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ballot-check`]
    
    inline def ban: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ban = "ban".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ban]
    
    inline def `band-aid`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`band-aid` = "band-aid".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`band-aid`]
    
    inline def bandcamp: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bandcamp = "bandcamp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bandcamp]
    
    inline def banjo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.banjo = "banjo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.banjo]
    
    inline def barcode: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.barcode = "barcode".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.barcode]
    
    inline def `barcode-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`barcode-alt` = "barcode-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`barcode-alt`]
    
    inline def `barcode-read`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`barcode-read` = "barcode-read".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`barcode-read`]
    
    inline def `barcode-scan`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`barcode-scan` = "barcode-scan".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`barcode-scan`]
    
    inline def bars: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bars = "bars".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bars]
    
    inline def baseball: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.baseball = "baseball".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.baseball]
    
    inline def `baseball-ball`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`baseball-ball` = "baseball-ball".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`baseball-ball`]
    
    inline def `basketball-ball`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`basketball-ball` = "basketball-ball".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`basketball-ball`]
    
    inline def `basketball-hoop`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`basketball-hoop` = "basketball-hoop".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`basketball-hoop`]
    
    inline def bat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bat = "bat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bat]
    
    inline def bath: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bath = "bath".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bath]
    
    inline def `battery-bolt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-bolt` = "battery-bolt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-bolt`]
    
    inline def `battery-empty`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-empty` = "battery-empty".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-empty`]
    
    inline def `battery-full`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-full` = "battery-full".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-full`]
    
    inline def `battery-half`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-half` = "battery-half".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-half`]
    
    inline def `battery-quarter`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-quarter` = "battery-quarter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-quarter`]
    
    inline def `battery-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-slash` = "battery-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-slash`]
    
    inline def `battery-three-quarters`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-three-quarters` = "battery-three-quarters".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-three-quarters`]
    
    inline def `battle-net`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battle-net` = "battle-net".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battle-net`]
    
    inline def bed: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bed = "bed".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bed]
    
    inline def `bed-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bed-alt` = "bed-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bed-alt`]
    
    inline def `bed-bunk`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bed-bunk` = "bed-bunk".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bed-bunk`]
    
    inline def `bed-empty`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bed-empty` = "bed-empty".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bed-empty`]
    
    inline def beer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.beer = "beer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.beer]
    
    inline def behance: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.behance = "behance".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.behance]
    
    inline def `behance-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`behance-square` = "behance-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`behance-square`]
    
    inline def bell: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bell = "bell".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bell]
    
    inline def `bell-exclamation`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-exclamation` = "bell-exclamation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-exclamation`]
    
    inline def `bell-on`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-on` = "bell-on".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-on`]
    
    inline def `bell-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-plus` = "bell-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-plus`]
    
    inline def `bell-school`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-school` = "bell-school".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-school`]
    
    inline def `bell-school-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-school-slash` = "bell-school-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-school-slash`]
    
    inline def `bell-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-slash` = "bell-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-slash`]
    
    inline def bells: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bells = "bells".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bells]
    
    inline def betamax: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.betamax = "betamax".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.betamax]
    
    inline def `bezier-curve`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bezier-curve` = "bezier-curve".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bezier-curve`]
    
    inline def bible: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bible = "bible".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bible]
    
    inline def bicycle: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bicycle = "bicycle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bicycle]
    
    inline def biking: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.biking = "biking".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.biking]
    
    inline def `biking-mountain`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`biking-mountain` = "biking-mountain".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`biking-mountain`]
    
    inline def bimobject: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bimobject = "bimobject".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bimobject]
    
    inline def binoculars: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.binoculars = "binoculars".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.binoculars]
    
    inline def biohazard: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.biohazard = "biohazard".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.biohazard]
    
    inline def `birthday-cake`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`birthday-cake` = "birthday-cake".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`birthday-cake`]
    
    inline def bitbucket: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bitbucket = "bitbucket".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bitbucket]
    
    inline def bitcoin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bitcoin = "bitcoin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bitcoin]
    
    inline def bity: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bity = "bity".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bity]
    
    inline def `black-tie`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`black-tie` = "black-tie".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`black-tie`]
    
    inline def blackberry: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blackberry = "blackberry".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blackberry]
    
    inline def blanket: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blanket = "blanket".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blanket]
    
    inline def blender: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blender = "blender".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blender]
    
    inline def `blender-phone`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`blender-phone` = "blender-phone".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`blender-phone`]
    
    inline def blind: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blind = "blind".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blind]
    
    inline def blinds: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blinds = "blinds".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blinds]
    
    inline def `blinds-open`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`blinds-open` = "blinds-open".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`blinds-open`]
    
    inline def `blinds-raised`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`blinds-raised` = "blinds-raised".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`blinds-raised`]
    
    inline def blog: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blog = "blog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blog]
    
    inline def blogger: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blogger = "blogger".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blogger]
    
    inline def `blogger-b`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`blogger-b` = "blogger-b".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`blogger-b`]
    
    inline def bluetooth: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bluetooth = "bluetooth".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bluetooth]
    
    inline def `bluetooth-b`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bluetooth-b` = "bluetooth-b".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bluetooth-b`]
    
    inline def bold: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bold = "bold".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bold]
    
    inline def bolt: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bolt = "bolt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bolt]
    
    inline def bomb: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bomb = "bomb".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bomb]
    
    inline def bone: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bone = "bone".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bone]
    
    inline def `bone-break`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bone-break` = "bone-break".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bone-break`]
    
    inline def bong: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bong = "bong".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bong]
    
    inline def book: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.book = "book".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.book]
    
    inline def `book-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-alt` = "book-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-alt`]
    
    inline def `book-dead`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-dead` = "book-dead".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-dead`]
    
    inline def `book-heart`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-heart` = "book-heart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-heart`]
    
    inline def `book-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-medical` = "book-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-medical`]
    
    inline def `book-open`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-open` = "book-open".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-open`]
    
    inline def `book-reader`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-reader` = "book-reader".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-reader`]
    
    inline def `book-spells`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-spells` = "book-spells".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-spells`]
    
    inline def `book-user`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-user` = "book-user".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-user`]
    
    inline def bookmark: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bookmark = "bookmark".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bookmark]
    
    inline def books: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.books = "books".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.books]
    
    inline def `books-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`books-medical` = "books-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`books-medical`]
    
    inline def boombox: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.boombox = "boombox".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.boombox]
    
    inline def boot: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.boot = "boot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.boot]
    
    inline def `booth-curtain`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`booth-curtain` = "booth-curtain".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`booth-curtain`]
    
    inline def bootstrap: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bootstrap = "bootstrap".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bootstrap]
    
    inline def `border-all`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-all` = "border-all".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-all`]
    
    inline def `border-bottom`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-bottom` = "border-bottom".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-bottom`]
    
    inline def `border-center-h`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-center-h` = "border-center-h".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-center-h`]
    
    inline def `border-center-v`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-center-v` = "border-center-v".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-center-v`]
    
    inline def `border-inner`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-inner` = "border-inner".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-inner`]
    
    inline def `border-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-left` = "border-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-left`]
    
    inline def `border-none`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-none` = "border-none".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-none`]
    
    inline def `border-outer`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-outer` = "border-outer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-outer`]
    
    inline def `border-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-right` = "border-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-right`]
    
    inline def `border-style`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-style` = "border-style".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-style`]
    
    inline def `border-style-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-style-alt` = "border-style-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-style-alt`]
    
    inline def `border-top`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-top` = "border-top".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-top`]
    
    inline def `bow-arrow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bow-arrow` = "bow-arrow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bow-arrow`]
    
    inline def `bowling-ball`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bowling-ball` = "bowling-ball".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bowling-ball`]
    
    inline def `bowling-pins`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bowling-pins` = "bowling-pins".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bowling-pins`]
    
    inline def box: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.box = "box".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.box]
    
    inline def `box-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-alt` = "box-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-alt`]
    
    inline def `box-ballot`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-ballot` = "box-ballot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-ballot`]
    
    inline def `box-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-check` = "box-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-check`]
    
    inline def `box-fragile`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-fragile` = "box-fragile".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-fragile`]
    
    inline def `box-full`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-full` = "box-full".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-full`]
    
    inline def `box-heart`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-heart` = "box-heart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-heart`]
    
    inline def `box-open`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-open` = "box-open".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-open`]
    
    inline def `box-tissue`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-tissue` = "box-tissue".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-tissue`]
    
    inline def `box-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-up` = "box-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-up`]
    
    inline def `box-usd`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-usd` = "box-usd".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-usd`]
    
    inline def boxes: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.boxes = "boxes".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.boxes]
    
    inline def `boxes-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`boxes-alt` = "boxes-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`boxes-alt`]
    
    inline def `boxing-glove`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`boxing-glove` = "boxing-glove".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`boxing-glove`]
    
    inline def brackets: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.brackets = "brackets".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.brackets]
    
    inline def `brackets-curly`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`brackets-curly` = "brackets-curly".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`brackets-curly`]
    
    inline def braille: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.braille = "braille".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.braille]
    
    inline def brain: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.brain = "brain".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.brain]
    
    inline def `bread-loaf`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bread-loaf` = "bread-loaf".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bread-loaf`]
    
    inline def `bread-slice`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bread-slice` = "bread-slice".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bread-slice`]
    
    inline def briefcase: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.briefcase = "briefcase".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.briefcase]
    
    inline def `briefcase-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`briefcase-medical` = "briefcase-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`briefcase-medical`]
    
    inline def `bring-forward`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bring-forward` = "bring-forward".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bring-forward`]
    
    inline def `bring-front`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bring-front` = "bring-front".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bring-front`]
    
    inline def `broadcast-tower`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`broadcast-tower` = "broadcast-tower".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`broadcast-tower`]
    
    inline def broom: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.broom = "broom".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.broom]
    
    inline def browser: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.browser = "browser".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.browser]
    
    inline def brush: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.brush = "brush".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.brush]
    
    inline def btc: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.btc = "btc".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.btc]
    
    inline def buffer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.buffer = "buffer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.buffer]
    
    inline def bug: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bug = "bug".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bug]
    
    inline def building: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.building = "building".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.building]
    
    inline def bullhorn: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bullhorn = "bullhorn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bullhorn]
    
    inline def bullseye: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bullseye = "bullseye".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bullseye]
    
    inline def `bullseye-arrow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bullseye-arrow` = "bullseye-arrow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bullseye-arrow`]
    
    inline def `bullseye-pointer`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bullseye-pointer` = "bullseye-pointer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bullseye-pointer`]
    
    inline def `burger-soda`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`burger-soda` = "burger-soda".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`burger-soda`]
    
    inline def burn: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.burn = "burn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.burn]
    
    inline def buromobelexperte: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.buromobelexperte = "buromobelexperte".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.buromobelexperte]
    
    inline def burrito: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.burrito = "burrito".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.burrito]
    
    inline def bus: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bus = "bus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bus]
    
    inline def `bus-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bus-alt` = "bus-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bus-alt`]
    
    inline def `bus-school`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bus-school` = "bus-school".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bus-school`]
    
    inline def `business-time`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`business-time` = "business-time".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`business-time`]
    
    inline def `buy-n-large`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`buy-n-large` = "buy-n-large".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`buy-n-large`]
    
    inline def buysellads: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.buysellads = "buysellads".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.buysellads]
    
    inline def `cabinet-filing`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cabinet-filing` = "cabinet-filing".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cabinet-filing`]
    
    inline def cactus: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cactus = "cactus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cactus]
    
    inline def calculator: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.calculator = "calculator".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.calculator]
    
    inline def `calculator-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calculator-alt` = "calculator-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calculator-alt`]
    
    inline def calendar: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.calendar = "calendar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.calendar]
    
    inline def `calendar-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-alt` = "calendar-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-alt`]
    
    inline def `calendar-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-check` = "calendar-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-check`]
    
    inline def `calendar-day`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-day` = "calendar-day".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-day`]
    
    inline def `calendar-edit`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-edit` = "calendar-edit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-edit`]
    
    inline def `calendar-exclamation`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-exclamation` = "calendar-exclamation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-exclamation`]
    
    inline def `calendar-minus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-minus` = "calendar-minus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-minus`]
    
    inline def `calendar-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-plus` = "calendar-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-plus`]
    
    inline def `calendar-star`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-star` = "calendar-star".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-star`]
    
    inline def `calendar-times`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-times` = "calendar-times".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-times`]
    
    inline def `calendar-week`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-week` = "calendar-week".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-week`]
    
    inline def camcorder: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.camcorder = "camcorder".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.camcorder]
    
    inline def camera: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.camera = "camera".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.camera]
    
    inline def `camera-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-alt` = "camera-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-alt`]
    
    inline def `camera-home`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-home` = "camera-home".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-home`]
    
    inline def `camera-movie`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-movie` = "camera-movie".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-movie`]
    
    inline def `camera-polaroid`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-polaroid` = "camera-polaroid".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-polaroid`]
    
    inline def `camera-retro`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-retro` = "camera-retro".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-retro`]
    
    inline def campfire: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.campfire = "campfire".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.campfire]
    
    inline def campground: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.campground = "campground".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.campground]
    
    inline def `canadian-maple-leaf`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`canadian-maple-leaf` = "canadian-maple-leaf".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`canadian-maple-leaf`]
    
    inline def `candle-holder`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`candle-holder` = "candle-holder".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`candle-holder`]
    
    inline def `candy-cane`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`candy-cane` = "candy-cane".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`candy-cane`]
    
    inline def `candy-corn`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`candy-corn` = "candy-corn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`candy-corn`]
    
    inline def cannabis: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cannabis = "cannabis".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cannabis]
    
    inline def capsules: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.capsules = "capsules".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.capsules]
    
    inline def car: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.car = "car".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.car]
    
    inline def `car-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-alt` = "car-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-alt`]
    
    inline def `car-battery`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-battery` = "car-battery".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-battery`]
    
    inline def `car-building`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-building` = "car-building".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-building`]
    
    inline def `car-bump`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-bump` = "car-bump".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-bump`]
    
    inline def `car-bus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-bus` = "car-bus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-bus`]
    
    inline def `car-crash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-crash` = "car-crash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-crash`]
    
    inline def `car-garage`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-garage` = "car-garage".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-garage`]
    
    inline def `car-mechanic`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-mechanic` = "car-mechanic".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-mechanic`]
    
    inline def `car-side`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-side` = "car-side".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-side`]
    
    inline def `car-tilt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-tilt` = "car-tilt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-tilt`]
    
    inline def `car-wash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-wash` = "car-wash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-wash`]
    
    inline def caravan: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.caravan = "caravan".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.caravan]
    
    inline def `caravan-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caravan-alt` = "caravan-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caravan-alt`]
    
    inline def `caret-circle-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-circle-down` = "caret-circle-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-circle-down`]
    
    inline def `caret-circle-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-circle-left` = "caret-circle-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-circle-left`]
    
    inline def `caret-circle-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-circle-right` = "caret-circle-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-circle-right`]
    
    inline def `caret-circle-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-circle-up` = "caret-circle-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-circle-up`]
    
    inline def `caret-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-down` = "caret-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-down`]
    
    inline def `caret-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-left` = "caret-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-left`]
    
    inline def `caret-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-right` = "caret-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-right`]
    
    inline def `caret-square-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-square-down` = "caret-square-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-square-down`]
    
    inline def `caret-square-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-square-left` = "caret-square-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-square-left`]
    
    inline def `caret-square-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-square-right` = "caret-square-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-square-right`]
    
    inline def `caret-square-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-square-up` = "caret-square-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-square-up`]
    
    inline def `caret-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-up` = "caret-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-up`]
    
    inline def carrot: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.carrot = "carrot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.carrot]
    
    inline def cars: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cars = "cars".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cars]
    
    inline def `cart-arrow-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cart-arrow-down` = "cart-arrow-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cart-arrow-down`]
    
    inline def `cart-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cart-plus` = "cart-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cart-plus`]
    
    inline def `cash-register`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cash-register` = "cash-register".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cash-register`]
    
    inline def `cassette-tape`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cassette-tape` = "cassette-tape".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cassette-tape`]
    
    inline def cat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cat = "cat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cat]
    
    inline def `cat-space`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cat-space` = "cat-space".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cat-space`]
    
    inline def cauldron: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cauldron = "cauldron".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cauldron]
    
    inline def `cc-amazon-pay`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-amazon-pay` = "cc-amazon-pay".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-amazon-pay`]
    
    inline def `cc-amex`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-amex` = "cc-amex".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-amex`]
    
    inline def `cc-apple-pay`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-apple-pay` = "cc-apple-pay".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-apple-pay`]
    
    inline def `cc-diners-club`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-diners-club` = "cc-diners-club".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-diners-club`]
    
    inline def `cc-discover`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-discover` = "cc-discover".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-discover`]
    
    inline def `cc-jcb`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-jcb` = "cc-jcb".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-jcb`]
    
    inline def `cc-mastercard`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-mastercard` = "cc-mastercard".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-mastercard`]
    
    inline def `cc-paypal`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-paypal` = "cc-paypal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-paypal`]
    
    inline def `cc-stripe`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-stripe` = "cc-stripe".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-stripe`]
    
    inline def `cc-visa`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-visa` = "cc-visa".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-visa`]
    
    inline def cctv: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cctv = "cctv".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cctv]
    
    inline def centercode: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.centercode = "centercode".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.centercode]
    
    inline def centos: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.centos = "centos".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.centos]
    
    inline def certificate: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.certificate = "certificate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.certificate]
    
    inline def chair: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chair = "chair".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chair]
    
    inline def `chair-office`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chair-office` = "chair-office".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chair-office`]
    
    inline def chalkboard: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chalkboard = "chalkboard".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chalkboard]
    
    inline def `chalkboard-teacher`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chalkboard-teacher` = "chalkboard-teacher".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chalkboard-teacher`]
    
    inline def `charging-station`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`charging-station` = "charging-station".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`charging-station`]
    
    inline def `chart-area`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-area` = "chart-area".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-area`]
    
    inline def `chart-bar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-bar` = "chart-bar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-bar`]
    
    inline def `chart-line`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-line` = "chart-line".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-line`]
    
    inline def `chart-line-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-line-down` = "chart-line-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-line-down`]
    
    inline def `chart-network`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-network` = "chart-network".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-network`]
    
    inline def `chart-pie`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-pie` = "chart-pie".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-pie`]
    
    inline def `chart-pie-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-pie-alt` = "chart-pie-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-pie-alt`]
    
    inline def `chart-scatter`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-scatter` = "chart-scatter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-scatter`]
    
    inline def check: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.check = "check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.check]
    
    inline def `check-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`check-circle` = "check-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`check-circle`]
    
    inline def `check-double`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`check-double` = "check-double".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`check-double`]
    
    inline def `check-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`check-square` = "check-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`check-square`]
    
    inline def cheese: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cheese = "cheese".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cheese]
    
    inline def `cheese-swiss`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cheese-swiss` = "cheese-swiss".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cheese-swiss`]
    
    inline def cheeseburger: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cheeseburger = "cheeseburger".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cheeseburger]
    
    inline def chess: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chess = "chess".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chess]
    
    inline def `chess-bishop`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-bishop` = "chess-bishop".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-bishop`]
    
    inline def `chess-bishop-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-bishop-alt` = "chess-bishop-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-bishop-alt`]
    
    inline def `chess-board`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-board` = "chess-board".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-board`]
    
    inline def `chess-clock`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-clock` = "chess-clock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-clock`]
    
    inline def `chess-clock-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-clock-alt` = "chess-clock-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-clock-alt`]
    
    inline def `chess-king`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-king` = "chess-king".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-king`]
    
    inline def `chess-king-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-king-alt` = "chess-king-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-king-alt`]
    
    inline def `chess-knight`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-knight` = "chess-knight".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-knight`]
    
    inline def `chess-knight-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-knight-alt` = "chess-knight-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-knight-alt`]
    
    inline def `chess-pawn`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-pawn` = "chess-pawn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-pawn`]
    
    inline def `chess-pawn-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-pawn-alt` = "chess-pawn-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-pawn-alt`]
    
    inline def `chess-queen`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-queen` = "chess-queen".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-queen`]
    
    inline def `chess-queen-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-queen-alt` = "chess-queen-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-queen-alt`]
    
    inline def `chess-rook`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-rook` = "chess-rook".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-rook`]
    
    inline def `chess-rook-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-rook-alt` = "chess-rook-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-rook-alt`]
    
    inline def `chevron-circle-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-circle-down` = "chevron-circle-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-circle-down`]
    
    inline def `chevron-circle-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-circle-left` = "chevron-circle-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-circle-left`]
    
    inline def `chevron-circle-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-circle-right` = "chevron-circle-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-circle-right`]
    
    inline def `chevron-circle-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-circle-up` = "chevron-circle-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-circle-up`]
    
    inline def `chevron-double-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-double-down` = "chevron-double-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-double-down`]
    
    inline def `chevron-double-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-double-left` = "chevron-double-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-double-left`]
    
    inline def `chevron-double-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-double-right` = "chevron-double-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-double-right`]
    
    inline def `chevron-double-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-double-up` = "chevron-double-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-double-up`]
    
    inline def `chevron-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-down` = "chevron-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-down`]
    
    inline def `chevron-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-left` = "chevron-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-left`]
    
    inline def `chevron-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-right` = "chevron-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-right`]
    
    inline def `chevron-square-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-square-down` = "chevron-square-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-square-down`]
    
    inline def `chevron-square-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-square-left` = "chevron-square-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-square-left`]
    
    inline def `chevron-square-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-square-right` = "chevron-square-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-square-right`]
    
    inline def `chevron-square-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-square-up` = "chevron-square-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-square-up`]
    
    inline def `chevron-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-up` = "chevron-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-up`]
    
    inline def child: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.child = "child".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.child]
    
    inline def chimney: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chimney = "chimney".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chimney]
    
    inline def chrome: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chrome = "chrome".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chrome]
    
    inline def chromecast: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chromecast = "chromecast".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chromecast]
    
    inline def church: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.church = "church".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.church]
    
    inline def circle: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.circle = "circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.circle]
    
    inline def `circle-notch`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`circle-notch` = "circle-notch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`circle-notch`]
    
    inline def city: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.city = "city".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.city]
    
    inline def clarinet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.clarinet = "clarinet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.clarinet]
    
    inline def `claw-marks`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`claw-marks` = "claw-marks".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`claw-marks`]
    
    inline def `clinic-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clinic-medical` = "clinic-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clinic-medical`]
    
    inline def clipboard: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.clipboard = "clipboard".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.clipboard]
    
    inline def `clipboard-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-check` = "clipboard-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-check`]
    
    inline def `clipboard-list`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-list` = "clipboard-list".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-list`]
    
    inline def `clipboard-list-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-list-check` = "clipboard-list-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-list-check`]
    
    inline def `clipboard-prescription`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-prescription` = "clipboard-prescription".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-prescription`]
    
    inline def `clipboard-user`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-user` = "clipboard-user".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-user`]
    
    inline def clock: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.clock = "clock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.clock]
    
    inline def `closed-captioning`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`closed-captioning` = "closed-captioning".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`closed-captioning`]
    
    inline def cloud: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloud = "cloud".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloud]
    
    inline def `cloud-download`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-download` = "cloud-download".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-download`]
    
    inline def `cloud-download-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-download-alt` = "cloud-download-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-download-alt`]
    
    inline def `cloud-drizzle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-drizzle` = "cloud-drizzle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-drizzle`]
    
    inline def `cloud-hail`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-hail` = "cloud-hail".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-hail`]
    
    inline def `cloud-hail-mixed`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-hail-mixed` = "cloud-hail-mixed".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-hail-mixed`]
    
    inline def `cloud-meatball`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-meatball` = "cloud-meatball".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-meatball`]
    
    inline def `cloud-moon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-moon` = "cloud-moon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-moon`]
    
    inline def `cloud-moon-rain`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-moon-rain` = "cloud-moon-rain".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-moon-rain`]
    
    inline def `cloud-music`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-music` = "cloud-music".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-music`]
    
    inline def `cloud-rain`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-rain` = "cloud-rain".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-rain`]
    
    inline def `cloud-rainbow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-rainbow` = "cloud-rainbow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-rainbow`]
    
    inline def `cloud-showers`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-showers` = "cloud-showers".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-showers`]
    
    inline def `cloud-showers-heavy`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-showers-heavy` = "cloud-showers-heavy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-showers-heavy`]
    
    inline def `cloud-sleet`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-sleet` = "cloud-sleet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-sleet`]
    
    inline def `cloud-snow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-snow` = "cloud-snow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-snow`]
    
    inline def `cloud-sun`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-sun` = "cloud-sun".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-sun`]
    
    inline def `cloud-sun-rain`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-sun-rain` = "cloud-sun-rain".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-sun-rain`]
    
    inline def `cloud-upload`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-upload` = "cloud-upload".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-upload`]
    
    inline def `cloud-upload-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-upload-alt` = "cloud-upload-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-upload-alt`]
    
    inline def cloudflare: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloudflare = "cloudflare".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloudflare]
    
    inline def clouds: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.clouds = "clouds".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.clouds]
    
    inline def `clouds-moon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clouds-moon` = "clouds-moon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clouds-moon`]
    
    inline def `clouds-sun`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clouds-sun` = "clouds-sun".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clouds-sun`]
    
    inline def cloudscale: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloudscale = "cloudscale".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloudscale]
    
    inline def cloudsmith: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloudsmith = "cloudsmith".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloudsmith]
    
    inline def cloudversify: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloudversify = "cloudversify".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloudversify]
    
    inline def club: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.club = "club".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.club]
    
    inline def cocktail: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cocktail = "cocktail".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cocktail]
    
    inline def code: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.code = "code".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.code]
    
    inline def `code-branch`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`code-branch` = "code-branch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`code-branch`]
    
    inline def `code-commit`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`code-commit` = "code-commit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`code-commit`]
    
    inline def `code-merge`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`code-merge` = "code-merge".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`code-merge`]
    
    inline def codepen: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.codepen = "codepen".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.codepen]
    
    inline def codiepie: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.codiepie = "codiepie".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.codiepie]
    
    inline def coffee: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.coffee = "coffee".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.coffee]
    
    inline def `coffee-pot`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`coffee-pot` = "coffee-pot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`coffee-pot`]
    
    inline def `coffee-togo`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`coffee-togo` = "coffee-togo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`coffee-togo`]
    
    inline def coffin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.coffin = "coffin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.coffin]
    
    inline def `coffin-cross`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`coffin-cross` = "coffin-cross".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`coffin-cross`]
    
    inline def cog: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cog = "cog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cog]
    
    inline def cogs: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cogs = "cogs".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cogs]
    
    inline def coin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.coin = "coin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.coin]
    
    inline def coins: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.coins = "coins".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.coins]
    
    inline def columns: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.columns = "columns".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.columns]
    
    inline def comet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.comet = "comet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.comet]
    
    inline def comment: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.comment = "comment".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.comment]
    
    inline def `comment-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt` = "comment-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt`]
    
    inline def `comment-alt-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-check` = "comment-alt-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-check`]
    
    inline def `comment-alt-dollar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-dollar` = "comment-alt-dollar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-dollar`]
    
    inline def `comment-alt-dots`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-dots` = "comment-alt-dots".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-dots`]
    
    inline def `comment-alt-edit`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-edit` = "comment-alt-edit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-edit`]
    
    inline def `comment-alt-exclamation`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-exclamation` = "comment-alt-exclamation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-exclamation`]
    
    inline def `comment-alt-lines`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-lines` = "comment-alt-lines".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-lines`]
    
    inline def `comment-alt-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-medical` = "comment-alt-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-medical`]
    
    inline def `comment-alt-minus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-minus` = "comment-alt-minus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-minus`]
    
    inline def `comment-alt-music`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-music` = "comment-alt-music".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-music`]
    
    inline def `comment-alt-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-plus` = "comment-alt-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-plus`]
    
    inline def `comment-alt-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-slash` = "comment-alt-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-slash`]
    
    inline def `comment-alt-smile`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-smile` = "comment-alt-smile".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-smile`]
    
    inline def `comment-alt-times`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-times` = "comment-alt-times".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-times`]
    
    inline def `comment-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-check` = "comment-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-check`]
    
    inline def `comment-dollar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-dollar` = "comment-dollar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-dollar`]
    
    inline def `comment-dots`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-dots` = "comment-dots".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-dots`]
    
    inline def `comment-edit`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-edit` = "comment-edit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-edit`]
    
    inline def `comment-exclamation`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-exclamation` = "comment-exclamation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-exclamation`]
    
    inline def `comment-lines`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-lines` = "comment-lines".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-lines`]
    
    inline def `comment-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-medical` = "comment-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-medical`]
    
    inline def `comment-minus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-minus` = "comment-minus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-minus`]
    
    inline def `comment-music`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-music` = "comment-music".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-music`]
    
    inline def `comment-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-plus` = "comment-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-plus`]
    
    inline def `comment-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-slash` = "comment-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-slash`]
    
    inline def `comment-smile`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-smile` = "comment-smile".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-smile`]
    
    inline def `comment-times`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-times` = "comment-times".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-times`]
    
    inline def comments: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.comments = "comments".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.comments]
    
    inline def `comments-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comments-alt` = "comments-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comments-alt`]
    
    inline def `comments-alt-dollar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comments-alt-dollar` = "comments-alt-dollar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comments-alt-dollar`]
    
    inline def `comments-dollar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comments-dollar` = "comments-dollar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comments-dollar`]
    
    inline def `compact-disc`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compact-disc` = "compact-disc".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compact-disc`]
    
    inline def compass: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.compass = "compass".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.compass]
    
    inline def `compass-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compass-slash` = "compass-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compass-slash`]
    
    inline def compress: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.compress = "compress".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.compress]
    
    inline def `compress-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compress-alt` = "compress-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compress-alt`]
    
    inline def `compress-arrows-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compress-arrows-alt` = "compress-arrows-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compress-arrows-alt`]
    
    inline def `compress-wide`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compress-wide` = "compress-wide".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compress-wide`]
    
    inline def `computer-classic`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`computer-classic` = "computer-classic".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`computer-classic`]
    
    inline def `computer-speaker`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`computer-speaker` = "computer-speaker".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`computer-speaker`]
    
    inline def `concierge-bell`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`concierge-bell` = "concierge-bell".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`concierge-bell`]
    
    inline def confluence: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.confluence = "confluence".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.confluence]
    
    inline def connectdevelop: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.connectdevelop = "connectdevelop".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.connectdevelop]
    
    inline def construction: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.construction = "construction".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.construction]
    
    inline def `container-storage`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`container-storage` = "container-storage".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`container-storage`]
    
    inline def contao: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.contao = "contao".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.contao]
    
    inline def `conveyor-belt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`conveyor-belt` = "conveyor-belt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`conveyor-belt`]
    
    inline def `conveyor-belt-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`conveyor-belt-alt` = "conveyor-belt-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`conveyor-belt-alt`]
    
    inline def cookie: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cookie = "cookie".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cookie]
    
    inline def `cookie-bite`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cookie-bite` = "cookie-bite".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cookie-bite`]
    
    inline def copy: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.copy = "copy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.copy]
    
    inline def copyright: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.copyright = "copyright".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.copyright]
    
    inline def corn: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.corn = "corn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.corn]
    
    inline def `cotton-bureau`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cotton-bureau` = "cotton-bureau".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cotton-bureau`]
    
    inline def couch: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.couch = "couch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.couch]
    
    inline def cow: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cow = "cow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cow]
    
    inline def cowbell: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cowbell = "cowbell".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cowbell]
    
    inline def `cowbell-more`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cowbell-more` = "cowbell-more".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cowbell-more`]
    
    inline def cpanel: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cpanel = "cpanel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cpanel]
    
    inline def `creative-commons`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons` = "creative-commons".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons`]
    
    inline def `creative-commons-by`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-by` = "creative-commons-by".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-by`]
    
    inline def `creative-commons-nc`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-nc` = "creative-commons-nc".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-nc`]
    
    inline def `creative-commons-nc-eu`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-nc-eu` = "creative-commons-nc-eu".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-nc-eu`]
    
    inline def `creative-commons-nc-jp`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-nc-jp` = "creative-commons-nc-jp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-nc-jp`]
    
    inline def `creative-commons-nd`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-nd` = "creative-commons-nd".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-nd`]
    
    inline def `creative-commons-pd`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-pd` = "creative-commons-pd".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-pd`]
    
    inline def `creative-commons-pd-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-pd-alt` = "creative-commons-pd-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-pd-alt`]
    
    inline def `creative-commons-remix`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-remix` = "creative-commons-remix".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-remix`]
    
    inline def `creative-commons-sa`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-sa` = "creative-commons-sa".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-sa`]
    
    inline def `creative-commons-sampling`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-sampling` = "creative-commons-sampling".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-sampling`]
    
    inline def `creative-commons-sampling-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-sampling-plus` = "creative-commons-sampling-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-sampling-plus`]
    
    inline def `creative-commons-share`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-share` = "creative-commons-share".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-share`]
    
    inline def `creative-commons-zero`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-zero` = "creative-commons-zero".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-zero`]
    
    inline def `credit-card`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`credit-card` = "credit-card".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`credit-card`]
    
    inline def `credit-card-blank`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`credit-card-blank` = "credit-card-blank".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`credit-card-blank`]
    
    inline def `credit-card-front`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`credit-card-front` = "credit-card-front".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`credit-card-front`]
    
    inline def cricket: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cricket = "cricket".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cricket]
    
    inline def `critical-role`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`critical-role` = "critical-role".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`critical-role`]
    
    inline def croissant: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.croissant = "croissant".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.croissant]
    
    inline def crop: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crop = "crop".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crop]
    
    inline def `crop-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`crop-alt` = "crop-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`crop-alt`]
    
    inline def cross: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cross = "cross".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cross]
    
    inline def crosshairs: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crosshairs = "crosshairs".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crosshairs]
    
    inline def crow: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crow = "crow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crow]
    
    inline def crown: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crown = "crown".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crown]
    
    inline def crutch: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crutch = "crutch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crutch]
    
    inline def crutches: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crutches = "crutches".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crutches]
    
    inline def css3: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.css3 = "css3".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.css3]
    
    inline def `css3-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`css3-alt` = "css3-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`css3-alt`]
    
    inline def cube: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cube = "cube".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cube]
    
    inline def cubes: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cubes = "cubes".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cubes]
    
    inline def curling: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.curling = "curling".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.curling]
    
    inline def cut: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cut = "cut".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cut]
    
    inline def cuttlefish: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cuttlefish = "cuttlefish".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cuttlefish]
    
    inline def `d-and-d`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`d-and-d` = "d-and-d".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`d-and-d`]
    
    inline def `d-and-d-beyond`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`d-and-d-beyond` = "d-and-d-beyond".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`d-and-d-beyond`]
    
    inline def dagger: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dagger = "dagger".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dagger]
    
    inline def dailymotion: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dailymotion = "dailymotion".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dailymotion]
    
    inline def dashcube: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dashcube = "dashcube".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dashcube]
    
    inline def database: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.database = "database".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.database]
    
    inline def deaf: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deaf = "deaf".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deaf]
    
    inline def debug: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.debug = "debug".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.debug]
    
    inline def deer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deer = "deer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deer]
    
    inline def `deer-rudolph`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`deer-rudolph` = "deer-rudolph".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`deer-rudolph`]
    
    inline def deezer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deezer = "deezer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deezer]
    
    inline def delicious: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.delicious = "delicious".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.delicious]
    
    inline def democrat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.democrat = "democrat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.democrat]
    
    inline def deploydog: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deploydog = "deploydog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deploydog]
    
    inline def deskpro: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deskpro = "deskpro".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deskpro]
    
    inline def desktop: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.desktop = "desktop".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.desktop]
    
    inline def `desktop-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`desktop-alt` = "desktop-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`desktop-alt`]
    
    inline def dev: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dev = "dev".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dev]
    
    inline def deviantart: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deviantart = "deviantart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deviantart]
    
    inline def dewpoint: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dewpoint = "dewpoint".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dewpoint]
    
    inline def dharmachakra: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dharmachakra = "dharmachakra".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dharmachakra]
    
    inline def dhl: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dhl = "dhl".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dhl]
    
    inline def diagnoses: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.diagnoses = "diagnoses".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.diagnoses]
    
    inline def diamond: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.diamond = "diamond".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.diamond]
    
    inline def diaspora: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.diaspora = "diaspora".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.diaspora]
    
    inline def dice: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dice = "dice".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dice]
    
    inline def `dice-d10`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d10` = "dice-d10".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d10`]
    
    inline def `dice-d12`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d12` = "dice-d12".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d12`]
    
    inline def `dice-d20`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d20` = "dice-d20".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d20`]
    
    inline def `dice-d4`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d4` = "dice-d4".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d4`]
    
    inline def `dice-d6`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d6` = "dice-d6".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d6`]
    
    inline def `dice-d8`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d8` = "dice-d8".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d8`]
    
    inline def `dice-five`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-five` = "dice-five".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-five`]
    
    inline def `dice-four`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-four` = "dice-four".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-four`]
    
    inline def `dice-one`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-one` = "dice-one".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-one`]
    
    inline def `dice-six`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-six` = "dice-six".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-six`]
    
    inline def `dice-three`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-three` = "dice-three".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-three`]
    
    inline def `dice-two`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-two` = "dice-two".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-two`]
    
    inline def digg: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.digg = "digg".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.digg]
    
    inline def digging: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.digging = "digging".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.digging]
    
    inline def `digital-ocean`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`digital-ocean` = "digital-ocean".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`digital-ocean`]
    
    inline def `digital-tachograph`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`digital-tachograph` = "digital-tachograph".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`digital-tachograph`]
    
    inline def diploma: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.diploma = "diploma".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.diploma]
    
    inline def directions: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.directions = "directions".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.directions]
    
    inline def `disc-drive`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`disc-drive` = "disc-drive".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`disc-drive`]
    
    inline def discord: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.discord = "discord".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.discord]
    
    inline def discourse: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.discourse = "discourse".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.discourse]
    
    inline def disease: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.disease = "disease".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.disease]
    
    inline def divide: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.divide = "divide".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.divide]
    
    inline def dizzy: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dizzy = "dizzy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dizzy]
    
    inline def dna: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dna = "dna".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dna]
    
    inline def `do-not-enter`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`do-not-enter` = "do-not-enter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`do-not-enter`]
    
    inline def dochub: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dochub = "dochub".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dochub]
    
    inline def docker: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.docker = "docker".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.docker]
    
    inline def dog: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dog = "dog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dog]
    
    inline def `dog-leashed`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dog-leashed` = "dog-leashed".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dog-leashed`]
    
    inline def `dollar-sign`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dollar-sign` = "dollar-sign".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dollar-sign`]
    
    inline def dolly: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dolly = "dolly".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dolly]
    
    inline def `dolly-empty`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dolly-empty` = "dolly-empty".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dolly-empty`]
    
    inline def `dolly-flatbed`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dolly-flatbed` = "dolly-flatbed".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dolly-flatbed`]
    
    inline def `dolly-flatbed-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dolly-flatbed-alt` = "dolly-flatbed-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dolly-flatbed-alt`]
    
    inline def `dolly-flatbed-empty`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dolly-flatbed-empty` = "dolly-flatbed-empty".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dolly-flatbed-empty`]
    
    inline def donate: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.donate = "donate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.donate]
    
    inline def `door-closed`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`door-closed` = "door-closed".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`door-closed`]
    
    inline def `door-open`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`door-open` = "door-open".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`door-open`]
    
    inline def `dot-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dot-circle` = "dot-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dot-circle`]
    
    inline def dove: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dove = "dove".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dove]
    
    inline def download: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.download = "download".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.download]
    
    inline def draft2digital: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.draft2digital = "draft2digital".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.draft2digital]
    
    inline def `drafting-compass`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`drafting-compass` = "drafting-compass".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`drafting-compass`]
    
    inline def dragon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dragon = "dragon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dragon]
    
    inline def `draw-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`draw-circle` = "draw-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`draw-circle`]
    
    inline def `draw-polygon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`draw-polygon` = "draw-polygon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`draw-polygon`]
    
    inline def `draw-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`draw-square` = "draw-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`draw-square`]
    
    inline def dreidel: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dreidel = "dreidel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dreidel]
    
    inline def dribbble: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dribbble = "dribbble".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dribbble]
    
    inline def `dribbble-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dribbble-square` = "dribbble-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dribbble-square`]
    
    inline def drone: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.drone = "drone".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.drone]
    
    inline def `drone-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`drone-alt` = "drone-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`drone-alt`]
    
    inline def dropbox: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dropbox = "dropbox".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dropbox]
    
    inline def drum: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.drum = "drum".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.drum]
    
    inline def `drum-steelpan`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`drum-steelpan` = "drum-steelpan".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`drum-steelpan`]
    
    inline def drumstick: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.drumstick = "drumstick".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.drumstick]
    
    inline def `drumstick-bite`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`drumstick-bite` = "drumstick-bite".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`drumstick-bite`]
    
    inline def drupal: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.drupal = "drupal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.drupal]
    
    inline def dryer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dryer = "dryer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dryer]
    
    inline def `dryer-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dryer-alt` = "dryer-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dryer-alt`]
    
    inline def duck: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.duck = "duck".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.duck]
    
    inline def dumbbell: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dumbbell = "dumbbell".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dumbbell]
    
    inline def dumpster: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dumpster = "dumpster".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dumpster]
    
    inline def `dumpster-fire`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dumpster-fire` = "dumpster-fire".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dumpster-fire`]
    
    inline def dungeon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dungeon = "dungeon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dungeon]
    
    inline def dyalog: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dyalog = "dyalog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dyalog]
    
    inline def ear: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ear = "ear".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ear]
    
    inline def `ear-muffs`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ear-muffs` = "ear-muffs".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ear-muffs`]
    
    inline def earlybirds: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.earlybirds = "earlybirds".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.earlybirds]
    
    inline def ebay: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ebay = "ebay".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ebay]
    
    inline def eclipse: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.eclipse = "eclipse".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.eclipse]
    
    inline def `eclipse-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`eclipse-alt` = "eclipse-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`eclipse-alt`]
    
    inline def edge: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.edge = "edge".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.edge]
    
    inline def `edge-legacy`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`edge-legacy` = "edge-legacy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`edge-legacy`]
    
    inline def edit: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.edit = "edit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.edit]
    
    inline def egg: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.egg = "egg".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.egg]
    
    inline def `egg-fried`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`egg-fried` = "egg-fried".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`egg-fried`]
    
    inline def eject: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.eject = "eject".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.eject]
    
    inline def elementor: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.elementor = "elementor".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.elementor]
    
    inline def elephant: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.elephant = "elephant".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.elephant]
    
    inline def `ellipsis-h`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ellipsis-h` = "ellipsis-h".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ellipsis-h`]
    
    inline def `ellipsis-h-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ellipsis-h-alt` = "ellipsis-h-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ellipsis-h-alt`]
    
    inline def `ellipsis-v`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ellipsis-v` = "ellipsis-v".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ellipsis-v`]
    
    inline def `ellipsis-v-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ellipsis-v-alt` = "ellipsis-v-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ellipsis-v-alt`]
    
    inline def ello: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ello = "ello".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ello]
    
    inline def ember: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ember = "ember".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ember]
    
    inline def empire: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.empire = "empire".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.empire]
    
    inline def `empty-set`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`empty-set` = "empty-set".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`empty-set`]
    
    inline def `engine-warning`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`engine-warning` = "engine-warning".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`engine-warning`]
    
    inline def envelope: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.envelope = "envelope".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.envelope]
    
    inline def `envelope-open`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`envelope-open` = "envelope-open".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`envelope-open`]
    
    inline def `envelope-open-dollar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`envelope-open-dollar` = "envelope-open-dollar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`envelope-open-dollar`]
    
    inline def `envelope-open-text`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`envelope-open-text` = "envelope-open-text".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`envelope-open-text`]
    
    inline def `envelope-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`envelope-square` = "envelope-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`envelope-square`]
    
    inline def envira: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.envira = "envira".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.envira]
    
    inline def equals: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.equals = "equals".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.equals]
    
    inline def eraser: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.eraser = "eraser".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.eraser]
    
    inline def erlang: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.erlang = "erlang".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.erlang]
    
    inline def ethereum: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ethereum = "ethereum".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ethereum]
    
    inline def ethernet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ethernet = "ethernet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ethernet]
    
    inline def etsy: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.etsy = "etsy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.etsy]
    
    inline def `euro-sign`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`euro-sign` = "euro-sign".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`euro-sign`]
    
    inline def evernote: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.evernote = "evernote".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.evernote]
    
    inline def exchange: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.exchange = "exchange".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.exchange]
    
    inline def `exchange-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`exchange-alt` = "exchange-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`exchange-alt`]
    
    inline def exclamation: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.exclamation = "exclamation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.exclamation]
    
    inline def `exclamation-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`exclamation-circle` = "exclamation-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`exclamation-circle`]
    
    inline def `exclamation-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`exclamation-square` = "exclamation-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`exclamation-square`]
    
    inline def `exclamation-triangle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`exclamation-triangle` = "exclamation-triangle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`exclamation-triangle`]
    
    inline def expand: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.expand = "expand".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.expand]
    
    inline def `expand-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`expand-alt` = "expand-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`expand-alt`]
    
    inline def `expand-arrows`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`expand-arrows` = "expand-arrows".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`expand-arrows`]
    
    inline def `expand-arrows-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`expand-arrows-alt` = "expand-arrows-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`expand-arrows-alt`]
    
    inline def `expand-wide`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`expand-wide` = "expand-wide".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`expand-wide`]
    
    inline def expeditedssl: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.expeditedssl = "expeditedssl".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.expeditedssl]
    
    inline def `external-link`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`external-link` = "external-link".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`external-link`]
    
    inline def `external-link-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`external-link-alt` = "external-link-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`external-link-alt`]
    
    inline def `external-link-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`external-link-square` = "external-link-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`external-link-square`]
    
    inline def `external-link-square-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`external-link-square-alt` = "external-link-square-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`external-link-square-alt`]
    
    inline def eye: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.eye = "eye".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.eye]
    
    inline def `eye-dropper`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`eye-dropper` = "eye-dropper".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`eye-dropper`]
    
    inline def `eye-evil`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`eye-evil` = "eye-evil".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`eye-evil`]
    
    inline def `eye-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`eye-slash` = "eye-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`eye-slash`]
    
    inline def facebook: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.facebook = "facebook".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.facebook]
    
    inline def `facebook-f`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`facebook-f` = "facebook-f".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`facebook-f`]
    
    inline def `facebook-messenger`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`facebook-messenger` = "facebook-messenger".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`facebook-messenger`]
    
    inline def `facebook-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`facebook-square` = "facebook-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`facebook-square`]
    
    inline def fan: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fan = "fan".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fan]
    
    inline def `fan-table`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fan-table` = "fan-table".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fan-table`]
    
    inline def `fantasy-flight-games`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fantasy-flight-games` = "fantasy-flight-games".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fantasy-flight-games`]
    
    inline def farm: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.farm = "farm".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.farm]
    
    inline def `fast-backward`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fast-backward` = "fast-backward".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fast-backward`]
    
    inline def `fast-forward`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fast-forward` = "fast-forward".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fast-forward`]
    
    inline def faucet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.faucet = "faucet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.faucet]
    
    inline def `faucet-drip`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`faucet-drip` = "faucet-drip".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`faucet-drip`]
    
    inline def fax: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fax = "fax".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fax]
    
    inline def feather: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.feather = "feather".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.feather]
    
    inline def `feather-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`feather-alt` = "feather-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`feather-alt`]
    
    inline def fedex: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fedex = "fedex".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fedex]
    
    inline def fedora: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fedora = "fedora".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fedora]
    
    inline def female: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.female = "female".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.female]
    
    inline def `field-hockey`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`field-hockey` = "field-hockey".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`field-hockey`]
    
    inline def `fighter-jet`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fighter-jet` = "fighter-jet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fighter-jet`]
    
    inline def figma: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.figma = "figma".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.figma]
    
    inline def file: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.file = "file".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.file]
    
    inline def `file-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-alt` = "file-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-alt`]
    
    inline def `file-archive`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-archive` = "file-archive".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-archive`]
    
    inline def `file-audio`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-audio` = "file-audio".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-audio`]
    
    inline def `file-certificate`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-certificate` = "file-certificate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-certificate`]
    
    inline def `file-chart-line`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-chart-line` = "file-chart-line".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-chart-line`]
    
    inline def `file-chart-pie`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-chart-pie` = "file-chart-pie".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-chart-pie`]
    
    inline def `file-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-check` = "file-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-check`]
    
    inline def `file-code`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-code` = "file-code".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-code`]
    
    inline def `file-contract`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-contract` = "file-contract".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-contract`]
    
    inline def `file-csv`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-csv` = "file-csv".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-csv`]
    
    inline def `file-download`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-download` = "file-download".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-download`]
    
    inline def `file-edit`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-edit` = "file-edit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-edit`]
    
    inline def `file-excel`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-excel` = "file-excel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-excel`]
    
    inline def `file-exclamation`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-exclamation` = "file-exclamation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-exclamation`]
    
    inline def `file-export`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-export` = "file-export".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-export`]
    
    inline def `file-image`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-image` = "file-image".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-image`]
    
    inline def `file-import`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-import` = "file-import".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-import`]
    
    inline def `file-invoice`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-invoice` = "file-invoice".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-invoice`]
    
    inline def `file-invoice-dollar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-invoice-dollar` = "file-invoice-dollar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-invoice-dollar`]
    
    inline def `file-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-medical` = "file-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-medical`]
    
    inline def `file-medical-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-medical-alt` = "file-medical-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-medical-alt`]
    
    inline def `file-minus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-minus` = "file-minus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-minus`]
    
    inline def `file-music`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-music` = "file-music".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-music`]
    
    inline def `file-pdf`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-pdf` = "file-pdf".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-pdf`]
    
    inline def `file-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-plus` = "file-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-plus`]
    
    inline def `file-powerpoint`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-powerpoint` = "file-powerpoint".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-powerpoint`]
    
    inline def `file-prescription`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-prescription` = "file-prescription".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-prescription`]
    
    inline def `file-search`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-search` = "file-search".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-search`]
    
    inline def `file-signature`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-signature` = "file-signature".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-signature`]
    
    inline def `file-spreadsheet`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-spreadsheet` = "file-spreadsheet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-spreadsheet`]
    
    inline def `file-times`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-times` = "file-times".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-times`]
    
    inline def `file-upload`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-upload` = "file-upload".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-upload`]
    
    inline def `file-user`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-user` = "file-user".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-user`]
    
    inline def `file-video`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-video` = "file-video".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-video`]
    
    inline def `file-word`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-word` = "file-word".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-word`]
    
    inline def `files-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`files-medical` = "files-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`files-medical`]
    
    inline def fill: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fill = "fill".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fill]
    
    inline def `fill-drip`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fill-drip` = "fill-drip".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fill-drip`]
    
    inline def film: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.film = "film".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.film]
    
    inline def `film-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`film-alt` = "film-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`film-alt`]
    
    inline def `film-canister`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`film-canister` = "film-canister".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`film-canister`]
    
    inline def filter: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.filter = "filter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.filter]
    
    inline def fingerprint: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fingerprint = "fingerprint".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fingerprint]
    
    inline def fire: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fire = "fire".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fire]
    
    inline def `fire-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fire-alt` = "fire-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fire-alt`]
    
    inline def `fire-extinguisher`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fire-extinguisher` = "fire-extinguisher".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fire-extinguisher`]
    
    inline def `fire-smoke`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fire-smoke` = "fire-smoke".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fire-smoke`]
    
    inline def firefox: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.firefox = "firefox".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.firefox]
    
    inline def `firefox-browser`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`firefox-browser` = "firefox-browser".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`firefox-browser`]
    
    inline def fireplace: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fireplace = "fireplace".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fireplace]
    
    inline def `first-aid`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`first-aid` = "first-aid".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`first-aid`]
    
    inline def `first-order`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`first-order` = "first-order".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`first-order`]
    
    inline def `first-order-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`first-order-alt` = "first-order-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`first-order-alt`]
    
    inline def firstdraft: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.firstdraft = "firstdraft".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.firstdraft]
    
    inline def fish: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fish = "fish".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fish]
    
    inline def `fish-cooked`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fish-cooked` = "fish-cooked".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fish-cooked`]
    
    inline def `fist-raised`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fist-raised` = "fist-raised".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fist-raised`]
    
    inline def flag: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flag = "flag".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flag]
    
    inline def `flag-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flag-alt` = "flag-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flag-alt`]
    
    inline def `flag-checkered`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flag-checkered` = "flag-checkered".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flag-checkered`]
    
    inline def `flag-usa`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flag-usa` = "flag-usa".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flag-usa`]
    
    inline def flame: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flame = "flame".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flame]
    
    inline def flashlight: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flashlight = "flashlight".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flashlight]
    
    inline def flask: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flask = "flask".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flask]
    
    inline def `flask-poison`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flask-poison` = "flask-poison".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flask-poison`]
    
    inline def `flask-potion`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flask-potion` = "flask-potion".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flask-potion`]
    
    inline def flickr: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flickr = "flickr".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flickr]
    
    inline def flipboard: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flipboard = "flipboard".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flipboard]
    
    inline def flower: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flower = "flower".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flower]
    
    inline def `flower-daffodil`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flower-daffodil` = "flower-daffodil".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flower-daffodil`]
    
    inline def `flower-tulip`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flower-tulip` = "flower-tulip".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flower-tulip`]
    
    inline def flushed: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flushed = "flushed".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flushed]
    
    inline def flute: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flute = "flute".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flute]
    
    inline def `flux-capacitor`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flux-capacitor` = "flux-capacitor".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flux-capacitor`]
    
    inline def fly: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fly = "fly".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fly]
    
    inline def fog: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fog = "fog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fog]
    
    inline def folder: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.folder = "folder".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.folder]
    
    inline def `folder-download`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-download` = "folder-download".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-download`]
    
    inline def `folder-minus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-minus` = "folder-minus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-minus`]
    
    inline def `folder-open`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-open` = "folder-open".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-open`]
    
    inline def `folder-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-plus` = "folder-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-plus`]
    
    inline def `folder-times`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-times` = "folder-times".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-times`]
    
    inline def `folder-tree`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-tree` = "folder-tree".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-tree`]
    
    inline def `folder-upload`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-upload` = "folder-upload".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-upload`]
    
    inline def folders: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.folders = "folders".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.folders]
    
    inline def font: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.font = "font".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.font]
    
    inline def `font-awesome`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-awesome` = "font-awesome".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-awesome`]
    
    inline def `font-awesome-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-awesome-alt` = "font-awesome-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-awesome-alt`]
    
    inline def `font-awesome-flag`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-awesome-flag` = "font-awesome-flag".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-awesome-flag`]
    
    inline def `font-awesome-logo-full`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-awesome-logo-full` = "font-awesome-logo-full".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-awesome-logo-full`]
    
    inline def `font-case`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-case` = "font-case".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-case`]
    
    inline def fonticons: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fonticons = "fonticons".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fonticons]
    
    inline def `fonticons-fi`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fonticons-fi` = "fonticons-fi".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fonticons-fi`]
    
    inline def `football-ball`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`football-ball` = "football-ball".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`football-ball`]
    
    inline def `football-helmet`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`football-helmet` = "football-helmet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`football-helmet`]
    
    inline def forklift: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.forklift = "forklift".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.forklift]
    
    inline def `fort-awesome`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fort-awesome` = "fort-awesome".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fort-awesome`]
    
    inline def `fort-awesome-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fort-awesome-alt` = "fort-awesome-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fort-awesome-alt`]
    
    inline def forumbee: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.forumbee = "forumbee".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.forumbee]
    
    inline def forward: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.forward = "forward".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.forward]
    
    inline def foursquare: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.foursquare = "foursquare".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.foursquare]
    
    inline def fragile: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fragile = "fragile".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fragile]
    
    inline def `free-code-camp`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`free-code-camp` = "free-code-camp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`free-code-camp`]
    
    inline def freebsd: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.freebsd = "freebsd".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.freebsd]
    
    inline def `french-fries`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`french-fries` = "french-fries".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`french-fries`]
    
    inline def frog: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.frog = "frog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.frog]
    
    inline def `frosty-head`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`frosty-head` = "frosty-head".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`frosty-head`]
    
    inline def frown: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.frown = "frown".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.frown]
    
    inline def `frown-open`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`frown-open` = "frown-open".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`frown-open`]
    
    inline def fulcrum: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fulcrum = "fulcrum".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fulcrum]
    
    inline def function: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.function = "function".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.function]
    
    inline def `funnel-dollar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`funnel-dollar` = "funnel-dollar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`funnel-dollar`]
    
    inline def futbol: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.futbol = "futbol".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.futbol]
    
    inline def `galactic-republic`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`galactic-republic` = "galactic-republic".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`galactic-republic`]
    
    inline def `galactic-senate`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`galactic-senate` = "galactic-senate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`galactic-senate`]
    
    inline def galaxy: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.galaxy = "galaxy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.galaxy]
    
    inline def `game-board`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`game-board` = "game-board".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`game-board`]
    
    inline def `game-board-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`game-board-alt` = "game-board-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`game-board-alt`]
    
    inline def `game-console-handheld`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`game-console-handheld` = "game-console-handheld".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`game-console-handheld`]
    
    inline def gamepad: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gamepad = "gamepad".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gamepad]
    
    inline def `gamepad-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gamepad-alt` = "gamepad-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gamepad-alt`]
    
    inline def garage: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.garage = "garage".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.garage]
    
    inline def `garage-car`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`garage-car` = "garage-car".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`garage-car`]
    
    inline def `garage-open`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`garage-open` = "garage-open".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`garage-open`]
    
    inline def `gas-pump`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gas-pump` = "gas-pump".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gas-pump`]
    
    inline def `gas-pump-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gas-pump-slash` = "gas-pump-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gas-pump-slash`]
    
    inline def gavel: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gavel = "gavel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gavel]
    
    inline def gem: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gem = "gem".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gem]
    
    inline def genderless: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.genderless = "genderless".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.genderless]
    
    inline def `get-pocket`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`get-pocket` = "get-pocket".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`get-pocket`]
    
    inline def gg: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gg = "gg".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gg]
    
    inline def `gg-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gg-circle` = "gg-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gg-circle`]
    
    inline def ghost: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ghost = "ghost".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ghost]
    
    inline def gift: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gift = "gift".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gift]
    
    inline def `gift-card`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gift-card` = "gift-card".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gift-card`]
    
    inline def gifts: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gifts = "gifts".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gifts]
    
    inline def `gingerbread-man`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gingerbread-man` = "gingerbread-man".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gingerbread-man`]
    
    inline def git: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.git = "git".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.git]
    
    inline def `git-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`git-alt` = "git-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`git-alt`]
    
    inline def `git-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`git-square` = "git-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`git-square`]
    
    inline def github: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.github = "github".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.github]
    
    inline def `github-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`github-alt` = "github-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`github-alt`]
    
    inline def `github-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`github-square` = "github-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`github-square`]
    
    inline def gitkraken: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gitkraken = "gitkraken".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gitkraken]
    
    inline def gitlab: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gitlab = "gitlab".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gitlab]
    
    inline def gitter: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gitter = "gitter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gitter]
    
    inline def glass: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.glass = "glass".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.glass]
    
    inline def `glass-champagne`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-champagne` = "glass-champagne".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-champagne`]
    
    inline def `glass-cheers`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-cheers` = "glass-cheers".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-cheers`]
    
    inline def `glass-citrus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-citrus` = "glass-citrus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-citrus`]
    
    inline def `glass-martini`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-martini` = "glass-martini".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-martini`]
    
    inline def `glass-martini-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-martini-alt` = "glass-martini-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-martini-alt`]
    
    inline def `glass-whiskey`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-whiskey` = "glass-whiskey".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-whiskey`]
    
    inline def `glass-whiskey-rocks`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-whiskey-rocks` = "glass-whiskey-rocks".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-whiskey-rocks`]
    
    inline def glasses: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.glasses = "glasses".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.glasses]
    
    inline def `glasses-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glasses-alt` = "glasses-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glasses-alt`]
    
    inline def glide: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.glide = "glide".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.glide]
    
    inline def `glide-g`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glide-g` = "glide-g".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glide-g`]
    
    inline def globe: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.globe = "globe".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.globe]
    
    inline def `globe-africa`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-africa` = "globe-africa".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-africa`]
    
    inline def `globe-americas`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-americas` = "globe-americas".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-americas`]
    
    inline def `globe-asia`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-asia` = "globe-asia".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-asia`]
    
    inline def `globe-europe`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-europe` = "globe-europe".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-europe`]
    
    inline def `globe-snow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-snow` = "globe-snow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-snow`]
    
    inline def `globe-stand`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-stand` = "globe-stand".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-stand`]
    
    inline def gofore: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gofore = "gofore".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gofore]
    
    inline def `golf-ball`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`golf-ball` = "golf-ball".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`golf-ball`]
    
    inline def `golf-club`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`golf-club` = "golf-club".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`golf-club`]
    
    inline def goodreads: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.goodreads = "goodreads".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.goodreads]
    
    inline def `goodreads-g`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`goodreads-g` = "goodreads-g".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`goodreads-g`]
    
    inline def google: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.google = "google".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.google]
    
    inline def `google-drive`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-drive` = "google-drive".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-drive`]
    
    inline def `google-pay`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-pay` = "google-pay".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-pay`]
    
    inline def `google-play`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-play` = "google-play".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-play`]
    
    inline def `google-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-plus` = "google-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-plus`]
    
    inline def `google-plus-g`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-plus-g` = "google-plus-g".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-plus-g`]
    
    inline def `google-plus-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-plus-square` = "google-plus-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-plus-square`]
    
    inline def `google-wallet`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-wallet` = "google-wallet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-wallet`]
    
    inline def gopuram: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gopuram = "gopuram".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gopuram]
    
    inline def `graduation-cap`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`graduation-cap` = "graduation-cap".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`graduation-cap`]
    
    inline def gramophone: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gramophone = "gramophone".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gramophone]
    
    inline def gratipay: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gratipay = "gratipay".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gratipay]
    
    inline def grav: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.grav = "grav".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.grav]
    
    inline def `greater-than`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`greater-than` = "greater-than".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`greater-than`]
    
    inline def `greater-than-equal`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`greater-than-equal` = "greater-than-equal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`greater-than-equal`]
    
    inline def grimace: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.grimace = "grimace".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.grimace]
    
    inline def grin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.grin = "grin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.grin]
    
    inline def `grin-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-alt` = "grin-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-alt`]
    
    inline def `grin-beam`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-beam` = "grin-beam".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-beam`]
    
    inline def `grin-beam-sweat`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-beam-sweat` = "grin-beam-sweat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-beam-sweat`]
    
    inline def `grin-hearts`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-hearts` = "grin-hearts".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-hearts`]
    
    inline def `grin-squint`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-squint` = "grin-squint".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-squint`]
    
    inline def `grin-squint-tears`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-squint-tears` = "grin-squint-tears".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-squint-tears`]
    
    inline def `grin-stars`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-stars` = "grin-stars".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-stars`]
    
    inline def `grin-tears`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-tears` = "grin-tears".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-tears`]
    
    inline def `grin-tongue`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-tongue` = "grin-tongue".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-tongue`]
    
    inline def `grin-tongue-squint`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-tongue-squint` = "grin-tongue-squint".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-tongue-squint`]
    
    inline def `grin-tongue-wink`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-tongue-wink` = "grin-tongue-wink".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-tongue-wink`]
    
    inline def `grin-wink`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-wink` = "grin-wink".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-wink`]
    
    inline def `grip-horizontal`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grip-horizontal` = "grip-horizontal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grip-horizontal`]
    
    inline def `grip-lines`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grip-lines` = "grip-lines".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grip-lines`]
    
    inline def `grip-lines-vertical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grip-lines-vertical` = "grip-lines-vertical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grip-lines-vertical`]
    
    inline def `grip-vertical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grip-vertical` = "grip-vertical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grip-vertical`]
    
    inline def gripfire: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gripfire = "gripfire".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gripfire]
    
    inline def grunt: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.grunt = "grunt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.grunt]
    
    inline def guilded: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.guilded = "guilded".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.guilded]
    
    inline def guitar: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.guitar = "guitar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.guitar]
    
    inline def `guitar-electric`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`guitar-electric` = "guitar-electric".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`guitar-electric`]
    
    inline def guitars: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.guitars = "guitars".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.guitars]
    
    inline def gulp: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gulp = "gulp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gulp]
    
    inline def `h-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`h-square` = "h-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`h-square`]
    
    inline def h1: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.h1 = "h1".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.h1]
    
    inline def h2: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.h2 = "h2".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.h2]
    
    inline def h3: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.h3 = "h3".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.h3]
    
    inline def h4: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.h4 = "h4".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.h4]
    
    inline def `hacker-news`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hacker-news` = "hacker-news".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hacker-news`]
    
    inline def `hacker-news-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hacker-news-square` = "hacker-news-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hacker-news-square`]
    
    inline def hackerrank: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hackerrank = "hackerrank".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hackerrank]
    
    inline def hamburger: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hamburger = "hamburger".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hamburger]
    
    inline def hammer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hammer = "hammer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hammer]
    
    inline def `hammer-war`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hammer-war` = "hammer-war".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hammer-war`]
    
    inline def hamsa: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hamsa = "hamsa".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hamsa]
    
    inline def `hand-heart`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-heart` = "hand-heart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-heart`]
    
    inline def `hand-holding`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding` = "hand-holding".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding`]
    
    inline def `hand-holding-box`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-box` = "hand-holding-box".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-box`]
    
    inline def `hand-holding-heart`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-heart` = "hand-holding-heart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-heart`]
    
    inline def `hand-holding-magic`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-magic` = "hand-holding-magic".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-magic`]
    
    inline def `hand-holding-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-medical` = "hand-holding-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-medical`]
    
    inline def `hand-holding-seedling`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-seedling` = "hand-holding-seedling".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-seedling`]
    
    inline def `hand-holding-usd`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-usd` = "hand-holding-usd".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-usd`]
    
    inline def `hand-holding-water`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-water` = "hand-holding-water".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-water`]
    
    inline def `hand-lizard`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-lizard` = "hand-lizard".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-lizard`]
    
    inline def `hand-middle-finger`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-middle-finger` = "hand-middle-finger".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-middle-finger`]
    
    inline def `hand-paper`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-paper` = "hand-paper".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-paper`]
    
    inline def `hand-peace`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-peace` = "hand-peace".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-peace`]
    
    inline def `hand-point-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-point-down` = "hand-point-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-point-down`]
    
    inline def `hand-point-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-point-left` = "hand-point-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-point-left`]
    
    inline def `hand-point-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-point-right` = "hand-point-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-point-right`]
    
    inline def `hand-point-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-point-up` = "hand-point-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-point-up`]
    
    inline def `hand-pointer`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-pointer` = "hand-pointer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-pointer`]
    
    inline def `hand-receiving`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-receiving` = "hand-receiving".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-receiving`]
    
    inline def `hand-rock`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-rock` = "hand-rock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-rock`]
    
    inline def `hand-scissors`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-scissors` = "hand-scissors".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-scissors`]
    
    inline def `hand-sparkles`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-sparkles` = "hand-sparkles".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-sparkles`]
    
    inline def `hand-spock`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-spock` = "hand-spock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-spock`]
    
    inline def hands: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hands = "hands".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hands]
    
    inline def `hands-heart`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hands-heart` = "hands-heart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hands-heart`]
    
    inline def `hands-helping`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hands-helping` = "hands-helping".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hands-helping`]
    
    inline def `hands-usd`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hands-usd` = "hands-usd".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hands-usd`]
    
    inline def `hands-wash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hands-wash` = "hands-wash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hands-wash`]
    
    inline def handshake: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.handshake = "handshake".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.handshake]
    
    inline def `handshake-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`handshake-alt` = "handshake-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`handshake-alt`]
    
    inline def `handshake-alt-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`handshake-alt-slash` = "handshake-alt-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`handshake-alt-slash`]
    
    inline def `handshake-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`handshake-slash` = "handshake-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`handshake-slash`]
    
    inline def hanukiah: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hanukiah = "hanukiah".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hanukiah]
    
    inline def `hard-hat`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hard-hat` = "hard-hat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hard-hat`]
    
    inline def hashtag: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hashtag = "hashtag".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hashtag]
    
    inline def `hat-chef`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-chef` = "hat-chef".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-chef`]
    
    inline def `hat-cowboy`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-cowboy` = "hat-cowboy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-cowboy`]
    
    inline def `hat-cowboy-side`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-cowboy-side` = "hat-cowboy-side".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-cowboy-side`]
    
    inline def `hat-santa`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-santa` = "hat-santa".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-santa`]
    
    inline def `hat-winter`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-winter` = "hat-winter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-winter`]
    
    inline def `hat-witch`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-witch` = "hat-witch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-witch`]
    
    inline def `hat-wizard`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-wizard` = "hat-wizard".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-wizard`]
    
    inline def hdd: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hdd = "hdd".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hdd]
    
    inline def `head-side`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side` = "head-side".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side`]
    
    inline def `head-side-brain`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-brain` = "head-side-brain".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-brain`]
    
    inline def `head-side-cough`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-cough` = "head-side-cough".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-cough`]
    
    inline def `head-side-cough-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-cough-slash` = "head-side-cough-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-cough-slash`]
    
    inline def `head-side-headphones`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-headphones` = "head-side-headphones".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-headphones`]
    
    inline def `head-side-mask`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-mask` = "head-side-mask".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-mask`]
    
    inline def `head-side-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-medical` = "head-side-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-medical`]
    
    inline def `head-side-virus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-virus` = "head-side-virus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-virus`]
    
    inline def `head-vr`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-vr` = "head-vr".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-vr`]
    
    inline def heading: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.heading = "heading".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.heading]
    
    inline def headphones: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.headphones = "headphones".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.headphones]
    
    inline def `headphones-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`headphones-alt` = "headphones-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`headphones-alt`]
    
    inline def headset: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.headset = "headset".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.headset]
    
    inline def heart: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.heart = "heart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.heart]
    
    inline def `heart-broken`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`heart-broken` = "heart-broken".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`heart-broken`]
    
    inline def `heart-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`heart-circle` = "heart-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`heart-circle`]
    
    inline def `heart-rate`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`heart-rate` = "heart-rate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`heart-rate`]
    
    inline def `heart-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`heart-square` = "heart-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`heart-square`]
    
    inline def heartbeat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.heartbeat = "heartbeat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.heartbeat]
    
    inline def heat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.heat = "heat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.heat]
    
    inline def helicopter: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.helicopter = "helicopter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.helicopter]
    
    inline def `helmet-battle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`helmet-battle` = "helmet-battle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`helmet-battle`]
    
    inline def hexagon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hexagon = "hexagon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hexagon]
    
    inline def highlighter: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.highlighter = "highlighter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.highlighter]
    
    inline def hiking: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hiking = "hiking".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hiking]
    
    inline def hippo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hippo = "hippo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hippo]
    
    inline def hips: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hips = "hips".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hips]
    
    inline def `hire-a-helper`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hire-a-helper` = "hire-a-helper".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hire-a-helper`]
    
    inline def history: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.history = "history".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.history]
    
    inline def hive: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hive = "hive".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hive]
    
    inline def `hockey-mask`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hockey-mask` = "hockey-mask".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hockey-mask`]
    
    inline def `hockey-puck`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hockey-puck` = "hockey-puck".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hockey-puck`]
    
    inline def `hockey-sticks`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hockey-sticks` = "hockey-sticks".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hockey-sticks`]
    
    inline def `holly-berry`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`holly-berry` = "holly-berry".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`holly-berry`]
    
    inline def home: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.home = "home".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.home]
    
    inline def `home-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`home-alt` = "home-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`home-alt`]
    
    inline def `home-heart`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`home-heart` = "home-heart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`home-heart`]
    
    inline def `home-lg`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`home-lg` = "home-lg".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`home-lg`]
    
    inline def `home-lg-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`home-lg-alt` = "home-lg-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`home-lg-alt`]
    
    inline def `hood-cloak`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hood-cloak` = "hood-cloak".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hood-cloak`]
    
    inline def hooli: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hooli = "hooli".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hooli]
    
    inline def `horizontal-rule`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`horizontal-rule` = "horizontal-rule".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`horizontal-rule`]
    
    inline def hornbill: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hornbill = "hornbill".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hornbill]
    
    inline def horse: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.horse = "horse".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.horse]
    
    inline def `horse-head`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`horse-head` = "horse-head".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`horse-head`]
    
    inline def `horse-saddle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`horse-saddle` = "horse-saddle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`horse-saddle`]
    
    inline def hospital: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hospital = "hospital".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hospital]
    
    inline def `hospital-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hospital-alt` = "hospital-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hospital-alt`]
    
    inline def `hospital-symbol`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hospital-symbol` = "hospital-symbol".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hospital-symbol`]
    
    inline def `hospital-user`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hospital-user` = "hospital-user".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hospital-user`]
    
    inline def hospitals: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hospitals = "hospitals".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hospitals]
    
    inline def `hot-tub`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hot-tub` = "hot-tub".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hot-tub`]
    
    inline def hotdog: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hotdog = "hotdog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hotdog]
    
    inline def hotel: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hotel = "hotel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hotel]
    
    inline def hotjar: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hotjar = "hotjar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hotjar]
    
    inline def hourglass: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hourglass = "hourglass".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hourglass]
    
    inline def `hourglass-end`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hourglass-end` = "hourglass-end".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hourglass-end`]
    
    inline def `hourglass-half`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hourglass-half` = "hourglass-half".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hourglass-half`]
    
    inline def `hourglass-start`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hourglass-start` = "hourglass-start".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hourglass-start`]
    
    inline def house: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.house = "house".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.house]
    
    inline def `house-damage`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-damage` = "house-damage".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-damage`]
    
    inline def `house-day`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-day` = "house-day".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-day`]
    
    inline def `house-flood`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-flood` = "house-flood".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-flood`]
    
    inline def `house-leave`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-leave` = "house-leave".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-leave`]
    
    inline def `house-night`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-night` = "house-night".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-night`]
    
    inline def `house-return`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-return` = "house-return".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-return`]
    
    inline def `house-signal`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-signal` = "house-signal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-signal`]
    
    inline def `house-user`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-user` = "house-user".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-user`]
    
    inline def houzz: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.houzz = "houzz".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.houzz]
    
    inline def hryvnia: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hryvnia = "hryvnia".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hryvnia]
    
    inline def html5: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.html5 = "html5".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.html5]
    
    inline def hubspot: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hubspot = "hubspot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hubspot]
    
    inline def humidity: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.humidity = "humidity".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.humidity]
    
    inline def hurricane: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hurricane = "hurricane".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hurricane]
    
    inline def `i-cursor`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`i-cursor` = "i-cursor".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`i-cursor`]
    
    inline def `ice-cream`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ice-cream` = "ice-cream".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ice-cream`]
    
    inline def `ice-skate`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ice-skate` = "ice-skate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ice-skate`]
    
    inline def icicles: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.icicles = "icicles".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.icicles]
    
    inline def icons: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.icons = "icons".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.icons]
    
    inline def `icons-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`icons-alt` = "icons-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`icons-alt`]
    
    inline def `id-badge`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`id-badge` = "id-badge".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`id-badge`]
    
    inline def `id-card`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`id-card` = "id-card".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`id-card`]
    
    inline def `id-card-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`id-card-alt` = "id-card-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`id-card-alt`]
    
    inline def ideal: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ideal = "ideal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ideal]
    
    inline def igloo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.igloo = "igloo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.igloo]
    
    inline def image: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.image = "image".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.image]
    
    inline def `image-polaroid`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`image-polaroid` = "image-polaroid".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`image-polaroid`]
    
    inline def images: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.images = "images".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.images]
    
    inline def imdb: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.imdb = "imdb".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.imdb]
    
    inline def inbox: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.inbox = "inbox".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.inbox]
    
    inline def `inbox-in`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`inbox-in` = "inbox-in".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`inbox-in`]
    
    inline def `inbox-out`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`inbox-out` = "inbox-out".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`inbox-out`]
    
    inline def indent: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.indent = "indent".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.indent]
    
    inline def industry: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.industry = "industry".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.industry]
    
    inline def `industry-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`industry-alt` = "industry-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`industry-alt`]
    
    inline def infinity: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.infinity = "infinity".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.infinity]
    
    inline def info: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.info = "info".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.info]
    
    inline def `info-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`info-circle` = "info-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`info-circle`]
    
    inline def `info-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`info-square` = "info-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`info-square`]
    
    inline def inhaler: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.inhaler = "inhaler".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.inhaler]
    
    inline def innosoft: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.innosoft = "innosoft".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.innosoft]
    
    inline def instagram: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.instagram = "instagram".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.instagram]
    
    inline def `instagram-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`instagram-square` = "instagram-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`instagram-square`]
    
    inline def instalod: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.instalod = "instalod".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.instalod]
    
    inline def integral: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.integral = "integral".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.integral]
    
    inline def intercom: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.intercom = "intercom".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.intercom]
    
    inline def `internet-explorer`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`internet-explorer` = "internet-explorer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`internet-explorer`]
    
    inline def intersection: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.intersection = "intersection".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.intersection]
    
    inline def inventory: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.inventory = "inventory".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.inventory]
    
    inline def invision: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.invision = "invision".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.invision]
    
    inline def ioxhost: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ioxhost = "ioxhost".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ioxhost]
    
    inline def `island-tropical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`island-tropical` = "island-tropical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`island-tropical`]
    
    inline def italic: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.italic = "italic".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.italic]
    
    inline def `itch-io`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`itch-io` = "itch-io".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`itch-io`]
    
    inline def itunes: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.itunes = "itunes".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.itunes]
    
    inline def `itunes-note`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`itunes-note` = "itunes-note".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`itunes-note`]
    
    inline def `jack-o-lantern`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`jack-o-lantern` = "jack-o-lantern".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`jack-o-lantern`]
    
    inline def java_ : typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.java_ = "java".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.java_]
    
    inline def jedi: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jedi = "jedi".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jedi]
    
    inline def `jedi-order`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`jedi-order` = "jedi-order".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`jedi-order`]
    
    inline def jenkins: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jenkins = "jenkins".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jenkins]
    
    inline def jira: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jira = "jira".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jira]
    
    inline def joget: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.joget = "joget".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.joget]
    
    inline def joint: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.joint = "joint".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.joint]
    
    inline def joomla: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.joomla = "joomla".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.joomla]
    
    inline def `journal-whills`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`journal-whills` = "journal-whills".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`journal-whills`]
    
    inline def joystick: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.joystick = "joystick".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.joystick]
    
    inline def `js-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`js-square` = "js-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`js-square`]
    
    inline def js_ : typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.js_ = "js".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.js_]
    
    inline def jsfiddle: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jsfiddle = "jsfiddle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jsfiddle]
    
    inline def jug: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jug = "jug".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jug]
    
    inline def kaaba: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kaaba = "kaaba".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kaaba]
    
    inline def kaggle: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kaggle = "kaggle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kaggle]
    
    inline def kazoo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kazoo = "kazoo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kazoo]
    
    inline def kerning: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kerning = "kerning".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kerning]
    
    inline def key: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.key = "key".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.key]
    
    inline def `key-skeleton`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`key-skeleton` = "key-skeleton".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`key-skeleton`]
    
    inline def keybase: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.keybase = "keybase".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.keybase]
    
    inline def keyboard: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.keyboard = "keyboard".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.keyboard]
    
    inline def keycdn: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.keycdn = "keycdn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.keycdn]
    
    inline def keynote: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.keynote = "keynote".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.keynote]
    
    inline def khanda: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.khanda = "khanda".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.khanda]
    
    inline def kickstarter: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kickstarter = "kickstarter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kickstarter]
    
    inline def `kickstarter-k`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`kickstarter-k` = "kickstarter-k".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`kickstarter-k`]
    
    inline def kidneys: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kidneys = "kidneys".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kidneys]
    
    inline def kiss: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kiss = "kiss".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kiss]
    
    inline def `kiss-beam`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`kiss-beam` = "kiss-beam".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`kiss-beam`]
    
    inline def `kiss-wink-heart`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`kiss-wink-heart` = "kiss-wink-heart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`kiss-wink-heart`]
    
    inline def kite: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kite = "kite".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kite]
    
    inline def `kiwi-bird`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`kiwi-bird` = "kiwi-bird".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`kiwi-bird`]
    
    inline def `knife-kitchen`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`knife-kitchen` = "knife-kitchen".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`knife-kitchen`]
    
    inline def korvue: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.korvue = "korvue".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.korvue]
    
    inline def lambda: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lambda = "lambda".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lambda]
    
    inline def lamp: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lamp = "lamp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lamp]
    
    inline def `lamp-desk`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lamp-desk` = "lamp-desk".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lamp-desk`]
    
    inline def `lamp-floor`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lamp-floor` = "lamp-floor".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lamp-floor`]
    
    inline def landmark: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.landmark = "landmark".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.landmark]
    
    inline def `landmark-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`landmark-alt` = "landmark-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`landmark-alt`]
    
    inline def language: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.language = "language".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.language]
    
    inline def laptop: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.laptop = "laptop".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.laptop]
    
    inline def `laptop-code`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laptop-code` = "laptop-code".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laptop-code`]
    
    inline def `laptop-house`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laptop-house` = "laptop-house".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laptop-house`]
    
    inline def `laptop-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laptop-medical` = "laptop-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laptop-medical`]
    
    inline def laravel: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.laravel = "laravel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.laravel]
    
    inline def lasso: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lasso = "lasso".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lasso]
    
    inline def lastfm: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lastfm = "lastfm".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lastfm]
    
    inline def `lastfm-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lastfm-square` = "lastfm-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lastfm-square`]
    
    inline def laugh: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.laugh = "laugh".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.laugh]
    
    inline def `laugh-beam`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laugh-beam` = "laugh-beam".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laugh-beam`]
    
    inline def `laugh-squint`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laugh-squint` = "laugh-squint".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laugh-squint`]
    
    inline def `laugh-wink`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laugh-wink` = "laugh-wink".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laugh-wink`]
    
    inline def `layer-group`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`layer-group` = "layer-group".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`layer-group`]
    
    inline def `layer-minus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`layer-minus` = "layer-minus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`layer-minus`]
    
    inline def `layer-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`layer-plus` = "layer-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`layer-plus`]
    
    inline def leaf: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.leaf = "leaf".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.leaf]
    
    inline def `leaf-heart`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`leaf-heart` = "leaf-heart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`leaf-heart`]
    
    inline def `leaf-maple`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`leaf-maple` = "leaf-maple".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`leaf-maple`]
    
    inline def `leaf-oak`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`leaf-oak` = "leaf-oak".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`leaf-oak`]
    
    inline def leanpub: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.leanpub = "leanpub".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.leanpub]
    
    inline def lemon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lemon = "lemon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lemon]
    
    inline def less: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.less = "less".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.less]
    
    inline def `less-than`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`less-than` = "less-than".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`less-than`]
    
    inline def `less-than-equal`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`less-than-equal` = "less-than-equal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`less-than-equal`]
    
    inline def `level-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`level-down` = "level-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`level-down`]
    
    inline def `level-down-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`level-down-alt` = "level-down-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`level-down-alt`]
    
    inline def `level-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`level-up` = "level-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`level-up`]
    
    inline def `level-up-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`level-up-alt` = "level-up-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`level-up-alt`]
    
    inline def `life-ring`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`life-ring` = "life-ring".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`life-ring`]
    
    inline def `light-ceiling`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`light-ceiling` = "light-ceiling".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`light-ceiling`]
    
    inline def `light-switch`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`light-switch` = "light-switch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`light-switch`]
    
    inline def `light-switch-off`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`light-switch-off` = "light-switch-off".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`light-switch-off`]
    
    inline def `light-switch-on`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`light-switch-on` = "light-switch-on".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`light-switch-on`]
    
    inline def lightbulb: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lightbulb = "lightbulb".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lightbulb]
    
    inline def `lightbulb-dollar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lightbulb-dollar` = "lightbulb-dollar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lightbulb-dollar`]
    
    inline def `lightbulb-exclamation`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lightbulb-exclamation` = "lightbulb-exclamation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lightbulb-exclamation`]
    
    inline def `lightbulb-on`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lightbulb-on` = "lightbulb-on".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lightbulb-on`]
    
    inline def `lightbulb-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lightbulb-slash` = "lightbulb-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lightbulb-slash`]
    
    inline def `lights-holiday`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lights-holiday` = "lights-holiday".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lights-holiday`]
    
    inline def line: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.line = "line".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.line]
    
    inline def `line-columns`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`line-columns` = "line-columns".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`line-columns`]
    
    inline def `line-height`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`line-height` = "line-height".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`line-height`]
    
    inline def link: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.link = "link".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.link]
    
    inline def linkedin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.linkedin = "linkedin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.linkedin]
    
    inline def `linkedin-in`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`linkedin-in` = "linkedin-in".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`linkedin-in`]
    
    inline def linode: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.linode = "linode".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.linode]
    
    inline def linux: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.linux = "linux".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.linux]
    
    inline def lips: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lips = "lips".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lips]
    
    inline def `lira-sign`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lira-sign` = "lira-sign".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lira-sign`]
    
    inline def list: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.list = "list".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.list]
    
    inline def `list-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`list-alt` = "list-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`list-alt`]
    
    inline def `list-music`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`list-music` = "list-music".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`list-music`]
    
    inline def `list-ol`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`list-ol` = "list-ol".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`list-ol`]
    
    inline def `list-ul`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`list-ul` = "list-ul".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`list-ul`]
    
    inline def location: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.location = "location".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.location]
    
    inline def `location-arrow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`location-arrow` = "location-arrow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`location-arrow`]
    
    inline def `location-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`location-circle` = "location-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`location-circle`]
    
    inline def `location-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`location-slash` = "location-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`location-slash`]
    
    inline def lock: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lock = "lock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lock]
    
    inline def `lock-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lock-alt` = "lock-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lock-alt`]
    
    inline def `lock-open`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lock-open` = "lock-open".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lock-open`]
    
    inline def `lock-open-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lock-open-alt` = "lock-open-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lock-open-alt`]
    
    inline def `long-arrow-alt-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-alt-down` = "long-arrow-alt-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-alt-down`]
    
    inline def `long-arrow-alt-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-alt-left` = "long-arrow-alt-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-alt-left`]
    
    inline def `long-arrow-alt-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-alt-right` = "long-arrow-alt-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-alt-right`]
    
    inline def `long-arrow-alt-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-alt-up` = "long-arrow-alt-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-alt-up`]
    
    inline def `long-arrow-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-down` = "long-arrow-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-down`]
    
    inline def `long-arrow-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-left` = "long-arrow-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-left`]
    
    inline def `long-arrow-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-right` = "long-arrow-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-right`]
    
    inline def `long-arrow-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-up` = "long-arrow-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-up`]
    
    inline def loveseat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.loveseat = "loveseat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.loveseat]
    
    inline def `low-vision`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`low-vision` = "low-vision".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`low-vision`]
    
    inline def luchador: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.luchador = "luchador".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.luchador]
    
    inline def `luggage-cart`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`luggage-cart` = "luggage-cart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`luggage-cart`]
    
    inline def lungs: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lungs = "lungs".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lungs]
    
    inline def `lungs-virus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lungs-virus` = "lungs-virus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lungs-virus`]
    
    inline def lyft: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lyft = "lyft".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lyft]
    
    inline def mace: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mace = "mace".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mace]
    
    inline def magento: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.magento = "magento".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.magento]
    
    inline def magic: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.magic = "magic".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.magic]
    
    inline def magnet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.magnet = "magnet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.magnet]
    
    inline def `mail-bulk`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mail-bulk` = "mail-bulk".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mail-bulk`]
    
    inline def mailbox: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mailbox = "mailbox".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mailbox]
    
    inline def mailchimp: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mailchimp = "mailchimp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mailchimp]
    
    inline def male: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.male = "male".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.male]
    
    inline def mandalorian: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mandalorian = "mandalorian".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mandalorian]
    
    inline def mandolin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mandolin = "mandolin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mandolin]
    
    inline def map: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.map = "map".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.map]
    
    inline def `map-marked`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marked` = "map-marked".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marked`]
    
    inline def `map-marked-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marked-alt` = "map-marked-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marked-alt`]
    
    inline def `map-marker`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker` = "map-marker".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker`]
    
    inline def `map-marker-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-alt` = "map-marker-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-alt`]
    
    inline def `map-marker-alt-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-alt-slash` = "map-marker-alt-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-alt-slash`]
    
    inline def `map-marker-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-check` = "map-marker-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-check`]
    
    inline def `map-marker-edit`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-edit` = "map-marker-edit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-edit`]
    
    inline def `map-marker-exclamation`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-exclamation` = "map-marker-exclamation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-exclamation`]
    
    inline def `map-marker-minus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-minus` = "map-marker-minus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-minus`]
    
    inline def `map-marker-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-plus` = "map-marker-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-plus`]
    
    inline def `map-marker-question`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-question` = "map-marker-question".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-question`]
    
    inline def `map-marker-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-slash` = "map-marker-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-slash`]
    
    inline def `map-marker-smile`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-smile` = "map-marker-smile".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-smile`]
    
    inline def `map-marker-times`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-times` = "map-marker-times".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-times`]
    
    inline def `map-pin`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-pin` = "map-pin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-pin`]
    
    inline def `map-signs`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-signs` = "map-signs".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-signs`]
    
    inline def markdown: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.markdown = "markdown".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.markdown]
    
    inline def marker: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.marker = "marker".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.marker]
    
    inline def mars: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mars = "mars".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mars]
    
    inline def `mars-double`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mars-double` = "mars-double".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mars-double`]
    
    inline def `mars-stroke`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mars-stroke` = "mars-stroke".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mars-stroke`]
    
    inline def `mars-stroke-h`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mars-stroke-h` = "mars-stroke-h".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mars-stroke-h`]
    
    inline def `mars-stroke-v`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mars-stroke-v` = "mars-stroke-v".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mars-stroke-v`]
    
    inline def mask: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mask = "mask".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mask]
    
    inline def mastodon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mastodon = "mastodon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mastodon]
    
    inline def maxcdn: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.maxcdn = "maxcdn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.maxcdn]
    
    inline def mdb: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mdb = "mdb".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mdb]
    
    inline def meat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.meat = "meat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.meat]
    
    inline def medal: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medal = "medal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medal]
    
    inline def medapps: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medapps = "medapps".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medapps]
    
    inline def medium: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medium = "medium".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medium]
    
    inline def `medium-m`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`medium-m` = "medium-m".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`medium-m`]
    
    inline def medkit: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medkit = "medkit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medkit]
    
    inline def medrt: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medrt = "medrt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medrt]
    
    inline def meetup: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.meetup = "meetup".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.meetup]
    
    inline def megaphone: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.megaphone = "megaphone".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.megaphone]
    
    inline def megaport: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.megaport = "megaport".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.megaport]
    
    inline def meh: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.meh = "meh".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.meh]
    
    inline def `meh-blank`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`meh-blank` = "meh-blank".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`meh-blank`]
    
    inline def `meh-rolling-eyes`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`meh-rolling-eyes` = "meh-rolling-eyes".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`meh-rolling-eyes`]
    
    inline def memory: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.memory = "memory".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.memory]
    
    inline def mendeley: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mendeley = "mendeley".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mendeley]
    
    inline def menorah: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.menorah = "menorah".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.menorah]
    
    inline def mercury: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mercury = "mercury".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mercury]
    
    inline def meteor: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.meteor = "meteor".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.meteor]
    
    inline def microblog: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microblog = "microblog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microblog]
    
    inline def microchip: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microchip = "microchip".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microchip]
    
    inline def microphone: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microphone = "microphone".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microphone]
    
    inline def `microphone-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`microphone-alt` = "microphone-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`microphone-alt`]
    
    inline def `microphone-alt-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`microphone-alt-slash` = "microphone-alt-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`microphone-alt-slash`]
    
    inline def `microphone-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`microphone-slash` = "microphone-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`microphone-slash`]
    
    inline def `microphone-stand`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`microphone-stand` = "microphone-stand".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`microphone-stand`]
    
    inline def microscope: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microscope = "microscope".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microscope]
    
    inline def microsoft: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microsoft = "microsoft".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microsoft]
    
    inline def microwave: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microwave = "microwave".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microwave]
    
    inline def `mind-share`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mind-share` = "mind-share".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mind-share`]
    
    inline def minus: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.minus = "minus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.minus]
    
    inline def `minus-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`minus-circle` = "minus-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`minus-circle`]
    
    inline def `minus-hexagon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`minus-hexagon` = "minus-hexagon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`minus-hexagon`]
    
    inline def `minus-octagon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`minus-octagon` = "minus-octagon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`minus-octagon`]
    
    inline def `minus-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`minus-square` = "minus-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`minus-square`]
    
    inline def mistletoe: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mistletoe = "mistletoe".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mistletoe]
    
    inline def mitten: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mitten = "mitten".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mitten]
    
    inline def mix: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mix = "mix".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mix]
    
    inline def mixcloud: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mixcloud = "mixcloud".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mixcloud]
    
    inline def mixer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mixer = "mixer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mixer]
    
    inline def mizuni: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mizuni = "mizuni".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mizuni]
    
    inline def mobile: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mobile = "mobile".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mobile]
    
    inline def `mobile-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mobile-alt` = "mobile-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mobile-alt`]
    
    inline def `mobile-android`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mobile-android` = "mobile-android".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mobile-android`]
    
    inline def `mobile-android-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mobile-android-alt` = "mobile-android-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mobile-android-alt`]
    
    inline def modx: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.modx = "modx".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.modx]
    
    inline def monero: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.monero = "monero".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.monero]
    
    inline def `money-bill`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-bill` = "money-bill".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-bill`]
    
    inline def `money-bill-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-bill-alt` = "money-bill-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-bill-alt`]
    
    inline def `money-bill-wave`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-bill-wave` = "money-bill-wave".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-bill-wave`]
    
    inline def `money-bill-wave-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-bill-wave-alt` = "money-bill-wave-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-bill-wave-alt`]
    
    inline def `money-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-check` = "money-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-check`]
    
    inline def `money-check-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-check-alt` = "money-check-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-check-alt`]
    
    inline def `money-check-edit`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-check-edit` = "money-check-edit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-check-edit`]
    
    inline def `money-check-edit-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-check-edit-alt` = "money-check-edit-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-check-edit-alt`]
    
    inline def `monitor-heart-rate`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`monitor-heart-rate` = "monitor-heart-rate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`monitor-heart-rate`]
    
    inline def monkey: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.monkey = "monkey".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.monkey]
    
    inline def monument: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.monument = "monument".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.monument]
    
    inline def moon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.moon = "moon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.moon]
    
    inline def `moon-cloud`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`moon-cloud` = "moon-cloud".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`moon-cloud`]
    
    inline def `moon-stars`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`moon-stars` = "moon-stars".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`moon-stars`]
    
    inline def `mortar-pestle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mortar-pestle` = "mortar-pestle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mortar-pestle`]
    
    inline def mosque: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mosque = "mosque".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mosque]
    
    inline def motorcycle: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.motorcycle = "motorcycle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.motorcycle]
    
    inline def mountain: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mountain = "mountain".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mountain]
    
    inline def mountains: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mountains = "mountains".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mountains]
    
    inline def mouse: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mouse = "mouse".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mouse]
    
    inline def `mouse-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mouse-alt` = "mouse-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mouse-alt`]
    
    inline def `mouse-pointer`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mouse-pointer` = "mouse-pointer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mouse-pointer`]
    
    inline def `mp3-player`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mp3-player` = "mp3-player".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mp3-player`]
    
    inline def mug: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mug = "mug".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mug]
    
    inline def `mug-hot`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mug-hot` = "mug-hot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mug-hot`]
    
    inline def `mug-marshmallows`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mug-marshmallows` = "mug-marshmallows".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mug-marshmallows`]
    
    inline def `mug-tea`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mug-tea` = "mug-tea".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mug-tea`]
    
    inline def music: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.music = "music".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.music]
    
    inline def `music-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`music-alt` = "music-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`music-alt`]
    
    inline def `music-alt-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`music-alt-slash` = "music-alt-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`music-alt-slash`]
    
    inline def `music-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`music-slash` = "music-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`music-slash`]
    
    inline def napster: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.napster = "napster".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.napster]
    
    inline def narwhal: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.narwhal = "narwhal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.narwhal]
    
    inline def neos: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.neos = "neos".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.neos]
    
    inline def `network-wired`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`network-wired` = "network-wired".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`network-wired`]
    
    inline def neuter: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.neuter = "neuter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.neuter]
    
    inline def newspaper: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.newspaper = "newspaper".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.newspaper]
    
    inline def nimblr: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.nimblr = "nimblr".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.nimblr]
    
    inline def node: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.node = "node".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.node]
    
    inline def `node-js`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`node-js` = "node-js".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`node-js`]
    
    inline def `not-equal`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`not-equal` = "not-equal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`not-equal`]
    
    inline def `notes-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`notes-medical` = "notes-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`notes-medical`]
    
    inline def npm: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.npm = "npm".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.npm]
    
    inline def ns8: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ns8 = "ns8".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ns8]
    
    inline def nutritionix: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.nutritionix = "nutritionix".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.nutritionix]
    
    inline def `object-group`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`object-group` = "object-group".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`object-group`]
    
    inline def `object-ungroup`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`object-ungroup` = "object-ungroup".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`object-ungroup`]
    
    inline def octagon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.octagon = "octagon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.octagon]
    
    inline def `octopus-deploy`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`octopus-deploy` = "octopus-deploy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`octopus-deploy`]
    
    inline def odnoklassniki: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.odnoklassniki = "odnoklassniki".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.odnoklassniki]
    
    inline def `odnoklassniki-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`odnoklassniki-square` = "odnoklassniki-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`odnoklassniki-square`]
    
    inline def `oil-can`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`oil-can` = "oil-can".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`oil-can`]
    
    inline def `oil-temp`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`oil-temp` = "oil-temp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`oil-temp`]
    
    inline def `old-republic`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`old-republic` = "old-republic".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`old-republic`]
    
    inline def om: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.om = "om".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.om]
    
    inline def omega: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.omega = "omega".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.omega]
    
    inline def opencart: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.opencart = "opencart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.opencart]
    
    inline def openid: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.openid = "openid".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.openid]
    
    inline def opera: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.opera = "opera".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.opera]
    
    inline def `optin-monster`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`optin-monster` = "optin-monster".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`optin-monster`]
    
    inline def orcid: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.orcid = "orcid".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.orcid]
    
    inline def ornament: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ornament = "ornament".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ornament]
    
    inline def osi: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.osi = "osi".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.osi]
    
    inline def otter: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.otter = "otter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.otter]
    
    inline def outdent: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.outdent = "outdent".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.outdent]
    
    inline def outlet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.outlet = "outlet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.outlet]
    
    inline def oven: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.oven = "oven".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.oven]
    
    inline def overline: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.overline = "overline".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.overline]
    
    inline def `page-break`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`page-break` = "page-break".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`page-break`]
    
    inline def page4: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.page4 = "page4".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.page4]
    
    inline def pagelines: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pagelines = "pagelines".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pagelines]
    
    inline def pager: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pager = "pager".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pager]
    
    inline def `paint-brush`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paint-brush` = "paint-brush".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paint-brush`]
    
    inline def `paint-brush-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paint-brush-alt` = "paint-brush-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paint-brush-alt`]
    
    inline def `paint-roller`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paint-roller` = "paint-roller".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paint-roller`]
    
    inline def palette: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.palette = "palette".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.palette]
    
    inline def palfed: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.palfed = "palfed".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.palfed]
    
    inline def pallet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pallet = "pallet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pallet]
    
    inline def `pallet-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pallet-alt` = "pallet-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pallet-alt`]
    
    inline def `paper-plane`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paper-plane` = "paper-plane".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paper-plane`]
    
    inline def paperclip: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paperclip = "paperclip".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paperclip]
    
    inline def `parachute-box`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`parachute-box` = "parachute-box".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`parachute-box`]
    
    inline def paragraph: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paragraph = "paragraph".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paragraph]
    
    inline def `paragraph-rtl`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paragraph-rtl` = "paragraph-rtl".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paragraph-rtl`]
    
    inline def parking: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.parking = "parking".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.parking]
    
    inline def `parking-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`parking-circle` = "parking-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`parking-circle`]
    
    inline def `parking-circle-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`parking-circle-slash` = "parking-circle-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`parking-circle-slash`]
    
    inline def `parking-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`parking-slash` = "parking-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`parking-slash`]
    
    inline def passport: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.passport = "passport".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.passport]
    
    inline def pastafarianism: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pastafarianism = "pastafarianism".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pastafarianism]
    
    inline def paste: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paste = "paste".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paste]
    
    inline def patreon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.patreon = "patreon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.patreon]
    
    inline def pause: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pause = "pause".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pause]
    
    inline def `pause-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pause-circle` = "pause-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pause-circle`]
    
    inline def paw: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paw = "paw".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paw]
    
    inline def `paw-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paw-alt` = "paw-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paw-alt`]
    
    inline def `paw-claws`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paw-claws` = "paw-claws".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paw-claws`]
    
    inline def paypal: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paypal = "paypal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paypal]
    
    inline def peace: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.peace = "peace".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.peace]
    
    inline def pegasus: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pegasus = "pegasus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pegasus]
    
    inline def pen: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pen = "pen".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pen]
    
    inline def `pen-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pen-alt` = "pen-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pen-alt`]
    
    inline def `pen-fancy`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pen-fancy` = "pen-fancy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pen-fancy`]
    
    inline def `pen-nib`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pen-nib` = "pen-nib".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pen-nib`]
    
    inline def `pen-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pen-square` = "pen-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pen-square`]
    
    inline def pencil: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pencil = "pencil".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pencil]
    
    inline def `pencil-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pencil-alt` = "pencil-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pencil-alt`]
    
    inline def `pencil-paintbrush`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pencil-paintbrush` = "pencil-paintbrush".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pencil-paintbrush`]
    
    inline def `pencil-ruler`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pencil-ruler` = "pencil-ruler".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pencil-ruler`]
    
    inline def pennant: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pennant = "pennant".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pennant]
    
    inline def `penny-arcade`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`penny-arcade` = "penny-arcade".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`penny-arcade`]
    
    inline def `people-arrows`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`people-arrows` = "people-arrows".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`people-arrows`]
    
    inline def `people-carry`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`people-carry` = "people-carry".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`people-carry`]
    
    inline def `pepper-hot`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pepper-hot` = "pepper-hot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pepper-hot`]
    
    inline def perbyte: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.perbyte = "perbyte".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.perbyte]
    
    inline def percent: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.percent = "percent".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.percent]
    
    inline def percentage: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.percentage = "percentage".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.percentage]
    
    inline def periscope: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.periscope = "periscope".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.periscope]
    
    inline def `person-booth`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-booth` = "person-booth".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-booth`]
    
    inline def `person-carry`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-carry` = "person-carry".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-carry`]
    
    inline def `person-dolly`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-dolly` = "person-dolly".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-dolly`]
    
    inline def `person-dolly-empty`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-dolly-empty` = "person-dolly-empty".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-dolly-empty`]
    
    inline def `person-sign`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-sign` = "person-sign".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-sign`]
    
    inline def phabricator: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.phabricator = "phabricator".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.phabricator]
    
    inline def `phoenix-framework`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phoenix-framework` = "phoenix-framework".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phoenix-framework`]
    
    inline def `phoenix-squadron`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phoenix-squadron` = "phoenix-squadron".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phoenix-squadron`]
    
    inline def phone: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.phone = "phone".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.phone]
    
    inline def `phone-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-alt` = "phone-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-alt`]
    
    inline def `phone-laptop`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-laptop` = "phone-laptop".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-laptop`]
    
    inline def `phone-office`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-office` = "phone-office".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-office`]
    
    inline def `phone-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-plus` = "phone-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-plus`]
    
    inline def `phone-rotary`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-rotary` = "phone-rotary".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-rotary`]
    
    inline def `phone-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-slash` = "phone-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-slash`]
    
    inline def `phone-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-square` = "phone-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-square`]
    
    inline def `phone-square-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-square-alt` = "phone-square-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-square-alt`]
    
    inline def `phone-volume`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-volume` = "phone-volume".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-volume`]
    
    inline def `photo-video`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`photo-video` = "photo-video".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`photo-video`]
    
    inline def php: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.php = "php".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.php]
    
    inline def pi: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pi = "pi".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pi]
    
    inline def piano: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.piano = "piano".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.piano]
    
    inline def `piano-keyboard`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`piano-keyboard` = "piano-keyboard".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`piano-keyboard`]
    
    inline def pie: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pie = "pie".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pie]
    
    inline def `pied-piper`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper` = "pied-piper".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper`]
    
    inline def `pied-piper-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper-alt` = "pied-piper-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper-alt`]
    
    inline def `pied-piper-hat`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper-hat` = "pied-piper-hat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper-hat`]
    
    inline def `pied-piper-pp`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper-pp` = "pied-piper-pp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper-pp`]
    
    inline def `pied-piper-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper-square` = "pied-piper-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper-square`]
    
    inline def pig: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pig = "pig".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pig]
    
    inline def `piggy-bank`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`piggy-bank` = "piggy-bank".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`piggy-bank`]
    
    inline def pills: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pills = "pills".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pills]
    
    inline def pinterest: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pinterest = "pinterest".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pinterest]
    
    inline def `pinterest-p`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pinterest-p` = "pinterest-p".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pinterest-p`]
    
    inline def `pinterest-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pinterest-square` = "pinterest-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pinterest-square`]
    
    inline def pizza: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pizza = "pizza".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pizza]
    
    inline def `pizza-slice`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pizza-slice` = "pizza-slice".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pizza-slice`]
    
    inline def `place-of-worship`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`place-of-worship` = "place-of-worship".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`place-of-worship`]
    
    inline def plane: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.plane = "plane".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.plane]
    
    inline def `plane-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plane-alt` = "plane-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plane-alt`]
    
    inline def `plane-arrival`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plane-arrival` = "plane-arrival".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plane-arrival`]
    
    inline def `plane-departure`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plane-departure` = "plane-departure".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plane-departure`]
    
    inline def `plane-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plane-slash` = "plane-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plane-slash`]
    
    inline def `planet-moon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`planet-moon` = "planet-moon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`planet-moon`]
    
    inline def `planet-ringed`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`planet-ringed` = "planet-ringed".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`planet-ringed`]
    
    inline def play: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.play = "play".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.play]
    
    inline def `play-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`play-circle` = "play-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`play-circle`]
    
    inline def playstation: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.playstation = "playstation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.playstation]
    
    inline def plug: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.plug = "plug".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.plug]
    
    inline def plus: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.plus = "plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.plus]
    
    inline def `plus-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plus-circle` = "plus-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plus-circle`]
    
    inline def `plus-hexagon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plus-hexagon` = "plus-hexagon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plus-hexagon`]
    
    inline def `plus-octagon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plus-octagon` = "plus-octagon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plus-octagon`]
    
    inline def `plus-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plus-square` = "plus-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plus-square`]
    
    inline def podcast: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.podcast = "podcast".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.podcast]
    
    inline def podium: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.podium = "podium".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.podium]
    
    inline def `podium-star`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`podium-star` = "podium-star".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`podium-star`]
    
    inline def `police-box`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`police-box` = "police-box".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`police-box`]
    
    inline def poll: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.poll = "poll".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.poll]
    
    inline def `poll-h`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`poll-h` = "poll-h".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`poll-h`]
    
    inline def `poll-people`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`poll-people` = "poll-people".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`poll-people`]
    
    inline def poo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.poo = "poo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.poo]
    
    inline def `poo-storm`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`poo-storm` = "poo-storm".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`poo-storm`]
    
    inline def poop: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.poop = "poop".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.poop]
    
    inline def popcorn: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.popcorn = "popcorn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.popcorn]
    
    inline def `portal-enter`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`portal-enter` = "portal-enter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`portal-enter`]
    
    inline def `portal-exit`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`portal-exit` = "portal-exit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`portal-exit`]
    
    inline def portrait: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.portrait = "portrait".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.portrait]
    
    inline def `pound-sign`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pound-sign` = "pound-sign".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pound-sign`]
    
    inline def `power-off`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`power-off` = "power-off".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`power-off`]
    
    inline def pray: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pray = "pray".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pray]
    
    inline def `praying-hands`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`praying-hands` = "praying-hands".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`praying-hands`]
    
    inline def prescription: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.prescription = "prescription".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.prescription]
    
    inline def `prescription-bottle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`prescription-bottle` = "prescription-bottle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`prescription-bottle`]
    
    inline def `prescription-bottle-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`prescription-bottle-alt` = "prescription-bottle-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`prescription-bottle-alt`]
    
    inline def presentation: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.presentation = "presentation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.presentation]
    
    inline def print: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.print = "print".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.print]
    
    inline def `print-search`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`print-search` = "print-search".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`print-search`]
    
    inline def `print-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`print-slash` = "print-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`print-slash`]
    
    inline def procedures: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.procedures = "procedures".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.procedures]
    
    inline def `product-hunt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`product-hunt` = "product-hunt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`product-hunt`]
    
    inline def `project-diagram`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`project-diagram` = "project-diagram".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`project-diagram`]
    
    inline def projector: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.projector = "projector".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.projector]
    
    inline def `pump-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pump-medical` = "pump-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pump-medical`]
    
    inline def `pump-soap`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pump-soap` = "pump-soap".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pump-soap`]
    
    inline def pumpkin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pumpkin = "pumpkin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pumpkin]
    
    inline def pushed: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pushed = "pushed".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pushed]
    
    inline def `puzzle-piece`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`puzzle-piece` = "puzzle-piece".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`puzzle-piece`]
    
    inline def python: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.python = "python".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.python]
    
    inline def qq: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.qq = "qq".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.qq]
    
    inline def qrcode: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.qrcode = "qrcode".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.qrcode]
    
    inline def question: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.question = "question".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.question]
    
    inline def `question-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`question-circle` = "question-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`question-circle`]
    
    inline def `question-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`question-square` = "question-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`question-square`]
    
    inline def quidditch: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.quidditch = "quidditch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.quidditch]
    
    inline def quinscape: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.quinscape = "quinscape".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.quinscape]
    
    inline def quora: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.quora = "quora".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.quora]
    
    inline def `quote-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`quote-left` = "quote-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`quote-left`]
    
    inline def `quote-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`quote-right` = "quote-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`quote-right`]
    
    inline def quran: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.quran = "quran".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.quran]
    
    inline def `r-project`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`r-project` = "r-project".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`r-project`]
    
    inline def rabbit: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rabbit = "rabbit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rabbit]
    
    inline def `rabbit-fast`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rabbit-fast` = "rabbit-fast".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rabbit-fast`]
    
    inline def racquet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.racquet = "racquet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.racquet]
    
    inline def radar: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.radar = "radar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.radar]
    
    inline def radiation: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.radiation = "radiation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.radiation]
    
    inline def `radiation-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`radiation-alt` = "radiation-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`radiation-alt`]
    
    inline def radio: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.radio = "radio".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.radio]
    
    inline def `radio-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`radio-alt` = "radio-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`radio-alt`]
    
    inline def rainbow: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rainbow = "rainbow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rainbow]
    
    inline def raindrops: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.raindrops = "raindrops".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.raindrops]
    
    inline def ram: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ram = "ram".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ram]
    
    inline def `ramp-loading`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ramp-loading` = "ramp-loading".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ramp-loading`]
    
    inline def random: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.random = "random".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.random]
    
    inline def `raspberry-pi`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`raspberry-pi` = "raspberry-pi".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`raspberry-pi`]
    
    inline def ravelry: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ravelry = "ravelry".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ravelry]
    
    inline def raygun: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.raygun = "raygun".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.raygun]
    
    inline def react: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.react = "react".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.react]
    
    inline def reacteurope: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.reacteurope = "reacteurope".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.reacteurope]
    
    inline def readme: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.readme = "readme".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.readme]
    
    inline def rebel: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rebel = "rebel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rebel]
    
    inline def receipt: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.receipt = "receipt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.receipt]
    
    inline def `record-vinyl`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`record-vinyl` = "record-vinyl".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`record-vinyl`]
    
    inline def `rectangle-landscape`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rectangle-landscape` = "rectangle-landscape".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rectangle-landscape`]
    
    inline def `rectangle-portrait`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rectangle-portrait` = "rectangle-portrait".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rectangle-portrait`]
    
    inline def `rectangle-wide`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rectangle-wide` = "rectangle-wide".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rectangle-wide`]
    
    inline def recycle: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.recycle = "recycle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.recycle]
    
    inline def `red-river`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`red-river` = "red-river".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`red-river`]
    
    inline def reddit: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.reddit = "reddit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.reddit]
    
    inline def `reddit-alien`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`reddit-alien` = "reddit-alien".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`reddit-alien`]
    
    inline def `reddit-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`reddit-square` = "reddit-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`reddit-square`]
    
    inline def redhat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.redhat = "redhat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.redhat]
    
    inline def redo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.redo = "redo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.redo]
    
    inline def `redo-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`redo-alt` = "redo-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`redo-alt`]
    
    inline def refrigerator: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.refrigerator = "refrigerator".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.refrigerator]
    
    inline def registered: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.registered = "registered".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.registered]
    
    inline def `remove-format`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`remove-format` = "remove-format".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`remove-format`]
    
    inline def renren: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.renren = "renren".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.renren]
    
    inline def repeat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.repeat = "repeat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.repeat]
    
    inline def `repeat-1`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`repeat-1` = "repeat-1".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`repeat-1`]
    
    inline def `repeat-1-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`repeat-1-alt` = "repeat-1-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`repeat-1-alt`]
    
    inline def `repeat-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`repeat-alt` = "repeat-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`repeat-alt`]
    
    inline def reply: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.reply = "reply".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.reply]
    
    inline def `reply-all`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`reply-all` = "reply-all".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`reply-all`]
    
    inline def replyd: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.replyd = "replyd".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.replyd]
    
    inline def republican: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.republican = "republican".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.republican]
    
    inline def researchgate: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.researchgate = "researchgate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.researchgate]
    
    inline def resolving: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.resolving = "resolving".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.resolving]
    
    inline def restroom: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.restroom = "restroom".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.restroom]
    
    inline def retweet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.retweet = "retweet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.retweet]
    
    inline def `retweet-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`retweet-alt` = "retweet-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`retweet-alt`]
    
    inline def rev: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rev = "rev".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rev]
    
    inline def ribbon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ribbon = "ribbon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ribbon]
    
    inline def ring: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ring = "ring".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ring]
    
    inline def `rings-wedding`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rings-wedding` = "rings-wedding".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rings-wedding`]
    
    inline def road: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.road = "road".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.road]
    
    inline def robot: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.robot = "robot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.robot]
    
    inline def rocket: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rocket = "rocket".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rocket]
    
    inline def `rocket-launch`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rocket-launch` = "rocket-launch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rocket-launch`]
    
    inline def rocketchat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rocketchat = "rocketchat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rocketchat]
    
    inline def rockrms: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rockrms = "rockrms".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rockrms]
    
    inline def route: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.route = "route".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.route]
    
    inline def `route-highway`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`route-highway` = "route-highway".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`route-highway`]
    
    inline def `route-interstate`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`route-interstate` = "route-interstate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`route-interstate`]
    
    inline def router: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.router = "router".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.router]
    
    inline def rss: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rss = "rss".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rss]
    
    inline def `rss-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rss-square` = "rss-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rss-square`]
    
    inline def `ruble-sign`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruble-sign` = "ruble-sign".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruble-sign`]
    
    inline def ruler: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ruler = "ruler".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ruler]
    
    inline def `ruler-combined`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruler-combined` = "ruler-combined".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruler-combined`]
    
    inline def `ruler-horizontal`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruler-horizontal` = "ruler-horizontal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruler-horizontal`]
    
    inline def `ruler-triangle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruler-triangle` = "ruler-triangle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruler-triangle`]
    
    inline def `ruler-vertical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruler-vertical` = "ruler-vertical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruler-vertical`]
    
    inline def running: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.running = "running".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.running]
    
    inline def `rupee-sign`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rupee-sign` = "rupee-sign".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rupee-sign`]
    
    inline def rust: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rust = "rust".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rust]
    
    inline def rv: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rv = "rv".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rv]
    
    inline def sack: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sack = "sack".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sack]
    
    inline def `sack-dollar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sack-dollar` = "sack-dollar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sack-dollar`]
    
    inline def `sad-cry`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sad-cry` = "sad-cry".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sad-cry`]
    
    inline def `sad-tear`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sad-tear` = "sad-tear".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sad-tear`]
    
    inline def safari: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.safari = "safari".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.safari]
    
    inline def salad: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.salad = "salad".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.salad]
    
    inline def salesforce: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.salesforce = "salesforce".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.salesforce]
    
    inline def sandwich: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sandwich = "sandwich".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sandwich]
    
    inline def sass: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sass = "sass".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sass]
    
    inline def satellite: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.satellite = "satellite".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.satellite]
    
    inline def `satellite-dish`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`satellite-dish` = "satellite-dish".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`satellite-dish`]
    
    inline def sausage: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sausage = "sausage".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sausage]
    
    inline def save: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.save = "save".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.save]
    
    inline def `sax-hot`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sax-hot` = "sax-hot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sax-hot`]
    
    inline def saxophone: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.saxophone = "saxophone".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.saxophone]
    
    inline def scalpel: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scalpel = "scalpel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scalpel]
    
    inline def `scalpel-path`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scalpel-path` = "scalpel-path".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scalpel-path`]
    
    inline def scanner: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scanner = "scanner".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scanner]
    
    inline def `scanner-image`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scanner-image` = "scanner-image".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scanner-image`]
    
    inline def `scanner-keyboard`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scanner-keyboard` = "scanner-keyboard".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scanner-keyboard`]
    
    inline def `scanner-touchscreen`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scanner-touchscreen` = "scanner-touchscreen".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scanner-touchscreen`]
    
    inline def scarecrow: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scarecrow = "scarecrow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scarecrow]
    
    inline def scarf: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scarf = "scarf".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scarf]
    
    inline def schlix: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.schlix = "schlix".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.schlix]
    
    inline def school: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.school = "school".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.school]
    
    inline def screwdriver: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.screwdriver = "screwdriver".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.screwdriver]
    
    inline def scribd: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scribd = "scribd".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scribd]
    
    inline def scroll: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scroll = "scroll".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scroll]
    
    inline def `scroll-old`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scroll-old` = "scroll-old".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scroll-old`]
    
    inline def scrubber: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scrubber = "scrubber".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scrubber]
    
    inline def scythe: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scythe = "scythe".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scythe]
    
    inline def `sd-card`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sd-card` = "sd-card".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sd-card`]
    
    inline def search: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.search = "search".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.search]
    
    inline def `search-dollar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`search-dollar` = "search-dollar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`search-dollar`]
    
    inline def `search-location`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`search-location` = "search-location".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`search-location`]
    
    inline def `search-minus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`search-minus` = "search-minus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`search-minus`]
    
    inline def `search-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`search-plus` = "search-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`search-plus`]
    
    inline def searchengin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.searchengin = "searchengin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.searchengin]
    
    inline def seedling: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.seedling = "seedling".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.seedling]
    
    inline def sellcast: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sellcast = "sellcast".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sellcast]
    
    inline def sellsy: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sellsy = "sellsy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sellsy]
    
    inline def `send-back`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`send-back` = "send-back".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`send-back`]
    
    inline def `send-backward`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`send-backward` = "send-backward".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`send-backward`]
    
    inline def sensor: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sensor = "sensor".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sensor]
    
    inline def `sensor-alert`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sensor-alert` = "sensor-alert".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sensor-alert`]
    
    inline def `sensor-fire`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sensor-fire` = "sensor-fire".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sensor-fire`]
    
    inline def `sensor-on`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sensor-on` = "sensor-on".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sensor-on`]
    
    inline def `sensor-smoke`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sensor-smoke` = "sensor-smoke".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sensor-smoke`]
    
    inline def server: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.server = "server".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.server]
    
    inline def servicestack: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.servicestack = "servicestack".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.servicestack]
    
    inline def shapes: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shapes = "shapes".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shapes]
    
    inline def share: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.share = "share".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.share]
    
    inline def `share-all`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`share-all` = "share-all".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`share-all`]
    
    inline def `share-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`share-alt` = "share-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`share-alt`]
    
    inline def `share-alt-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`share-alt-square` = "share-alt-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`share-alt-square`]
    
    inline def `share-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`share-square` = "share-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`share-square`]
    
    inline def sheep: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sheep = "sheep".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sheep]
    
    inline def `shekel-sign`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shekel-sign` = "shekel-sign".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shekel-sign`]
    
    inline def shield: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shield = "shield".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shield]
    
    inline def `shield-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shield-alt` = "shield-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shield-alt`]
    
    inline def `shield-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shield-check` = "shield-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shield-check`]
    
    inline def `shield-cross`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shield-cross` = "shield-cross".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shield-cross`]
    
    inline def `shield-virus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shield-virus` = "shield-virus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shield-virus`]
    
    inline def ship: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ship = "ship".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ship]
    
    inline def `shipping-fast`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shipping-fast` = "shipping-fast".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shipping-fast`]
    
    inline def `shipping-timed`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shipping-timed` = "shipping-timed".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shipping-timed`]
    
    inline def shirtsinbulk: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shirtsinbulk = "shirtsinbulk".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shirtsinbulk]
    
    inline def `shish-kebab`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shish-kebab` = "shish-kebab".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shish-kebab`]
    
    inline def `shoe-prints`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shoe-prints` = "shoe-prints".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shoe-prints`]
    
    inline def shopify: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shopify = "shopify".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shopify]
    
    inline def `shopping-bag`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shopping-bag` = "shopping-bag".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shopping-bag`]
    
    inline def `shopping-basket`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shopping-basket` = "shopping-basket".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shopping-basket`]
    
    inline def `shopping-cart`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shopping-cart` = "shopping-cart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shopping-cart`]
    
    inline def shopware: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shopware = "shopware".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shopware]
    
    inline def shovel: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shovel = "shovel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shovel]
    
    inline def `shovel-snow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shovel-snow` = "shovel-snow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shovel-snow`]
    
    inline def shower: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shower = "shower".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shower]
    
    inline def shredder: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shredder = "shredder".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shredder]
    
    inline def `shuttle-van`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shuttle-van` = "shuttle-van".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shuttle-van`]
    
    inline def shuttlecock: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shuttlecock = "shuttlecock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shuttlecock]
    
    inline def sickle: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sickle = "sickle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sickle]
    
    inline def sigma: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sigma = "sigma".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sigma]
    
    inline def sign: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sign = "sign".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sign]
    
    inline def `sign-in`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-in` = "sign-in".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-in`]
    
    inline def `sign-in-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-in-alt` = "sign-in-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-in-alt`]
    
    inline def `sign-language`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-language` = "sign-language".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-language`]
    
    inline def `sign-out`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-out` = "sign-out".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-out`]
    
    inline def `sign-out-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-out-alt` = "sign-out-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-out-alt`]
    
    inline def signal: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.signal = "signal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.signal]
    
    inline def `signal-1`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-1` = "signal-1".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-1`]
    
    inline def `signal-2`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-2` = "signal-2".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-2`]
    
    inline def `signal-3`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-3` = "signal-3".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-3`]
    
    inline def `signal-4`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-4` = "signal-4".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-4`]
    
    inline def `signal-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt` = "signal-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt`]
    
    inline def `signal-alt-1`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt-1` = "signal-alt-1".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt-1`]
    
    inline def `signal-alt-2`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt-2` = "signal-alt-2".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt-2`]
    
    inline def `signal-alt-3`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt-3` = "signal-alt-3".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt-3`]
    
    inline def `signal-alt-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt-slash` = "signal-alt-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt-slash`]
    
    inline def `signal-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-slash` = "signal-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-slash`]
    
    inline def `signal-stream`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-stream` = "signal-stream".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-stream`]
    
    inline def signature: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.signature = "signature".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.signature]
    
    inline def `sim-card`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sim-card` = "sim-card".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sim-card`]
    
    inline def simplybuilt: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.simplybuilt = "simplybuilt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.simplybuilt]
    
    inline def sink: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sink = "sink".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sink]
    
    inline def siren: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.siren = "siren".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.siren]
    
    inline def `siren-on`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`siren-on` = "siren-on".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`siren-on`]
    
    inline def sistrix: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sistrix = "sistrix".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sistrix]
    
    inline def sitemap: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sitemap = "sitemap".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sitemap]
    
    inline def sith: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sith = "sith".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sith]
    
    inline def skating: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skating = "skating".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skating]
    
    inline def skeleton: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skeleton = "skeleton".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skeleton]
    
    inline def sketch: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sketch = "sketch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sketch]
    
    inline def `ski-jump`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ski-jump` = "ski-jump".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ski-jump`]
    
    inline def `ski-lift`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ski-lift` = "ski-lift".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ski-lift`]
    
    inline def skiing: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skiing = "skiing".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skiing]
    
    inline def `skiing-nordic`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`skiing-nordic` = "skiing-nordic".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`skiing-nordic`]
    
    inline def skull: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skull = "skull".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skull]
    
    inline def `skull-cow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`skull-cow` = "skull-cow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`skull-cow`]
    
    inline def `skull-crossbones`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`skull-crossbones` = "skull-crossbones".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`skull-crossbones`]
    
    inline def skyatlas: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skyatlas = "skyatlas".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skyatlas]
    
    inline def skype: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skype = "skype".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skype]
    
    inline def slack: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.slack = "slack".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.slack]
    
    inline def `slack-hash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`slack-hash` = "slack-hash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`slack-hash`]
    
    inline def slash: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.slash = "slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.slash]
    
    inline def sledding: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sledding = "sledding".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sledding]
    
    inline def sleigh: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sleigh = "sleigh".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sleigh]
    
    inline def `sliders-h`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sliders-h` = "sliders-h".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sliders-h`]
    
    inline def `sliders-h-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sliders-h-square` = "sliders-h-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sliders-h-square`]
    
    inline def `sliders-v`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sliders-v` = "sliders-v".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sliders-v`]
    
    inline def `sliders-v-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sliders-v-square` = "sliders-v-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sliders-v-square`]
    
    inline def slideshare: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.slideshare = "slideshare".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.slideshare]
    
    inline def smile: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.smile = "smile".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.smile]
    
    inline def `smile-beam`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`smile-beam` = "smile-beam".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`smile-beam`]
    
    inline def `smile-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`smile-plus` = "smile-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`smile-plus`]
    
    inline def `smile-wink`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`smile-wink` = "smile-wink".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`smile-wink`]
    
    inline def smog: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.smog = "smog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.smog]
    
    inline def smoke: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.smoke = "smoke".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.smoke]
    
    inline def smoking: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.smoking = "smoking".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.smoking]
    
    inline def `smoking-ban`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`smoking-ban` = "smoking-ban".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`smoking-ban`]
    
    inline def sms: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sms = "sms".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sms]
    
    inline def snake: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snake = "snake".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snake]
    
    inline def snapchat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snapchat = "snapchat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snapchat]
    
    inline def `snapchat-ghost`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`snapchat-ghost` = "snapchat-ghost".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`snapchat-ghost`]
    
    inline def `snapchat-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`snapchat-square` = "snapchat-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`snapchat-square`]
    
    inline def snooze: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snooze = "snooze".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snooze]
    
    inline def `snow-blowing`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`snow-blowing` = "snow-blowing".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`snow-blowing`]
    
    inline def snowboarding: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowboarding = "snowboarding".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowboarding]
    
    inline def snowflake: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowflake = "snowflake".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowflake]
    
    inline def snowflakes: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowflakes = "snowflakes".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowflakes]
    
    inline def snowman: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowman = "snowman".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowman]
    
    inline def snowmobile: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowmobile = "snowmobile".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowmobile]
    
    inline def snowplow: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowplow = "snowplow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowplow]
    
    inline def soap: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.soap = "soap".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.soap]
    
    inline def socks: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.socks = "socks".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.socks]
    
    inline def `solar-panel`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`solar-panel` = "solar-panel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`solar-panel`]
    
    inline def `solar-system`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`solar-system` = "solar-system".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`solar-system`]
    
    inline def sort: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sort = "sort".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sort]
    
    inline def `sort-alpha-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alpha-down` = "sort-alpha-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alpha-down`]
    
    inline def `sort-alpha-down-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alpha-down-alt` = "sort-alpha-down-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alpha-down-alt`]
    
    inline def `sort-alpha-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alpha-up` = "sort-alpha-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alpha-up`]
    
    inline def `sort-alpha-up-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alpha-up-alt` = "sort-alpha-up-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alpha-up-alt`]
    
    inline def `sort-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alt` = "sort-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alt`]
    
    inline def `sort-amount-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-amount-down` = "sort-amount-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-amount-down`]
    
    inline def `sort-amount-down-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-amount-down-alt` = "sort-amount-down-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-amount-down-alt`]
    
    inline def `sort-amount-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-amount-up` = "sort-amount-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-amount-up`]
    
    inline def `sort-amount-up-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-amount-up-alt` = "sort-amount-up-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-amount-up-alt`]
    
    inline def `sort-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-circle` = "sort-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-circle`]
    
    inline def `sort-circle-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-circle-down` = "sort-circle-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-circle-down`]
    
    inline def `sort-circle-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-circle-up` = "sort-circle-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-circle-up`]
    
    inline def `sort-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-down` = "sort-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-down`]
    
    inline def `sort-numeric-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-numeric-down` = "sort-numeric-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-numeric-down`]
    
    inline def `sort-numeric-down-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-numeric-down-alt` = "sort-numeric-down-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-numeric-down-alt`]
    
    inline def `sort-numeric-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-numeric-up` = "sort-numeric-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-numeric-up`]
    
    inline def `sort-numeric-up-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-numeric-up-alt` = "sort-numeric-up-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-numeric-up-alt`]
    
    inline def `sort-shapes-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-shapes-down` = "sort-shapes-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-shapes-down`]
    
    inline def `sort-shapes-down-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-shapes-down-alt` = "sort-shapes-down-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-shapes-down-alt`]
    
    inline def `sort-shapes-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-shapes-up` = "sort-shapes-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-shapes-up`]
    
    inline def `sort-shapes-up-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-shapes-up-alt` = "sort-shapes-up-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-shapes-up-alt`]
    
    inline def `sort-size-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-size-down` = "sort-size-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-size-down`]
    
    inline def `sort-size-down-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-size-down-alt` = "sort-size-down-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-size-down-alt`]
    
    inline def `sort-size-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-size-up` = "sort-size-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-size-up`]
    
    inline def `sort-size-up-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-size-up-alt` = "sort-size-up-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-size-up-alt`]
    
    inline def `sort-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-up` = "sort-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-up`]
    
    inline def soundcloud: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.soundcloud = "soundcloud".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.soundcloud]
    
    inline def soup: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.soup = "soup".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.soup]
    
    inline def sourcetree: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sourcetree = "sourcetree".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sourcetree]
    
    inline def spa: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spa = "spa".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spa]
    
    inline def `space-shuttle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`space-shuttle` = "space-shuttle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`space-shuttle`]
    
    inline def `space-station-moon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`space-station-moon` = "space-station-moon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`space-station-moon`]
    
    inline def `space-station-moon-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`space-station-moon-alt` = "space-station-moon-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`space-station-moon-alt`]
    
    inline def spade: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spade = "spade".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spade]
    
    inline def sparkles: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sparkles = "sparkles".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sparkles]
    
    inline def speakap: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.speakap = "speakap".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.speakap]
    
    inline def speaker: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.speaker = "speaker".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.speaker]
    
    inline def `speaker-deck`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`speaker-deck` = "speaker-deck".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`speaker-deck`]
    
    inline def speakers: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.speakers = "speakers".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.speakers]
    
    inline def `spell-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spell-check` = "spell-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spell-check`]
    
    inline def spider: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spider = "spider".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spider]
    
    inline def `spider-black-widow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spider-black-widow` = "spider-black-widow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spider-black-widow`]
    
    inline def `spider-web`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spider-web` = "spider-web".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spider-web`]
    
    inline def spinner: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spinner = "spinner".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spinner]
    
    inline def `spinner-third`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spinner-third` = "spinner-third".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spinner-third`]
    
    inline def splotch: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.splotch = "splotch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.splotch]
    
    inline def spotify: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spotify = "spotify".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spotify]
    
    inline def `spray-can`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spray-can` = "spray-can".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spray-can`]
    
    inline def sprinkler: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sprinkler = "sprinkler".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sprinkler]
    
    inline def square: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.square = "square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.square]
    
    inline def `square-full`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`square-full` = "square-full".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`square-full`]
    
    inline def `square-root`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`square-root` = "square-root".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`square-root`]
    
    inline def `square-root-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`square-root-alt` = "square-root-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`square-root-alt`]
    
    inline def squarespace: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.squarespace = "squarespace".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.squarespace]
    
    inline def squirrel: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.squirrel = "squirrel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.squirrel]
    
    inline def `stack-exchange`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stack-exchange` = "stack-exchange".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stack-exchange`]
    
    inline def `stack-overflow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stack-overflow` = "stack-overflow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stack-overflow`]
    
    inline def stackpath: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stackpath = "stackpath".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stackpath]
    
    inline def staff: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.staff = "staff".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.staff]
    
    inline def stamp: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stamp = "stamp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stamp]
    
    inline def star: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.star = "star".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.star]
    
    inline def `star-and-crescent`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-and-crescent` = "star-and-crescent".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-and-crescent`]
    
    inline def `star-christmas`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-christmas` = "star-christmas".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-christmas`]
    
    inline def `star-exclamation`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-exclamation` = "star-exclamation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-exclamation`]
    
    inline def `star-half`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-half` = "star-half".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-half`]
    
    inline def `star-half-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-half-alt` = "star-half-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-half-alt`]
    
    inline def `star-of-david`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-of-david` = "star-of-david".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-of-david`]
    
    inline def `star-of-life`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-of-life` = "star-of-life".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-of-life`]
    
    inline def `star-shooting`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-shooting` = "star-shooting".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-shooting`]
    
    inline def starfighter: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.starfighter = "starfighter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.starfighter]
    
    inline def `starfighter-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`starfighter-alt` = "starfighter-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`starfighter-alt`]
    
    inline def stars: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stars = "stars".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stars]
    
    inline def starship: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.starship = "starship".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.starship]
    
    inline def `starship-freighter`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`starship-freighter` = "starship-freighter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`starship-freighter`]
    
    inline def staylinked: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.staylinked = "staylinked".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.staylinked]
    
    inline def steak: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.steak = "steak".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.steak]
    
    inline def steam: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.steam = "steam".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.steam]
    
    inline def `steam-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`steam-square` = "steam-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`steam-square`]
    
    inline def `steam-symbol`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`steam-symbol` = "steam-symbol".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`steam-symbol`]
    
    inline def `steering-wheel`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`steering-wheel` = "steering-wheel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`steering-wheel`]
    
    inline def `step-backward`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`step-backward` = "step-backward".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`step-backward`]
    
    inline def `step-forward`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`step-forward` = "step-forward".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`step-forward`]
    
    inline def stethoscope: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stethoscope = "stethoscope".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stethoscope]
    
    inline def `sticker-mule`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sticker-mule` = "sticker-mule".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sticker-mule`]
    
    inline def `sticky-note`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sticky-note` = "sticky-note".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sticky-note`]
    
    inline def stocking: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stocking = "stocking".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stocking]
    
    inline def stomach: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stomach = "stomach".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stomach]
    
    inline def stop: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stop = "stop".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stop]
    
    inline def `stop-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stop-circle` = "stop-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stop-circle`]
    
    inline def stopwatch: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stopwatch = "stopwatch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stopwatch]
    
    inline def `stopwatch-20`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stopwatch-20` = "stopwatch-20".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stopwatch-20`]
    
    inline def store: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.store = "store".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.store]
    
    inline def `store-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`store-alt` = "store-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`store-alt`]
    
    inline def `store-alt-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`store-alt-slash` = "store-alt-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`store-alt-slash`]
    
    inline def `store-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`store-slash` = "store-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`store-slash`]
    
    inline def strava: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.strava = "strava".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.strava]
    
    inline def stream: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stream = "stream".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stream]
    
    inline def `street-view`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`street-view` = "street-view".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`street-view`]
    
    inline def stretcher: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stretcher = "stretcher".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stretcher]
    
    inline def strikethrough: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.strikethrough = "strikethrough".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.strikethrough]
    
    inline def stripe: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stripe = "stripe".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stripe]
    
    inline def `stripe-s`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stripe-s` = "stripe-s".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stripe-s`]
    
    inline def stroopwafel: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stroopwafel = "stroopwafel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stroopwafel]
    
    inline def studiovinari: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.studiovinari = "studiovinari".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.studiovinari]
    
    inline def stumbleupon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stumbleupon = "stumbleupon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stumbleupon]
    
    inline def `stumbleupon-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stumbleupon-circle` = "stumbleupon-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stumbleupon-circle`]
    
    inline def subscript: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.subscript = "subscript".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.subscript]
    
    inline def subway: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.subway = "subway".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.subway]
    
    inline def suitcase: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.suitcase = "suitcase".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.suitcase]
    
    inline def `suitcase-rolling`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`suitcase-rolling` = "suitcase-rolling".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`suitcase-rolling`]
    
    inline def sun: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sun = "sun".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sun]
    
    inline def `sun-cloud`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sun-cloud` = "sun-cloud".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sun-cloud`]
    
    inline def `sun-dust`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sun-dust` = "sun-dust".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sun-dust`]
    
    inline def `sun-haze`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sun-haze` = "sun-haze".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sun-haze`]
    
    inline def sunglasses: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sunglasses = "sunglasses".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sunglasses]
    
    inline def sunrise: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sunrise = "sunrise".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sunrise]
    
    inline def sunset: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sunset = "sunset".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sunset]
    
    inline def superpowers: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.superpowers = "superpowers".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.superpowers]
    
    inline def superscript: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.superscript = "superscript".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.superscript]
    
    inline def supple: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.supple = "supple".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.supple]
    
    inline def surprise: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.surprise = "surprise".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.surprise]
    
    inline def suse: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.suse = "suse".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.suse]
    
    inline def swatchbook: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.swatchbook = "swatchbook".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.swatchbook]
    
    inline def swift: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.swift = "swift".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.swift]
    
    inline def swimmer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.swimmer = "swimmer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.swimmer]
    
    inline def `swimming-pool`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`swimming-pool` = "swimming-pool".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`swimming-pool`]
    
    inline def sword: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sword = "sword".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sword]
    
    inline def `sword-laser`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sword-laser` = "sword-laser".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sword-laser`]
    
    inline def `sword-laser-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sword-laser-alt` = "sword-laser-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sword-laser-alt`]
    
    inline def swords: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.swords = "swords".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.swords]
    
    inline def `swords-laser`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`swords-laser` = "swords-laser".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`swords-laser`]
    
    inline def symfony: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.symfony = "symfony".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.symfony]
    
    inline def synagogue: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.synagogue = "synagogue".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.synagogue]
    
    inline def sync: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sync = "sync".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sync]
    
    inline def `sync-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sync-alt` = "sync-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sync-alt`]
    
    inline def syringe: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.syringe = "syringe".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.syringe]
    
    inline def table: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.table = "table".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.table]
    
    inline def `table-tennis`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`table-tennis` = "table-tennis".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`table-tennis`]
    
    inline def tablet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tablet = "tablet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tablet]
    
    inline def `tablet-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tablet-alt` = "tablet-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tablet-alt`]
    
    inline def `tablet-android`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tablet-android` = "tablet-android".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tablet-android`]
    
    inline def `tablet-android-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tablet-android-alt` = "tablet-android-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tablet-android-alt`]
    
    inline def `tablet-rugged`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tablet-rugged` = "tablet-rugged".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tablet-rugged`]
    
    inline def tablets: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tablets = "tablets".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tablets]
    
    inline def tachometer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tachometer = "tachometer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tachometer]
    
    inline def `tachometer-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt` = "tachometer-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt`]
    
    inline def `tachometer-alt-average`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-average` = "tachometer-alt-average".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-average`]
    
    inline def `tachometer-alt-fast`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-fast` = "tachometer-alt-fast".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-fast`]
    
    inline def `tachometer-alt-fastest`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-fastest` = "tachometer-alt-fastest".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-fastest`]
    
    inline def `tachometer-alt-slow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-slow` = "tachometer-alt-slow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-slow`]
    
    inline def `tachometer-alt-slowest`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-slowest` = "tachometer-alt-slowest".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-slowest`]
    
    inline def `tachometer-average`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-average` = "tachometer-average".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-average`]
    
    inline def `tachometer-fast`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-fast` = "tachometer-fast".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-fast`]
    
    inline def `tachometer-fastest`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-fastest` = "tachometer-fastest".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-fastest`]
    
    inline def `tachometer-slow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-slow` = "tachometer-slow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-slow`]
    
    inline def `tachometer-slowest`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-slowest` = "tachometer-slowest".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-slowest`]
    
    inline def taco: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.taco = "taco".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.taco]
    
    inline def tag: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tag = "tag".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tag]
    
    inline def tags: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tags = "tags".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tags]
    
    inline def tally: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tally = "tally".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tally]
    
    inline def tanakh: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tanakh = "tanakh".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tanakh]
    
    inline def tape: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tape = "tape".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tape]
    
    inline def tasks: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tasks = "tasks".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tasks]
    
    inline def `tasks-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tasks-alt` = "tasks-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tasks-alt`]
    
    inline def taxi: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.taxi = "taxi".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.taxi]
    
    inline def teamspeak: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.teamspeak = "teamspeak".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.teamspeak]
    
    inline def teeth: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.teeth = "teeth".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.teeth]
    
    inline def `teeth-open`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`teeth-open` = "teeth-open".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`teeth-open`]
    
    inline def telegram: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.telegram = "telegram".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.telegram]
    
    inline def `telegram-plane`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`telegram-plane` = "telegram-plane".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`telegram-plane`]
    
    inline def telescope: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.telescope = "telescope".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.telescope]
    
    inline def `temperature-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-down` = "temperature-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-down`]
    
    inline def `temperature-frigid`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-frigid` = "temperature-frigid".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-frigid`]
    
    inline def `temperature-high`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-high` = "temperature-high".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-high`]
    
    inline def `temperature-hot`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-hot` = "temperature-hot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-hot`]
    
    inline def `temperature-low`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-low` = "temperature-low".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-low`]
    
    inline def `temperature-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-up` = "temperature-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-up`]
    
    inline def `tencent-weibo`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tencent-weibo` = "tencent-weibo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tencent-weibo`]
    
    inline def tenge: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tenge = "tenge".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tenge]
    
    inline def `tennis-ball`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tennis-ball` = "tennis-ball".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tennis-ball`]
    
    inline def terminal: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.terminal = "terminal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.terminal]
    
    inline def text: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.text = "text".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.text]
    
    inline def `text-height`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`text-height` = "text-height".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`text-height`]
    
    inline def `text-size`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`text-size` = "text-size".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`text-size`]
    
    inline def `text-width`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`text-width` = "text-width".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`text-width`]
    
    inline def th: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.th = "th".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.th]
    
    inline def `th-large`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`th-large` = "th-large".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`th-large`]
    
    inline def `th-list`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`th-list` = "th-list".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`th-list`]
    
    inline def `the-red-yeti`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`the-red-yeti` = "the-red-yeti".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`the-red-yeti`]
    
    inline def `theater-masks`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`theater-masks` = "theater-masks".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`theater-masks`]
    
    inline def themeco: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.themeco = "themeco".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.themeco]
    
    inline def themeisle: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.themeisle = "themeisle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.themeisle]
    
    inline def thermometer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.thermometer = "thermometer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.thermometer]
    
    inline def `thermometer-empty`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-empty` = "thermometer-empty".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-empty`]
    
    inline def `thermometer-full`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-full` = "thermometer-full".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-full`]
    
    inline def `thermometer-half`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-half` = "thermometer-half".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-half`]
    
    inline def `thermometer-quarter`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-quarter` = "thermometer-quarter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-quarter`]
    
    inline def `thermometer-three-quarters`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-three-quarters` = "thermometer-three-quarters".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-three-quarters`]
    
    inline def theta: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.theta = "theta".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.theta]
    
    inline def `think-peaks`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`think-peaks` = "think-peaks".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`think-peaks`]
    
    inline def `thumbs-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thumbs-down` = "thumbs-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thumbs-down`]
    
    inline def `thumbs-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thumbs-up` = "thumbs-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thumbs-up`]
    
    inline def thumbtack: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.thumbtack = "thumbtack".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.thumbtack]
    
    inline def thunderstorm: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.thunderstorm = "thunderstorm".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.thunderstorm]
    
    inline def `thunderstorm-moon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thunderstorm-moon` = "thunderstorm-moon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thunderstorm-moon`]
    
    inline def `thunderstorm-sun`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thunderstorm-sun` = "thunderstorm-sun".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thunderstorm-sun`]
    
    inline def ticket: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ticket = "ticket".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ticket]
    
    inline def `ticket-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ticket-alt` = "ticket-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ticket-alt`]
    
    inline def tiktok: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tiktok = "tiktok".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tiktok]
    
    inline def tilde: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tilde = "tilde".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tilde]
    
    inline def times: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.times = "times".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.times]
    
    inline def `times-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`times-circle` = "times-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`times-circle`]
    
    inline def `times-hexagon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`times-hexagon` = "times-hexagon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`times-hexagon`]
    
    inline def `times-octagon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`times-octagon` = "times-octagon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`times-octagon`]
    
    inline def `times-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`times-square` = "times-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`times-square`]
    
    inline def tint: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tint = "tint".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tint]
    
    inline def `tint-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tint-slash` = "tint-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tint-slash`]
    
    inline def tire: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tire = "tire".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tire]
    
    inline def `tire-flat`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tire-flat` = "tire-flat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tire-flat`]
    
    inline def `tire-pressure-warning`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tire-pressure-warning` = "tire-pressure-warning".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tire-pressure-warning`]
    
    inline def `tire-rugged`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tire-rugged` = "tire-rugged".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tire-rugged`]
    
    inline def tired: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tired = "tired".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tired]
    
    inline def `toggle-off`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toggle-off` = "toggle-off".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toggle-off`]
    
    inline def `toggle-on`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toggle-on` = "toggle-on".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toggle-on`]
    
    inline def toilet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.toilet = "toilet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.toilet]
    
    inline def `toilet-paper`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toilet-paper` = "toilet-paper".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toilet-paper`]
    
    inline def `toilet-paper-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toilet-paper-alt` = "toilet-paper-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toilet-paper-alt`]
    
    inline def `toilet-paper-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toilet-paper-slash` = "toilet-paper-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toilet-paper-slash`]
    
    inline def tombstone: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tombstone = "tombstone".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tombstone]
    
    inline def `tombstone-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tombstone-alt` = "tombstone-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tombstone-alt`]
    
    inline def toolbox: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.toolbox = "toolbox".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.toolbox]
    
    inline def tools: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tools = "tools".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tools]
    
    inline def tooth: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tooth = "tooth".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tooth]
    
    inline def toothbrush: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.toothbrush = "toothbrush".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.toothbrush]
    
    inline def torah: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.torah = "torah".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.torah]
    
    inline def `torii-gate`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`torii-gate` = "torii-gate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`torii-gate`]
    
    inline def tornado: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tornado = "tornado".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tornado]
    
    inline def tractor: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tractor = "tractor".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tractor]
    
    inline def `trade-federation`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trade-federation` = "trade-federation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trade-federation`]
    
    inline def trademark: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trademark = "trademark".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trademark]
    
    inline def `traffic-cone`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-cone` = "traffic-cone".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-cone`]
    
    inline def `traffic-light`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-light` = "traffic-light".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-light`]
    
    inline def `traffic-light-go`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-light-go` = "traffic-light-go".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-light-go`]
    
    inline def `traffic-light-slow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-light-slow` = "traffic-light-slow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-light-slow`]
    
    inline def `traffic-light-stop`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-light-stop` = "traffic-light-stop".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-light-stop`]
    
    inline def trailer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trailer = "trailer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trailer]
    
    inline def train: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.train = "train".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.train]
    
    inline def tram: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tram = "tram".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tram]
    
    inline def transgender: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.transgender = "transgender".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.transgender]
    
    inline def `transgender-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transgender-alt` = "transgender-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transgender-alt`]
    
    inline def transporter: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.transporter = "transporter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.transporter]
    
    inline def `transporter-1`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transporter-1` = "transporter-1".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transporter-1`]
    
    inline def `transporter-2`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transporter-2` = "transporter-2".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transporter-2`]
    
    inline def `transporter-3`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transporter-3` = "transporter-3".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transporter-3`]
    
    inline def `transporter-empty`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transporter-empty` = "transporter-empty".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transporter-empty`]
    
    inline def trash: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trash = "trash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trash]
    
    inline def `trash-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-alt` = "trash-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-alt`]
    
    inline def `trash-restore`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-restore` = "trash-restore".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-restore`]
    
    inline def `trash-restore-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-restore-alt` = "trash-restore-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-restore-alt`]
    
    inline def `trash-undo`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-undo` = "trash-undo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-undo`]
    
    inline def `trash-undo-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-undo-alt` = "trash-undo-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-undo-alt`]
    
    inline def `treasure-chest`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`treasure-chest` = "treasure-chest".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`treasure-chest`]
    
    inline def tree: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tree = "tree".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tree]
    
    inline def `tree-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-alt` = "tree-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-alt`]
    
    inline def `tree-christmas`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-christmas` = "tree-christmas".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-christmas`]
    
    inline def `tree-decorated`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-decorated` = "tree-decorated".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-decorated`]
    
    inline def `tree-large`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-large` = "tree-large".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-large`]
    
    inline def `tree-palm`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-palm` = "tree-palm".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-palm`]
    
    inline def trees: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trees = "trees".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trees]
    
    inline def trello: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trello = "trello".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trello]
    
    inline def triangle: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.triangle = "triangle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.triangle]
    
    inline def `triangle-music`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`triangle-music` = "triangle-music".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`triangle-music`]
    
    inline def tripadvisor: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tripadvisor = "tripadvisor".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tripadvisor]
    
    inline def trophy: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trophy = "trophy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trophy]
    
    inline def `trophy-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trophy-alt` = "trophy-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trophy-alt`]
    
    inline def truck: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.truck = "truck".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.truck]
    
    inline def `truck-container`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-container` = "truck-container".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-container`]
    
    inline def `truck-couch`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-couch` = "truck-couch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-couch`]
    
    inline def `truck-loading`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-loading` = "truck-loading".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-loading`]
    
    inline def `truck-monster`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-monster` = "truck-monster".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-monster`]
    
    inline def `truck-moving`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-moving` = "truck-moving".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-moving`]
    
    inline def `truck-pickup`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-pickup` = "truck-pickup".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-pickup`]
    
    inline def `truck-plow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-plow` = "truck-plow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-plow`]
    
    inline def `truck-ramp`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-ramp` = "truck-ramp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-ramp`]
    
    inline def trumpet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trumpet = "trumpet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trumpet]
    
    inline def tshirt: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tshirt = "tshirt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tshirt]
    
    inline def tty: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tty = "tty".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tty]
    
    inline def tumblr: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tumblr = "tumblr".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tumblr]
    
    inline def `tumblr-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tumblr-square` = "tumblr-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tumblr-square`]
    
    inline def turkey: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.turkey = "turkey".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.turkey]
    
    inline def turntable: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.turntable = "turntable".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.turntable]
    
    inline def turtle: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.turtle = "turtle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.turtle]
    
    inline def tv: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tv = "tv".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tv]
    
    inline def `tv-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tv-alt` = "tv-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tv-alt`]
    
    inline def `tv-music`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tv-music` = "tv-music".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tv-music`]
    
    inline def `tv-retro`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tv-retro` = "tv-retro".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tv-retro`]
    
    inline def twitch: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.twitch = "twitch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.twitch]
    
    inline def twitter: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.twitter = "twitter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.twitter]
    
    inline def `twitter-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`twitter-square` = "twitter-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`twitter-square`]
    
    inline def typewriter: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.typewriter = "typewriter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.typewriter]
    
    inline def typo3: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.typo3 = "typo3".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.typo3]
    
    inline def uber: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.uber = "uber".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.uber]
    
    inline def ubuntu: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ubuntu = "ubuntu".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ubuntu]
    
    inline def ufo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ufo = "ufo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ufo]
    
    inline def `ufo-beam`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ufo-beam` = "ufo-beam".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ufo-beam`]
    
    inline def uikit: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.uikit = "uikit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.uikit]
    
    inline def umbraco: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.umbraco = "umbraco".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.umbraco]
    
    inline def umbrella: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.umbrella = "umbrella".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.umbrella]
    
    inline def `umbrella-beach`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`umbrella-beach` = "umbrella-beach".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`umbrella-beach`]
    
    inline def uncharted: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.uncharted = "uncharted".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.uncharted]
    
    inline def underline: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.underline = "underline".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.underline]
    
    inline def undo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.undo = "undo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.undo]
    
    inline def `undo-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`undo-alt` = "undo-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`undo-alt`]
    
    inline def unicorn: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unicorn = "unicorn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unicorn]
    
    inline def union: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.union = "union".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.union]
    
    inline def uniregistry: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.uniregistry = "uniregistry".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.uniregistry]
    
    inline def unity: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unity = "unity".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unity]
    
    inline def `universal-access`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`universal-access` = "universal-access".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`universal-access`]
    
    inline def university: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.university = "university".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.university]
    
    inline def unlink: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unlink = "unlink".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unlink]
    
    inline def unlock: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unlock = "unlock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unlock]
    
    inline def `unlock-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`unlock-alt` = "unlock-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`unlock-alt`]
    
    inline def unsplash: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unsplash = "unsplash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unsplash]
    
    inline def untappd: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.untappd = "untappd".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.untappd]
    
    inline def upload: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.upload = "upload".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.upload]
    
    inline def ups: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ups = "ups".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ups]
    
    inline def usb: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.usb = "usb".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.usb]
    
    inline def `usb-drive`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`usb-drive` = "usb-drive".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`usb-drive`]
    
    inline def `usd-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`usd-circle` = "usd-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`usd-circle`]
    
    inline def `usd-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`usd-square` = "usd-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`usd-square`]
    
    inline def user: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.user = "user".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.user]
    
    inline def `user-alien`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-alien` = "user-alien".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-alien`]
    
    inline def `user-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-alt` = "user-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-alt`]
    
    inline def `user-alt-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-alt-slash` = "user-alt-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-alt-slash`]
    
    inline def `user-astronaut`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-astronaut` = "user-astronaut".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-astronaut`]
    
    inline def `user-chart`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-chart` = "user-chart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-chart`]
    
    inline def `user-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-check` = "user-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-check`]
    
    inline def `user-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-circle` = "user-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-circle`]
    
    inline def `user-clock`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-clock` = "user-clock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-clock`]
    
    inline def `user-cog`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-cog` = "user-cog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-cog`]
    
    inline def `user-cowboy`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-cowboy` = "user-cowboy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-cowboy`]
    
    inline def `user-crown`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-crown` = "user-crown".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-crown`]
    
    inline def `user-edit`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-edit` = "user-edit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-edit`]
    
    inline def `user-friends`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-friends` = "user-friends".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-friends`]
    
    inline def `user-graduate`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-graduate` = "user-graduate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-graduate`]
    
    inline def `user-hard-hat`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-hard-hat` = "user-hard-hat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-hard-hat`]
    
    inline def `user-headset`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-headset` = "user-headset".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-headset`]
    
    inline def `user-injured`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-injured` = "user-injured".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-injured`]
    
    inline def `user-lock`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-lock` = "user-lock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-lock`]
    
    inline def `user-md`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-md` = "user-md".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-md`]
    
    inline def `user-md-chat`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-md-chat` = "user-md-chat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-md-chat`]
    
    inline def `user-minus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-minus` = "user-minus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-minus`]
    
    inline def `user-music`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-music` = "user-music".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-music`]
    
    inline def `user-ninja`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-ninja` = "user-ninja".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-ninja`]
    
    inline def `user-nurse`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-nurse` = "user-nurse".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-nurse`]
    
    inline def `user-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-plus` = "user-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-plus`]
    
    inline def `user-robot`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-robot` = "user-robot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-robot`]
    
    inline def `user-secret`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-secret` = "user-secret".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-secret`]
    
    inline def `user-shield`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-shield` = "user-shield".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-shield`]
    
    inline def `user-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-slash` = "user-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-slash`]
    
    inline def `user-tag`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-tag` = "user-tag".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-tag`]
    
    inline def `user-tie`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-tie` = "user-tie".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-tie`]
    
    inline def `user-times`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-times` = "user-times".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-times`]
    
    inline def `user-unlock`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-unlock` = "user-unlock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-unlock`]
    
    inline def `user-visor`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-visor` = "user-visor".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-visor`]
    
    inline def users: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.users = "users".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.users]
    
    inline def `users-class`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-class` = "users-class".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-class`]
    
    inline def `users-cog`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-cog` = "users-cog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-cog`]
    
    inline def `users-crown`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-crown` = "users-crown".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-crown`]
    
    inline def `users-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-medical` = "users-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-medical`]
    
    inline def `users-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-slash` = "users-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-slash`]
    
    inline def usps: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.usps = "usps".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.usps]
    
    inline def ussunnah: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ussunnah = "ussunnah".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ussunnah]
    
    inline def `utensil-fork`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`utensil-fork` = "utensil-fork".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`utensil-fork`]
    
    inline def `utensil-knife`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`utensil-knife` = "utensil-knife".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`utensil-knife`]
    
    inline def `utensil-spoon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`utensil-spoon` = "utensil-spoon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`utensil-spoon`]
    
    inline def utensils: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.utensils = "utensils".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.utensils]
    
    inline def `utensils-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`utensils-alt` = "utensils-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`utensils-alt`]
    
    inline def vaadin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vaadin = "vaadin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vaadin]
    
    inline def vacuum: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vacuum = "vacuum".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vacuum]
    
    inline def `vacuum-robot`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vacuum-robot` = "vacuum-robot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vacuum-robot`]
    
    inline def `value-absolute`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`value-absolute` = "value-absolute".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`value-absolute`]
    
    inline def `vector-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vector-square` = "vector-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vector-square`]
    
    inline def venus: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.venus = "venus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.venus]
    
    inline def `venus-double`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`venus-double` = "venus-double".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`venus-double`]
    
    inline def `venus-mars`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`venus-mars` = "venus-mars".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`venus-mars`]
    
    inline def vest: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vest = "vest".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vest]
    
    inline def `vest-patches`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vest-patches` = "vest-patches".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vest-patches`]
    
    inline def vhs: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vhs = "vhs".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vhs]
    
    inline def viacoin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.viacoin = "viacoin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.viacoin]
    
    inline def viadeo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.viadeo = "viadeo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.viadeo]
    
    inline def `viadeo-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`viadeo-square` = "viadeo-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`viadeo-square`]
    
    inline def vial: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vial = "vial".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vial]
    
    inline def vials: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vials = "vials".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vials]
    
    inline def viber: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.viber = "viber".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.viber]
    
    inline def video: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.video = "video".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.video]
    
    inline def `video-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`video-plus` = "video-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`video-plus`]
    
    inline def `video-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`video-slash` = "video-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`video-slash`]
    
    inline def vihara: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vihara = "vihara".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vihara]
    
    inline def vimeo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vimeo = "vimeo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vimeo]
    
    inline def `vimeo-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vimeo-square` = "vimeo-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vimeo-square`]
    
    inline def `vimeo-v`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vimeo-v` = "vimeo-v".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vimeo-v`]
    
    inline def vine: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vine = "vine".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vine]
    
    inline def violin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.violin = "violin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.violin]
    
    inline def virus: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.virus = "virus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.virus]
    
    inline def `virus-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`virus-slash` = "virus-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`virus-slash`]
    
    inline def viruses: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.viruses = "viruses".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.viruses]
    
    inline def vk: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vk = "vk".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vk]
    
    inline def vnv: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vnv = "vnv".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vnv]
    
    inline def voicemail: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.voicemail = "voicemail".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.voicemail]
    
    inline def volcano: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.volcano = "volcano".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.volcano]
    
    inline def `volleyball-ball`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volleyball-ball` = "volleyball-ball".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volleyball-ball`]
    
    inline def volume: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.volume = "volume".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.volume]
    
    inline def `volume-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-down` = "volume-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-down`]
    
    inline def `volume-mute`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-mute` = "volume-mute".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-mute`]
    
    inline def `volume-off`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-off` = "volume-off".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-off`]
    
    inline def `volume-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-slash` = "volume-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-slash`]
    
    inline def `volume-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-up` = "volume-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-up`]
    
    inline def `vote-nay`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vote-nay` = "vote-nay".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vote-nay`]
    
    inline def `vote-yea`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vote-yea` = "vote-yea".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vote-yea`]
    
    inline def `vr-cardboard`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vr-cardboard` = "vr-cardboard".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vr-cardboard`]
    
    inline def vuejs: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vuejs = "vuejs".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vuejs]
    
    inline def `wagon-covered`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wagon-covered` = "wagon-covered".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wagon-covered`]
    
    inline def walker: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.walker = "walker".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.walker]
    
    inline def `walkie-talkie`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`walkie-talkie` = "walkie-talkie".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`walkie-talkie`]
    
    inline def walking: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.walking = "walking".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.walking]
    
    inline def wallet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wallet = "wallet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wallet]
    
    inline def wand: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wand = "wand".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wand]
    
    inline def `wand-magic`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wand-magic` = "wand-magic".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wand-magic`]
    
    inline def warehouse: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.warehouse = "warehouse".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.warehouse]
    
    inline def `warehouse-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`warehouse-alt` = "warehouse-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`warehouse-alt`]
    
    inline def washer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.washer = "washer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.washer]
    
    inline def watch: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.watch = "watch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.watch]
    
    inline def `watch-calculator`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`watch-calculator` = "watch-calculator".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`watch-calculator`]
    
    inline def `watch-fitness`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`watch-fitness` = "watch-fitness".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`watch-fitness`]
    
    inline def `watchman-monitoring`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`watchman-monitoring` = "watchman-monitoring".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`watchman-monitoring`]
    
    inline def water: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.water = "water".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.water]
    
    inline def `water-lower`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`water-lower` = "water-lower".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`water-lower`]
    
    inline def `water-rise`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`water-rise` = "water-rise".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`water-rise`]
    
    inline def `wave-sine`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wave-sine` = "wave-sine".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wave-sine`]
    
    inline def `wave-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wave-square` = "wave-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wave-square`]
    
    inline def `wave-triangle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wave-triangle` = "wave-triangle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wave-triangle`]
    
    inline def waveform: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.waveform = "waveform".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.waveform]
    
    inline def `waveform-path`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`waveform-path` = "waveform-path".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`waveform-path`]
    
    inline def waze: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.waze = "waze".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.waze]
    
    inline def webcam: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.webcam = "webcam".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.webcam]
    
    inline def `webcam-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`webcam-slash` = "webcam-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`webcam-slash`]
    
    inline def weebly: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.weebly = "weebly".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.weebly]
    
    inline def weibo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.weibo = "weibo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.weibo]
    
    inline def weight: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.weight = "weight".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.weight]
    
    inline def `weight-hanging`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`weight-hanging` = "weight-hanging".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`weight-hanging`]
    
    inline def weixin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.weixin = "weixin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.weixin]
    
    inline def whale: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.whale = "whale".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.whale]
    
    inline def whatsapp: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.whatsapp = "whatsapp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.whatsapp]
    
    inline def `whatsapp-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`whatsapp-square` = "whatsapp-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`whatsapp-square`]
    
    inline def wheat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wheat = "wheat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wheat]
    
    inline def wheelchair: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wheelchair = "wheelchair".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wheelchair]
    
    inline def whistle: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.whistle = "whistle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.whistle]
    
    inline def whmcs: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.whmcs = "whmcs".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.whmcs]
    
    inline def wifi: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wifi = "wifi".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wifi]
    
    inline def `wifi-1`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wifi-1` = "wifi-1".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wifi-1`]
    
    inline def `wifi-2`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wifi-2` = "wifi-2".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wifi-2`]
    
    inline def `wifi-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wifi-slash` = "wifi-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wifi-slash`]
    
    inline def `wikipedia-w`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wikipedia-w` = "wikipedia-w".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wikipedia-w`]
    
    inline def wind: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wind = "wind".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wind]
    
    inline def `wind-turbine`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wind-turbine` = "wind-turbine".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wind-turbine`]
    
    inline def `wind-warning`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wind-warning` = "wind-warning".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wind-warning`]
    
    inline def window: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.window = "window".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.window]
    
    inline def `window-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-alt` = "window-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-alt`]
    
    inline def `window-close`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-close` = "window-close".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-close`]
    
    inline def `window-frame`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-frame` = "window-frame".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-frame`]
    
    inline def `window-frame-open`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-frame-open` = "window-frame-open".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-frame-open`]
    
    inline def `window-maximize`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-maximize` = "window-maximize".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-maximize`]
    
    inline def `window-minimize`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-minimize` = "window-minimize".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-minimize`]
    
    inline def `window-restore`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-restore` = "window-restore".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-restore`]
    
    inline def windows: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.windows = "windows".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.windows]
    
    inline def windsock: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.windsock = "windsock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.windsock]
    
    inline def `wine-bottle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wine-bottle` = "wine-bottle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wine-bottle`]
    
    inline def `wine-glass`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wine-glass` = "wine-glass".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wine-glass`]
    
    inline def `wine-glass-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wine-glass-alt` = "wine-glass-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wine-glass-alt`]
    
    inline def wix: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wix = "wix".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wix]
    
    inline def `wizards-of-the-coast`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wizards-of-the-coast` = "wizards-of-the-coast".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wizards-of-the-coast`]
    
    inline def wodu: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wodu = "wodu".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wodu]
    
    inline def `wolf-pack-battalion`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wolf-pack-battalion` = "wolf-pack-battalion".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wolf-pack-battalion`]
    
    inline def `won-sign`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`won-sign` = "won-sign".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`won-sign`]
    
    inline def wordpress: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wordpress = "wordpress".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wordpress]
    
    inline def `wordpress-simple`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wordpress-simple` = "wordpress-simple".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wordpress-simple`]
    
    inline def wpbeginner: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wpbeginner = "wpbeginner".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wpbeginner]
    
    inline def wpexplorer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wpexplorer = "wpexplorer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wpexplorer]
    
    inline def wpforms: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wpforms = "wpforms".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wpforms]
    
    inline def wpressr: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wpressr = "wpressr".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wpressr]
    
    inline def wreath: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wreath = "wreath".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wreath]
    
    inline def wrench: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wrench = "wrench".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wrench]
    
    inline def `x-ray`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`x-ray` = "x-ray".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`x-ray`]
    
    inline def xbox: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.xbox = "xbox".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.xbox]
    
    inline def xing: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.xing = "xing".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.xing]
    
    inline def `xing-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`xing-square` = "xing-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`xing-square`]
    
    inline def `y-combinator`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`y-combinator` = "y-combinator".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`y-combinator`]
    
    inline def yahoo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yahoo = "yahoo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yahoo]
    
    inline def yammer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yammer = "yammer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yammer]
    
    inline def yandex: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yandex = "yandex".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yandex]
    
    inline def `yandex-international`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`yandex-international` = "yandex-international".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`yandex-international`]
    
    inline def yarn: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yarn = "yarn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yarn]
    
    inline def yelp: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yelp = "yelp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yelp]
    
    inline def `yen-sign`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`yen-sign` = "yen-sign".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`yen-sign`]
    
    inline def `yin-yang`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`yin-yang` = "yin-yang".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`yin-yang`]
    
    inline def yoast: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yoast = "yoast".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yoast]
    
    inline def youtube: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.youtube = "youtube".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.youtube]
    
    inline def `youtube-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`youtube-square` = "youtube-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`youtube-square`]
    
    inline def zhihu: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.zhihu = "zhihu".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.zhihu]
  }
  
  type IconPack = StringDictionary[IconDefinition]
  
  type IconPathData = String | js.Array[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fas
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fab
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.far
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fal
    - typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fad
  */
  trait IconPrefix extends StObject
  object IconPrefix {
    
    inline def fab: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fab = "fab".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fab]
    
    inline def fad: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fad = "fad".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fad]
    
    inline def fal: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fal = "fal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fal]
    
    inline def far: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.far = "far".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.far]
    
    inline def fas: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fas = "fas".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fas]
  }
}
