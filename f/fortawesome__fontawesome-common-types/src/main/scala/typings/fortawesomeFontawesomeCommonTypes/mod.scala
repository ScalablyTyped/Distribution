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
    
    @scala.inline
    implicit class IconDefinitionMutableBuilder[Self <: IconDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(
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
    
    @scala.inline
    implicit class IconLookupMutableBuilder[Self <: IconLookup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconName(value: IconName): Self = StObject.set(x, "iconName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: IconPrefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def `500px`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`500px` = "500px".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`500px`]
    
    @scala.inline
    def abacus: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.abacus = "abacus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.abacus]
    
    @scala.inline
    def `accessible-icon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`accessible-icon` = "accessible-icon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`accessible-icon`]
    
    @scala.inline
    def accusoft: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.accusoft = "accusoft".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.accusoft]
    
    @scala.inline
    def acorn: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.acorn = "acorn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.acorn]
    
    @scala.inline
    def `acquisitions-incorporated`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`acquisitions-incorporated` = "acquisitions-incorporated".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`acquisitions-incorporated`]
    
    @scala.inline
    def ad: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ad = "ad".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ad]
    
    @scala.inline
    def `address-book`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`address-book` = "address-book".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`address-book`]
    
    @scala.inline
    def `address-card`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`address-card` = "address-card".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`address-card`]
    
    @scala.inline
    def adjust: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.adjust = "adjust".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.adjust]
    
    @scala.inline
    def adn: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.adn = "adn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.adn]
    
    @scala.inline
    def adversal: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.adversal = "adversal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.adversal]
    
    @scala.inline
    def affiliatetheme: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.affiliatetheme = "affiliatetheme".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.affiliatetheme]
    
    @scala.inline
    def `air-conditioner`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`air-conditioner` = "air-conditioner".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`air-conditioner`]
    
    @scala.inline
    def `air-freshener`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`air-freshener` = "air-freshener".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`air-freshener`]
    
    @scala.inline
    def airbnb: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.airbnb = "airbnb".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.airbnb]
    
    @scala.inline
    def `alarm-clock`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alarm-clock` = "alarm-clock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alarm-clock`]
    
    @scala.inline
    def `alarm-exclamation`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alarm-exclamation` = "alarm-exclamation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alarm-exclamation`]
    
    @scala.inline
    def `alarm-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alarm-plus` = "alarm-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alarm-plus`]
    
    @scala.inline
    def `alarm-snooze`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alarm-snooze` = "alarm-snooze".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alarm-snooze`]
    
    @scala.inline
    def album: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.album = "album".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.album]
    
    @scala.inline
    def `album-collection`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`album-collection` = "album-collection".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`album-collection`]
    
    @scala.inline
    def algolia: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.algolia = "algolia".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.algolia]
    
    @scala.inline
    def alicorn: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.alicorn = "alicorn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.alicorn]
    
    @scala.inline
    def alien: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.alien = "alien".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.alien]
    
    @scala.inline
    def `alien-monster`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alien-monster` = "alien-monster".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`alien-monster`]
    
    @scala.inline
    def `align-center`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-center` = "align-center".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-center`]
    
    @scala.inline
    def `align-justify`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-justify` = "align-justify".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-justify`]
    
    @scala.inline
    def `align-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-left` = "align-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-left`]
    
    @scala.inline
    def `align-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-right` = "align-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-right`]
    
    @scala.inline
    def `align-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-slash` = "align-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`align-slash`]
    
    @scala.inline
    def alipay: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.alipay = "alipay".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.alipay]
    
    @scala.inline
    def allergies: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.allergies = "allergies".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.allergies]
    
    @scala.inline
    def amazon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.amazon = "amazon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.amazon]
    
    @scala.inline
    def `amazon-pay`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`amazon-pay` = "amazon-pay".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`amazon-pay`]
    
    @scala.inline
    def ambulance: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ambulance = "ambulance".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ambulance]
    
    @scala.inline
    def `american-sign-language-interpreting`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`american-sign-language-interpreting` = "american-sign-language-interpreting".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`american-sign-language-interpreting`]
    
    @scala.inline
    def amilia: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.amilia = "amilia".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.amilia]
    
    @scala.inline
    def `amp-guitar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`amp-guitar` = "amp-guitar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`amp-guitar`]
    
    @scala.inline
    def analytics: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.analytics = "analytics".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.analytics]
    
    @scala.inline
    def anchor: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.anchor = "anchor".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.anchor]
    
    @scala.inline
    def android: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.android = "android".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.android]
    
    @scala.inline
    def angel: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angel = "angel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angel]
    
    @scala.inline
    def angellist: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angellist = "angellist".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angellist]
    
    @scala.inline
    def `angle-double-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-double-down` = "angle-double-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-double-down`]
    
    @scala.inline
    def `angle-double-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-double-left` = "angle-double-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-double-left`]
    
    @scala.inline
    def `angle-double-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-double-right` = "angle-double-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-double-right`]
    
    @scala.inline
    def `angle-double-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-double-up` = "angle-double-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-double-up`]
    
    @scala.inline
    def `angle-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-down` = "angle-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-down`]
    
    @scala.inline
    def `angle-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-left` = "angle-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-left`]
    
    @scala.inline
    def `angle-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-right` = "angle-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-right`]
    
    @scala.inline
    def `angle-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-up` = "angle-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`angle-up`]
    
    @scala.inline
    def angry: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angry = "angry".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angry]
    
    @scala.inline
    def angrycreative: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angrycreative = "angrycreative".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angrycreative]
    
    @scala.inline
    def angular: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angular = "angular".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.angular]
    
    @scala.inline
    def ankh: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ankh = "ankh".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ankh]
    
    @scala.inline
    def `app-store`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`app-store` = "app-store".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`app-store`]
    
    @scala.inline
    def `app-store-ios`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`app-store-ios` = "app-store-ios".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`app-store-ios`]
    
    @scala.inline
    def apper: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.apper = "apper".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.apper]
    
    @scala.inline
    def apple: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.apple = "apple".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.apple]
    
    @scala.inline
    def `apple-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`apple-alt` = "apple-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`apple-alt`]
    
    @scala.inline
    def `apple-crate`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`apple-crate` = "apple-crate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`apple-crate`]
    
    @scala.inline
    def `apple-pay`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`apple-pay` = "apple-pay".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`apple-pay`]
    
    @scala.inline
    def archive: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.archive = "archive".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.archive]
    
    @scala.inline
    def archway: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.archway = "archway".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.archway]
    
    @scala.inline
    def `arrow-alt-circle-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-circle-down` = "arrow-alt-circle-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-circle-down`]
    
    @scala.inline
    def `arrow-alt-circle-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-circle-left` = "arrow-alt-circle-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-circle-left`]
    
    @scala.inline
    def `arrow-alt-circle-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-circle-right` = "arrow-alt-circle-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-circle-right`]
    
    @scala.inline
    def `arrow-alt-circle-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-circle-up` = "arrow-alt-circle-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-circle-up`]
    
    @scala.inline
    def `arrow-alt-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-down` = "arrow-alt-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-down`]
    
    @scala.inline
    def `arrow-alt-from-bottom`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-from-bottom` = "arrow-alt-from-bottom".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-from-bottom`]
    
    @scala.inline
    def `arrow-alt-from-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-from-left` = "arrow-alt-from-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-from-left`]
    
    @scala.inline
    def `arrow-alt-from-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-from-right` = "arrow-alt-from-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-from-right`]
    
    @scala.inline
    def `arrow-alt-from-top`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-from-top` = "arrow-alt-from-top".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-from-top`]
    
    @scala.inline
    def `arrow-alt-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-left` = "arrow-alt-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-left`]
    
    @scala.inline
    def `arrow-alt-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-right` = "arrow-alt-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-right`]
    
    @scala.inline
    def `arrow-alt-square-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-square-down` = "arrow-alt-square-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-square-down`]
    
    @scala.inline
    def `arrow-alt-square-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-square-left` = "arrow-alt-square-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-square-left`]
    
    @scala.inline
    def `arrow-alt-square-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-square-right` = "arrow-alt-square-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-square-right`]
    
    @scala.inline
    def `arrow-alt-square-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-square-up` = "arrow-alt-square-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-square-up`]
    
    @scala.inline
    def `arrow-alt-to-bottom`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-to-bottom` = "arrow-alt-to-bottom".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-to-bottom`]
    
    @scala.inline
    def `arrow-alt-to-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-to-left` = "arrow-alt-to-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-to-left`]
    
    @scala.inline
    def `arrow-alt-to-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-to-right` = "arrow-alt-to-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-to-right`]
    
    @scala.inline
    def `arrow-alt-to-top`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-to-top` = "arrow-alt-to-top".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-to-top`]
    
    @scala.inline
    def `arrow-alt-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-up` = "arrow-alt-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-alt-up`]
    
    @scala.inline
    def `arrow-circle-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-circle-down` = "arrow-circle-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-circle-down`]
    
    @scala.inline
    def `arrow-circle-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-circle-left` = "arrow-circle-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-circle-left`]
    
    @scala.inline
    def `arrow-circle-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-circle-right` = "arrow-circle-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-circle-right`]
    
    @scala.inline
    def `arrow-circle-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-circle-up` = "arrow-circle-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-circle-up`]
    
    @scala.inline
    def `arrow-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-down` = "arrow-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-down`]
    
    @scala.inline
    def `arrow-from-bottom`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-from-bottom` = "arrow-from-bottom".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-from-bottom`]
    
    @scala.inline
    def `arrow-from-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-from-left` = "arrow-from-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-from-left`]
    
    @scala.inline
    def `arrow-from-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-from-right` = "arrow-from-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-from-right`]
    
    @scala.inline
    def `arrow-from-top`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-from-top` = "arrow-from-top".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-from-top`]
    
    @scala.inline
    def `arrow-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-left` = "arrow-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-left`]
    
    @scala.inline
    def `arrow-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-right` = "arrow-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-right`]
    
    @scala.inline
    def `arrow-square-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-square-down` = "arrow-square-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-square-down`]
    
    @scala.inline
    def `arrow-square-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-square-left` = "arrow-square-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-square-left`]
    
    @scala.inline
    def `arrow-square-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-square-right` = "arrow-square-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-square-right`]
    
    @scala.inline
    def `arrow-square-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-square-up` = "arrow-square-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-square-up`]
    
    @scala.inline
    def `arrow-to-bottom`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-to-bottom` = "arrow-to-bottom".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-to-bottom`]
    
    @scala.inline
    def `arrow-to-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-to-left` = "arrow-to-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-to-left`]
    
    @scala.inline
    def `arrow-to-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-to-right` = "arrow-to-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-to-right`]
    
    @scala.inline
    def `arrow-to-top`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-to-top` = "arrow-to-top".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-to-top`]
    
    @scala.inline
    def `arrow-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-up` = "arrow-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrow-up`]
    
    @scala.inline
    def arrows: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.arrows = "arrows".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.arrows]
    
    @scala.inline
    def `arrows-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-alt` = "arrows-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-alt`]
    
    @scala.inline
    def `arrows-alt-h`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-alt-h` = "arrows-alt-h".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-alt-h`]
    
    @scala.inline
    def `arrows-alt-v`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-alt-v` = "arrows-alt-v".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-alt-v`]
    
    @scala.inline
    def `arrows-h`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-h` = "arrows-h".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-h`]
    
    @scala.inline
    def `arrows-v`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-v` = "arrows-v".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`arrows-v`]
    
    @scala.inline
    def artstation: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.artstation = "artstation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.artstation]
    
    @scala.inline
    def `assistive-listening-systems`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`assistive-listening-systems` = "assistive-listening-systems".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`assistive-listening-systems`]
    
    @scala.inline
    def asterisk: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.asterisk = "asterisk".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.asterisk]
    
    @scala.inline
    def asymmetrik: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.asymmetrik = "asymmetrik".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.asymmetrik]
    
    @scala.inline
    def at: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.at = "at".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.at]
    
    @scala.inline
    def atlas: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.atlas = "atlas".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.atlas]
    
    @scala.inline
    def atlassian: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.atlassian = "atlassian".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.atlassian]
    
    @scala.inline
    def atom: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.atom = "atom".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.atom]
    
    @scala.inline
    def `atom-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`atom-alt` = "atom-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`atom-alt`]
    
    @scala.inline
    def audible: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.audible = "audible".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.audible]
    
    @scala.inline
    def `audio-description`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`audio-description` = "audio-description".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`audio-description`]
    
    @scala.inline
    def autoprefixer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.autoprefixer = "autoprefixer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.autoprefixer]
    
    @scala.inline
    def avianex: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.avianex = "avianex".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.avianex]
    
    @scala.inline
    def aviato: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.aviato = "aviato".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.aviato]
    
    @scala.inline
    def award: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.award = "award".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.award]
    
    @scala.inline
    def aws: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.aws = "aws".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.aws]
    
    @scala.inline
    def axe: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.axe = "axe".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.axe]
    
    @scala.inline
    def `axe-battle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`axe-battle` = "axe-battle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`axe-battle`]
    
    @scala.inline
    def baby: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.baby = "baby".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.baby]
    
    @scala.inline
    def `baby-carriage`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`baby-carriage` = "baby-carriage".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`baby-carriage`]
    
    @scala.inline
    def backpack: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.backpack = "backpack".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.backpack]
    
    @scala.inline
    def backspace: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.backspace = "backspace".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.backspace]
    
    @scala.inline
    def backward: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.backward = "backward".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.backward]
    
    @scala.inline
    def bacon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bacon = "bacon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bacon]
    
    @scala.inline
    def bacteria: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bacteria = "bacteria".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bacteria]
    
    @scala.inline
    def bacterium: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bacterium = "bacterium".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bacterium]
    
    @scala.inline
    def badge: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.badge = "badge".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.badge]
    
    @scala.inline
    def `badge-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badge-check` = "badge-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badge-check`]
    
    @scala.inline
    def `badge-dollar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badge-dollar` = "badge-dollar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badge-dollar`]
    
    @scala.inline
    def `badge-percent`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badge-percent` = "badge-percent".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badge-percent`]
    
    @scala.inline
    def `badge-sheriff`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badge-sheriff` = "badge-sheriff".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badge-sheriff`]
    
    @scala.inline
    def `badger-honey`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badger-honey` = "badger-honey".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`badger-honey`]
    
    @scala.inline
    def `bags-shopping`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bags-shopping` = "bags-shopping".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bags-shopping`]
    
    @scala.inline
    def bahai: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bahai = "bahai".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bahai]
    
    @scala.inline
    def `balance-scale`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`balance-scale` = "balance-scale".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`balance-scale`]
    
    @scala.inline
    def `balance-scale-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`balance-scale-left` = "balance-scale-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`balance-scale-left`]
    
    @scala.inline
    def `balance-scale-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`balance-scale-right` = "balance-scale-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`balance-scale-right`]
    
    @scala.inline
    def `ball-pile`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ball-pile` = "ball-pile".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ball-pile`]
    
    @scala.inline
    def ballot: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ballot = "ballot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ballot]
    
    @scala.inline
    def `ballot-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ballot-check` = "ballot-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ballot-check`]
    
    @scala.inline
    def ban: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ban = "ban".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ban]
    
    @scala.inline
    def `band-aid`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`band-aid` = "band-aid".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`band-aid`]
    
    @scala.inline
    def bandcamp: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bandcamp = "bandcamp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bandcamp]
    
    @scala.inline
    def banjo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.banjo = "banjo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.banjo]
    
    @scala.inline
    def barcode: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.barcode = "barcode".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.barcode]
    
    @scala.inline
    def `barcode-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`barcode-alt` = "barcode-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`barcode-alt`]
    
    @scala.inline
    def `barcode-read`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`barcode-read` = "barcode-read".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`barcode-read`]
    
    @scala.inline
    def `barcode-scan`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`barcode-scan` = "barcode-scan".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`barcode-scan`]
    
    @scala.inline
    def bars: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bars = "bars".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bars]
    
    @scala.inline
    def baseball: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.baseball = "baseball".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.baseball]
    
    @scala.inline
    def `baseball-ball`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`baseball-ball` = "baseball-ball".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`baseball-ball`]
    
    @scala.inline
    def `basketball-ball`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`basketball-ball` = "basketball-ball".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`basketball-ball`]
    
    @scala.inline
    def `basketball-hoop`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`basketball-hoop` = "basketball-hoop".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`basketball-hoop`]
    
    @scala.inline
    def bat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bat = "bat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bat]
    
    @scala.inline
    def bath: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bath = "bath".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bath]
    
    @scala.inline
    def `battery-bolt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-bolt` = "battery-bolt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-bolt`]
    
    @scala.inline
    def `battery-empty`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-empty` = "battery-empty".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-empty`]
    
    @scala.inline
    def `battery-full`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-full` = "battery-full".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-full`]
    
    @scala.inline
    def `battery-half`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-half` = "battery-half".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-half`]
    
    @scala.inline
    def `battery-quarter`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-quarter` = "battery-quarter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-quarter`]
    
    @scala.inline
    def `battery-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-slash` = "battery-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-slash`]
    
    @scala.inline
    def `battery-three-quarters`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-three-quarters` = "battery-three-quarters".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battery-three-quarters`]
    
    @scala.inline
    def `battle-net`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battle-net` = "battle-net".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`battle-net`]
    
    @scala.inline
    def bed: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bed = "bed".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bed]
    
    @scala.inline
    def `bed-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bed-alt` = "bed-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bed-alt`]
    
    @scala.inline
    def `bed-bunk`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bed-bunk` = "bed-bunk".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bed-bunk`]
    
    @scala.inline
    def `bed-empty`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bed-empty` = "bed-empty".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bed-empty`]
    
    @scala.inline
    def beer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.beer = "beer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.beer]
    
    @scala.inline
    def behance: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.behance = "behance".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.behance]
    
    @scala.inline
    def `behance-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`behance-square` = "behance-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`behance-square`]
    
    @scala.inline
    def bell: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bell = "bell".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bell]
    
    @scala.inline
    def `bell-exclamation`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-exclamation` = "bell-exclamation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-exclamation`]
    
    @scala.inline
    def `bell-on`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-on` = "bell-on".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-on`]
    
    @scala.inline
    def `bell-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-plus` = "bell-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-plus`]
    
    @scala.inline
    def `bell-school`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-school` = "bell-school".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-school`]
    
    @scala.inline
    def `bell-school-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-school-slash` = "bell-school-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-school-slash`]
    
    @scala.inline
    def `bell-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-slash` = "bell-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bell-slash`]
    
    @scala.inline
    def bells: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bells = "bells".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bells]
    
    @scala.inline
    def betamax: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.betamax = "betamax".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.betamax]
    
    @scala.inline
    def `bezier-curve`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bezier-curve` = "bezier-curve".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bezier-curve`]
    
    @scala.inline
    def bible: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bible = "bible".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bible]
    
    @scala.inline
    def bicycle: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bicycle = "bicycle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bicycle]
    
    @scala.inline
    def biking: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.biking = "biking".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.biking]
    
    @scala.inline
    def `biking-mountain`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`biking-mountain` = "biking-mountain".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`biking-mountain`]
    
    @scala.inline
    def bimobject: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bimobject = "bimobject".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bimobject]
    
    @scala.inline
    def binoculars: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.binoculars = "binoculars".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.binoculars]
    
    @scala.inline
    def biohazard: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.biohazard = "biohazard".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.biohazard]
    
    @scala.inline
    def `birthday-cake`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`birthday-cake` = "birthday-cake".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`birthday-cake`]
    
    @scala.inline
    def bitbucket: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bitbucket = "bitbucket".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bitbucket]
    
    @scala.inline
    def bitcoin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bitcoin = "bitcoin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bitcoin]
    
    @scala.inline
    def bity: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bity = "bity".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bity]
    
    @scala.inline
    def `black-tie`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`black-tie` = "black-tie".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`black-tie`]
    
    @scala.inline
    def blackberry: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blackberry = "blackberry".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blackberry]
    
    @scala.inline
    def blanket: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blanket = "blanket".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blanket]
    
    @scala.inline
    def blender: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blender = "blender".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blender]
    
    @scala.inline
    def `blender-phone`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`blender-phone` = "blender-phone".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`blender-phone`]
    
    @scala.inline
    def blind: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blind = "blind".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blind]
    
    @scala.inline
    def blinds: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blinds = "blinds".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blinds]
    
    @scala.inline
    def `blinds-open`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`blinds-open` = "blinds-open".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`blinds-open`]
    
    @scala.inline
    def `blinds-raised`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`blinds-raised` = "blinds-raised".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`blinds-raised`]
    
    @scala.inline
    def blog: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blog = "blog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blog]
    
    @scala.inline
    def blogger: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blogger = "blogger".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.blogger]
    
    @scala.inline
    def `blogger-b`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`blogger-b` = "blogger-b".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`blogger-b`]
    
    @scala.inline
    def bluetooth: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bluetooth = "bluetooth".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bluetooth]
    
    @scala.inline
    def `bluetooth-b`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bluetooth-b` = "bluetooth-b".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bluetooth-b`]
    
    @scala.inline
    def bold: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bold = "bold".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bold]
    
    @scala.inline
    def bolt: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bolt = "bolt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bolt]
    
    @scala.inline
    def bomb: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bomb = "bomb".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bomb]
    
    @scala.inline
    def bone: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bone = "bone".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bone]
    
    @scala.inline
    def `bone-break`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bone-break` = "bone-break".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bone-break`]
    
    @scala.inline
    def bong: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bong = "bong".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bong]
    
    @scala.inline
    def book: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.book = "book".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.book]
    
    @scala.inline
    def `book-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-alt` = "book-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-alt`]
    
    @scala.inline
    def `book-dead`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-dead` = "book-dead".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-dead`]
    
    @scala.inline
    def `book-heart`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-heart` = "book-heart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-heart`]
    
    @scala.inline
    def `book-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-medical` = "book-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-medical`]
    
    @scala.inline
    def `book-open`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-open` = "book-open".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-open`]
    
    @scala.inline
    def `book-reader`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-reader` = "book-reader".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-reader`]
    
    @scala.inline
    def `book-spells`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-spells` = "book-spells".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-spells`]
    
    @scala.inline
    def `book-user`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-user` = "book-user".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`book-user`]
    
    @scala.inline
    def bookmark: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bookmark = "bookmark".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bookmark]
    
    @scala.inline
    def books: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.books = "books".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.books]
    
    @scala.inline
    def `books-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`books-medical` = "books-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`books-medical`]
    
    @scala.inline
    def boombox: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.boombox = "boombox".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.boombox]
    
    @scala.inline
    def boot: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.boot = "boot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.boot]
    
    @scala.inline
    def `booth-curtain`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`booth-curtain` = "booth-curtain".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`booth-curtain`]
    
    @scala.inline
    def bootstrap: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bootstrap = "bootstrap".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bootstrap]
    
    @scala.inline
    def `border-all`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-all` = "border-all".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-all`]
    
    @scala.inline
    def `border-bottom`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-bottom` = "border-bottom".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-bottom`]
    
    @scala.inline
    def `border-center-h`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-center-h` = "border-center-h".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-center-h`]
    
    @scala.inline
    def `border-center-v`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-center-v` = "border-center-v".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-center-v`]
    
    @scala.inline
    def `border-inner`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-inner` = "border-inner".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-inner`]
    
    @scala.inline
    def `border-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-left` = "border-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-left`]
    
    @scala.inline
    def `border-none`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-none` = "border-none".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-none`]
    
    @scala.inline
    def `border-outer`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-outer` = "border-outer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-outer`]
    
    @scala.inline
    def `border-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-right` = "border-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-right`]
    
    @scala.inline
    def `border-style`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-style` = "border-style".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-style`]
    
    @scala.inline
    def `border-style-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-style-alt` = "border-style-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-style-alt`]
    
    @scala.inline
    def `border-top`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-top` = "border-top".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`border-top`]
    
    @scala.inline
    def `bow-arrow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bow-arrow` = "bow-arrow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bow-arrow`]
    
    @scala.inline
    def `bowling-ball`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bowling-ball` = "bowling-ball".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bowling-ball`]
    
    @scala.inline
    def `bowling-pins`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bowling-pins` = "bowling-pins".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bowling-pins`]
    
    @scala.inline
    def box: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.box = "box".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.box]
    
    @scala.inline
    def `box-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-alt` = "box-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-alt`]
    
    @scala.inline
    def `box-ballot`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-ballot` = "box-ballot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-ballot`]
    
    @scala.inline
    def `box-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-check` = "box-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-check`]
    
    @scala.inline
    def `box-fragile`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-fragile` = "box-fragile".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-fragile`]
    
    @scala.inline
    def `box-full`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-full` = "box-full".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-full`]
    
    @scala.inline
    def `box-heart`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-heart` = "box-heart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-heart`]
    
    @scala.inline
    def `box-open`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-open` = "box-open".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-open`]
    
    @scala.inline
    def `box-tissue`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-tissue` = "box-tissue".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-tissue`]
    
    @scala.inline
    def `box-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-up` = "box-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-up`]
    
    @scala.inline
    def `box-usd`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-usd` = "box-usd".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`box-usd`]
    
    @scala.inline
    def boxes: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.boxes = "boxes".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.boxes]
    
    @scala.inline
    def `boxes-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`boxes-alt` = "boxes-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`boxes-alt`]
    
    @scala.inline
    def `boxing-glove`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`boxing-glove` = "boxing-glove".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`boxing-glove`]
    
    @scala.inline
    def brackets: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.brackets = "brackets".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.brackets]
    
    @scala.inline
    def `brackets-curly`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`brackets-curly` = "brackets-curly".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`brackets-curly`]
    
    @scala.inline
    def braille: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.braille = "braille".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.braille]
    
    @scala.inline
    def brain: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.brain = "brain".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.brain]
    
    @scala.inline
    def `bread-loaf`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bread-loaf` = "bread-loaf".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bread-loaf`]
    
    @scala.inline
    def `bread-slice`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bread-slice` = "bread-slice".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bread-slice`]
    
    @scala.inline
    def briefcase: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.briefcase = "briefcase".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.briefcase]
    
    @scala.inline
    def `briefcase-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`briefcase-medical` = "briefcase-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`briefcase-medical`]
    
    @scala.inline
    def `bring-forward`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bring-forward` = "bring-forward".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bring-forward`]
    
    @scala.inline
    def `bring-front`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bring-front` = "bring-front".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bring-front`]
    
    @scala.inline
    def `broadcast-tower`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`broadcast-tower` = "broadcast-tower".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`broadcast-tower`]
    
    @scala.inline
    def broom: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.broom = "broom".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.broom]
    
    @scala.inline
    def browser: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.browser = "browser".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.browser]
    
    @scala.inline
    def brush: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.brush = "brush".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.brush]
    
    @scala.inline
    def btc: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.btc = "btc".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.btc]
    
    @scala.inline
    def buffer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.buffer = "buffer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.buffer]
    
    @scala.inline
    def bug: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bug = "bug".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bug]
    
    @scala.inline
    def building: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.building = "building".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.building]
    
    @scala.inline
    def bullhorn: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bullhorn = "bullhorn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bullhorn]
    
    @scala.inline
    def bullseye: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bullseye = "bullseye".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bullseye]
    
    @scala.inline
    def `bullseye-arrow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bullseye-arrow` = "bullseye-arrow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bullseye-arrow`]
    
    @scala.inline
    def `bullseye-pointer`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bullseye-pointer` = "bullseye-pointer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bullseye-pointer`]
    
    @scala.inline
    def `burger-soda`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`burger-soda` = "burger-soda".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`burger-soda`]
    
    @scala.inline
    def burn: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.burn = "burn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.burn]
    
    @scala.inline
    def buromobelexperte: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.buromobelexperte = "buromobelexperte".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.buromobelexperte]
    
    @scala.inline
    def burrito: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.burrito = "burrito".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.burrito]
    
    @scala.inline
    def bus: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bus = "bus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.bus]
    
    @scala.inline
    def `bus-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bus-alt` = "bus-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bus-alt`]
    
    @scala.inline
    def `bus-school`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bus-school` = "bus-school".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`bus-school`]
    
    @scala.inline
    def `business-time`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`business-time` = "business-time".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`business-time`]
    
    @scala.inline
    def `buy-n-large`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`buy-n-large` = "buy-n-large".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`buy-n-large`]
    
    @scala.inline
    def buysellads: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.buysellads = "buysellads".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.buysellads]
    
    @scala.inline
    def `cabinet-filing`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cabinet-filing` = "cabinet-filing".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cabinet-filing`]
    
    @scala.inline
    def cactus: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cactus = "cactus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cactus]
    
    @scala.inline
    def calculator: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.calculator = "calculator".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.calculator]
    
    @scala.inline
    def `calculator-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calculator-alt` = "calculator-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calculator-alt`]
    
    @scala.inline
    def calendar: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.calendar = "calendar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.calendar]
    
    @scala.inline
    def `calendar-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-alt` = "calendar-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-alt`]
    
    @scala.inline
    def `calendar-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-check` = "calendar-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-check`]
    
    @scala.inline
    def `calendar-day`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-day` = "calendar-day".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-day`]
    
    @scala.inline
    def `calendar-edit`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-edit` = "calendar-edit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-edit`]
    
    @scala.inline
    def `calendar-exclamation`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-exclamation` = "calendar-exclamation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-exclamation`]
    
    @scala.inline
    def `calendar-minus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-minus` = "calendar-minus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-minus`]
    
    @scala.inline
    def `calendar-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-plus` = "calendar-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-plus`]
    
    @scala.inline
    def `calendar-star`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-star` = "calendar-star".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-star`]
    
    @scala.inline
    def `calendar-times`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-times` = "calendar-times".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-times`]
    
    @scala.inline
    def `calendar-week`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-week` = "calendar-week".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`calendar-week`]
    
    @scala.inline
    def camcorder: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.camcorder = "camcorder".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.camcorder]
    
    @scala.inline
    def camera: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.camera = "camera".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.camera]
    
    @scala.inline
    def `camera-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-alt` = "camera-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-alt`]
    
    @scala.inline
    def `camera-home`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-home` = "camera-home".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-home`]
    
    @scala.inline
    def `camera-movie`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-movie` = "camera-movie".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-movie`]
    
    @scala.inline
    def `camera-polaroid`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-polaroid` = "camera-polaroid".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-polaroid`]
    
    @scala.inline
    def `camera-retro`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-retro` = "camera-retro".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`camera-retro`]
    
    @scala.inline
    def campfire: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.campfire = "campfire".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.campfire]
    
    @scala.inline
    def campground: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.campground = "campground".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.campground]
    
    @scala.inline
    def `canadian-maple-leaf`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`canadian-maple-leaf` = "canadian-maple-leaf".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`canadian-maple-leaf`]
    
    @scala.inline
    def `candle-holder`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`candle-holder` = "candle-holder".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`candle-holder`]
    
    @scala.inline
    def `candy-cane`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`candy-cane` = "candy-cane".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`candy-cane`]
    
    @scala.inline
    def `candy-corn`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`candy-corn` = "candy-corn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`candy-corn`]
    
    @scala.inline
    def cannabis: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cannabis = "cannabis".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cannabis]
    
    @scala.inline
    def capsules: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.capsules = "capsules".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.capsules]
    
    @scala.inline
    def car: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.car = "car".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.car]
    
    @scala.inline
    def `car-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-alt` = "car-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-alt`]
    
    @scala.inline
    def `car-battery`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-battery` = "car-battery".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-battery`]
    
    @scala.inline
    def `car-building`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-building` = "car-building".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-building`]
    
    @scala.inline
    def `car-bump`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-bump` = "car-bump".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-bump`]
    
    @scala.inline
    def `car-bus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-bus` = "car-bus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-bus`]
    
    @scala.inline
    def `car-crash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-crash` = "car-crash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-crash`]
    
    @scala.inline
    def `car-garage`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-garage` = "car-garage".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-garage`]
    
    @scala.inline
    def `car-mechanic`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-mechanic` = "car-mechanic".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-mechanic`]
    
    @scala.inline
    def `car-side`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-side` = "car-side".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-side`]
    
    @scala.inline
    def `car-tilt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-tilt` = "car-tilt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-tilt`]
    
    @scala.inline
    def `car-wash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-wash` = "car-wash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`car-wash`]
    
    @scala.inline
    def caravan: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.caravan = "caravan".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.caravan]
    
    @scala.inline
    def `caravan-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caravan-alt` = "caravan-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caravan-alt`]
    
    @scala.inline
    def `caret-circle-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-circle-down` = "caret-circle-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-circle-down`]
    
    @scala.inline
    def `caret-circle-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-circle-left` = "caret-circle-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-circle-left`]
    
    @scala.inline
    def `caret-circle-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-circle-right` = "caret-circle-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-circle-right`]
    
    @scala.inline
    def `caret-circle-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-circle-up` = "caret-circle-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-circle-up`]
    
    @scala.inline
    def `caret-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-down` = "caret-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-down`]
    
    @scala.inline
    def `caret-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-left` = "caret-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-left`]
    
    @scala.inline
    def `caret-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-right` = "caret-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-right`]
    
    @scala.inline
    def `caret-square-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-square-down` = "caret-square-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-square-down`]
    
    @scala.inline
    def `caret-square-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-square-left` = "caret-square-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-square-left`]
    
    @scala.inline
    def `caret-square-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-square-right` = "caret-square-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-square-right`]
    
    @scala.inline
    def `caret-square-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-square-up` = "caret-square-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-square-up`]
    
    @scala.inline
    def `caret-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-up` = "caret-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`caret-up`]
    
    @scala.inline
    def carrot: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.carrot = "carrot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.carrot]
    
    @scala.inline
    def cars: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cars = "cars".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cars]
    
    @scala.inline
    def `cart-arrow-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cart-arrow-down` = "cart-arrow-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cart-arrow-down`]
    
    @scala.inline
    def `cart-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cart-plus` = "cart-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cart-plus`]
    
    @scala.inline
    def `cash-register`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cash-register` = "cash-register".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cash-register`]
    
    @scala.inline
    def `cassette-tape`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cassette-tape` = "cassette-tape".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cassette-tape`]
    
    @scala.inline
    def cat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cat = "cat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cat]
    
    @scala.inline
    def `cat-space`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cat-space` = "cat-space".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cat-space`]
    
    @scala.inline
    def cauldron: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cauldron = "cauldron".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cauldron]
    
    @scala.inline
    def `cc-amazon-pay`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-amazon-pay` = "cc-amazon-pay".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-amazon-pay`]
    
    @scala.inline
    def `cc-amex`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-amex` = "cc-amex".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-amex`]
    
    @scala.inline
    def `cc-apple-pay`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-apple-pay` = "cc-apple-pay".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-apple-pay`]
    
    @scala.inline
    def `cc-diners-club`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-diners-club` = "cc-diners-club".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-diners-club`]
    
    @scala.inline
    def `cc-discover`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-discover` = "cc-discover".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-discover`]
    
    @scala.inline
    def `cc-jcb`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-jcb` = "cc-jcb".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-jcb`]
    
    @scala.inline
    def `cc-mastercard`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-mastercard` = "cc-mastercard".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-mastercard`]
    
    @scala.inline
    def `cc-paypal`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-paypal` = "cc-paypal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-paypal`]
    
    @scala.inline
    def `cc-stripe`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-stripe` = "cc-stripe".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-stripe`]
    
    @scala.inline
    def `cc-visa`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-visa` = "cc-visa".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cc-visa`]
    
    @scala.inline
    def cctv: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cctv = "cctv".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cctv]
    
    @scala.inline
    def centercode: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.centercode = "centercode".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.centercode]
    
    @scala.inline
    def centos: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.centos = "centos".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.centos]
    
    @scala.inline
    def certificate: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.certificate = "certificate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.certificate]
    
    @scala.inline
    def chair: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chair = "chair".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chair]
    
    @scala.inline
    def `chair-office`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chair-office` = "chair-office".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chair-office`]
    
    @scala.inline
    def chalkboard: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chalkboard = "chalkboard".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chalkboard]
    
    @scala.inline
    def `chalkboard-teacher`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chalkboard-teacher` = "chalkboard-teacher".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chalkboard-teacher`]
    
    @scala.inline
    def `charging-station`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`charging-station` = "charging-station".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`charging-station`]
    
    @scala.inline
    def `chart-area`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-area` = "chart-area".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-area`]
    
    @scala.inline
    def `chart-bar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-bar` = "chart-bar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-bar`]
    
    @scala.inline
    def `chart-line`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-line` = "chart-line".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-line`]
    
    @scala.inline
    def `chart-line-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-line-down` = "chart-line-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-line-down`]
    
    @scala.inline
    def `chart-network`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-network` = "chart-network".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-network`]
    
    @scala.inline
    def `chart-pie`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-pie` = "chart-pie".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-pie`]
    
    @scala.inline
    def `chart-pie-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-pie-alt` = "chart-pie-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-pie-alt`]
    
    @scala.inline
    def `chart-scatter`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-scatter` = "chart-scatter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chart-scatter`]
    
    @scala.inline
    def check: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.check = "check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.check]
    
    @scala.inline
    def `check-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`check-circle` = "check-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`check-circle`]
    
    @scala.inline
    def `check-double`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`check-double` = "check-double".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`check-double`]
    
    @scala.inline
    def `check-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`check-square` = "check-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`check-square`]
    
    @scala.inline
    def cheese: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cheese = "cheese".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cheese]
    
    @scala.inline
    def `cheese-swiss`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cheese-swiss` = "cheese-swiss".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cheese-swiss`]
    
    @scala.inline
    def cheeseburger: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cheeseburger = "cheeseburger".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cheeseburger]
    
    @scala.inline
    def chess: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chess = "chess".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chess]
    
    @scala.inline
    def `chess-bishop`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-bishop` = "chess-bishop".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-bishop`]
    
    @scala.inline
    def `chess-bishop-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-bishop-alt` = "chess-bishop-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-bishop-alt`]
    
    @scala.inline
    def `chess-board`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-board` = "chess-board".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-board`]
    
    @scala.inline
    def `chess-clock`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-clock` = "chess-clock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-clock`]
    
    @scala.inline
    def `chess-clock-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-clock-alt` = "chess-clock-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-clock-alt`]
    
    @scala.inline
    def `chess-king`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-king` = "chess-king".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-king`]
    
    @scala.inline
    def `chess-king-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-king-alt` = "chess-king-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-king-alt`]
    
    @scala.inline
    def `chess-knight`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-knight` = "chess-knight".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-knight`]
    
    @scala.inline
    def `chess-knight-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-knight-alt` = "chess-knight-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-knight-alt`]
    
    @scala.inline
    def `chess-pawn`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-pawn` = "chess-pawn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-pawn`]
    
    @scala.inline
    def `chess-pawn-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-pawn-alt` = "chess-pawn-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-pawn-alt`]
    
    @scala.inline
    def `chess-queen`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-queen` = "chess-queen".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-queen`]
    
    @scala.inline
    def `chess-queen-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-queen-alt` = "chess-queen-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-queen-alt`]
    
    @scala.inline
    def `chess-rook`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-rook` = "chess-rook".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-rook`]
    
    @scala.inline
    def `chess-rook-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-rook-alt` = "chess-rook-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chess-rook-alt`]
    
    @scala.inline
    def `chevron-circle-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-circle-down` = "chevron-circle-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-circle-down`]
    
    @scala.inline
    def `chevron-circle-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-circle-left` = "chevron-circle-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-circle-left`]
    
    @scala.inline
    def `chevron-circle-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-circle-right` = "chevron-circle-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-circle-right`]
    
    @scala.inline
    def `chevron-circle-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-circle-up` = "chevron-circle-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-circle-up`]
    
    @scala.inline
    def `chevron-double-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-double-down` = "chevron-double-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-double-down`]
    
    @scala.inline
    def `chevron-double-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-double-left` = "chevron-double-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-double-left`]
    
    @scala.inline
    def `chevron-double-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-double-right` = "chevron-double-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-double-right`]
    
    @scala.inline
    def `chevron-double-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-double-up` = "chevron-double-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-double-up`]
    
    @scala.inline
    def `chevron-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-down` = "chevron-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-down`]
    
    @scala.inline
    def `chevron-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-left` = "chevron-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-left`]
    
    @scala.inline
    def `chevron-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-right` = "chevron-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-right`]
    
    @scala.inline
    def `chevron-square-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-square-down` = "chevron-square-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-square-down`]
    
    @scala.inline
    def `chevron-square-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-square-left` = "chevron-square-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-square-left`]
    
    @scala.inline
    def `chevron-square-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-square-right` = "chevron-square-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-square-right`]
    
    @scala.inline
    def `chevron-square-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-square-up` = "chevron-square-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-square-up`]
    
    @scala.inline
    def `chevron-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-up` = "chevron-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`chevron-up`]
    
    @scala.inline
    def child: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.child = "child".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.child]
    
    @scala.inline
    def chimney: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chimney = "chimney".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chimney]
    
    @scala.inline
    def chrome: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chrome = "chrome".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chrome]
    
    @scala.inline
    def chromecast: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chromecast = "chromecast".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.chromecast]
    
    @scala.inline
    def church: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.church = "church".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.church]
    
    @scala.inline
    def circle: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.circle = "circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.circle]
    
    @scala.inline
    def `circle-notch`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`circle-notch` = "circle-notch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`circle-notch`]
    
    @scala.inline
    def city: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.city = "city".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.city]
    
    @scala.inline
    def clarinet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.clarinet = "clarinet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.clarinet]
    
    @scala.inline
    def `claw-marks`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`claw-marks` = "claw-marks".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`claw-marks`]
    
    @scala.inline
    def `clinic-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clinic-medical` = "clinic-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clinic-medical`]
    
    @scala.inline
    def clipboard: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.clipboard = "clipboard".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.clipboard]
    
    @scala.inline
    def `clipboard-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-check` = "clipboard-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-check`]
    
    @scala.inline
    def `clipboard-list`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-list` = "clipboard-list".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-list`]
    
    @scala.inline
    def `clipboard-list-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-list-check` = "clipboard-list-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-list-check`]
    
    @scala.inline
    def `clipboard-prescription`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-prescription` = "clipboard-prescription".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-prescription`]
    
    @scala.inline
    def `clipboard-user`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-user` = "clipboard-user".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clipboard-user`]
    
    @scala.inline
    def clock: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.clock = "clock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.clock]
    
    @scala.inline
    def `closed-captioning`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`closed-captioning` = "closed-captioning".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`closed-captioning`]
    
    @scala.inline
    def cloud: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloud = "cloud".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloud]
    
    @scala.inline
    def `cloud-download`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-download` = "cloud-download".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-download`]
    
    @scala.inline
    def `cloud-download-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-download-alt` = "cloud-download-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-download-alt`]
    
    @scala.inline
    def `cloud-drizzle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-drizzle` = "cloud-drizzle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-drizzle`]
    
    @scala.inline
    def `cloud-hail`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-hail` = "cloud-hail".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-hail`]
    
    @scala.inline
    def `cloud-hail-mixed`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-hail-mixed` = "cloud-hail-mixed".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-hail-mixed`]
    
    @scala.inline
    def `cloud-meatball`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-meatball` = "cloud-meatball".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-meatball`]
    
    @scala.inline
    def `cloud-moon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-moon` = "cloud-moon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-moon`]
    
    @scala.inline
    def `cloud-moon-rain`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-moon-rain` = "cloud-moon-rain".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-moon-rain`]
    
    @scala.inline
    def `cloud-music`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-music` = "cloud-music".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-music`]
    
    @scala.inline
    def `cloud-rain`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-rain` = "cloud-rain".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-rain`]
    
    @scala.inline
    def `cloud-rainbow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-rainbow` = "cloud-rainbow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-rainbow`]
    
    @scala.inline
    def `cloud-showers`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-showers` = "cloud-showers".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-showers`]
    
    @scala.inline
    def `cloud-showers-heavy`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-showers-heavy` = "cloud-showers-heavy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-showers-heavy`]
    
    @scala.inline
    def `cloud-sleet`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-sleet` = "cloud-sleet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-sleet`]
    
    @scala.inline
    def `cloud-snow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-snow` = "cloud-snow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-snow`]
    
    @scala.inline
    def `cloud-sun`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-sun` = "cloud-sun".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-sun`]
    
    @scala.inline
    def `cloud-sun-rain`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-sun-rain` = "cloud-sun-rain".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-sun-rain`]
    
    @scala.inline
    def `cloud-upload`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-upload` = "cloud-upload".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-upload`]
    
    @scala.inline
    def `cloud-upload-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-upload-alt` = "cloud-upload-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cloud-upload-alt`]
    
    @scala.inline
    def cloudflare: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloudflare = "cloudflare".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloudflare]
    
    @scala.inline
    def clouds: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.clouds = "clouds".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.clouds]
    
    @scala.inline
    def `clouds-moon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clouds-moon` = "clouds-moon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clouds-moon`]
    
    @scala.inline
    def `clouds-sun`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clouds-sun` = "clouds-sun".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`clouds-sun`]
    
    @scala.inline
    def cloudscale: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloudscale = "cloudscale".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloudscale]
    
    @scala.inline
    def cloudsmith: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloudsmith = "cloudsmith".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloudsmith]
    
    @scala.inline
    def cloudversify: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloudversify = "cloudversify".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cloudversify]
    
    @scala.inline
    def club: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.club = "club".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.club]
    
    @scala.inline
    def cocktail: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cocktail = "cocktail".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cocktail]
    
    @scala.inline
    def code: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.code = "code".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.code]
    
    @scala.inline
    def `code-branch`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`code-branch` = "code-branch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`code-branch`]
    
    @scala.inline
    def `code-commit`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`code-commit` = "code-commit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`code-commit`]
    
    @scala.inline
    def `code-merge`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`code-merge` = "code-merge".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`code-merge`]
    
    @scala.inline
    def codepen: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.codepen = "codepen".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.codepen]
    
    @scala.inline
    def codiepie: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.codiepie = "codiepie".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.codiepie]
    
    @scala.inline
    def coffee: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.coffee = "coffee".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.coffee]
    
    @scala.inline
    def `coffee-pot`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`coffee-pot` = "coffee-pot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`coffee-pot`]
    
    @scala.inline
    def `coffee-togo`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`coffee-togo` = "coffee-togo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`coffee-togo`]
    
    @scala.inline
    def coffin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.coffin = "coffin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.coffin]
    
    @scala.inline
    def `coffin-cross`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`coffin-cross` = "coffin-cross".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`coffin-cross`]
    
    @scala.inline
    def cog: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cog = "cog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cog]
    
    @scala.inline
    def cogs: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cogs = "cogs".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cogs]
    
    @scala.inline
    def coin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.coin = "coin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.coin]
    
    @scala.inline
    def coins: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.coins = "coins".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.coins]
    
    @scala.inline
    def columns: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.columns = "columns".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.columns]
    
    @scala.inline
    def comet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.comet = "comet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.comet]
    
    @scala.inline
    def comment: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.comment = "comment".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.comment]
    
    @scala.inline
    def `comment-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt` = "comment-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt`]
    
    @scala.inline
    def `comment-alt-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-check` = "comment-alt-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-check`]
    
    @scala.inline
    def `comment-alt-dollar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-dollar` = "comment-alt-dollar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-dollar`]
    
    @scala.inline
    def `comment-alt-dots`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-dots` = "comment-alt-dots".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-dots`]
    
    @scala.inline
    def `comment-alt-edit`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-edit` = "comment-alt-edit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-edit`]
    
    @scala.inline
    def `comment-alt-exclamation`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-exclamation` = "comment-alt-exclamation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-exclamation`]
    
    @scala.inline
    def `comment-alt-lines`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-lines` = "comment-alt-lines".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-lines`]
    
    @scala.inline
    def `comment-alt-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-medical` = "comment-alt-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-medical`]
    
    @scala.inline
    def `comment-alt-minus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-minus` = "comment-alt-minus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-minus`]
    
    @scala.inline
    def `comment-alt-music`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-music` = "comment-alt-music".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-music`]
    
    @scala.inline
    def `comment-alt-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-plus` = "comment-alt-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-plus`]
    
    @scala.inline
    def `comment-alt-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-slash` = "comment-alt-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-slash`]
    
    @scala.inline
    def `comment-alt-smile`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-smile` = "comment-alt-smile".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-smile`]
    
    @scala.inline
    def `comment-alt-times`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-times` = "comment-alt-times".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-alt-times`]
    
    @scala.inline
    def `comment-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-check` = "comment-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-check`]
    
    @scala.inline
    def `comment-dollar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-dollar` = "comment-dollar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-dollar`]
    
    @scala.inline
    def `comment-dots`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-dots` = "comment-dots".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-dots`]
    
    @scala.inline
    def `comment-edit`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-edit` = "comment-edit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-edit`]
    
    @scala.inline
    def `comment-exclamation`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-exclamation` = "comment-exclamation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-exclamation`]
    
    @scala.inline
    def `comment-lines`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-lines` = "comment-lines".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-lines`]
    
    @scala.inline
    def `comment-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-medical` = "comment-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-medical`]
    
    @scala.inline
    def `comment-minus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-minus` = "comment-minus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-minus`]
    
    @scala.inline
    def `comment-music`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-music` = "comment-music".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-music`]
    
    @scala.inline
    def `comment-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-plus` = "comment-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-plus`]
    
    @scala.inline
    def `comment-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-slash` = "comment-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-slash`]
    
    @scala.inline
    def `comment-smile`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-smile` = "comment-smile".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-smile`]
    
    @scala.inline
    def `comment-times`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-times` = "comment-times".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comment-times`]
    
    @scala.inline
    def comments: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.comments = "comments".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.comments]
    
    @scala.inline
    def `comments-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comments-alt` = "comments-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comments-alt`]
    
    @scala.inline
    def `comments-alt-dollar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comments-alt-dollar` = "comments-alt-dollar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comments-alt-dollar`]
    
    @scala.inline
    def `comments-dollar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comments-dollar` = "comments-dollar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`comments-dollar`]
    
    @scala.inline
    def `compact-disc`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compact-disc` = "compact-disc".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compact-disc`]
    
    @scala.inline
    def compass: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.compass = "compass".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.compass]
    
    @scala.inline
    def `compass-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compass-slash` = "compass-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compass-slash`]
    
    @scala.inline
    def compress: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.compress = "compress".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.compress]
    
    @scala.inline
    def `compress-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compress-alt` = "compress-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compress-alt`]
    
    @scala.inline
    def `compress-arrows-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compress-arrows-alt` = "compress-arrows-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compress-arrows-alt`]
    
    @scala.inline
    def `compress-wide`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compress-wide` = "compress-wide".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`compress-wide`]
    
    @scala.inline
    def `computer-classic`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`computer-classic` = "computer-classic".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`computer-classic`]
    
    @scala.inline
    def `computer-speaker`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`computer-speaker` = "computer-speaker".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`computer-speaker`]
    
    @scala.inline
    def `concierge-bell`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`concierge-bell` = "concierge-bell".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`concierge-bell`]
    
    @scala.inline
    def confluence: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.confluence = "confluence".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.confluence]
    
    @scala.inline
    def connectdevelop: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.connectdevelop = "connectdevelop".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.connectdevelop]
    
    @scala.inline
    def construction: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.construction = "construction".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.construction]
    
    @scala.inline
    def `container-storage`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`container-storage` = "container-storage".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`container-storage`]
    
    @scala.inline
    def contao: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.contao = "contao".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.contao]
    
    @scala.inline
    def `conveyor-belt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`conveyor-belt` = "conveyor-belt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`conveyor-belt`]
    
    @scala.inline
    def `conveyor-belt-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`conveyor-belt-alt` = "conveyor-belt-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`conveyor-belt-alt`]
    
    @scala.inline
    def cookie: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cookie = "cookie".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cookie]
    
    @scala.inline
    def `cookie-bite`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cookie-bite` = "cookie-bite".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cookie-bite`]
    
    @scala.inline
    def copy: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.copy = "copy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.copy]
    
    @scala.inline
    def copyright: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.copyright = "copyright".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.copyright]
    
    @scala.inline
    def corn: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.corn = "corn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.corn]
    
    @scala.inline
    def `cotton-bureau`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cotton-bureau` = "cotton-bureau".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cotton-bureau`]
    
    @scala.inline
    def couch: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.couch = "couch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.couch]
    
    @scala.inline
    def cow: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cow = "cow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cow]
    
    @scala.inline
    def cowbell: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cowbell = "cowbell".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cowbell]
    
    @scala.inline
    def `cowbell-more`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cowbell-more` = "cowbell-more".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`cowbell-more`]
    
    @scala.inline
    def cpanel: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cpanel = "cpanel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cpanel]
    
    @scala.inline
    def `creative-commons`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons` = "creative-commons".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons`]
    
    @scala.inline
    def `creative-commons-by`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-by` = "creative-commons-by".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-by`]
    
    @scala.inline
    def `creative-commons-nc`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-nc` = "creative-commons-nc".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-nc`]
    
    @scala.inline
    def `creative-commons-nc-eu`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-nc-eu` = "creative-commons-nc-eu".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-nc-eu`]
    
    @scala.inline
    def `creative-commons-nc-jp`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-nc-jp` = "creative-commons-nc-jp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-nc-jp`]
    
    @scala.inline
    def `creative-commons-nd`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-nd` = "creative-commons-nd".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-nd`]
    
    @scala.inline
    def `creative-commons-pd`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-pd` = "creative-commons-pd".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-pd`]
    
    @scala.inline
    def `creative-commons-pd-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-pd-alt` = "creative-commons-pd-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-pd-alt`]
    
    @scala.inline
    def `creative-commons-remix`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-remix` = "creative-commons-remix".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-remix`]
    
    @scala.inline
    def `creative-commons-sa`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-sa` = "creative-commons-sa".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-sa`]
    
    @scala.inline
    def `creative-commons-sampling`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-sampling` = "creative-commons-sampling".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-sampling`]
    
    @scala.inline
    def `creative-commons-sampling-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-sampling-plus` = "creative-commons-sampling-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-sampling-plus`]
    
    @scala.inline
    def `creative-commons-share`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-share` = "creative-commons-share".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-share`]
    
    @scala.inline
    def `creative-commons-zero`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-zero` = "creative-commons-zero".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`creative-commons-zero`]
    
    @scala.inline
    def `credit-card`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`credit-card` = "credit-card".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`credit-card`]
    
    @scala.inline
    def `credit-card-blank`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`credit-card-blank` = "credit-card-blank".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`credit-card-blank`]
    
    @scala.inline
    def `credit-card-front`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`credit-card-front` = "credit-card-front".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`credit-card-front`]
    
    @scala.inline
    def cricket: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cricket = "cricket".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cricket]
    
    @scala.inline
    def `critical-role`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`critical-role` = "critical-role".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`critical-role`]
    
    @scala.inline
    def croissant: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.croissant = "croissant".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.croissant]
    
    @scala.inline
    def crop: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crop = "crop".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crop]
    
    @scala.inline
    def `crop-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`crop-alt` = "crop-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`crop-alt`]
    
    @scala.inline
    def cross: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cross = "cross".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cross]
    
    @scala.inline
    def crosshairs: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crosshairs = "crosshairs".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crosshairs]
    
    @scala.inline
    def crow: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crow = "crow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crow]
    
    @scala.inline
    def crown: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crown = "crown".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crown]
    
    @scala.inline
    def crutch: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crutch = "crutch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crutch]
    
    @scala.inline
    def crutches: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crutches = "crutches".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.crutches]
    
    @scala.inline
    def css3: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.css3 = "css3".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.css3]
    
    @scala.inline
    def `css3-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`css3-alt` = "css3-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`css3-alt`]
    
    @scala.inline
    def cube: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cube = "cube".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cube]
    
    @scala.inline
    def cubes: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cubes = "cubes".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cubes]
    
    @scala.inline
    def curling: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.curling = "curling".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.curling]
    
    @scala.inline
    def cut: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cut = "cut".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cut]
    
    @scala.inline
    def cuttlefish: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cuttlefish = "cuttlefish".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.cuttlefish]
    
    @scala.inline
    def `d-and-d`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`d-and-d` = "d-and-d".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`d-and-d`]
    
    @scala.inline
    def `d-and-d-beyond`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`d-and-d-beyond` = "d-and-d-beyond".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`d-and-d-beyond`]
    
    @scala.inline
    def dagger: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dagger = "dagger".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dagger]
    
    @scala.inline
    def dailymotion: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dailymotion = "dailymotion".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dailymotion]
    
    @scala.inline
    def dashcube: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dashcube = "dashcube".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dashcube]
    
    @scala.inline
    def database: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.database = "database".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.database]
    
    @scala.inline
    def deaf: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deaf = "deaf".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deaf]
    
    @scala.inline
    def debug: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.debug = "debug".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.debug]
    
    @scala.inline
    def deer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deer = "deer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deer]
    
    @scala.inline
    def `deer-rudolph`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`deer-rudolph` = "deer-rudolph".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`deer-rudolph`]
    
    @scala.inline
    def deezer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deezer = "deezer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deezer]
    
    @scala.inline
    def delicious: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.delicious = "delicious".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.delicious]
    
    @scala.inline
    def democrat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.democrat = "democrat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.democrat]
    
    @scala.inline
    def deploydog: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deploydog = "deploydog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deploydog]
    
    @scala.inline
    def deskpro: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deskpro = "deskpro".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deskpro]
    
    @scala.inline
    def desktop: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.desktop = "desktop".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.desktop]
    
    @scala.inline
    def `desktop-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`desktop-alt` = "desktop-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`desktop-alt`]
    
    @scala.inline
    def dev: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dev = "dev".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dev]
    
    @scala.inline
    def deviantart: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deviantart = "deviantart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.deviantart]
    
    @scala.inline
    def dewpoint: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dewpoint = "dewpoint".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dewpoint]
    
    @scala.inline
    def dharmachakra: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dharmachakra = "dharmachakra".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dharmachakra]
    
    @scala.inline
    def dhl: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dhl = "dhl".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dhl]
    
    @scala.inline
    def diagnoses: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.diagnoses = "diagnoses".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.diagnoses]
    
    @scala.inline
    def diamond: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.diamond = "diamond".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.diamond]
    
    @scala.inline
    def diaspora: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.diaspora = "diaspora".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.diaspora]
    
    @scala.inline
    def dice: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dice = "dice".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dice]
    
    @scala.inline
    def `dice-d10`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d10` = "dice-d10".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d10`]
    
    @scala.inline
    def `dice-d12`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d12` = "dice-d12".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d12`]
    
    @scala.inline
    def `dice-d20`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d20` = "dice-d20".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d20`]
    
    @scala.inline
    def `dice-d4`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d4` = "dice-d4".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d4`]
    
    @scala.inline
    def `dice-d6`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d6` = "dice-d6".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d6`]
    
    @scala.inline
    def `dice-d8`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d8` = "dice-d8".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-d8`]
    
    @scala.inline
    def `dice-five`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-five` = "dice-five".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-five`]
    
    @scala.inline
    def `dice-four`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-four` = "dice-four".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-four`]
    
    @scala.inline
    def `dice-one`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-one` = "dice-one".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-one`]
    
    @scala.inline
    def `dice-six`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-six` = "dice-six".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-six`]
    
    @scala.inline
    def `dice-three`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-three` = "dice-three".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-three`]
    
    @scala.inline
    def `dice-two`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-two` = "dice-two".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dice-two`]
    
    @scala.inline
    def digg: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.digg = "digg".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.digg]
    
    @scala.inline
    def digging: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.digging = "digging".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.digging]
    
    @scala.inline
    def `digital-ocean`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`digital-ocean` = "digital-ocean".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`digital-ocean`]
    
    @scala.inline
    def `digital-tachograph`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`digital-tachograph` = "digital-tachograph".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`digital-tachograph`]
    
    @scala.inline
    def diploma: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.diploma = "diploma".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.diploma]
    
    @scala.inline
    def directions: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.directions = "directions".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.directions]
    
    @scala.inline
    def `disc-drive`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`disc-drive` = "disc-drive".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`disc-drive`]
    
    @scala.inline
    def discord: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.discord = "discord".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.discord]
    
    @scala.inline
    def discourse: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.discourse = "discourse".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.discourse]
    
    @scala.inline
    def disease: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.disease = "disease".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.disease]
    
    @scala.inline
    def divide: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.divide = "divide".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.divide]
    
    @scala.inline
    def dizzy: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dizzy = "dizzy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dizzy]
    
    @scala.inline
    def dna: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dna = "dna".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dna]
    
    @scala.inline
    def `do-not-enter`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`do-not-enter` = "do-not-enter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`do-not-enter`]
    
    @scala.inline
    def dochub: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dochub = "dochub".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dochub]
    
    @scala.inline
    def docker: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.docker = "docker".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.docker]
    
    @scala.inline
    def dog: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dog = "dog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dog]
    
    @scala.inline
    def `dog-leashed`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dog-leashed` = "dog-leashed".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dog-leashed`]
    
    @scala.inline
    def `dollar-sign`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dollar-sign` = "dollar-sign".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dollar-sign`]
    
    @scala.inline
    def dolly: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dolly = "dolly".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dolly]
    
    @scala.inline
    def `dolly-empty`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dolly-empty` = "dolly-empty".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dolly-empty`]
    
    @scala.inline
    def `dolly-flatbed`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dolly-flatbed` = "dolly-flatbed".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dolly-flatbed`]
    
    @scala.inline
    def `dolly-flatbed-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dolly-flatbed-alt` = "dolly-flatbed-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dolly-flatbed-alt`]
    
    @scala.inline
    def `dolly-flatbed-empty`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dolly-flatbed-empty` = "dolly-flatbed-empty".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dolly-flatbed-empty`]
    
    @scala.inline
    def donate: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.donate = "donate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.donate]
    
    @scala.inline
    def `door-closed`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`door-closed` = "door-closed".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`door-closed`]
    
    @scala.inline
    def `door-open`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`door-open` = "door-open".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`door-open`]
    
    @scala.inline
    def `dot-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dot-circle` = "dot-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dot-circle`]
    
    @scala.inline
    def dove: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dove = "dove".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dove]
    
    @scala.inline
    def download: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.download = "download".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.download]
    
    @scala.inline
    def draft2digital: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.draft2digital = "draft2digital".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.draft2digital]
    
    @scala.inline
    def `drafting-compass`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`drafting-compass` = "drafting-compass".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`drafting-compass`]
    
    @scala.inline
    def dragon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dragon = "dragon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dragon]
    
    @scala.inline
    def `draw-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`draw-circle` = "draw-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`draw-circle`]
    
    @scala.inline
    def `draw-polygon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`draw-polygon` = "draw-polygon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`draw-polygon`]
    
    @scala.inline
    def `draw-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`draw-square` = "draw-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`draw-square`]
    
    @scala.inline
    def dreidel: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dreidel = "dreidel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dreidel]
    
    @scala.inline
    def dribbble: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dribbble = "dribbble".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dribbble]
    
    @scala.inline
    def `dribbble-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dribbble-square` = "dribbble-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dribbble-square`]
    
    @scala.inline
    def drone: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.drone = "drone".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.drone]
    
    @scala.inline
    def `drone-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`drone-alt` = "drone-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`drone-alt`]
    
    @scala.inline
    def dropbox: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dropbox = "dropbox".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dropbox]
    
    @scala.inline
    def drum: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.drum = "drum".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.drum]
    
    @scala.inline
    def `drum-steelpan`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`drum-steelpan` = "drum-steelpan".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`drum-steelpan`]
    
    @scala.inline
    def drumstick: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.drumstick = "drumstick".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.drumstick]
    
    @scala.inline
    def `drumstick-bite`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`drumstick-bite` = "drumstick-bite".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`drumstick-bite`]
    
    @scala.inline
    def drupal: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.drupal = "drupal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.drupal]
    
    @scala.inline
    def dryer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dryer = "dryer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dryer]
    
    @scala.inline
    def `dryer-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dryer-alt` = "dryer-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dryer-alt`]
    
    @scala.inline
    def duck: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.duck = "duck".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.duck]
    
    @scala.inline
    def dumbbell: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dumbbell = "dumbbell".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dumbbell]
    
    @scala.inline
    def dumpster: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dumpster = "dumpster".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dumpster]
    
    @scala.inline
    def `dumpster-fire`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dumpster-fire` = "dumpster-fire".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`dumpster-fire`]
    
    @scala.inline
    def dungeon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dungeon = "dungeon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dungeon]
    
    @scala.inline
    def dyalog: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dyalog = "dyalog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.dyalog]
    
    @scala.inline
    def ear: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ear = "ear".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ear]
    
    @scala.inline
    def `ear-muffs`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ear-muffs` = "ear-muffs".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ear-muffs`]
    
    @scala.inline
    def earlybirds: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.earlybirds = "earlybirds".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.earlybirds]
    
    @scala.inline
    def ebay: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ebay = "ebay".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ebay]
    
    @scala.inline
    def eclipse: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.eclipse = "eclipse".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.eclipse]
    
    @scala.inline
    def `eclipse-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`eclipse-alt` = "eclipse-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`eclipse-alt`]
    
    @scala.inline
    def edge: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.edge = "edge".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.edge]
    
    @scala.inline
    def `edge-legacy`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`edge-legacy` = "edge-legacy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`edge-legacy`]
    
    @scala.inline
    def edit: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.edit = "edit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.edit]
    
    @scala.inline
    def egg: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.egg = "egg".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.egg]
    
    @scala.inline
    def `egg-fried`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`egg-fried` = "egg-fried".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`egg-fried`]
    
    @scala.inline
    def eject: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.eject = "eject".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.eject]
    
    @scala.inline
    def elementor: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.elementor = "elementor".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.elementor]
    
    @scala.inline
    def elephant: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.elephant = "elephant".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.elephant]
    
    @scala.inline
    def `ellipsis-h`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ellipsis-h` = "ellipsis-h".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ellipsis-h`]
    
    @scala.inline
    def `ellipsis-h-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ellipsis-h-alt` = "ellipsis-h-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ellipsis-h-alt`]
    
    @scala.inline
    def `ellipsis-v`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ellipsis-v` = "ellipsis-v".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ellipsis-v`]
    
    @scala.inline
    def `ellipsis-v-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ellipsis-v-alt` = "ellipsis-v-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ellipsis-v-alt`]
    
    @scala.inline
    def ello: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ello = "ello".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ello]
    
    @scala.inline
    def ember: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ember = "ember".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ember]
    
    @scala.inline
    def empire: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.empire = "empire".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.empire]
    
    @scala.inline
    def `empty-set`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`empty-set` = "empty-set".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`empty-set`]
    
    @scala.inline
    def `engine-warning`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`engine-warning` = "engine-warning".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`engine-warning`]
    
    @scala.inline
    def envelope: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.envelope = "envelope".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.envelope]
    
    @scala.inline
    def `envelope-open`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`envelope-open` = "envelope-open".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`envelope-open`]
    
    @scala.inline
    def `envelope-open-dollar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`envelope-open-dollar` = "envelope-open-dollar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`envelope-open-dollar`]
    
    @scala.inline
    def `envelope-open-text`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`envelope-open-text` = "envelope-open-text".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`envelope-open-text`]
    
    @scala.inline
    def `envelope-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`envelope-square` = "envelope-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`envelope-square`]
    
    @scala.inline
    def envira: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.envira = "envira".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.envira]
    
    @scala.inline
    def equals: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.equals = "equals".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.equals]
    
    @scala.inline
    def eraser: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.eraser = "eraser".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.eraser]
    
    @scala.inline
    def erlang: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.erlang = "erlang".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.erlang]
    
    @scala.inline
    def ethereum: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ethereum = "ethereum".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ethereum]
    
    @scala.inline
    def ethernet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ethernet = "ethernet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ethernet]
    
    @scala.inline
    def etsy: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.etsy = "etsy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.etsy]
    
    @scala.inline
    def `euro-sign`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`euro-sign` = "euro-sign".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`euro-sign`]
    
    @scala.inline
    def evernote: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.evernote = "evernote".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.evernote]
    
    @scala.inline
    def exchange: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.exchange = "exchange".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.exchange]
    
    @scala.inline
    def `exchange-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`exchange-alt` = "exchange-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`exchange-alt`]
    
    @scala.inline
    def exclamation: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.exclamation = "exclamation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.exclamation]
    
    @scala.inline
    def `exclamation-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`exclamation-circle` = "exclamation-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`exclamation-circle`]
    
    @scala.inline
    def `exclamation-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`exclamation-square` = "exclamation-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`exclamation-square`]
    
    @scala.inline
    def `exclamation-triangle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`exclamation-triangle` = "exclamation-triangle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`exclamation-triangle`]
    
    @scala.inline
    def expand: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.expand = "expand".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.expand]
    
    @scala.inline
    def `expand-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`expand-alt` = "expand-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`expand-alt`]
    
    @scala.inline
    def `expand-arrows`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`expand-arrows` = "expand-arrows".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`expand-arrows`]
    
    @scala.inline
    def `expand-arrows-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`expand-arrows-alt` = "expand-arrows-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`expand-arrows-alt`]
    
    @scala.inline
    def `expand-wide`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`expand-wide` = "expand-wide".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`expand-wide`]
    
    @scala.inline
    def expeditedssl: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.expeditedssl = "expeditedssl".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.expeditedssl]
    
    @scala.inline
    def `external-link`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`external-link` = "external-link".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`external-link`]
    
    @scala.inline
    def `external-link-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`external-link-alt` = "external-link-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`external-link-alt`]
    
    @scala.inline
    def `external-link-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`external-link-square` = "external-link-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`external-link-square`]
    
    @scala.inline
    def `external-link-square-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`external-link-square-alt` = "external-link-square-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`external-link-square-alt`]
    
    @scala.inline
    def eye: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.eye = "eye".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.eye]
    
    @scala.inline
    def `eye-dropper`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`eye-dropper` = "eye-dropper".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`eye-dropper`]
    
    @scala.inline
    def `eye-evil`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`eye-evil` = "eye-evil".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`eye-evil`]
    
    @scala.inline
    def `eye-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`eye-slash` = "eye-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`eye-slash`]
    
    @scala.inline
    def facebook: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.facebook = "facebook".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.facebook]
    
    @scala.inline
    def `facebook-f`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`facebook-f` = "facebook-f".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`facebook-f`]
    
    @scala.inline
    def `facebook-messenger`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`facebook-messenger` = "facebook-messenger".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`facebook-messenger`]
    
    @scala.inline
    def `facebook-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`facebook-square` = "facebook-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`facebook-square`]
    
    @scala.inline
    def fan: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fan = "fan".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fan]
    
    @scala.inline
    def `fan-table`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fan-table` = "fan-table".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fan-table`]
    
    @scala.inline
    def `fantasy-flight-games`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fantasy-flight-games` = "fantasy-flight-games".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fantasy-flight-games`]
    
    @scala.inline
    def farm: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.farm = "farm".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.farm]
    
    @scala.inline
    def `fast-backward`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fast-backward` = "fast-backward".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fast-backward`]
    
    @scala.inline
    def `fast-forward`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fast-forward` = "fast-forward".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fast-forward`]
    
    @scala.inline
    def faucet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.faucet = "faucet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.faucet]
    
    @scala.inline
    def `faucet-drip`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`faucet-drip` = "faucet-drip".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`faucet-drip`]
    
    @scala.inline
    def fax: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fax = "fax".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fax]
    
    @scala.inline
    def feather: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.feather = "feather".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.feather]
    
    @scala.inline
    def `feather-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`feather-alt` = "feather-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`feather-alt`]
    
    @scala.inline
    def fedex: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fedex = "fedex".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fedex]
    
    @scala.inline
    def fedora: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fedora = "fedora".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fedora]
    
    @scala.inline
    def female: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.female = "female".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.female]
    
    @scala.inline
    def `field-hockey`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`field-hockey` = "field-hockey".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`field-hockey`]
    
    @scala.inline
    def `fighter-jet`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fighter-jet` = "fighter-jet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fighter-jet`]
    
    @scala.inline
    def figma: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.figma = "figma".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.figma]
    
    @scala.inline
    def file: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.file = "file".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.file]
    
    @scala.inline
    def `file-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-alt` = "file-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-alt`]
    
    @scala.inline
    def `file-archive`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-archive` = "file-archive".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-archive`]
    
    @scala.inline
    def `file-audio`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-audio` = "file-audio".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-audio`]
    
    @scala.inline
    def `file-certificate`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-certificate` = "file-certificate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-certificate`]
    
    @scala.inline
    def `file-chart-line`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-chart-line` = "file-chart-line".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-chart-line`]
    
    @scala.inline
    def `file-chart-pie`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-chart-pie` = "file-chart-pie".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-chart-pie`]
    
    @scala.inline
    def `file-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-check` = "file-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-check`]
    
    @scala.inline
    def `file-code`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-code` = "file-code".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-code`]
    
    @scala.inline
    def `file-contract`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-contract` = "file-contract".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-contract`]
    
    @scala.inline
    def `file-csv`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-csv` = "file-csv".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-csv`]
    
    @scala.inline
    def `file-download`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-download` = "file-download".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-download`]
    
    @scala.inline
    def `file-edit`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-edit` = "file-edit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-edit`]
    
    @scala.inline
    def `file-excel`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-excel` = "file-excel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-excel`]
    
    @scala.inline
    def `file-exclamation`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-exclamation` = "file-exclamation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-exclamation`]
    
    @scala.inline
    def `file-export`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-export` = "file-export".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-export`]
    
    @scala.inline
    def `file-image`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-image` = "file-image".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-image`]
    
    @scala.inline
    def `file-import`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-import` = "file-import".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-import`]
    
    @scala.inline
    def `file-invoice`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-invoice` = "file-invoice".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-invoice`]
    
    @scala.inline
    def `file-invoice-dollar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-invoice-dollar` = "file-invoice-dollar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-invoice-dollar`]
    
    @scala.inline
    def `file-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-medical` = "file-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-medical`]
    
    @scala.inline
    def `file-medical-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-medical-alt` = "file-medical-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-medical-alt`]
    
    @scala.inline
    def `file-minus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-minus` = "file-minus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-minus`]
    
    @scala.inline
    def `file-music`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-music` = "file-music".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-music`]
    
    @scala.inline
    def `file-pdf`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-pdf` = "file-pdf".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-pdf`]
    
    @scala.inline
    def `file-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-plus` = "file-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-plus`]
    
    @scala.inline
    def `file-powerpoint`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-powerpoint` = "file-powerpoint".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-powerpoint`]
    
    @scala.inline
    def `file-prescription`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-prescription` = "file-prescription".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-prescription`]
    
    @scala.inline
    def `file-search`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-search` = "file-search".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-search`]
    
    @scala.inline
    def `file-signature`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-signature` = "file-signature".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-signature`]
    
    @scala.inline
    def `file-spreadsheet`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-spreadsheet` = "file-spreadsheet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-spreadsheet`]
    
    @scala.inline
    def `file-times`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-times` = "file-times".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-times`]
    
    @scala.inline
    def `file-upload`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-upload` = "file-upload".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-upload`]
    
    @scala.inline
    def `file-user`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-user` = "file-user".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-user`]
    
    @scala.inline
    def `file-video`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-video` = "file-video".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-video`]
    
    @scala.inline
    def `file-word`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-word` = "file-word".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`file-word`]
    
    @scala.inline
    def `files-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`files-medical` = "files-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`files-medical`]
    
    @scala.inline
    def fill: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fill = "fill".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fill]
    
    @scala.inline
    def `fill-drip`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fill-drip` = "fill-drip".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fill-drip`]
    
    @scala.inline
    def film: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.film = "film".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.film]
    
    @scala.inline
    def `film-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`film-alt` = "film-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`film-alt`]
    
    @scala.inline
    def `film-canister`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`film-canister` = "film-canister".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`film-canister`]
    
    @scala.inline
    def filter: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.filter = "filter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.filter]
    
    @scala.inline
    def fingerprint: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fingerprint = "fingerprint".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fingerprint]
    
    @scala.inline
    def fire: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fire = "fire".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fire]
    
    @scala.inline
    def `fire-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fire-alt` = "fire-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fire-alt`]
    
    @scala.inline
    def `fire-extinguisher`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fire-extinguisher` = "fire-extinguisher".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fire-extinguisher`]
    
    @scala.inline
    def `fire-smoke`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fire-smoke` = "fire-smoke".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fire-smoke`]
    
    @scala.inline
    def firefox: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.firefox = "firefox".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.firefox]
    
    @scala.inline
    def `firefox-browser`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`firefox-browser` = "firefox-browser".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`firefox-browser`]
    
    @scala.inline
    def fireplace: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fireplace = "fireplace".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fireplace]
    
    @scala.inline
    def `first-aid`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`first-aid` = "first-aid".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`first-aid`]
    
    @scala.inline
    def `first-order`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`first-order` = "first-order".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`first-order`]
    
    @scala.inline
    def `first-order-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`first-order-alt` = "first-order-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`first-order-alt`]
    
    @scala.inline
    def firstdraft: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.firstdraft = "firstdraft".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.firstdraft]
    
    @scala.inline
    def fish: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fish = "fish".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fish]
    
    @scala.inline
    def `fish-cooked`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fish-cooked` = "fish-cooked".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fish-cooked`]
    
    @scala.inline
    def `fist-raised`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fist-raised` = "fist-raised".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fist-raised`]
    
    @scala.inline
    def flag: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flag = "flag".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flag]
    
    @scala.inline
    def `flag-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flag-alt` = "flag-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flag-alt`]
    
    @scala.inline
    def `flag-checkered`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flag-checkered` = "flag-checkered".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flag-checkered`]
    
    @scala.inline
    def `flag-usa`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flag-usa` = "flag-usa".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flag-usa`]
    
    @scala.inline
    def flame: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flame = "flame".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flame]
    
    @scala.inline
    def flashlight: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flashlight = "flashlight".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flashlight]
    
    @scala.inline
    def flask: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flask = "flask".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flask]
    
    @scala.inline
    def `flask-poison`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flask-poison` = "flask-poison".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flask-poison`]
    
    @scala.inline
    def `flask-potion`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flask-potion` = "flask-potion".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flask-potion`]
    
    @scala.inline
    def flickr: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flickr = "flickr".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flickr]
    
    @scala.inline
    def flipboard: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flipboard = "flipboard".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flipboard]
    
    @scala.inline
    def flower: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flower = "flower".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flower]
    
    @scala.inline
    def `flower-daffodil`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flower-daffodil` = "flower-daffodil".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flower-daffodil`]
    
    @scala.inline
    def `flower-tulip`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flower-tulip` = "flower-tulip".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flower-tulip`]
    
    @scala.inline
    def flushed: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flushed = "flushed".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flushed]
    
    @scala.inline
    def flute: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flute = "flute".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.flute]
    
    @scala.inline
    def `flux-capacitor`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flux-capacitor` = "flux-capacitor".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`flux-capacitor`]
    
    @scala.inline
    def fly: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fly = "fly".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fly]
    
    @scala.inline
    def fog: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fog = "fog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fog]
    
    @scala.inline
    def folder: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.folder = "folder".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.folder]
    
    @scala.inline
    def `folder-download`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-download` = "folder-download".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-download`]
    
    @scala.inline
    def `folder-minus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-minus` = "folder-minus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-minus`]
    
    @scala.inline
    def `folder-open`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-open` = "folder-open".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-open`]
    
    @scala.inline
    def `folder-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-plus` = "folder-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-plus`]
    
    @scala.inline
    def `folder-times`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-times` = "folder-times".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-times`]
    
    @scala.inline
    def `folder-tree`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-tree` = "folder-tree".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-tree`]
    
    @scala.inline
    def `folder-upload`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-upload` = "folder-upload".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`folder-upload`]
    
    @scala.inline
    def folders: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.folders = "folders".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.folders]
    
    @scala.inline
    def font: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.font = "font".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.font]
    
    @scala.inline
    def `font-awesome`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-awesome` = "font-awesome".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-awesome`]
    
    @scala.inline
    def `font-awesome-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-awesome-alt` = "font-awesome-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-awesome-alt`]
    
    @scala.inline
    def `font-awesome-flag`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-awesome-flag` = "font-awesome-flag".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-awesome-flag`]
    
    @scala.inline
    def `font-awesome-logo-full`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-awesome-logo-full` = "font-awesome-logo-full".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-awesome-logo-full`]
    
    @scala.inline
    def `font-case`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-case` = "font-case".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`font-case`]
    
    @scala.inline
    def fonticons: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fonticons = "fonticons".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fonticons]
    
    @scala.inline
    def `fonticons-fi`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fonticons-fi` = "fonticons-fi".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fonticons-fi`]
    
    @scala.inline
    def `football-ball`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`football-ball` = "football-ball".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`football-ball`]
    
    @scala.inline
    def `football-helmet`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`football-helmet` = "football-helmet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`football-helmet`]
    
    @scala.inline
    def forklift: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.forklift = "forklift".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.forklift]
    
    @scala.inline
    def `fort-awesome`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fort-awesome` = "fort-awesome".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fort-awesome`]
    
    @scala.inline
    def `fort-awesome-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fort-awesome-alt` = "fort-awesome-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`fort-awesome-alt`]
    
    @scala.inline
    def forumbee: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.forumbee = "forumbee".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.forumbee]
    
    @scala.inline
    def forward: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.forward = "forward".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.forward]
    
    @scala.inline
    def foursquare: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.foursquare = "foursquare".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.foursquare]
    
    @scala.inline
    def fragile: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fragile = "fragile".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fragile]
    
    @scala.inline
    def `free-code-camp`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`free-code-camp` = "free-code-camp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`free-code-camp`]
    
    @scala.inline
    def freebsd: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.freebsd = "freebsd".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.freebsd]
    
    @scala.inline
    def `french-fries`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`french-fries` = "french-fries".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`french-fries`]
    
    @scala.inline
    def frog: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.frog = "frog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.frog]
    
    @scala.inline
    def `frosty-head`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`frosty-head` = "frosty-head".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`frosty-head`]
    
    @scala.inline
    def frown: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.frown = "frown".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.frown]
    
    @scala.inline
    def `frown-open`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`frown-open` = "frown-open".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`frown-open`]
    
    @scala.inline
    def fulcrum: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fulcrum = "fulcrum".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fulcrum]
    
    @scala.inline
    def function: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.function = "function".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.function]
    
    @scala.inline
    def `funnel-dollar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`funnel-dollar` = "funnel-dollar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`funnel-dollar`]
    
    @scala.inline
    def futbol: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.futbol = "futbol".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.futbol]
    
    @scala.inline
    def `galactic-republic`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`galactic-republic` = "galactic-republic".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`galactic-republic`]
    
    @scala.inline
    def `galactic-senate`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`galactic-senate` = "galactic-senate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`galactic-senate`]
    
    @scala.inline
    def galaxy: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.galaxy = "galaxy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.galaxy]
    
    @scala.inline
    def `game-board`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`game-board` = "game-board".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`game-board`]
    
    @scala.inline
    def `game-board-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`game-board-alt` = "game-board-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`game-board-alt`]
    
    @scala.inline
    def `game-console-handheld`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`game-console-handheld` = "game-console-handheld".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`game-console-handheld`]
    
    @scala.inline
    def gamepad: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gamepad = "gamepad".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gamepad]
    
    @scala.inline
    def `gamepad-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gamepad-alt` = "gamepad-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gamepad-alt`]
    
    @scala.inline
    def garage: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.garage = "garage".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.garage]
    
    @scala.inline
    def `garage-car`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`garage-car` = "garage-car".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`garage-car`]
    
    @scala.inline
    def `garage-open`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`garage-open` = "garage-open".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`garage-open`]
    
    @scala.inline
    def `gas-pump`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gas-pump` = "gas-pump".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gas-pump`]
    
    @scala.inline
    def `gas-pump-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gas-pump-slash` = "gas-pump-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gas-pump-slash`]
    
    @scala.inline
    def gavel: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gavel = "gavel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gavel]
    
    @scala.inline
    def gem: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gem = "gem".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gem]
    
    @scala.inline
    def genderless: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.genderless = "genderless".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.genderless]
    
    @scala.inline
    def `get-pocket`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`get-pocket` = "get-pocket".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`get-pocket`]
    
    @scala.inline
    def gg: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gg = "gg".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gg]
    
    @scala.inline
    def `gg-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gg-circle` = "gg-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gg-circle`]
    
    @scala.inline
    def ghost: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ghost = "ghost".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ghost]
    
    @scala.inline
    def gift: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gift = "gift".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gift]
    
    @scala.inline
    def `gift-card`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gift-card` = "gift-card".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gift-card`]
    
    @scala.inline
    def gifts: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gifts = "gifts".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gifts]
    
    @scala.inline
    def `gingerbread-man`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gingerbread-man` = "gingerbread-man".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`gingerbread-man`]
    
    @scala.inline
    def git: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.git = "git".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.git]
    
    @scala.inline
    def `git-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`git-alt` = "git-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`git-alt`]
    
    @scala.inline
    def `git-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`git-square` = "git-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`git-square`]
    
    @scala.inline
    def github: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.github = "github".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.github]
    
    @scala.inline
    def `github-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`github-alt` = "github-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`github-alt`]
    
    @scala.inline
    def `github-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`github-square` = "github-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`github-square`]
    
    @scala.inline
    def gitkraken: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gitkraken = "gitkraken".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gitkraken]
    
    @scala.inline
    def gitlab: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gitlab = "gitlab".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gitlab]
    
    @scala.inline
    def gitter: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gitter = "gitter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gitter]
    
    @scala.inline
    def glass: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.glass = "glass".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.glass]
    
    @scala.inline
    def `glass-champagne`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-champagne` = "glass-champagne".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-champagne`]
    
    @scala.inline
    def `glass-cheers`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-cheers` = "glass-cheers".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-cheers`]
    
    @scala.inline
    def `glass-citrus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-citrus` = "glass-citrus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-citrus`]
    
    @scala.inline
    def `glass-martini`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-martini` = "glass-martini".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-martini`]
    
    @scala.inline
    def `glass-martini-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-martini-alt` = "glass-martini-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-martini-alt`]
    
    @scala.inline
    def `glass-whiskey`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-whiskey` = "glass-whiskey".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-whiskey`]
    
    @scala.inline
    def `glass-whiskey-rocks`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-whiskey-rocks` = "glass-whiskey-rocks".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glass-whiskey-rocks`]
    
    @scala.inline
    def glasses: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.glasses = "glasses".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.glasses]
    
    @scala.inline
    def `glasses-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glasses-alt` = "glasses-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glasses-alt`]
    
    @scala.inline
    def glide: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.glide = "glide".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.glide]
    
    @scala.inline
    def `glide-g`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glide-g` = "glide-g".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`glide-g`]
    
    @scala.inline
    def globe: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.globe = "globe".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.globe]
    
    @scala.inline
    def `globe-africa`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-africa` = "globe-africa".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-africa`]
    
    @scala.inline
    def `globe-americas`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-americas` = "globe-americas".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-americas`]
    
    @scala.inline
    def `globe-asia`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-asia` = "globe-asia".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-asia`]
    
    @scala.inline
    def `globe-europe`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-europe` = "globe-europe".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-europe`]
    
    @scala.inline
    def `globe-snow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-snow` = "globe-snow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-snow`]
    
    @scala.inline
    def `globe-stand`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-stand` = "globe-stand".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`globe-stand`]
    
    @scala.inline
    def gofore: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gofore = "gofore".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gofore]
    
    @scala.inline
    def `golf-ball`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`golf-ball` = "golf-ball".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`golf-ball`]
    
    @scala.inline
    def `golf-club`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`golf-club` = "golf-club".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`golf-club`]
    
    @scala.inline
    def goodreads: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.goodreads = "goodreads".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.goodreads]
    
    @scala.inline
    def `goodreads-g`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`goodreads-g` = "goodreads-g".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`goodreads-g`]
    
    @scala.inline
    def google: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.google = "google".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.google]
    
    @scala.inline
    def `google-drive`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-drive` = "google-drive".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-drive`]
    
    @scala.inline
    def `google-pay`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-pay` = "google-pay".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-pay`]
    
    @scala.inline
    def `google-play`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-play` = "google-play".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-play`]
    
    @scala.inline
    def `google-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-plus` = "google-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-plus`]
    
    @scala.inline
    def `google-plus-g`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-plus-g` = "google-plus-g".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-plus-g`]
    
    @scala.inline
    def `google-plus-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-plus-square` = "google-plus-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-plus-square`]
    
    @scala.inline
    def `google-wallet`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-wallet` = "google-wallet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`google-wallet`]
    
    @scala.inline
    def gopuram: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gopuram = "gopuram".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gopuram]
    
    @scala.inline
    def `graduation-cap`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`graduation-cap` = "graduation-cap".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`graduation-cap`]
    
    @scala.inline
    def gramophone: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gramophone = "gramophone".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gramophone]
    
    @scala.inline
    def gratipay: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gratipay = "gratipay".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gratipay]
    
    @scala.inline
    def grav: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.grav = "grav".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.grav]
    
    @scala.inline
    def `greater-than`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`greater-than` = "greater-than".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`greater-than`]
    
    @scala.inline
    def `greater-than-equal`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`greater-than-equal` = "greater-than-equal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`greater-than-equal`]
    
    @scala.inline
    def grimace: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.grimace = "grimace".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.grimace]
    
    @scala.inline
    def grin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.grin = "grin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.grin]
    
    @scala.inline
    def `grin-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-alt` = "grin-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-alt`]
    
    @scala.inline
    def `grin-beam`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-beam` = "grin-beam".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-beam`]
    
    @scala.inline
    def `grin-beam-sweat`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-beam-sweat` = "grin-beam-sweat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-beam-sweat`]
    
    @scala.inline
    def `grin-hearts`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-hearts` = "grin-hearts".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-hearts`]
    
    @scala.inline
    def `grin-squint`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-squint` = "grin-squint".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-squint`]
    
    @scala.inline
    def `grin-squint-tears`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-squint-tears` = "grin-squint-tears".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-squint-tears`]
    
    @scala.inline
    def `grin-stars`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-stars` = "grin-stars".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-stars`]
    
    @scala.inline
    def `grin-tears`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-tears` = "grin-tears".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-tears`]
    
    @scala.inline
    def `grin-tongue`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-tongue` = "grin-tongue".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-tongue`]
    
    @scala.inline
    def `grin-tongue-squint`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-tongue-squint` = "grin-tongue-squint".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-tongue-squint`]
    
    @scala.inline
    def `grin-tongue-wink`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-tongue-wink` = "grin-tongue-wink".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-tongue-wink`]
    
    @scala.inline
    def `grin-wink`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-wink` = "grin-wink".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grin-wink`]
    
    @scala.inline
    def `grip-horizontal`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grip-horizontal` = "grip-horizontal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grip-horizontal`]
    
    @scala.inline
    def `grip-lines`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grip-lines` = "grip-lines".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grip-lines`]
    
    @scala.inline
    def `grip-lines-vertical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grip-lines-vertical` = "grip-lines-vertical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grip-lines-vertical`]
    
    @scala.inline
    def `grip-vertical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grip-vertical` = "grip-vertical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`grip-vertical`]
    
    @scala.inline
    def gripfire: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gripfire = "gripfire".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gripfire]
    
    @scala.inline
    def grunt: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.grunt = "grunt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.grunt]
    
    @scala.inline
    def guilded: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.guilded = "guilded".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.guilded]
    
    @scala.inline
    def guitar: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.guitar = "guitar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.guitar]
    
    @scala.inline
    def `guitar-electric`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`guitar-electric` = "guitar-electric".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`guitar-electric`]
    
    @scala.inline
    def guitars: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.guitars = "guitars".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.guitars]
    
    @scala.inline
    def gulp: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gulp = "gulp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.gulp]
    
    @scala.inline
    def `h-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`h-square` = "h-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`h-square`]
    
    @scala.inline
    def h1: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.h1 = "h1".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.h1]
    
    @scala.inline
    def h2: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.h2 = "h2".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.h2]
    
    @scala.inline
    def h3: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.h3 = "h3".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.h3]
    
    @scala.inline
    def h4: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.h4 = "h4".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.h4]
    
    @scala.inline
    def `hacker-news`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hacker-news` = "hacker-news".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hacker-news`]
    
    @scala.inline
    def `hacker-news-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hacker-news-square` = "hacker-news-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hacker-news-square`]
    
    @scala.inline
    def hackerrank: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hackerrank = "hackerrank".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hackerrank]
    
    @scala.inline
    def hamburger: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hamburger = "hamburger".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hamburger]
    
    @scala.inline
    def hammer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hammer = "hammer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hammer]
    
    @scala.inline
    def `hammer-war`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hammer-war` = "hammer-war".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hammer-war`]
    
    @scala.inline
    def hamsa: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hamsa = "hamsa".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hamsa]
    
    @scala.inline
    def `hand-heart`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-heart` = "hand-heart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-heart`]
    
    @scala.inline
    def `hand-holding`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding` = "hand-holding".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding`]
    
    @scala.inline
    def `hand-holding-box`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-box` = "hand-holding-box".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-box`]
    
    @scala.inline
    def `hand-holding-heart`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-heart` = "hand-holding-heart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-heart`]
    
    @scala.inline
    def `hand-holding-magic`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-magic` = "hand-holding-magic".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-magic`]
    
    @scala.inline
    def `hand-holding-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-medical` = "hand-holding-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-medical`]
    
    @scala.inline
    def `hand-holding-seedling`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-seedling` = "hand-holding-seedling".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-seedling`]
    
    @scala.inline
    def `hand-holding-usd`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-usd` = "hand-holding-usd".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-usd`]
    
    @scala.inline
    def `hand-holding-water`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-water` = "hand-holding-water".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-holding-water`]
    
    @scala.inline
    def `hand-lizard`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-lizard` = "hand-lizard".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-lizard`]
    
    @scala.inline
    def `hand-middle-finger`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-middle-finger` = "hand-middle-finger".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-middle-finger`]
    
    @scala.inline
    def `hand-paper`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-paper` = "hand-paper".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-paper`]
    
    @scala.inline
    def `hand-peace`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-peace` = "hand-peace".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-peace`]
    
    @scala.inline
    def `hand-point-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-point-down` = "hand-point-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-point-down`]
    
    @scala.inline
    def `hand-point-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-point-left` = "hand-point-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-point-left`]
    
    @scala.inline
    def `hand-point-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-point-right` = "hand-point-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-point-right`]
    
    @scala.inline
    def `hand-point-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-point-up` = "hand-point-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-point-up`]
    
    @scala.inline
    def `hand-pointer`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-pointer` = "hand-pointer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-pointer`]
    
    @scala.inline
    def `hand-receiving`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-receiving` = "hand-receiving".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-receiving`]
    
    @scala.inline
    def `hand-rock`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-rock` = "hand-rock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-rock`]
    
    @scala.inline
    def `hand-scissors`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-scissors` = "hand-scissors".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-scissors`]
    
    @scala.inline
    def `hand-sparkles`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-sparkles` = "hand-sparkles".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-sparkles`]
    
    @scala.inline
    def `hand-spock`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-spock` = "hand-spock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hand-spock`]
    
    @scala.inline
    def hands: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hands = "hands".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hands]
    
    @scala.inline
    def `hands-heart`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hands-heart` = "hands-heart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hands-heart`]
    
    @scala.inline
    def `hands-helping`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hands-helping` = "hands-helping".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hands-helping`]
    
    @scala.inline
    def `hands-usd`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hands-usd` = "hands-usd".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hands-usd`]
    
    @scala.inline
    def `hands-wash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hands-wash` = "hands-wash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hands-wash`]
    
    @scala.inline
    def handshake: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.handshake = "handshake".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.handshake]
    
    @scala.inline
    def `handshake-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`handshake-alt` = "handshake-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`handshake-alt`]
    
    @scala.inline
    def `handshake-alt-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`handshake-alt-slash` = "handshake-alt-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`handshake-alt-slash`]
    
    @scala.inline
    def `handshake-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`handshake-slash` = "handshake-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`handshake-slash`]
    
    @scala.inline
    def hanukiah: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hanukiah = "hanukiah".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hanukiah]
    
    @scala.inline
    def `hard-hat`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hard-hat` = "hard-hat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hard-hat`]
    
    @scala.inline
    def hashtag: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hashtag = "hashtag".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hashtag]
    
    @scala.inline
    def `hat-chef`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-chef` = "hat-chef".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-chef`]
    
    @scala.inline
    def `hat-cowboy`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-cowboy` = "hat-cowboy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-cowboy`]
    
    @scala.inline
    def `hat-cowboy-side`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-cowboy-side` = "hat-cowboy-side".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-cowboy-side`]
    
    @scala.inline
    def `hat-santa`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-santa` = "hat-santa".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-santa`]
    
    @scala.inline
    def `hat-winter`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-winter` = "hat-winter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-winter`]
    
    @scala.inline
    def `hat-witch`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-witch` = "hat-witch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-witch`]
    
    @scala.inline
    def `hat-wizard`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-wizard` = "hat-wizard".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hat-wizard`]
    
    @scala.inline
    def hdd: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hdd = "hdd".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hdd]
    
    @scala.inline
    def `head-side`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side` = "head-side".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side`]
    
    @scala.inline
    def `head-side-brain`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-brain` = "head-side-brain".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-brain`]
    
    @scala.inline
    def `head-side-cough`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-cough` = "head-side-cough".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-cough`]
    
    @scala.inline
    def `head-side-cough-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-cough-slash` = "head-side-cough-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-cough-slash`]
    
    @scala.inline
    def `head-side-headphones`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-headphones` = "head-side-headphones".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-headphones`]
    
    @scala.inline
    def `head-side-mask`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-mask` = "head-side-mask".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-mask`]
    
    @scala.inline
    def `head-side-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-medical` = "head-side-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-medical`]
    
    @scala.inline
    def `head-side-virus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-virus` = "head-side-virus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-side-virus`]
    
    @scala.inline
    def `head-vr`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-vr` = "head-vr".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`head-vr`]
    
    @scala.inline
    def heading: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.heading = "heading".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.heading]
    
    @scala.inline
    def headphones: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.headphones = "headphones".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.headphones]
    
    @scala.inline
    def `headphones-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`headphones-alt` = "headphones-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`headphones-alt`]
    
    @scala.inline
    def headset: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.headset = "headset".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.headset]
    
    @scala.inline
    def heart: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.heart = "heart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.heart]
    
    @scala.inline
    def `heart-broken`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`heart-broken` = "heart-broken".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`heart-broken`]
    
    @scala.inline
    def `heart-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`heart-circle` = "heart-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`heart-circle`]
    
    @scala.inline
    def `heart-rate`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`heart-rate` = "heart-rate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`heart-rate`]
    
    @scala.inline
    def `heart-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`heart-square` = "heart-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`heart-square`]
    
    @scala.inline
    def heartbeat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.heartbeat = "heartbeat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.heartbeat]
    
    @scala.inline
    def heat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.heat = "heat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.heat]
    
    @scala.inline
    def helicopter: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.helicopter = "helicopter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.helicopter]
    
    @scala.inline
    def `helmet-battle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`helmet-battle` = "helmet-battle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`helmet-battle`]
    
    @scala.inline
    def hexagon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hexagon = "hexagon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hexagon]
    
    @scala.inline
    def highlighter: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.highlighter = "highlighter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.highlighter]
    
    @scala.inline
    def hiking: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hiking = "hiking".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hiking]
    
    @scala.inline
    def hippo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hippo = "hippo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hippo]
    
    @scala.inline
    def hips: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hips = "hips".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hips]
    
    @scala.inline
    def `hire-a-helper`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hire-a-helper` = "hire-a-helper".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hire-a-helper`]
    
    @scala.inline
    def history: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.history = "history".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.history]
    
    @scala.inline
    def hive: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hive = "hive".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hive]
    
    @scala.inline
    def `hockey-mask`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hockey-mask` = "hockey-mask".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hockey-mask`]
    
    @scala.inline
    def `hockey-puck`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hockey-puck` = "hockey-puck".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hockey-puck`]
    
    @scala.inline
    def `hockey-sticks`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hockey-sticks` = "hockey-sticks".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hockey-sticks`]
    
    @scala.inline
    def `holly-berry`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`holly-berry` = "holly-berry".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`holly-berry`]
    
    @scala.inline
    def home: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.home = "home".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.home]
    
    @scala.inline
    def `home-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`home-alt` = "home-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`home-alt`]
    
    @scala.inline
    def `home-heart`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`home-heart` = "home-heart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`home-heart`]
    
    @scala.inline
    def `home-lg`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`home-lg` = "home-lg".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`home-lg`]
    
    @scala.inline
    def `home-lg-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`home-lg-alt` = "home-lg-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`home-lg-alt`]
    
    @scala.inline
    def `hood-cloak`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hood-cloak` = "hood-cloak".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hood-cloak`]
    
    @scala.inline
    def hooli: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hooli = "hooli".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hooli]
    
    @scala.inline
    def `horizontal-rule`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`horizontal-rule` = "horizontal-rule".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`horizontal-rule`]
    
    @scala.inline
    def hornbill: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hornbill = "hornbill".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hornbill]
    
    @scala.inline
    def horse: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.horse = "horse".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.horse]
    
    @scala.inline
    def `horse-head`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`horse-head` = "horse-head".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`horse-head`]
    
    @scala.inline
    def `horse-saddle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`horse-saddle` = "horse-saddle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`horse-saddle`]
    
    @scala.inline
    def hospital: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hospital = "hospital".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hospital]
    
    @scala.inline
    def `hospital-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hospital-alt` = "hospital-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hospital-alt`]
    
    @scala.inline
    def `hospital-symbol`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hospital-symbol` = "hospital-symbol".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hospital-symbol`]
    
    @scala.inline
    def `hospital-user`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hospital-user` = "hospital-user".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hospital-user`]
    
    @scala.inline
    def hospitals: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hospitals = "hospitals".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hospitals]
    
    @scala.inline
    def `hot-tub`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hot-tub` = "hot-tub".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hot-tub`]
    
    @scala.inline
    def hotdog: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hotdog = "hotdog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hotdog]
    
    @scala.inline
    def hotel: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hotel = "hotel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hotel]
    
    @scala.inline
    def hotjar: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hotjar = "hotjar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hotjar]
    
    @scala.inline
    def hourglass: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hourglass = "hourglass".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hourglass]
    
    @scala.inline
    def `hourglass-end`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hourglass-end` = "hourglass-end".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hourglass-end`]
    
    @scala.inline
    def `hourglass-half`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hourglass-half` = "hourglass-half".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hourglass-half`]
    
    @scala.inline
    def `hourglass-start`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hourglass-start` = "hourglass-start".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`hourglass-start`]
    
    @scala.inline
    def house: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.house = "house".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.house]
    
    @scala.inline
    def `house-damage`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-damage` = "house-damage".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-damage`]
    
    @scala.inline
    def `house-day`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-day` = "house-day".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-day`]
    
    @scala.inline
    def `house-flood`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-flood` = "house-flood".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-flood`]
    
    @scala.inline
    def `house-leave`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-leave` = "house-leave".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-leave`]
    
    @scala.inline
    def `house-night`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-night` = "house-night".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-night`]
    
    @scala.inline
    def `house-return`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-return` = "house-return".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-return`]
    
    @scala.inline
    def `house-signal`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-signal` = "house-signal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-signal`]
    
    @scala.inline
    def `house-user`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-user` = "house-user".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`house-user`]
    
    @scala.inline
    def houzz: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.houzz = "houzz".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.houzz]
    
    @scala.inline
    def hryvnia: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hryvnia = "hryvnia".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hryvnia]
    
    @scala.inline
    def html5: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.html5 = "html5".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.html5]
    
    @scala.inline
    def hubspot: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hubspot = "hubspot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hubspot]
    
    @scala.inline
    def humidity: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.humidity = "humidity".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.humidity]
    
    @scala.inline
    def hurricane: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hurricane = "hurricane".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.hurricane]
    
    @scala.inline
    def `i-cursor`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`i-cursor` = "i-cursor".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`i-cursor`]
    
    @scala.inline
    def `ice-cream`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ice-cream` = "ice-cream".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ice-cream`]
    
    @scala.inline
    def `ice-skate`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ice-skate` = "ice-skate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ice-skate`]
    
    @scala.inline
    def icicles: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.icicles = "icicles".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.icicles]
    
    @scala.inline
    def icons: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.icons = "icons".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.icons]
    
    @scala.inline
    def `icons-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`icons-alt` = "icons-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`icons-alt`]
    
    @scala.inline
    def `id-badge`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`id-badge` = "id-badge".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`id-badge`]
    
    @scala.inline
    def `id-card`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`id-card` = "id-card".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`id-card`]
    
    @scala.inline
    def `id-card-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`id-card-alt` = "id-card-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`id-card-alt`]
    
    @scala.inline
    def ideal: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ideal = "ideal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ideal]
    
    @scala.inline
    def igloo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.igloo = "igloo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.igloo]
    
    @scala.inline
    def image: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.image = "image".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.image]
    
    @scala.inline
    def `image-polaroid`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`image-polaroid` = "image-polaroid".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`image-polaroid`]
    
    @scala.inline
    def images: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.images = "images".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.images]
    
    @scala.inline
    def imdb: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.imdb = "imdb".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.imdb]
    
    @scala.inline
    def inbox: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.inbox = "inbox".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.inbox]
    
    @scala.inline
    def `inbox-in`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`inbox-in` = "inbox-in".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`inbox-in`]
    
    @scala.inline
    def `inbox-out`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`inbox-out` = "inbox-out".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`inbox-out`]
    
    @scala.inline
    def indent: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.indent = "indent".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.indent]
    
    @scala.inline
    def industry: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.industry = "industry".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.industry]
    
    @scala.inline
    def `industry-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`industry-alt` = "industry-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`industry-alt`]
    
    @scala.inline
    def infinity: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.infinity = "infinity".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.infinity]
    
    @scala.inline
    def info: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.info = "info".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.info]
    
    @scala.inline
    def `info-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`info-circle` = "info-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`info-circle`]
    
    @scala.inline
    def `info-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`info-square` = "info-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`info-square`]
    
    @scala.inline
    def inhaler: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.inhaler = "inhaler".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.inhaler]
    
    @scala.inline
    def innosoft: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.innosoft = "innosoft".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.innosoft]
    
    @scala.inline
    def instagram: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.instagram = "instagram".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.instagram]
    
    @scala.inline
    def `instagram-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`instagram-square` = "instagram-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`instagram-square`]
    
    @scala.inline
    def instalod: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.instalod = "instalod".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.instalod]
    
    @scala.inline
    def integral: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.integral = "integral".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.integral]
    
    @scala.inline
    def intercom: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.intercom = "intercom".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.intercom]
    
    @scala.inline
    def `internet-explorer`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`internet-explorer` = "internet-explorer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`internet-explorer`]
    
    @scala.inline
    def intersection: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.intersection = "intersection".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.intersection]
    
    @scala.inline
    def inventory: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.inventory = "inventory".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.inventory]
    
    @scala.inline
    def invision: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.invision = "invision".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.invision]
    
    @scala.inline
    def ioxhost: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ioxhost = "ioxhost".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ioxhost]
    
    @scala.inline
    def `island-tropical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`island-tropical` = "island-tropical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`island-tropical`]
    
    @scala.inline
    def italic: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.italic = "italic".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.italic]
    
    @scala.inline
    def `itch-io`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`itch-io` = "itch-io".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`itch-io`]
    
    @scala.inline
    def itunes: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.itunes = "itunes".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.itunes]
    
    @scala.inline
    def `itunes-note`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`itunes-note` = "itunes-note".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`itunes-note`]
    
    @scala.inline
    def `jack-o-lantern`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`jack-o-lantern` = "jack-o-lantern".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`jack-o-lantern`]
    
    @scala.inline
    def java_ : typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.java_ = "java".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.java_]
    
    @scala.inline
    def jedi: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jedi = "jedi".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jedi]
    
    @scala.inline
    def `jedi-order`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`jedi-order` = "jedi-order".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`jedi-order`]
    
    @scala.inline
    def jenkins: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jenkins = "jenkins".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jenkins]
    
    @scala.inline
    def jira: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jira = "jira".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jira]
    
    @scala.inline
    def joget: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.joget = "joget".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.joget]
    
    @scala.inline
    def joint: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.joint = "joint".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.joint]
    
    @scala.inline
    def joomla: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.joomla = "joomla".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.joomla]
    
    @scala.inline
    def `journal-whills`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`journal-whills` = "journal-whills".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`journal-whills`]
    
    @scala.inline
    def joystick: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.joystick = "joystick".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.joystick]
    
    @scala.inline
    def `js-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`js-square` = "js-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`js-square`]
    
    @scala.inline
    def js_ : typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.js_ = "js".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.js_]
    
    @scala.inline
    def jsfiddle: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jsfiddle = "jsfiddle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jsfiddle]
    
    @scala.inline
    def jug: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jug = "jug".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.jug]
    
    @scala.inline
    def kaaba: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kaaba = "kaaba".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kaaba]
    
    @scala.inline
    def kaggle: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kaggle = "kaggle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kaggle]
    
    @scala.inline
    def kazoo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kazoo = "kazoo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kazoo]
    
    @scala.inline
    def kerning: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kerning = "kerning".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kerning]
    
    @scala.inline
    def key: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.key = "key".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.key]
    
    @scala.inline
    def `key-skeleton`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`key-skeleton` = "key-skeleton".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`key-skeleton`]
    
    @scala.inline
    def keybase: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.keybase = "keybase".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.keybase]
    
    @scala.inline
    def keyboard: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.keyboard = "keyboard".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.keyboard]
    
    @scala.inline
    def keycdn: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.keycdn = "keycdn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.keycdn]
    
    @scala.inline
    def keynote: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.keynote = "keynote".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.keynote]
    
    @scala.inline
    def khanda: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.khanda = "khanda".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.khanda]
    
    @scala.inline
    def kickstarter: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kickstarter = "kickstarter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kickstarter]
    
    @scala.inline
    def `kickstarter-k`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`kickstarter-k` = "kickstarter-k".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`kickstarter-k`]
    
    @scala.inline
    def kidneys: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kidneys = "kidneys".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kidneys]
    
    @scala.inline
    def kiss: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kiss = "kiss".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kiss]
    
    @scala.inline
    def `kiss-beam`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`kiss-beam` = "kiss-beam".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`kiss-beam`]
    
    @scala.inline
    def `kiss-wink-heart`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`kiss-wink-heart` = "kiss-wink-heart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`kiss-wink-heart`]
    
    @scala.inline
    def kite: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kite = "kite".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.kite]
    
    @scala.inline
    def `kiwi-bird`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`kiwi-bird` = "kiwi-bird".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`kiwi-bird`]
    
    @scala.inline
    def `knife-kitchen`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`knife-kitchen` = "knife-kitchen".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`knife-kitchen`]
    
    @scala.inline
    def korvue: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.korvue = "korvue".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.korvue]
    
    @scala.inline
    def lambda: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lambda = "lambda".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lambda]
    
    @scala.inline
    def lamp: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lamp = "lamp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lamp]
    
    @scala.inline
    def `lamp-desk`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lamp-desk` = "lamp-desk".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lamp-desk`]
    
    @scala.inline
    def `lamp-floor`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lamp-floor` = "lamp-floor".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lamp-floor`]
    
    @scala.inline
    def landmark: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.landmark = "landmark".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.landmark]
    
    @scala.inline
    def `landmark-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`landmark-alt` = "landmark-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`landmark-alt`]
    
    @scala.inline
    def language: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.language = "language".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.language]
    
    @scala.inline
    def laptop: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.laptop = "laptop".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.laptop]
    
    @scala.inline
    def `laptop-code`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laptop-code` = "laptop-code".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laptop-code`]
    
    @scala.inline
    def `laptop-house`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laptop-house` = "laptop-house".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laptop-house`]
    
    @scala.inline
    def `laptop-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laptop-medical` = "laptop-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laptop-medical`]
    
    @scala.inline
    def laravel: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.laravel = "laravel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.laravel]
    
    @scala.inline
    def lasso: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lasso = "lasso".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lasso]
    
    @scala.inline
    def lastfm: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lastfm = "lastfm".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lastfm]
    
    @scala.inline
    def `lastfm-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lastfm-square` = "lastfm-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lastfm-square`]
    
    @scala.inline
    def laugh: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.laugh = "laugh".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.laugh]
    
    @scala.inline
    def `laugh-beam`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laugh-beam` = "laugh-beam".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laugh-beam`]
    
    @scala.inline
    def `laugh-squint`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laugh-squint` = "laugh-squint".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laugh-squint`]
    
    @scala.inline
    def `laugh-wink`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laugh-wink` = "laugh-wink".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`laugh-wink`]
    
    @scala.inline
    def `layer-group`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`layer-group` = "layer-group".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`layer-group`]
    
    @scala.inline
    def `layer-minus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`layer-minus` = "layer-minus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`layer-minus`]
    
    @scala.inline
    def `layer-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`layer-plus` = "layer-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`layer-plus`]
    
    @scala.inline
    def leaf: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.leaf = "leaf".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.leaf]
    
    @scala.inline
    def `leaf-heart`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`leaf-heart` = "leaf-heart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`leaf-heart`]
    
    @scala.inline
    def `leaf-maple`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`leaf-maple` = "leaf-maple".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`leaf-maple`]
    
    @scala.inline
    def `leaf-oak`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`leaf-oak` = "leaf-oak".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`leaf-oak`]
    
    @scala.inline
    def leanpub: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.leanpub = "leanpub".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.leanpub]
    
    @scala.inline
    def lemon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lemon = "lemon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lemon]
    
    @scala.inline
    def less: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.less = "less".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.less]
    
    @scala.inline
    def `less-than`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`less-than` = "less-than".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`less-than`]
    
    @scala.inline
    def `less-than-equal`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`less-than-equal` = "less-than-equal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`less-than-equal`]
    
    @scala.inline
    def `level-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`level-down` = "level-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`level-down`]
    
    @scala.inline
    def `level-down-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`level-down-alt` = "level-down-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`level-down-alt`]
    
    @scala.inline
    def `level-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`level-up` = "level-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`level-up`]
    
    @scala.inline
    def `level-up-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`level-up-alt` = "level-up-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`level-up-alt`]
    
    @scala.inline
    def `life-ring`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`life-ring` = "life-ring".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`life-ring`]
    
    @scala.inline
    def `light-ceiling`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`light-ceiling` = "light-ceiling".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`light-ceiling`]
    
    @scala.inline
    def `light-switch`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`light-switch` = "light-switch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`light-switch`]
    
    @scala.inline
    def `light-switch-off`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`light-switch-off` = "light-switch-off".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`light-switch-off`]
    
    @scala.inline
    def `light-switch-on`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`light-switch-on` = "light-switch-on".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`light-switch-on`]
    
    @scala.inline
    def lightbulb: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lightbulb = "lightbulb".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lightbulb]
    
    @scala.inline
    def `lightbulb-dollar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lightbulb-dollar` = "lightbulb-dollar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lightbulb-dollar`]
    
    @scala.inline
    def `lightbulb-exclamation`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lightbulb-exclamation` = "lightbulb-exclamation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lightbulb-exclamation`]
    
    @scala.inline
    def `lightbulb-on`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lightbulb-on` = "lightbulb-on".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lightbulb-on`]
    
    @scala.inline
    def `lightbulb-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lightbulb-slash` = "lightbulb-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lightbulb-slash`]
    
    @scala.inline
    def `lights-holiday`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lights-holiday` = "lights-holiday".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lights-holiday`]
    
    @scala.inline
    def line: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.line = "line".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.line]
    
    @scala.inline
    def `line-columns`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`line-columns` = "line-columns".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`line-columns`]
    
    @scala.inline
    def `line-height`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`line-height` = "line-height".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`line-height`]
    
    @scala.inline
    def link: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.link = "link".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.link]
    
    @scala.inline
    def linkedin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.linkedin = "linkedin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.linkedin]
    
    @scala.inline
    def `linkedin-in`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`linkedin-in` = "linkedin-in".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`linkedin-in`]
    
    @scala.inline
    def linode: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.linode = "linode".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.linode]
    
    @scala.inline
    def linux: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.linux = "linux".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.linux]
    
    @scala.inline
    def lips: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lips = "lips".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lips]
    
    @scala.inline
    def `lira-sign`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lira-sign` = "lira-sign".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lira-sign`]
    
    @scala.inline
    def list: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.list = "list".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.list]
    
    @scala.inline
    def `list-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`list-alt` = "list-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`list-alt`]
    
    @scala.inline
    def `list-music`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`list-music` = "list-music".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`list-music`]
    
    @scala.inline
    def `list-ol`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`list-ol` = "list-ol".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`list-ol`]
    
    @scala.inline
    def `list-ul`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`list-ul` = "list-ul".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`list-ul`]
    
    @scala.inline
    def location: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.location = "location".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.location]
    
    @scala.inline
    def `location-arrow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`location-arrow` = "location-arrow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`location-arrow`]
    
    @scala.inline
    def `location-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`location-circle` = "location-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`location-circle`]
    
    @scala.inline
    def `location-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`location-slash` = "location-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`location-slash`]
    
    @scala.inline
    def lock: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lock = "lock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lock]
    
    @scala.inline
    def `lock-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lock-alt` = "lock-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lock-alt`]
    
    @scala.inline
    def `lock-open`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lock-open` = "lock-open".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lock-open`]
    
    @scala.inline
    def `lock-open-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lock-open-alt` = "lock-open-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lock-open-alt`]
    
    @scala.inline
    def `long-arrow-alt-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-alt-down` = "long-arrow-alt-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-alt-down`]
    
    @scala.inline
    def `long-arrow-alt-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-alt-left` = "long-arrow-alt-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-alt-left`]
    
    @scala.inline
    def `long-arrow-alt-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-alt-right` = "long-arrow-alt-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-alt-right`]
    
    @scala.inline
    def `long-arrow-alt-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-alt-up` = "long-arrow-alt-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-alt-up`]
    
    @scala.inline
    def `long-arrow-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-down` = "long-arrow-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-down`]
    
    @scala.inline
    def `long-arrow-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-left` = "long-arrow-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-left`]
    
    @scala.inline
    def `long-arrow-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-right` = "long-arrow-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-right`]
    
    @scala.inline
    def `long-arrow-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-up` = "long-arrow-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`long-arrow-up`]
    
    @scala.inline
    def loveseat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.loveseat = "loveseat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.loveseat]
    
    @scala.inline
    def `low-vision`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`low-vision` = "low-vision".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`low-vision`]
    
    @scala.inline
    def luchador: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.luchador = "luchador".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.luchador]
    
    @scala.inline
    def `luggage-cart`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`luggage-cart` = "luggage-cart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`luggage-cart`]
    
    @scala.inline
    def lungs: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lungs = "lungs".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lungs]
    
    @scala.inline
    def `lungs-virus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lungs-virus` = "lungs-virus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`lungs-virus`]
    
    @scala.inline
    def lyft: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lyft = "lyft".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.lyft]
    
    @scala.inline
    def mace: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mace = "mace".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mace]
    
    @scala.inline
    def magento: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.magento = "magento".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.magento]
    
    @scala.inline
    def magic: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.magic = "magic".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.magic]
    
    @scala.inline
    def magnet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.magnet = "magnet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.magnet]
    
    @scala.inline
    def `mail-bulk`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mail-bulk` = "mail-bulk".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mail-bulk`]
    
    @scala.inline
    def mailbox: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mailbox = "mailbox".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mailbox]
    
    @scala.inline
    def mailchimp: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mailchimp = "mailchimp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mailchimp]
    
    @scala.inline
    def male: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.male = "male".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.male]
    
    @scala.inline
    def mandalorian: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mandalorian = "mandalorian".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mandalorian]
    
    @scala.inline
    def mandolin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mandolin = "mandolin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mandolin]
    
    @scala.inline
    def map: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.map = "map".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.map]
    
    @scala.inline
    def `map-marked`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marked` = "map-marked".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marked`]
    
    @scala.inline
    def `map-marked-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marked-alt` = "map-marked-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marked-alt`]
    
    @scala.inline
    def `map-marker`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker` = "map-marker".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker`]
    
    @scala.inline
    def `map-marker-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-alt` = "map-marker-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-alt`]
    
    @scala.inline
    def `map-marker-alt-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-alt-slash` = "map-marker-alt-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-alt-slash`]
    
    @scala.inline
    def `map-marker-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-check` = "map-marker-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-check`]
    
    @scala.inline
    def `map-marker-edit`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-edit` = "map-marker-edit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-edit`]
    
    @scala.inline
    def `map-marker-exclamation`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-exclamation` = "map-marker-exclamation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-exclamation`]
    
    @scala.inline
    def `map-marker-minus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-minus` = "map-marker-minus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-minus`]
    
    @scala.inline
    def `map-marker-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-plus` = "map-marker-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-plus`]
    
    @scala.inline
    def `map-marker-question`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-question` = "map-marker-question".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-question`]
    
    @scala.inline
    def `map-marker-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-slash` = "map-marker-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-slash`]
    
    @scala.inline
    def `map-marker-smile`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-smile` = "map-marker-smile".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-smile`]
    
    @scala.inline
    def `map-marker-times`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-times` = "map-marker-times".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-marker-times`]
    
    @scala.inline
    def `map-pin`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-pin` = "map-pin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-pin`]
    
    @scala.inline
    def `map-signs`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-signs` = "map-signs".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`map-signs`]
    
    @scala.inline
    def markdown: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.markdown = "markdown".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.markdown]
    
    @scala.inline
    def marker: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.marker = "marker".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.marker]
    
    @scala.inline
    def mars: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mars = "mars".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mars]
    
    @scala.inline
    def `mars-double`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mars-double` = "mars-double".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mars-double`]
    
    @scala.inline
    def `mars-stroke`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mars-stroke` = "mars-stroke".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mars-stroke`]
    
    @scala.inline
    def `mars-stroke-h`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mars-stroke-h` = "mars-stroke-h".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mars-stroke-h`]
    
    @scala.inline
    def `mars-stroke-v`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mars-stroke-v` = "mars-stroke-v".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mars-stroke-v`]
    
    @scala.inline
    def mask: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mask = "mask".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mask]
    
    @scala.inline
    def mastodon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mastodon = "mastodon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mastodon]
    
    @scala.inline
    def maxcdn: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.maxcdn = "maxcdn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.maxcdn]
    
    @scala.inline
    def mdb: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mdb = "mdb".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mdb]
    
    @scala.inline
    def meat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.meat = "meat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.meat]
    
    @scala.inline
    def medal: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medal = "medal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medal]
    
    @scala.inline
    def medapps: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medapps = "medapps".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medapps]
    
    @scala.inline
    def medium: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medium = "medium".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medium]
    
    @scala.inline
    def `medium-m`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`medium-m` = "medium-m".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`medium-m`]
    
    @scala.inline
    def medkit: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medkit = "medkit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medkit]
    
    @scala.inline
    def medrt: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medrt = "medrt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.medrt]
    
    @scala.inline
    def meetup: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.meetup = "meetup".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.meetup]
    
    @scala.inline
    def megaphone: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.megaphone = "megaphone".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.megaphone]
    
    @scala.inline
    def megaport: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.megaport = "megaport".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.megaport]
    
    @scala.inline
    def meh: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.meh = "meh".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.meh]
    
    @scala.inline
    def `meh-blank`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`meh-blank` = "meh-blank".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`meh-blank`]
    
    @scala.inline
    def `meh-rolling-eyes`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`meh-rolling-eyes` = "meh-rolling-eyes".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`meh-rolling-eyes`]
    
    @scala.inline
    def memory: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.memory = "memory".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.memory]
    
    @scala.inline
    def mendeley: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mendeley = "mendeley".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mendeley]
    
    @scala.inline
    def menorah: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.menorah = "menorah".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.menorah]
    
    @scala.inline
    def mercury: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mercury = "mercury".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mercury]
    
    @scala.inline
    def meteor: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.meteor = "meteor".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.meteor]
    
    @scala.inline
    def microblog: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microblog = "microblog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microblog]
    
    @scala.inline
    def microchip: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microchip = "microchip".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microchip]
    
    @scala.inline
    def microphone: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microphone = "microphone".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microphone]
    
    @scala.inline
    def `microphone-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`microphone-alt` = "microphone-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`microphone-alt`]
    
    @scala.inline
    def `microphone-alt-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`microphone-alt-slash` = "microphone-alt-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`microphone-alt-slash`]
    
    @scala.inline
    def `microphone-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`microphone-slash` = "microphone-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`microphone-slash`]
    
    @scala.inline
    def `microphone-stand`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`microphone-stand` = "microphone-stand".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`microphone-stand`]
    
    @scala.inline
    def microscope: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microscope = "microscope".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microscope]
    
    @scala.inline
    def microsoft: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microsoft = "microsoft".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microsoft]
    
    @scala.inline
    def microwave: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microwave = "microwave".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.microwave]
    
    @scala.inline
    def `mind-share`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mind-share` = "mind-share".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mind-share`]
    
    @scala.inline
    def minus: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.minus = "minus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.minus]
    
    @scala.inline
    def `minus-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`minus-circle` = "minus-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`minus-circle`]
    
    @scala.inline
    def `minus-hexagon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`minus-hexagon` = "minus-hexagon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`minus-hexagon`]
    
    @scala.inline
    def `minus-octagon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`minus-octagon` = "minus-octagon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`minus-octagon`]
    
    @scala.inline
    def `minus-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`minus-square` = "minus-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`minus-square`]
    
    @scala.inline
    def mistletoe: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mistletoe = "mistletoe".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mistletoe]
    
    @scala.inline
    def mitten: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mitten = "mitten".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mitten]
    
    @scala.inline
    def mix: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mix = "mix".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mix]
    
    @scala.inline
    def mixcloud: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mixcloud = "mixcloud".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mixcloud]
    
    @scala.inline
    def mixer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mixer = "mixer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mixer]
    
    @scala.inline
    def mizuni: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mizuni = "mizuni".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mizuni]
    
    @scala.inline
    def mobile: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mobile = "mobile".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mobile]
    
    @scala.inline
    def `mobile-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mobile-alt` = "mobile-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mobile-alt`]
    
    @scala.inline
    def `mobile-android`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mobile-android` = "mobile-android".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mobile-android`]
    
    @scala.inline
    def `mobile-android-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mobile-android-alt` = "mobile-android-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mobile-android-alt`]
    
    @scala.inline
    def modx: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.modx = "modx".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.modx]
    
    @scala.inline
    def monero: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.monero = "monero".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.monero]
    
    @scala.inline
    def `money-bill`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-bill` = "money-bill".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-bill`]
    
    @scala.inline
    def `money-bill-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-bill-alt` = "money-bill-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-bill-alt`]
    
    @scala.inline
    def `money-bill-wave`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-bill-wave` = "money-bill-wave".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-bill-wave`]
    
    @scala.inline
    def `money-bill-wave-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-bill-wave-alt` = "money-bill-wave-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-bill-wave-alt`]
    
    @scala.inline
    def `money-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-check` = "money-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-check`]
    
    @scala.inline
    def `money-check-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-check-alt` = "money-check-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-check-alt`]
    
    @scala.inline
    def `money-check-edit`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-check-edit` = "money-check-edit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-check-edit`]
    
    @scala.inline
    def `money-check-edit-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-check-edit-alt` = "money-check-edit-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`money-check-edit-alt`]
    
    @scala.inline
    def `monitor-heart-rate`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`monitor-heart-rate` = "monitor-heart-rate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`monitor-heart-rate`]
    
    @scala.inline
    def monkey: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.monkey = "monkey".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.monkey]
    
    @scala.inline
    def monument: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.monument = "monument".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.monument]
    
    @scala.inline
    def moon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.moon = "moon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.moon]
    
    @scala.inline
    def `moon-cloud`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`moon-cloud` = "moon-cloud".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`moon-cloud`]
    
    @scala.inline
    def `moon-stars`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`moon-stars` = "moon-stars".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`moon-stars`]
    
    @scala.inline
    def `mortar-pestle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mortar-pestle` = "mortar-pestle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mortar-pestle`]
    
    @scala.inline
    def mosque: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mosque = "mosque".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mosque]
    
    @scala.inline
    def motorcycle: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.motorcycle = "motorcycle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.motorcycle]
    
    @scala.inline
    def mountain: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mountain = "mountain".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mountain]
    
    @scala.inline
    def mountains: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mountains = "mountains".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mountains]
    
    @scala.inline
    def mouse: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mouse = "mouse".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mouse]
    
    @scala.inline
    def `mouse-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mouse-alt` = "mouse-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mouse-alt`]
    
    @scala.inline
    def `mouse-pointer`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mouse-pointer` = "mouse-pointer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mouse-pointer`]
    
    @scala.inline
    def `mp3-player`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mp3-player` = "mp3-player".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mp3-player`]
    
    @scala.inline
    def mug: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mug = "mug".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.mug]
    
    @scala.inline
    def `mug-hot`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mug-hot` = "mug-hot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mug-hot`]
    
    @scala.inline
    def `mug-marshmallows`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mug-marshmallows` = "mug-marshmallows".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mug-marshmallows`]
    
    @scala.inline
    def `mug-tea`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mug-tea` = "mug-tea".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`mug-tea`]
    
    @scala.inline
    def music: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.music = "music".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.music]
    
    @scala.inline
    def `music-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`music-alt` = "music-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`music-alt`]
    
    @scala.inline
    def `music-alt-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`music-alt-slash` = "music-alt-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`music-alt-slash`]
    
    @scala.inline
    def `music-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`music-slash` = "music-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`music-slash`]
    
    @scala.inline
    def napster: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.napster = "napster".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.napster]
    
    @scala.inline
    def narwhal: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.narwhal = "narwhal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.narwhal]
    
    @scala.inline
    def neos: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.neos = "neos".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.neos]
    
    @scala.inline
    def `network-wired`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`network-wired` = "network-wired".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`network-wired`]
    
    @scala.inline
    def neuter: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.neuter = "neuter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.neuter]
    
    @scala.inline
    def newspaper: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.newspaper = "newspaper".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.newspaper]
    
    @scala.inline
    def nimblr: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.nimblr = "nimblr".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.nimblr]
    
    @scala.inline
    def node: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.node = "node".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.node]
    
    @scala.inline
    def `node-js`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`node-js` = "node-js".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`node-js`]
    
    @scala.inline
    def `not-equal`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`not-equal` = "not-equal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`not-equal`]
    
    @scala.inline
    def `notes-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`notes-medical` = "notes-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`notes-medical`]
    
    @scala.inline
    def npm: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.npm = "npm".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.npm]
    
    @scala.inline
    def ns8: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ns8 = "ns8".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ns8]
    
    @scala.inline
    def nutritionix: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.nutritionix = "nutritionix".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.nutritionix]
    
    @scala.inline
    def `object-group`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`object-group` = "object-group".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`object-group`]
    
    @scala.inline
    def `object-ungroup`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`object-ungroup` = "object-ungroup".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`object-ungroup`]
    
    @scala.inline
    def octagon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.octagon = "octagon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.octagon]
    
    @scala.inline
    def `octopus-deploy`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`octopus-deploy` = "octopus-deploy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`octopus-deploy`]
    
    @scala.inline
    def odnoklassniki: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.odnoklassniki = "odnoklassniki".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.odnoklassniki]
    
    @scala.inline
    def `odnoklassniki-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`odnoklassniki-square` = "odnoklassniki-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`odnoklassniki-square`]
    
    @scala.inline
    def `oil-can`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`oil-can` = "oil-can".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`oil-can`]
    
    @scala.inline
    def `oil-temp`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`oil-temp` = "oil-temp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`oil-temp`]
    
    @scala.inline
    def `old-republic`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`old-republic` = "old-republic".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`old-republic`]
    
    @scala.inline
    def om: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.om = "om".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.om]
    
    @scala.inline
    def omega: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.omega = "omega".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.omega]
    
    @scala.inline
    def opencart: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.opencart = "opencart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.opencart]
    
    @scala.inline
    def openid: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.openid = "openid".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.openid]
    
    @scala.inline
    def opera: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.opera = "opera".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.opera]
    
    @scala.inline
    def `optin-monster`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`optin-monster` = "optin-monster".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`optin-monster`]
    
    @scala.inline
    def orcid: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.orcid = "orcid".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.orcid]
    
    @scala.inline
    def ornament: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ornament = "ornament".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ornament]
    
    @scala.inline
    def osi: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.osi = "osi".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.osi]
    
    @scala.inline
    def otter: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.otter = "otter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.otter]
    
    @scala.inline
    def outdent: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.outdent = "outdent".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.outdent]
    
    @scala.inline
    def outlet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.outlet = "outlet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.outlet]
    
    @scala.inline
    def oven: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.oven = "oven".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.oven]
    
    @scala.inline
    def overline: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.overline = "overline".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.overline]
    
    @scala.inline
    def `page-break`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`page-break` = "page-break".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`page-break`]
    
    @scala.inline
    def page4: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.page4 = "page4".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.page4]
    
    @scala.inline
    def pagelines: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pagelines = "pagelines".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pagelines]
    
    @scala.inline
    def pager: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pager = "pager".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pager]
    
    @scala.inline
    def `paint-brush`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paint-brush` = "paint-brush".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paint-brush`]
    
    @scala.inline
    def `paint-brush-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paint-brush-alt` = "paint-brush-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paint-brush-alt`]
    
    @scala.inline
    def `paint-roller`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paint-roller` = "paint-roller".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paint-roller`]
    
    @scala.inline
    def palette: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.palette = "palette".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.palette]
    
    @scala.inline
    def palfed: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.palfed = "palfed".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.palfed]
    
    @scala.inline
    def pallet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pallet = "pallet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pallet]
    
    @scala.inline
    def `pallet-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pallet-alt` = "pallet-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pallet-alt`]
    
    @scala.inline
    def `paper-plane`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paper-plane` = "paper-plane".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paper-plane`]
    
    @scala.inline
    def paperclip: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paperclip = "paperclip".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paperclip]
    
    @scala.inline
    def `parachute-box`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`parachute-box` = "parachute-box".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`parachute-box`]
    
    @scala.inline
    def paragraph: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paragraph = "paragraph".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paragraph]
    
    @scala.inline
    def `paragraph-rtl`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paragraph-rtl` = "paragraph-rtl".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paragraph-rtl`]
    
    @scala.inline
    def parking: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.parking = "parking".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.parking]
    
    @scala.inline
    def `parking-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`parking-circle` = "parking-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`parking-circle`]
    
    @scala.inline
    def `parking-circle-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`parking-circle-slash` = "parking-circle-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`parking-circle-slash`]
    
    @scala.inline
    def `parking-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`parking-slash` = "parking-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`parking-slash`]
    
    @scala.inline
    def passport: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.passport = "passport".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.passport]
    
    @scala.inline
    def pastafarianism: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pastafarianism = "pastafarianism".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pastafarianism]
    
    @scala.inline
    def paste: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paste = "paste".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paste]
    
    @scala.inline
    def patreon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.patreon = "patreon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.patreon]
    
    @scala.inline
    def pause: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pause = "pause".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pause]
    
    @scala.inline
    def `pause-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pause-circle` = "pause-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pause-circle`]
    
    @scala.inline
    def paw: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paw = "paw".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paw]
    
    @scala.inline
    def `paw-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paw-alt` = "paw-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paw-alt`]
    
    @scala.inline
    def `paw-claws`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paw-claws` = "paw-claws".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`paw-claws`]
    
    @scala.inline
    def paypal: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paypal = "paypal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.paypal]
    
    @scala.inline
    def peace: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.peace = "peace".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.peace]
    
    @scala.inline
    def pegasus: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pegasus = "pegasus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pegasus]
    
    @scala.inline
    def pen: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pen = "pen".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pen]
    
    @scala.inline
    def `pen-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pen-alt` = "pen-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pen-alt`]
    
    @scala.inline
    def `pen-fancy`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pen-fancy` = "pen-fancy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pen-fancy`]
    
    @scala.inline
    def `pen-nib`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pen-nib` = "pen-nib".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pen-nib`]
    
    @scala.inline
    def `pen-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pen-square` = "pen-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pen-square`]
    
    @scala.inline
    def pencil: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pencil = "pencil".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pencil]
    
    @scala.inline
    def `pencil-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pencil-alt` = "pencil-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pencil-alt`]
    
    @scala.inline
    def `pencil-paintbrush`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pencil-paintbrush` = "pencil-paintbrush".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pencil-paintbrush`]
    
    @scala.inline
    def `pencil-ruler`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pencil-ruler` = "pencil-ruler".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pencil-ruler`]
    
    @scala.inline
    def pennant: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pennant = "pennant".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pennant]
    
    @scala.inline
    def `penny-arcade`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`penny-arcade` = "penny-arcade".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`penny-arcade`]
    
    @scala.inline
    def `people-arrows`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`people-arrows` = "people-arrows".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`people-arrows`]
    
    @scala.inline
    def `people-carry`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`people-carry` = "people-carry".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`people-carry`]
    
    @scala.inline
    def `pepper-hot`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pepper-hot` = "pepper-hot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pepper-hot`]
    
    @scala.inline
    def perbyte: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.perbyte = "perbyte".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.perbyte]
    
    @scala.inline
    def percent: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.percent = "percent".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.percent]
    
    @scala.inline
    def percentage: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.percentage = "percentage".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.percentage]
    
    @scala.inline
    def periscope: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.periscope = "periscope".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.periscope]
    
    @scala.inline
    def `person-booth`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-booth` = "person-booth".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-booth`]
    
    @scala.inline
    def `person-carry`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-carry` = "person-carry".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-carry`]
    
    @scala.inline
    def `person-dolly`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-dolly` = "person-dolly".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-dolly`]
    
    @scala.inline
    def `person-dolly-empty`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-dolly-empty` = "person-dolly-empty".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-dolly-empty`]
    
    @scala.inline
    def `person-sign`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-sign` = "person-sign".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`person-sign`]
    
    @scala.inline
    def phabricator: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.phabricator = "phabricator".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.phabricator]
    
    @scala.inline
    def `phoenix-framework`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phoenix-framework` = "phoenix-framework".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phoenix-framework`]
    
    @scala.inline
    def `phoenix-squadron`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phoenix-squadron` = "phoenix-squadron".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phoenix-squadron`]
    
    @scala.inline
    def phone: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.phone = "phone".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.phone]
    
    @scala.inline
    def `phone-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-alt` = "phone-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-alt`]
    
    @scala.inline
    def `phone-laptop`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-laptop` = "phone-laptop".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-laptop`]
    
    @scala.inline
    def `phone-office`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-office` = "phone-office".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-office`]
    
    @scala.inline
    def `phone-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-plus` = "phone-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-plus`]
    
    @scala.inline
    def `phone-rotary`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-rotary` = "phone-rotary".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-rotary`]
    
    @scala.inline
    def `phone-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-slash` = "phone-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-slash`]
    
    @scala.inline
    def `phone-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-square` = "phone-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-square`]
    
    @scala.inline
    def `phone-square-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-square-alt` = "phone-square-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-square-alt`]
    
    @scala.inline
    def `phone-volume`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-volume` = "phone-volume".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`phone-volume`]
    
    @scala.inline
    def `photo-video`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`photo-video` = "photo-video".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`photo-video`]
    
    @scala.inline
    def php: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.php = "php".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.php]
    
    @scala.inline
    def pi: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pi = "pi".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pi]
    
    @scala.inline
    def piano: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.piano = "piano".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.piano]
    
    @scala.inline
    def `piano-keyboard`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`piano-keyboard` = "piano-keyboard".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`piano-keyboard`]
    
    @scala.inline
    def pie: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pie = "pie".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pie]
    
    @scala.inline
    def `pied-piper`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper` = "pied-piper".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper`]
    
    @scala.inline
    def `pied-piper-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper-alt` = "pied-piper-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper-alt`]
    
    @scala.inline
    def `pied-piper-hat`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper-hat` = "pied-piper-hat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper-hat`]
    
    @scala.inline
    def `pied-piper-pp`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper-pp` = "pied-piper-pp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper-pp`]
    
    @scala.inline
    def `pied-piper-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper-square` = "pied-piper-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pied-piper-square`]
    
    @scala.inline
    def pig: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pig = "pig".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pig]
    
    @scala.inline
    def `piggy-bank`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`piggy-bank` = "piggy-bank".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`piggy-bank`]
    
    @scala.inline
    def pills: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pills = "pills".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pills]
    
    @scala.inline
    def pinterest: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pinterest = "pinterest".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pinterest]
    
    @scala.inline
    def `pinterest-p`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pinterest-p` = "pinterest-p".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pinterest-p`]
    
    @scala.inline
    def `pinterest-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pinterest-square` = "pinterest-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pinterest-square`]
    
    @scala.inline
    def pizza: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pizza = "pizza".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pizza]
    
    @scala.inline
    def `pizza-slice`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pizza-slice` = "pizza-slice".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pizza-slice`]
    
    @scala.inline
    def `place-of-worship`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`place-of-worship` = "place-of-worship".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`place-of-worship`]
    
    @scala.inline
    def plane: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.plane = "plane".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.plane]
    
    @scala.inline
    def `plane-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plane-alt` = "plane-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plane-alt`]
    
    @scala.inline
    def `plane-arrival`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plane-arrival` = "plane-arrival".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plane-arrival`]
    
    @scala.inline
    def `plane-departure`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plane-departure` = "plane-departure".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plane-departure`]
    
    @scala.inline
    def `plane-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plane-slash` = "plane-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plane-slash`]
    
    @scala.inline
    def `planet-moon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`planet-moon` = "planet-moon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`planet-moon`]
    
    @scala.inline
    def `planet-ringed`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`planet-ringed` = "planet-ringed".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`planet-ringed`]
    
    @scala.inline
    def play: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.play = "play".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.play]
    
    @scala.inline
    def `play-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`play-circle` = "play-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`play-circle`]
    
    @scala.inline
    def playstation: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.playstation = "playstation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.playstation]
    
    @scala.inline
    def plug: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.plug = "plug".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.plug]
    
    @scala.inline
    def plus: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.plus = "plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.plus]
    
    @scala.inline
    def `plus-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plus-circle` = "plus-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plus-circle`]
    
    @scala.inline
    def `plus-hexagon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plus-hexagon` = "plus-hexagon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plus-hexagon`]
    
    @scala.inline
    def `plus-octagon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plus-octagon` = "plus-octagon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plus-octagon`]
    
    @scala.inline
    def `plus-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plus-square` = "plus-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`plus-square`]
    
    @scala.inline
    def podcast: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.podcast = "podcast".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.podcast]
    
    @scala.inline
    def podium: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.podium = "podium".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.podium]
    
    @scala.inline
    def `podium-star`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`podium-star` = "podium-star".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`podium-star`]
    
    @scala.inline
    def `police-box`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`police-box` = "police-box".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`police-box`]
    
    @scala.inline
    def poll: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.poll = "poll".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.poll]
    
    @scala.inline
    def `poll-h`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`poll-h` = "poll-h".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`poll-h`]
    
    @scala.inline
    def `poll-people`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`poll-people` = "poll-people".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`poll-people`]
    
    @scala.inline
    def poo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.poo = "poo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.poo]
    
    @scala.inline
    def `poo-storm`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`poo-storm` = "poo-storm".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`poo-storm`]
    
    @scala.inline
    def poop: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.poop = "poop".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.poop]
    
    @scala.inline
    def popcorn: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.popcorn = "popcorn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.popcorn]
    
    @scala.inline
    def `portal-enter`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`portal-enter` = "portal-enter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`portal-enter`]
    
    @scala.inline
    def `portal-exit`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`portal-exit` = "portal-exit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`portal-exit`]
    
    @scala.inline
    def portrait: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.portrait = "portrait".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.portrait]
    
    @scala.inline
    def `pound-sign`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pound-sign` = "pound-sign".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pound-sign`]
    
    @scala.inline
    def `power-off`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`power-off` = "power-off".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`power-off`]
    
    @scala.inline
    def pray: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pray = "pray".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pray]
    
    @scala.inline
    def `praying-hands`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`praying-hands` = "praying-hands".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`praying-hands`]
    
    @scala.inline
    def prescription: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.prescription = "prescription".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.prescription]
    
    @scala.inline
    def `prescription-bottle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`prescription-bottle` = "prescription-bottle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`prescription-bottle`]
    
    @scala.inline
    def `prescription-bottle-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`prescription-bottle-alt` = "prescription-bottle-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`prescription-bottle-alt`]
    
    @scala.inline
    def presentation: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.presentation = "presentation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.presentation]
    
    @scala.inline
    def print: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.print = "print".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.print]
    
    @scala.inline
    def `print-search`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`print-search` = "print-search".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`print-search`]
    
    @scala.inline
    def `print-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`print-slash` = "print-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`print-slash`]
    
    @scala.inline
    def procedures: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.procedures = "procedures".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.procedures]
    
    @scala.inline
    def `product-hunt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`product-hunt` = "product-hunt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`product-hunt`]
    
    @scala.inline
    def `project-diagram`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`project-diagram` = "project-diagram".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`project-diagram`]
    
    @scala.inline
    def projector: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.projector = "projector".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.projector]
    
    @scala.inline
    def `pump-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pump-medical` = "pump-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pump-medical`]
    
    @scala.inline
    def `pump-soap`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pump-soap` = "pump-soap".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`pump-soap`]
    
    @scala.inline
    def pumpkin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pumpkin = "pumpkin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pumpkin]
    
    @scala.inline
    def pushed: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pushed = "pushed".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.pushed]
    
    @scala.inline
    def `puzzle-piece`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`puzzle-piece` = "puzzle-piece".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`puzzle-piece`]
    
    @scala.inline
    def python: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.python = "python".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.python]
    
    @scala.inline
    def qq: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.qq = "qq".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.qq]
    
    @scala.inline
    def qrcode: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.qrcode = "qrcode".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.qrcode]
    
    @scala.inline
    def question: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.question = "question".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.question]
    
    @scala.inline
    def `question-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`question-circle` = "question-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`question-circle`]
    
    @scala.inline
    def `question-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`question-square` = "question-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`question-square`]
    
    @scala.inline
    def quidditch: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.quidditch = "quidditch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.quidditch]
    
    @scala.inline
    def quinscape: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.quinscape = "quinscape".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.quinscape]
    
    @scala.inline
    def quora: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.quora = "quora".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.quora]
    
    @scala.inline
    def `quote-left`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`quote-left` = "quote-left".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`quote-left`]
    
    @scala.inline
    def `quote-right`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`quote-right` = "quote-right".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`quote-right`]
    
    @scala.inline
    def quran: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.quran = "quran".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.quran]
    
    @scala.inline
    def `r-project`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`r-project` = "r-project".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`r-project`]
    
    @scala.inline
    def rabbit: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rabbit = "rabbit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rabbit]
    
    @scala.inline
    def `rabbit-fast`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rabbit-fast` = "rabbit-fast".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rabbit-fast`]
    
    @scala.inline
    def racquet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.racquet = "racquet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.racquet]
    
    @scala.inline
    def radar: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.radar = "radar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.radar]
    
    @scala.inline
    def radiation: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.radiation = "radiation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.radiation]
    
    @scala.inline
    def `radiation-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`radiation-alt` = "radiation-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`radiation-alt`]
    
    @scala.inline
    def radio: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.radio = "radio".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.radio]
    
    @scala.inline
    def `radio-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`radio-alt` = "radio-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`radio-alt`]
    
    @scala.inline
    def rainbow: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rainbow = "rainbow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rainbow]
    
    @scala.inline
    def raindrops: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.raindrops = "raindrops".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.raindrops]
    
    @scala.inline
    def ram: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ram = "ram".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ram]
    
    @scala.inline
    def `ramp-loading`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ramp-loading` = "ramp-loading".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ramp-loading`]
    
    @scala.inline
    def random: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.random = "random".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.random]
    
    @scala.inline
    def `raspberry-pi`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`raspberry-pi` = "raspberry-pi".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`raspberry-pi`]
    
    @scala.inline
    def ravelry: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ravelry = "ravelry".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ravelry]
    
    @scala.inline
    def raygun: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.raygun = "raygun".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.raygun]
    
    @scala.inline
    def react: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.react = "react".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.react]
    
    @scala.inline
    def reacteurope: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.reacteurope = "reacteurope".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.reacteurope]
    
    @scala.inline
    def readme: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.readme = "readme".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.readme]
    
    @scala.inline
    def rebel: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rebel = "rebel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rebel]
    
    @scala.inline
    def receipt: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.receipt = "receipt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.receipt]
    
    @scala.inline
    def `record-vinyl`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`record-vinyl` = "record-vinyl".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`record-vinyl`]
    
    @scala.inline
    def `rectangle-landscape`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rectangle-landscape` = "rectangle-landscape".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rectangle-landscape`]
    
    @scala.inline
    def `rectangle-portrait`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rectangle-portrait` = "rectangle-portrait".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rectangle-portrait`]
    
    @scala.inline
    def `rectangle-wide`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rectangle-wide` = "rectangle-wide".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rectangle-wide`]
    
    @scala.inline
    def recycle: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.recycle = "recycle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.recycle]
    
    @scala.inline
    def `red-river`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`red-river` = "red-river".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`red-river`]
    
    @scala.inline
    def reddit: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.reddit = "reddit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.reddit]
    
    @scala.inline
    def `reddit-alien`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`reddit-alien` = "reddit-alien".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`reddit-alien`]
    
    @scala.inline
    def `reddit-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`reddit-square` = "reddit-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`reddit-square`]
    
    @scala.inline
    def redhat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.redhat = "redhat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.redhat]
    
    @scala.inline
    def redo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.redo = "redo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.redo]
    
    @scala.inline
    def `redo-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`redo-alt` = "redo-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`redo-alt`]
    
    @scala.inline
    def refrigerator: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.refrigerator = "refrigerator".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.refrigerator]
    
    @scala.inline
    def registered: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.registered = "registered".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.registered]
    
    @scala.inline
    def `remove-format`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`remove-format` = "remove-format".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`remove-format`]
    
    @scala.inline
    def renren: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.renren = "renren".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.renren]
    
    @scala.inline
    def repeat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.repeat = "repeat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.repeat]
    
    @scala.inline
    def `repeat-1`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`repeat-1` = "repeat-1".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`repeat-1`]
    
    @scala.inline
    def `repeat-1-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`repeat-1-alt` = "repeat-1-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`repeat-1-alt`]
    
    @scala.inline
    def `repeat-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`repeat-alt` = "repeat-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`repeat-alt`]
    
    @scala.inline
    def reply: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.reply = "reply".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.reply]
    
    @scala.inline
    def `reply-all`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`reply-all` = "reply-all".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`reply-all`]
    
    @scala.inline
    def replyd: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.replyd = "replyd".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.replyd]
    
    @scala.inline
    def republican: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.republican = "republican".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.republican]
    
    @scala.inline
    def researchgate: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.researchgate = "researchgate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.researchgate]
    
    @scala.inline
    def resolving: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.resolving = "resolving".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.resolving]
    
    @scala.inline
    def restroom: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.restroom = "restroom".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.restroom]
    
    @scala.inline
    def retweet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.retweet = "retweet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.retweet]
    
    @scala.inline
    def `retweet-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`retweet-alt` = "retweet-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`retweet-alt`]
    
    @scala.inline
    def rev: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rev = "rev".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rev]
    
    @scala.inline
    def ribbon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ribbon = "ribbon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ribbon]
    
    @scala.inline
    def ring: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ring = "ring".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ring]
    
    @scala.inline
    def `rings-wedding`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rings-wedding` = "rings-wedding".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rings-wedding`]
    
    @scala.inline
    def road: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.road = "road".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.road]
    
    @scala.inline
    def robot: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.robot = "robot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.robot]
    
    @scala.inline
    def rocket: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rocket = "rocket".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rocket]
    
    @scala.inline
    def `rocket-launch`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rocket-launch` = "rocket-launch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rocket-launch`]
    
    @scala.inline
    def rocketchat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rocketchat = "rocketchat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rocketchat]
    
    @scala.inline
    def rockrms: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rockrms = "rockrms".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rockrms]
    
    @scala.inline
    def route: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.route = "route".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.route]
    
    @scala.inline
    def `route-highway`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`route-highway` = "route-highway".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`route-highway`]
    
    @scala.inline
    def `route-interstate`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`route-interstate` = "route-interstate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`route-interstate`]
    
    @scala.inline
    def router: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.router = "router".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.router]
    
    @scala.inline
    def rss: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rss = "rss".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rss]
    
    @scala.inline
    def `rss-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rss-square` = "rss-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rss-square`]
    
    @scala.inline
    def `ruble-sign`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruble-sign` = "ruble-sign".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruble-sign`]
    
    @scala.inline
    def ruler: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ruler = "ruler".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ruler]
    
    @scala.inline
    def `ruler-combined`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruler-combined` = "ruler-combined".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruler-combined`]
    
    @scala.inline
    def `ruler-horizontal`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruler-horizontal` = "ruler-horizontal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruler-horizontal`]
    
    @scala.inline
    def `ruler-triangle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruler-triangle` = "ruler-triangle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruler-triangle`]
    
    @scala.inline
    def `ruler-vertical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruler-vertical` = "ruler-vertical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ruler-vertical`]
    
    @scala.inline
    def running: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.running = "running".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.running]
    
    @scala.inline
    def `rupee-sign`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rupee-sign` = "rupee-sign".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`rupee-sign`]
    
    @scala.inline
    def rust: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rust = "rust".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rust]
    
    @scala.inline
    def rv: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rv = "rv".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.rv]
    
    @scala.inline
    def sack: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sack = "sack".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sack]
    
    @scala.inline
    def `sack-dollar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sack-dollar` = "sack-dollar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sack-dollar`]
    
    @scala.inline
    def `sad-cry`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sad-cry` = "sad-cry".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sad-cry`]
    
    @scala.inline
    def `sad-tear`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sad-tear` = "sad-tear".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sad-tear`]
    
    @scala.inline
    def safari: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.safari = "safari".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.safari]
    
    @scala.inline
    def salad: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.salad = "salad".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.salad]
    
    @scala.inline
    def salesforce: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.salesforce = "salesforce".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.salesforce]
    
    @scala.inline
    def sandwich: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sandwich = "sandwich".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sandwich]
    
    @scala.inline
    def sass: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sass = "sass".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sass]
    
    @scala.inline
    def satellite: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.satellite = "satellite".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.satellite]
    
    @scala.inline
    def `satellite-dish`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`satellite-dish` = "satellite-dish".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`satellite-dish`]
    
    @scala.inline
    def sausage: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sausage = "sausage".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sausage]
    
    @scala.inline
    def save: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.save = "save".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.save]
    
    @scala.inline
    def `sax-hot`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sax-hot` = "sax-hot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sax-hot`]
    
    @scala.inline
    def saxophone: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.saxophone = "saxophone".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.saxophone]
    
    @scala.inline
    def scalpel: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scalpel = "scalpel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scalpel]
    
    @scala.inline
    def `scalpel-path`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scalpel-path` = "scalpel-path".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scalpel-path`]
    
    @scala.inline
    def scanner: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scanner = "scanner".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scanner]
    
    @scala.inline
    def `scanner-image`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scanner-image` = "scanner-image".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scanner-image`]
    
    @scala.inline
    def `scanner-keyboard`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scanner-keyboard` = "scanner-keyboard".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scanner-keyboard`]
    
    @scala.inline
    def `scanner-touchscreen`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scanner-touchscreen` = "scanner-touchscreen".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scanner-touchscreen`]
    
    @scala.inline
    def scarecrow: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scarecrow = "scarecrow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scarecrow]
    
    @scala.inline
    def scarf: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scarf = "scarf".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scarf]
    
    @scala.inline
    def schlix: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.schlix = "schlix".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.schlix]
    
    @scala.inline
    def school: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.school = "school".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.school]
    
    @scala.inline
    def screwdriver: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.screwdriver = "screwdriver".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.screwdriver]
    
    @scala.inline
    def scribd: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scribd = "scribd".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scribd]
    
    @scala.inline
    def scroll: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scroll = "scroll".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scroll]
    
    @scala.inline
    def `scroll-old`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scroll-old` = "scroll-old".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`scroll-old`]
    
    @scala.inline
    def scrubber: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scrubber = "scrubber".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scrubber]
    
    @scala.inline
    def scythe: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scythe = "scythe".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.scythe]
    
    @scala.inline
    def `sd-card`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sd-card` = "sd-card".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sd-card`]
    
    @scala.inline
    def search: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.search = "search".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.search]
    
    @scala.inline
    def `search-dollar`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`search-dollar` = "search-dollar".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`search-dollar`]
    
    @scala.inline
    def `search-location`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`search-location` = "search-location".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`search-location`]
    
    @scala.inline
    def `search-minus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`search-minus` = "search-minus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`search-minus`]
    
    @scala.inline
    def `search-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`search-plus` = "search-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`search-plus`]
    
    @scala.inline
    def searchengin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.searchengin = "searchengin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.searchengin]
    
    @scala.inline
    def seedling: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.seedling = "seedling".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.seedling]
    
    @scala.inline
    def sellcast: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sellcast = "sellcast".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sellcast]
    
    @scala.inline
    def sellsy: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sellsy = "sellsy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sellsy]
    
    @scala.inline
    def `send-back`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`send-back` = "send-back".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`send-back`]
    
    @scala.inline
    def `send-backward`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`send-backward` = "send-backward".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`send-backward`]
    
    @scala.inline
    def sensor: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sensor = "sensor".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sensor]
    
    @scala.inline
    def `sensor-alert`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sensor-alert` = "sensor-alert".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sensor-alert`]
    
    @scala.inline
    def `sensor-fire`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sensor-fire` = "sensor-fire".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sensor-fire`]
    
    @scala.inline
    def `sensor-on`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sensor-on` = "sensor-on".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sensor-on`]
    
    @scala.inline
    def `sensor-smoke`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sensor-smoke` = "sensor-smoke".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sensor-smoke`]
    
    @scala.inline
    def server: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.server = "server".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.server]
    
    @scala.inline
    def servicestack: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.servicestack = "servicestack".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.servicestack]
    
    @scala.inline
    def shapes: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shapes = "shapes".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shapes]
    
    @scala.inline
    def share: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.share = "share".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.share]
    
    @scala.inline
    def `share-all`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`share-all` = "share-all".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`share-all`]
    
    @scala.inline
    def `share-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`share-alt` = "share-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`share-alt`]
    
    @scala.inline
    def `share-alt-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`share-alt-square` = "share-alt-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`share-alt-square`]
    
    @scala.inline
    def `share-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`share-square` = "share-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`share-square`]
    
    @scala.inline
    def sheep: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sheep = "sheep".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sheep]
    
    @scala.inline
    def `shekel-sign`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shekel-sign` = "shekel-sign".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shekel-sign`]
    
    @scala.inline
    def shield: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shield = "shield".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shield]
    
    @scala.inline
    def `shield-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shield-alt` = "shield-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shield-alt`]
    
    @scala.inline
    def `shield-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shield-check` = "shield-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shield-check`]
    
    @scala.inline
    def `shield-cross`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shield-cross` = "shield-cross".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shield-cross`]
    
    @scala.inline
    def `shield-virus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shield-virus` = "shield-virus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shield-virus`]
    
    @scala.inline
    def ship: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ship = "ship".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ship]
    
    @scala.inline
    def `shipping-fast`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shipping-fast` = "shipping-fast".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shipping-fast`]
    
    @scala.inline
    def `shipping-timed`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shipping-timed` = "shipping-timed".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shipping-timed`]
    
    @scala.inline
    def shirtsinbulk: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shirtsinbulk = "shirtsinbulk".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shirtsinbulk]
    
    @scala.inline
    def `shish-kebab`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shish-kebab` = "shish-kebab".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shish-kebab`]
    
    @scala.inline
    def `shoe-prints`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shoe-prints` = "shoe-prints".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shoe-prints`]
    
    @scala.inline
    def shopify: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shopify = "shopify".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shopify]
    
    @scala.inline
    def `shopping-bag`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shopping-bag` = "shopping-bag".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shopping-bag`]
    
    @scala.inline
    def `shopping-basket`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shopping-basket` = "shopping-basket".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shopping-basket`]
    
    @scala.inline
    def `shopping-cart`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shopping-cart` = "shopping-cart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shopping-cart`]
    
    @scala.inline
    def shopware: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shopware = "shopware".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shopware]
    
    @scala.inline
    def shovel: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shovel = "shovel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shovel]
    
    @scala.inline
    def `shovel-snow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shovel-snow` = "shovel-snow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shovel-snow`]
    
    @scala.inline
    def shower: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shower = "shower".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shower]
    
    @scala.inline
    def shredder: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shredder = "shredder".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shredder]
    
    @scala.inline
    def `shuttle-van`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shuttle-van` = "shuttle-van".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`shuttle-van`]
    
    @scala.inline
    def shuttlecock: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shuttlecock = "shuttlecock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.shuttlecock]
    
    @scala.inline
    def sickle: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sickle = "sickle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sickle]
    
    @scala.inline
    def sigma: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sigma = "sigma".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sigma]
    
    @scala.inline
    def sign: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sign = "sign".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sign]
    
    @scala.inline
    def `sign-in`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-in` = "sign-in".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-in`]
    
    @scala.inline
    def `sign-in-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-in-alt` = "sign-in-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-in-alt`]
    
    @scala.inline
    def `sign-language`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-language` = "sign-language".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-language`]
    
    @scala.inline
    def `sign-out`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-out` = "sign-out".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-out`]
    
    @scala.inline
    def `sign-out-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-out-alt` = "sign-out-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sign-out-alt`]
    
    @scala.inline
    def signal: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.signal = "signal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.signal]
    
    @scala.inline
    def `signal-1`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-1` = "signal-1".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-1`]
    
    @scala.inline
    def `signal-2`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-2` = "signal-2".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-2`]
    
    @scala.inline
    def `signal-3`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-3` = "signal-3".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-3`]
    
    @scala.inline
    def `signal-4`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-4` = "signal-4".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-4`]
    
    @scala.inline
    def `signal-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt` = "signal-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt`]
    
    @scala.inline
    def `signal-alt-1`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt-1` = "signal-alt-1".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt-1`]
    
    @scala.inline
    def `signal-alt-2`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt-2` = "signal-alt-2".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt-2`]
    
    @scala.inline
    def `signal-alt-3`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt-3` = "signal-alt-3".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt-3`]
    
    @scala.inline
    def `signal-alt-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt-slash` = "signal-alt-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-alt-slash`]
    
    @scala.inline
    def `signal-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-slash` = "signal-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-slash`]
    
    @scala.inline
    def `signal-stream`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-stream` = "signal-stream".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`signal-stream`]
    
    @scala.inline
    def signature: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.signature = "signature".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.signature]
    
    @scala.inline
    def `sim-card`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sim-card` = "sim-card".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sim-card`]
    
    @scala.inline
    def simplybuilt: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.simplybuilt = "simplybuilt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.simplybuilt]
    
    @scala.inline
    def sink: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sink = "sink".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sink]
    
    @scala.inline
    def siren: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.siren = "siren".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.siren]
    
    @scala.inline
    def `siren-on`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`siren-on` = "siren-on".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`siren-on`]
    
    @scala.inline
    def sistrix: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sistrix = "sistrix".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sistrix]
    
    @scala.inline
    def sitemap: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sitemap = "sitemap".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sitemap]
    
    @scala.inline
    def sith: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sith = "sith".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sith]
    
    @scala.inline
    def skating: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skating = "skating".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skating]
    
    @scala.inline
    def skeleton: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skeleton = "skeleton".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skeleton]
    
    @scala.inline
    def sketch: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sketch = "sketch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sketch]
    
    @scala.inline
    def `ski-jump`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ski-jump` = "ski-jump".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ski-jump`]
    
    @scala.inline
    def `ski-lift`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ski-lift` = "ski-lift".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ski-lift`]
    
    @scala.inline
    def skiing: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skiing = "skiing".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skiing]
    
    @scala.inline
    def `skiing-nordic`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`skiing-nordic` = "skiing-nordic".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`skiing-nordic`]
    
    @scala.inline
    def skull: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skull = "skull".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skull]
    
    @scala.inline
    def `skull-cow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`skull-cow` = "skull-cow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`skull-cow`]
    
    @scala.inline
    def `skull-crossbones`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`skull-crossbones` = "skull-crossbones".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`skull-crossbones`]
    
    @scala.inline
    def skyatlas: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skyatlas = "skyatlas".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skyatlas]
    
    @scala.inline
    def skype: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skype = "skype".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.skype]
    
    @scala.inline
    def slack: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.slack = "slack".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.slack]
    
    @scala.inline
    def `slack-hash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`slack-hash` = "slack-hash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`slack-hash`]
    
    @scala.inline
    def slash: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.slash = "slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.slash]
    
    @scala.inline
    def sledding: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sledding = "sledding".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sledding]
    
    @scala.inline
    def sleigh: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sleigh = "sleigh".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sleigh]
    
    @scala.inline
    def `sliders-h`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sliders-h` = "sliders-h".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sliders-h`]
    
    @scala.inline
    def `sliders-h-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sliders-h-square` = "sliders-h-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sliders-h-square`]
    
    @scala.inline
    def `sliders-v`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sliders-v` = "sliders-v".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sliders-v`]
    
    @scala.inline
    def `sliders-v-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sliders-v-square` = "sliders-v-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sliders-v-square`]
    
    @scala.inline
    def slideshare: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.slideshare = "slideshare".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.slideshare]
    
    @scala.inline
    def smile: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.smile = "smile".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.smile]
    
    @scala.inline
    def `smile-beam`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`smile-beam` = "smile-beam".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`smile-beam`]
    
    @scala.inline
    def `smile-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`smile-plus` = "smile-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`smile-plus`]
    
    @scala.inline
    def `smile-wink`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`smile-wink` = "smile-wink".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`smile-wink`]
    
    @scala.inline
    def smog: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.smog = "smog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.smog]
    
    @scala.inline
    def smoke: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.smoke = "smoke".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.smoke]
    
    @scala.inline
    def smoking: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.smoking = "smoking".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.smoking]
    
    @scala.inline
    def `smoking-ban`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`smoking-ban` = "smoking-ban".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`smoking-ban`]
    
    @scala.inline
    def sms: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sms = "sms".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sms]
    
    @scala.inline
    def snake: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snake = "snake".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snake]
    
    @scala.inline
    def snapchat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snapchat = "snapchat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snapchat]
    
    @scala.inline
    def `snapchat-ghost`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`snapchat-ghost` = "snapchat-ghost".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`snapchat-ghost`]
    
    @scala.inline
    def `snapchat-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`snapchat-square` = "snapchat-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`snapchat-square`]
    
    @scala.inline
    def snooze: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snooze = "snooze".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snooze]
    
    @scala.inline
    def `snow-blowing`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`snow-blowing` = "snow-blowing".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`snow-blowing`]
    
    @scala.inline
    def snowboarding: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowboarding = "snowboarding".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowboarding]
    
    @scala.inline
    def snowflake: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowflake = "snowflake".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowflake]
    
    @scala.inline
    def snowflakes: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowflakes = "snowflakes".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowflakes]
    
    @scala.inline
    def snowman: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowman = "snowman".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowman]
    
    @scala.inline
    def snowmobile: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowmobile = "snowmobile".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowmobile]
    
    @scala.inline
    def snowplow: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowplow = "snowplow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.snowplow]
    
    @scala.inline
    def soap: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.soap = "soap".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.soap]
    
    @scala.inline
    def socks: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.socks = "socks".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.socks]
    
    @scala.inline
    def `solar-panel`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`solar-panel` = "solar-panel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`solar-panel`]
    
    @scala.inline
    def `solar-system`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`solar-system` = "solar-system".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`solar-system`]
    
    @scala.inline
    def sort: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sort = "sort".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sort]
    
    @scala.inline
    def `sort-alpha-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alpha-down` = "sort-alpha-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alpha-down`]
    
    @scala.inline
    def `sort-alpha-down-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alpha-down-alt` = "sort-alpha-down-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alpha-down-alt`]
    
    @scala.inline
    def `sort-alpha-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alpha-up` = "sort-alpha-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alpha-up`]
    
    @scala.inline
    def `sort-alpha-up-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alpha-up-alt` = "sort-alpha-up-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alpha-up-alt`]
    
    @scala.inline
    def `sort-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alt` = "sort-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-alt`]
    
    @scala.inline
    def `sort-amount-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-amount-down` = "sort-amount-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-amount-down`]
    
    @scala.inline
    def `sort-amount-down-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-amount-down-alt` = "sort-amount-down-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-amount-down-alt`]
    
    @scala.inline
    def `sort-amount-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-amount-up` = "sort-amount-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-amount-up`]
    
    @scala.inline
    def `sort-amount-up-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-amount-up-alt` = "sort-amount-up-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-amount-up-alt`]
    
    @scala.inline
    def `sort-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-circle` = "sort-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-circle`]
    
    @scala.inline
    def `sort-circle-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-circle-down` = "sort-circle-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-circle-down`]
    
    @scala.inline
    def `sort-circle-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-circle-up` = "sort-circle-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-circle-up`]
    
    @scala.inline
    def `sort-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-down` = "sort-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-down`]
    
    @scala.inline
    def `sort-numeric-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-numeric-down` = "sort-numeric-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-numeric-down`]
    
    @scala.inline
    def `sort-numeric-down-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-numeric-down-alt` = "sort-numeric-down-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-numeric-down-alt`]
    
    @scala.inline
    def `sort-numeric-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-numeric-up` = "sort-numeric-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-numeric-up`]
    
    @scala.inline
    def `sort-numeric-up-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-numeric-up-alt` = "sort-numeric-up-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-numeric-up-alt`]
    
    @scala.inline
    def `sort-shapes-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-shapes-down` = "sort-shapes-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-shapes-down`]
    
    @scala.inline
    def `sort-shapes-down-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-shapes-down-alt` = "sort-shapes-down-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-shapes-down-alt`]
    
    @scala.inline
    def `sort-shapes-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-shapes-up` = "sort-shapes-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-shapes-up`]
    
    @scala.inline
    def `sort-shapes-up-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-shapes-up-alt` = "sort-shapes-up-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-shapes-up-alt`]
    
    @scala.inline
    def `sort-size-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-size-down` = "sort-size-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-size-down`]
    
    @scala.inline
    def `sort-size-down-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-size-down-alt` = "sort-size-down-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-size-down-alt`]
    
    @scala.inline
    def `sort-size-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-size-up` = "sort-size-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-size-up`]
    
    @scala.inline
    def `sort-size-up-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-size-up-alt` = "sort-size-up-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-size-up-alt`]
    
    @scala.inline
    def `sort-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-up` = "sort-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sort-up`]
    
    @scala.inline
    def soundcloud: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.soundcloud = "soundcloud".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.soundcloud]
    
    @scala.inline
    def soup: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.soup = "soup".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.soup]
    
    @scala.inline
    def sourcetree: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sourcetree = "sourcetree".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sourcetree]
    
    @scala.inline
    def spa: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spa = "spa".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spa]
    
    @scala.inline
    def `space-shuttle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`space-shuttle` = "space-shuttle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`space-shuttle`]
    
    @scala.inline
    def `space-station-moon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`space-station-moon` = "space-station-moon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`space-station-moon`]
    
    @scala.inline
    def `space-station-moon-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`space-station-moon-alt` = "space-station-moon-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`space-station-moon-alt`]
    
    @scala.inline
    def spade: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spade = "spade".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spade]
    
    @scala.inline
    def sparkles: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sparkles = "sparkles".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sparkles]
    
    @scala.inline
    def speakap: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.speakap = "speakap".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.speakap]
    
    @scala.inline
    def speaker: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.speaker = "speaker".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.speaker]
    
    @scala.inline
    def `speaker-deck`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`speaker-deck` = "speaker-deck".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`speaker-deck`]
    
    @scala.inline
    def speakers: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.speakers = "speakers".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.speakers]
    
    @scala.inline
    def `spell-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spell-check` = "spell-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spell-check`]
    
    @scala.inline
    def spider: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spider = "spider".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spider]
    
    @scala.inline
    def `spider-black-widow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spider-black-widow` = "spider-black-widow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spider-black-widow`]
    
    @scala.inline
    def `spider-web`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spider-web` = "spider-web".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spider-web`]
    
    @scala.inline
    def spinner: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spinner = "spinner".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spinner]
    
    @scala.inline
    def `spinner-third`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spinner-third` = "spinner-third".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spinner-third`]
    
    @scala.inline
    def splotch: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.splotch = "splotch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.splotch]
    
    @scala.inline
    def spotify: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spotify = "spotify".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.spotify]
    
    @scala.inline
    def `spray-can`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spray-can` = "spray-can".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`spray-can`]
    
    @scala.inline
    def sprinkler: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sprinkler = "sprinkler".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sprinkler]
    
    @scala.inline
    def square: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.square = "square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.square]
    
    @scala.inline
    def `square-full`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`square-full` = "square-full".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`square-full`]
    
    @scala.inline
    def `square-root`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`square-root` = "square-root".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`square-root`]
    
    @scala.inline
    def `square-root-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`square-root-alt` = "square-root-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`square-root-alt`]
    
    @scala.inline
    def squarespace: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.squarespace = "squarespace".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.squarespace]
    
    @scala.inline
    def squirrel: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.squirrel = "squirrel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.squirrel]
    
    @scala.inline
    def `stack-exchange`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stack-exchange` = "stack-exchange".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stack-exchange`]
    
    @scala.inline
    def `stack-overflow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stack-overflow` = "stack-overflow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stack-overflow`]
    
    @scala.inline
    def stackpath: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stackpath = "stackpath".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stackpath]
    
    @scala.inline
    def staff: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.staff = "staff".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.staff]
    
    @scala.inline
    def stamp: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stamp = "stamp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stamp]
    
    @scala.inline
    def star: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.star = "star".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.star]
    
    @scala.inline
    def `star-and-crescent`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-and-crescent` = "star-and-crescent".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-and-crescent`]
    
    @scala.inline
    def `star-christmas`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-christmas` = "star-christmas".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-christmas`]
    
    @scala.inline
    def `star-exclamation`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-exclamation` = "star-exclamation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-exclamation`]
    
    @scala.inline
    def `star-half`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-half` = "star-half".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-half`]
    
    @scala.inline
    def `star-half-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-half-alt` = "star-half-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-half-alt`]
    
    @scala.inline
    def `star-of-david`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-of-david` = "star-of-david".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-of-david`]
    
    @scala.inline
    def `star-of-life`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-of-life` = "star-of-life".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-of-life`]
    
    @scala.inline
    def `star-shooting`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-shooting` = "star-shooting".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`star-shooting`]
    
    @scala.inline
    def starfighter: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.starfighter = "starfighter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.starfighter]
    
    @scala.inline
    def `starfighter-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`starfighter-alt` = "starfighter-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`starfighter-alt`]
    
    @scala.inline
    def stars: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stars = "stars".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stars]
    
    @scala.inline
    def starship: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.starship = "starship".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.starship]
    
    @scala.inline
    def `starship-freighter`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`starship-freighter` = "starship-freighter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`starship-freighter`]
    
    @scala.inline
    def staylinked: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.staylinked = "staylinked".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.staylinked]
    
    @scala.inline
    def steak: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.steak = "steak".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.steak]
    
    @scala.inline
    def steam: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.steam = "steam".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.steam]
    
    @scala.inline
    def `steam-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`steam-square` = "steam-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`steam-square`]
    
    @scala.inline
    def `steam-symbol`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`steam-symbol` = "steam-symbol".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`steam-symbol`]
    
    @scala.inline
    def `steering-wheel`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`steering-wheel` = "steering-wheel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`steering-wheel`]
    
    @scala.inline
    def `step-backward`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`step-backward` = "step-backward".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`step-backward`]
    
    @scala.inline
    def `step-forward`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`step-forward` = "step-forward".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`step-forward`]
    
    @scala.inline
    def stethoscope: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stethoscope = "stethoscope".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stethoscope]
    
    @scala.inline
    def `sticker-mule`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sticker-mule` = "sticker-mule".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sticker-mule`]
    
    @scala.inline
    def `sticky-note`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sticky-note` = "sticky-note".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sticky-note`]
    
    @scala.inline
    def stocking: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stocking = "stocking".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stocking]
    
    @scala.inline
    def stomach: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stomach = "stomach".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stomach]
    
    @scala.inline
    def stop: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stop = "stop".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stop]
    
    @scala.inline
    def `stop-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stop-circle` = "stop-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stop-circle`]
    
    @scala.inline
    def stopwatch: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stopwatch = "stopwatch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stopwatch]
    
    @scala.inline
    def `stopwatch-20`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stopwatch-20` = "stopwatch-20".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stopwatch-20`]
    
    @scala.inline
    def store: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.store = "store".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.store]
    
    @scala.inline
    def `store-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`store-alt` = "store-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`store-alt`]
    
    @scala.inline
    def `store-alt-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`store-alt-slash` = "store-alt-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`store-alt-slash`]
    
    @scala.inline
    def `store-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`store-slash` = "store-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`store-slash`]
    
    @scala.inline
    def strava: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.strava = "strava".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.strava]
    
    @scala.inline
    def stream: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stream = "stream".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stream]
    
    @scala.inline
    def `street-view`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`street-view` = "street-view".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`street-view`]
    
    @scala.inline
    def stretcher: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stretcher = "stretcher".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stretcher]
    
    @scala.inline
    def strikethrough: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.strikethrough = "strikethrough".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.strikethrough]
    
    @scala.inline
    def stripe: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stripe = "stripe".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stripe]
    
    @scala.inline
    def `stripe-s`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stripe-s` = "stripe-s".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stripe-s`]
    
    @scala.inline
    def stroopwafel: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stroopwafel = "stroopwafel".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stroopwafel]
    
    @scala.inline
    def studiovinari: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.studiovinari = "studiovinari".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.studiovinari]
    
    @scala.inline
    def stumbleupon: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stumbleupon = "stumbleupon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.stumbleupon]
    
    @scala.inline
    def `stumbleupon-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stumbleupon-circle` = "stumbleupon-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`stumbleupon-circle`]
    
    @scala.inline
    def subscript: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.subscript = "subscript".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.subscript]
    
    @scala.inline
    def subway: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.subway = "subway".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.subway]
    
    @scala.inline
    def suitcase: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.suitcase = "suitcase".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.suitcase]
    
    @scala.inline
    def `suitcase-rolling`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`suitcase-rolling` = "suitcase-rolling".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`suitcase-rolling`]
    
    @scala.inline
    def sun: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sun = "sun".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sun]
    
    @scala.inline
    def `sun-cloud`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sun-cloud` = "sun-cloud".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sun-cloud`]
    
    @scala.inline
    def `sun-dust`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sun-dust` = "sun-dust".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sun-dust`]
    
    @scala.inline
    def `sun-haze`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sun-haze` = "sun-haze".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sun-haze`]
    
    @scala.inline
    def sunglasses: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sunglasses = "sunglasses".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sunglasses]
    
    @scala.inline
    def sunrise: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sunrise = "sunrise".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sunrise]
    
    @scala.inline
    def sunset: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sunset = "sunset".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sunset]
    
    @scala.inline
    def superpowers: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.superpowers = "superpowers".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.superpowers]
    
    @scala.inline
    def superscript: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.superscript = "superscript".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.superscript]
    
    @scala.inline
    def supple: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.supple = "supple".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.supple]
    
    @scala.inline
    def surprise: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.surprise = "surprise".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.surprise]
    
    @scala.inline
    def suse: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.suse = "suse".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.suse]
    
    @scala.inline
    def swatchbook: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.swatchbook = "swatchbook".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.swatchbook]
    
    @scala.inline
    def swift: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.swift = "swift".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.swift]
    
    @scala.inline
    def swimmer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.swimmer = "swimmer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.swimmer]
    
    @scala.inline
    def `swimming-pool`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`swimming-pool` = "swimming-pool".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`swimming-pool`]
    
    @scala.inline
    def sword: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sword = "sword".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sword]
    
    @scala.inline
    def `sword-laser`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sword-laser` = "sword-laser".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sword-laser`]
    
    @scala.inline
    def `sword-laser-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sword-laser-alt` = "sword-laser-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sword-laser-alt`]
    
    @scala.inline
    def swords: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.swords = "swords".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.swords]
    
    @scala.inline
    def `swords-laser`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`swords-laser` = "swords-laser".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`swords-laser`]
    
    @scala.inline
    def symfony: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.symfony = "symfony".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.symfony]
    
    @scala.inline
    def synagogue: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.synagogue = "synagogue".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.synagogue]
    
    @scala.inline
    def sync: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sync = "sync".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.sync]
    
    @scala.inline
    def `sync-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sync-alt` = "sync-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`sync-alt`]
    
    @scala.inline
    def syringe: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.syringe = "syringe".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.syringe]
    
    @scala.inline
    def table: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.table = "table".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.table]
    
    @scala.inline
    def `table-tennis`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`table-tennis` = "table-tennis".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`table-tennis`]
    
    @scala.inline
    def tablet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tablet = "tablet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tablet]
    
    @scala.inline
    def `tablet-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tablet-alt` = "tablet-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tablet-alt`]
    
    @scala.inline
    def `tablet-android`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tablet-android` = "tablet-android".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tablet-android`]
    
    @scala.inline
    def `tablet-android-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tablet-android-alt` = "tablet-android-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tablet-android-alt`]
    
    @scala.inline
    def `tablet-rugged`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tablet-rugged` = "tablet-rugged".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tablet-rugged`]
    
    @scala.inline
    def tablets: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tablets = "tablets".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tablets]
    
    @scala.inline
    def tachometer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tachometer = "tachometer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tachometer]
    
    @scala.inline
    def `tachometer-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt` = "tachometer-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt`]
    
    @scala.inline
    def `tachometer-alt-average`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-average` = "tachometer-alt-average".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-average`]
    
    @scala.inline
    def `tachometer-alt-fast`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-fast` = "tachometer-alt-fast".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-fast`]
    
    @scala.inline
    def `tachometer-alt-fastest`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-fastest` = "tachometer-alt-fastest".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-fastest`]
    
    @scala.inline
    def `tachometer-alt-slow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-slow` = "tachometer-alt-slow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-slow`]
    
    @scala.inline
    def `tachometer-alt-slowest`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-slowest` = "tachometer-alt-slowest".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-alt-slowest`]
    
    @scala.inline
    def `tachometer-average`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-average` = "tachometer-average".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-average`]
    
    @scala.inline
    def `tachometer-fast`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-fast` = "tachometer-fast".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-fast`]
    
    @scala.inline
    def `tachometer-fastest`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-fastest` = "tachometer-fastest".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-fastest`]
    
    @scala.inline
    def `tachometer-slow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-slow` = "tachometer-slow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-slow`]
    
    @scala.inline
    def `tachometer-slowest`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-slowest` = "tachometer-slowest".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tachometer-slowest`]
    
    @scala.inline
    def taco: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.taco = "taco".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.taco]
    
    @scala.inline
    def tag: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tag = "tag".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tag]
    
    @scala.inline
    def tags: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tags = "tags".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tags]
    
    @scala.inline
    def tally: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tally = "tally".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tally]
    
    @scala.inline
    def tanakh: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tanakh = "tanakh".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tanakh]
    
    @scala.inline
    def tape: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tape = "tape".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tape]
    
    @scala.inline
    def tasks: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tasks = "tasks".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tasks]
    
    @scala.inline
    def `tasks-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tasks-alt` = "tasks-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tasks-alt`]
    
    @scala.inline
    def taxi: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.taxi = "taxi".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.taxi]
    
    @scala.inline
    def teamspeak: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.teamspeak = "teamspeak".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.teamspeak]
    
    @scala.inline
    def teeth: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.teeth = "teeth".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.teeth]
    
    @scala.inline
    def `teeth-open`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`teeth-open` = "teeth-open".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`teeth-open`]
    
    @scala.inline
    def telegram: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.telegram = "telegram".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.telegram]
    
    @scala.inline
    def `telegram-plane`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`telegram-plane` = "telegram-plane".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`telegram-plane`]
    
    @scala.inline
    def telescope: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.telescope = "telescope".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.telescope]
    
    @scala.inline
    def `temperature-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-down` = "temperature-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-down`]
    
    @scala.inline
    def `temperature-frigid`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-frigid` = "temperature-frigid".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-frigid`]
    
    @scala.inline
    def `temperature-high`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-high` = "temperature-high".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-high`]
    
    @scala.inline
    def `temperature-hot`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-hot` = "temperature-hot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-hot`]
    
    @scala.inline
    def `temperature-low`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-low` = "temperature-low".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-low`]
    
    @scala.inline
    def `temperature-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-up` = "temperature-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`temperature-up`]
    
    @scala.inline
    def `tencent-weibo`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tencent-weibo` = "tencent-weibo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tencent-weibo`]
    
    @scala.inline
    def tenge: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tenge = "tenge".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tenge]
    
    @scala.inline
    def `tennis-ball`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tennis-ball` = "tennis-ball".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tennis-ball`]
    
    @scala.inline
    def terminal: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.terminal = "terminal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.terminal]
    
    @scala.inline
    def text: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.text = "text".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.text]
    
    @scala.inline
    def `text-height`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`text-height` = "text-height".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`text-height`]
    
    @scala.inline
    def `text-size`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`text-size` = "text-size".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`text-size`]
    
    @scala.inline
    def `text-width`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`text-width` = "text-width".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`text-width`]
    
    @scala.inline
    def th: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.th = "th".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.th]
    
    @scala.inline
    def `th-large`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`th-large` = "th-large".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`th-large`]
    
    @scala.inline
    def `th-list`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`th-list` = "th-list".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`th-list`]
    
    @scala.inline
    def `the-red-yeti`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`the-red-yeti` = "the-red-yeti".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`the-red-yeti`]
    
    @scala.inline
    def `theater-masks`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`theater-masks` = "theater-masks".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`theater-masks`]
    
    @scala.inline
    def themeco: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.themeco = "themeco".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.themeco]
    
    @scala.inline
    def themeisle: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.themeisle = "themeisle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.themeisle]
    
    @scala.inline
    def thermometer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.thermometer = "thermometer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.thermometer]
    
    @scala.inline
    def `thermometer-empty`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-empty` = "thermometer-empty".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-empty`]
    
    @scala.inline
    def `thermometer-full`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-full` = "thermometer-full".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-full`]
    
    @scala.inline
    def `thermometer-half`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-half` = "thermometer-half".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-half`]
    
    @scala.inline
    def `thermometer-quarter`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-quarter` = "thermometer-quarter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-quarter`]
    
    @scala.inline
    def `thermometer-three-quarters`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-three-quarters` = "thermometer-three-quarters".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thermometer-three-quarters`]
    
    @scala.inline
    def theta: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.theta = "theta".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.theta]
    
    @scala.inline
    def `think-peaks`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`think-peaks` = "think-peaks".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`think-peaks`]
    
    @scala.inline
    def `thumbs-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thumbs-down` = "thumbs-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thumbs-down`]
    
    @scala.inline
    def `thumbs-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thumbs-up` = "thumbs-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thumbs-up`]
    
    @scala.inline
    def thumbtack: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.thumbtack = "thumbtack".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.thumbtack]
    
    @scala.inline
    def thunderstorm: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.thunderstorm = "thunderstorm".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.thunderstorm]
    
    @scala.inline
    def `thunderstorm-moon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thunderstorm-moon` = "thunderstorm-moon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thunderstorm-moon`]
    
    @scala.inline
    def `thunderstorm-sun`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thunderstorm-sun` = "thunderstorm-sun".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`thunderstorm-sun`]
    
    @scala.inline
    def ticket: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ticket = "ticket".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ticket]
    
    @scala.inline
    def `ticket-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ticket-alt` = "ticket-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ticket-alt`]
    
    @scala.inline
    def tiktok: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tiktok = "tiktok".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tiktok]
    
    @scala.inline
    def tilde: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tilde = "tilde".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tilde]
    
    @scala.inline
    def times: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.times = "times".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.times]
    
    @scala.inline
    def `times-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`times-circle` = "times-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`times-circle`]
    
    @scala.inline
    def `times-hexagon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`times-hexagon` = "times-hexagon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`times-hexagon`]
    
    @scala.inline
    def `times-octagon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`times-octagon` = "times-octagon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`times-octagon`]
    
    @scala.inline
    def `times-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`times-square` = "times-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`times-square`]
    
    @scala.inline
    def tint: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tint = "tint".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tint]
    
    @scala.inline
    def `tint-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tint-slash` = "tint-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tint-slash`]
    
    @scala.inline
    def tire: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tire = "tire".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tire]
    
    @scala.inline
    def `tire-flat`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tire-flat` = "tire-flat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tire-flat`]
    
    @scala.inline
    def `tire-pressure-warning`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tire-pressure-warning` = "tire-pressure-warning".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tire-pressure-warning`]
    
    @scala.inline
    def `tire-rugged`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tire-rugged` = "tire-rugged".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tire-rugged`]
    
    @scala.inline
    def tired: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tired = "tired".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tired]
    
    @scala.inline
    def `toggle-off`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toggle-off` = "toggle-off".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toggle-off`]
    
    @scala.inline
    def `toggle-on`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toggle-on` = "toggle-on".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toggle-on`]
    
    @scala.inline
    def toilet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.toilet = "toilet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.toilet]
    
    @scala.inline
    def `toilet-paper`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toilet-paper` = "toilet-paper".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toilet-paper`]
    
    @scala.inline
    def `toilet-paper-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toilet-paper-alt` = "toilet-paper-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toilet-paper-alt`]
    
    @scala.inline
    def `toilet-paper-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toilet-paper-slash` = "toilet-paper-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`toilet-paper-slash`]
    
    @scala.inline
    def tombstone: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tombstone = "tombstone".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tombstone]
    
    @scala.inline
    def `tombstone-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tombstone-alt` = "tombstone-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tombstone-alt`]
    
    @scala.inline
    def toolbox: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.toolbox = "toolbox".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.toolbox]
    
    @scala.inline
    def tools: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tools = "tools".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tools]
    
    @scala.inline
    def tooth: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tooth = "tooth".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tooth]
    
    @scala.inline
    def toothbrush: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.toothbrush = "toothbrush".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.toothbrush]
    
    @scala.inline
    def torah: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.torah = "torah".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.torah]
    
    @scala.inline
    def `torii-gate`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`torii-gate` = "torii-gate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`torii-gate`]
    
    @scala.inline
    def tornado: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tornado = "tornado".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tornado]
    
    @scala.inline
    def tractor: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tractor = "tractor".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tractor]
    
    @scala.inline
    def `trade-federation`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trade-federation` = "trade-federation".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trade-federation`]
    
    @scala.inline
    def trademark: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trademark = "trademark".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trademark]
    
    @scala.inline
    def `traffic-cone`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-cone` = "traffic-cone".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-cone`]
    
    @scala.inline
    def `traffic-light`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-light` = "traffic-light".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-light`]
    
    @scala.inline
    def `traffic-light-go`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-light-go` = "traffic-light-go".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-light-go`]
    
    @scala.inline
    def `traffic-light-slow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-light-slow` = "traffic-light-slow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-light-slow`]
    
    @scala.inline
    def `traffic-light-stop`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-light-stop` = "traffic-light-stop".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`traffic-light-stop`]
    
    @scala.inline
    def trailer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trailer = "trailer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trailer]
    
    @scala.inline
    def train: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.train = "train".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.train]
    
    @scala.inline
    def tram: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tram = "tram".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tram]
    
    @scala.inline
    def transgender: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.transgender = "transgender".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.transgender]
    
    @scala.inline
    def `transgender-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transgender-alt` = "transgender-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transgender-alt`]
    
    @scala.inline
    def transporter: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.transporter = "transporter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.transporter]
    
    @scala.inline
    def `transporter-1`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transporter-1` = "transporter-1".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transporter-1`]
    
    @scala.inline
    def `transporter-2`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transporter-2` = "transporter-2".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transporter-2`]
    
    @scala.inline
    def `transporter-3`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transporter-3` = "transporter-3".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transporter-3`]
    
    @scala.inline
    def `transporter-empty`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transporter-empty` = "transporter-empty".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`transporter-empty`]
    
    @scala.inline
    def trash: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trash = "trash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trash]
    
    @scala.inline
    def `trash-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-alt` = "trash-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-alt`]
    
    @scala.inline
    def `trash-restore`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-restore` = "trash-restore".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-restore`]
    
    @scala.inline
    def `trash-restore-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-restore-alt` = "trash-restore-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-restore-alt`]
    
    @scala.inline
    def `trash-undo`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-undo` = "trash-undo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-undo`]
    
    @scala.inline
    def `trash-undo-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-undo-alt` = "trash-undo-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trash-undo-alt`]
    
    @scala.inline
    def `treasure-chest`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`treasure-chest` = "treasure-chest".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`treasure-chest`]
    
    @scala.inline
    def tree: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tree = "tree".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tree]
    
    @scala.inline
    def `tree-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-alt` = "tree-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-alt`]
    
    @scala.inline
    def `tree-christmas`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-christmas` = "tree-christmas".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-christmas`]
    
    @scala.inline
    def `tree-decorated`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-decorated` = "tree-decorated".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-decorated`]
    
    @scala.inline
    def `tree-large`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-large` = "tree-large".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-large`]
    
    @scala.inline
    def `tree-palm`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-palm` = "tree-palm".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tree-palm`]
    
    @scala.inline
    def trees: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trees = "trees".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trees]
    
    @scala.inline
    def trello: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trello = "trello".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trello]
    
    @scala.inline
    def triangle: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.triangle = "triangle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.triangle]
    
    @scala.inline
    def `triangle-music`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`triangle-music` = "triangle-music".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`triangle-music`]
    
    @scala.inline
    def tripadvisor: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tripadvisor = "tripadvisor".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tripadvisor]
    
    @scala.inline
    def trophy: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trophy = "trophy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trophy]
    
    @scala.inline
    def `trophy-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trophy-alt` = "trophy-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`trophy-alt`]
    
    @scala.inline
    def truck: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.truck = "truck".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.truck]
    
    @scala.inline
    def `truck-container`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-container` = "truck-container".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-container`]
    
    @scala.inline
    def `truck-couch`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-couch` = "truck-couch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-couch`]
    
    @scala.inline
    def `truck-loading`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-loading` = "truck-loading".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-loading`]
    
    @scala.inline
    def `truck-monster`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-monster` = "truck-monster".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-monster`]
    
    @scala.inline
    def `truck-moving`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-moving` = "truck-moving".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-moving`]
    
    @scala.inline
    def `truck-pickup`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-pickup` = "truck-pickup".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-pickup`]
    
    @scala.inline
    def `truck-plow`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-plow` = "truck-plow".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-plow`]
    
    @scala.inline
    def `truck-ramp`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-ramp` = "truck-ramp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`truck-ramp`]
    
    @scala.inline
    def trumpet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trumpet = "trumpet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.trumpet]
    
    @scala.inline
    def tshirt: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tshirt = "tshirt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tshirt]
    
    @scala.inline
    def tty: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tty = "tty".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tty]
    
    @scala.inline
    def tumblr: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tumblr = "tumblr".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tumblr]
    
    @scala.inline
    def `tumblr-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tumblr-square` = "tumblr-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tumblr-square`]
    
    @scala.inline
    def turkey: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.turkey = "turkey".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.turkey]
    
    @scala.inline
    def turntable: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.turntable = "turntable".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.turntable]
    
    @scala.inline
    def turtle: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.turtle = "turtle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.turtle]
    
    @scala.inline
    def tv: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tv = "tv".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.tv]
    
    @scala.inline
    def `tv-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tv-alt` = "tv-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tv-alt`]
    
    @scala.inline
    def `tv-music`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tv-music` = "tv-music".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tv-music`]
    
    @scala.inline
    def `tv-retro`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tv-retro` = "tv-retro".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`tv-retro`]
    
    @scala.inline
    def twitch: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.twitch = "twitch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.twitch]
    
    @scala.inline
    def twitter: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.twitter = "twitter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.twitter]
    
    @scala.inline
    def `twitter-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`twitter-square` = "twitter-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`twitter-square`]
    
    @scala.inline
    def typewriter: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.typewriter = "typewriter".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.typewriter]
    
    @scala.inline
    def typo3: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.typo3 = "typo3".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.typo3]
    
    @scala.inline
    def uber: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.uber = "uber".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.uber]
    
    @scala.inline
    def ubuntu: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ubuntu = "ubuntu".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ubuntu]
    
    @scala.inline
    def ufo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ufo = "ufo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ufo]
    
    @scala.inline
    def `ufo-beam`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ufo-beam` = "ufo-beam".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`ufo-beam`]
    
    @scala.inline
    def uikit: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.uikit = "uikit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.uikit]
    
    @scala.inline
    def umbraco: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.umbraco = "umbraco".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.umbraco]
    
    @scala.inline
    def umbrella: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.umbrella = "umbrella".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.umbrella]
    
    @scala.inline
    def `umbrella-beach`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`umbrella-beach` = "umbrella-beach".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`umbrella-beach`]
    
    @scala.inline
    def uncharted: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.uncharted = "uncharted".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.uncharted]
    
    @scala.inline
    def underline: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.underline = "underline".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.underline]
    
    @scala.inline
    def undo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.undo = "undo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.undo]
    
    @scala.inline
    def `undo-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`undo-alt` = "undo-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`undo-alt`]
    
    @scala.inline
    def unicorn: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unicorn = "unicorn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unicorn]
    
    @scala.inline
    def union: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.union = "union".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.union]
    
    @scala.inline
    def uniregistry: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.uniregistry = "uniregistry".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.uniregistry]
    
    @scala.inline
    def unity: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unity = "unity".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unity]
    
    @scala.inline
    def `universal-access`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`universal-access` = "universal-access".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`universal-access`]
    
    @scala.inline
    def university: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.university = "university".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.university]
    
    @scala.inline
    def unlink: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unlink = "unlink".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unlink]
    
    @scala.inline
    def unlock: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unlock = "unlock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unlock]
    
    @scala.inline
    def `unlock-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`unlock-alt` = "unlock-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`unlock-alt`]
    
    @scala.inline
    def unsplash: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unsplash = "unsplash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.unsplash]
    
    @scala.inline
    def untappd: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.untappd = "untappd".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.untappd]
    
    @scala.inline
    def upload: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.upload = "upload".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.upload]
    
    @scala.inline
    def ups: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ups = "ups".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ups]
    
    @scala.inline
    def usb: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.usb = "usb".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.usb]
    
    @scala.inline
    def `usb-drive`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`usb-drive` = "usb-drive".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`usb-drive`]
    
    @scala.inline
    def `usd-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`usd-circle` = "usd-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`usd-circle`]
    
    @scala.inline
    def `usd-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`usd-square` = "usd-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`usd-square`]
    
    @scala.inline
    def user: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.user = "user".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.user]
    
    @scala.inline
    def `user-alien`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-alien` = "user-alien".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-alien`]
    
    @scala.inline
    def `user-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-alt` = "user-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-alt`]
    
    @scala.inline
    def `user-alt-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-alt-slash` = "user-alt-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-alt-slash`]
    
    @scala.inline
    def `user-astronaut`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-astronaut` = "user-astronaut".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-astronaut`]
    
    @scala.inline
    def `user-chart`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-chart` = "user-chart".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-chart`]
    
    @scala.inline
    def `user-check`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-check` = "user-check".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-check`]
    
    @scala.inline
    def `user-circle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-circle` = "user-circle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-circle`]
    
    @scala.inline
    def `user-clock`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-clock` = "user-clock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-clock`]
    
    @scala.inline
    def `user-cog`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-cog` = "user-cog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-cog`]
    
    @scala.inline
    def `user-cowboy`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-cowboy` = "user-cowboy".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-cowboy`]
    
    @scala.inline
    def `user-crown`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-crown` = "user-crown".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-crown`]
    
    @scala.inline
    def `user-edit`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-edit` = "user-edit".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-edit`]
    
    @scala.inline
    def `user-friends`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-friends` = "user-friends".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-friends`]
    
    @scala.inline
    def `user-graduate`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-graduate` = "user-graduate".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-graduate`]
    
    @scala.inline
    def `user-hard-hat`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-hard-hat` = "user-hard-hat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-hard-hat`]
    
    @scala.inline
    def `user-headset`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-headset` = "user-headset".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-headset`]
    
    @scala.inline
    def `user-injured`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-injured` = "user-injured".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-injured`]
    
    @scala.inline
    def `user-lock`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-lock` = "user-lock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-lock`]
    
    @scala.inline
    def `user-md`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-md` = "user-md".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-md`]
    
    @scala.inline
    def `user-md-chat`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-md-chat` = "user-md-chat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-md-chat`]
    
    @scala.inline
    def `user-minus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-minus` = "user-minus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-minus`]
    
    @scala.inline
    def `user-music`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-music` = "user-music".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-music`]
    
    @scala.inline
    def `user-ninja`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-ninja` = "user-ninja".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-ninja`]
    
    @scala.inline
    def `user-nurse`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-nurse` = "user-nurse".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-nurse`]
    
    @scala.inline
    def `user-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-plus` = "user-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-plus`]
    
    @scala.inline
    def `user-robot`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-robot` = "user-robot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-robot`]
    
    @scala.inline
    def `user-secret`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-secret` = "user-secret".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-secret`]
    
    @scala.inline
    def `user-shield`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-shield` = "user-shield".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-shield`]
    
    @scala.inline
    def `user-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-slash` = "user-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-slash`]
    
    @scala.inline
    def `user-tag`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-tag` = "user-tag".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-tag`]
    
    @scala.inline
    def `user-tie`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-tie` = "user-tie".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-tie`]
    
    @scala.inline
    def `user-times`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-times` = "user-times".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-times`]
    
    @scala.inline
    def `user-unlock`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-unlock` = "user-unlock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-unlock`]
    
    @scala.inline
    def `user-visor`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-visor` = "user-visor".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`user-visor`]
    
    @scala.inline
    def users: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.users = "users".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.users]
    
    @scala.inline
    def `users-class`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-class` = "users-class".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-class`]
    
    @scala.inline
    def `users-cog`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-cog` = "users-cog".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-cog`]
    
    @scala.inline
    def `users-crown`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-crown` = "users-crown".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-crown`]
    
    @scala.inline
    def `users-medical`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-medical` = "users-medical".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-medical`]
    
    @scala.inline
    def `users-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-slash` = "users-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`users-slash`]
    
    @scala.inline
    def usps: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.usps = "usps".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.usps]
    
    @scala.inline
    def ussunnah: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ussunnah = "ussunnah".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.ussunnah]
    
    @scala.inline
    def `utensil-fork`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`utensil-fork` = "utensil-fork".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`utensil-fork`]
    
    @scala.inline
    def `utensil-knife`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`utensil-knife` = "utensil-knife".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`utensil-knife`]
    
    @scala.inline
    def `utensil-spoon`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`utensil-spoon` = "utensil-spoon".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`utensil-spoon`]
    
    @scala.inline
    def utensils: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.utensils = "utensils".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.utensils]
    
    @scala.inline
    def `utensils-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`utensils-alt` = "utensils-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`utensils-alt`]
    
    @scala.inline
    def vaadin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vaadin = "vaadin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vaadin]
    
    @scala.inline
    def vacuum: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vacuum = "vacuum".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vacuum]
    
    @scala.inline
    def `vacuum-robot`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vacuum-robot` = "vacuum-robot".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vacuum-robot`]
    
    @scala.inline
    def `value-absolute`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`value-absolute` = "value-absolute".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`value-absolute`]
    
    @scala.inline
    def `vector-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vector-square` = "vector-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vector-square`]
    
    @scala.inline
    def venus: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.venus = "venus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.venus]
    
    @scala.inline
    def `venus-double`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`venus-double` = "venus-double".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`venus-double`]
    
    @scala.inline
    def `venus-mars`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`venus-mars` = "venus-mars".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`venus-mars`]
    
    @scala.inline
    def vest: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vest = "vest".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vest]
    
    @scala.inline
    def `vest-patches`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vest-patches` = "vest-patches".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vest-patches`]
    
    @scala.inline
    def vhs: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vhs = "vhs".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vhs]
    
    @scala.inline
    def viacoin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.viacoin = "viacoin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.viacoin]
    
    @scala.inline
    def viadeo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.viadeo = "viadeo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.viadeo]
    
    @scala.inline
    def `viadeo-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`viadeo-square` = "viadeo-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`viadeo-square`]
    
    @scala.inline
    def vial: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vial = "vial".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vial]
    
    @scala.inline
    def vials: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vials = "vials".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vials]
    
    @scala.inline
    def viber: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.viber = "viber".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.viber]
    
    @scala.inline
    def video: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.video = "video".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.video]
    
    @scala.inline
    def `video-plus`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`video-plus` = "video-plus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`video-plus`]
    
    @scala.inline
    def `video-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`video-slash` = "video-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`video-slash`]
    
    @scala.inline
    def vihara: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vihara = "vihara".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vihara]
    
    @scala.inline
    def vimeo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vimeo = "vimeo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vimeo]
    
    @scala.inline
    def `vimeo-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vimeo-square` = "vimeo-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vimeo-square`]
    
    @scala.inline
    def `vimeo-v`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vimeo-v` = "vimeo-v".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vimeo-v`]
    
    @scala.inline
    def vine: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vine = "vine".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vine]
    
    @scala.inline
    def violin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.violin = "violin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.violin]
    
    @scala.inline
    def virus: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.virus = "virus".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.virus]
    
    @scala.inline
    def `virus-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`virus-slash` = "virus-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`virus-slash`]
    
    @scala.inline
    def viruses: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.viruses = "viruses".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.viruses]
    
    @scala.inline
    def vk: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vk = "vk".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vk]
    
    @scala.inline
    def vnv: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vnv = "vnv".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vnv]
    
    @scala.inline
    def voicemail: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.voicemail = "voicemail".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.voicemail]
    
    @scala.inline
    def volcano: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.volcano = "volcano".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.volcano]
    
    @scala.inline
    def `volleyball-ball`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volleyball-ball` = "volleyball-ball".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volleyball-ball`]
    
    @scala.inline
    def volume: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.volume = "volume".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.volume]
    
    @scala.inline
    def `volume-down`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-down` = "volume-down".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-down`]
    
    @scala.inline
    def `volume-mute`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-mute` = "volume-mute".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-mute`]
    
    @scala.inline
    def `volume-off`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-off` = "volume-off".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-off`]
    
    @scala.inline
    def `volume-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-slash` = "volume-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-slash`]
    
    @scala.inline
    def `volume-up`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-up` = "volume-up".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`volume-up`]
    
    @scala.inline
    def `vote-nay`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vote-nay` = "vote-nay".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vote-nay`]
    
    @scala.inline
    def `vote-yea`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vote-yea` = "vote-yea".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vote-yea`]
    
    @scala.inline
    def `vr-cardboard`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vr-cardboard` = "vr-cardboard".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`vr-cardboard`]
    
    @scala.inline
    def vuejs: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vuejs = "vuejs".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.vuejs]
    
    @scala.inline
    def `wagon-covered`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wagon-covered` = "wagon-covered".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wagon-covered`]
    
    @scala.inline
    def walker: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.walker = "walker".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.walker]
    
    @scala.inline
    def `walkie-talkie`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`walkie-talkie` = "walkie-talkie".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`walkie-talkie`]
    
    @scala.inline
    def walking: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.walking = "walking".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.walking]
    
    @scala.inline
    def wallet: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wallet = "wallet".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wallet]
    
    @scala.inline
    def wand: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wand = "wand".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wand]
    
    @scala.inline
    def `wand-magic`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wand-magic` = "wand-magic".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wand-magic`]
    
    @scala.inline
    def warehouse: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.warehouse = "warehouse".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.warehouse]
    
    @scala.inline
    def `warehouse-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`warehouse-alt` = "warehouse-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`warehouse-alt`]
    
    @scala.inline
    def washer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.washer = "washer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.washer]
    
    @scala.inline
    def watch: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.watch = "watch".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.watch]
    
    @scala.inline
    def `watch-calculator`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`watch-calculator` = "watch-calculator".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`watch-calculator`]
    
    @scala.inline
    def `watch-fitness`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`watch-fitness` = "watch-fitness".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`watch-fitness`]
    
    @scala.inline
    def `watchman-monitoring`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`watchman-monitoring` = "watchman-monitoring".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`watchman-monitoring`]
    
    @scala.inline
    def water: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.water = "water".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.water]
    
    @scala.inline
    def `water-lower`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`water-lower` = "water-lower".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`water-lower`]
    
    @scala.inline
    def `water-rise`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`water-rise` = "water-rise".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`water-rise`]
    
    @scala.inline
    def `wave-sine`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wave-sine` = "wave-sine".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wave-sine`]
    
    @scala.inline
    def `wave-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wave-square` = "wave-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wave-square`]
    
    @scala.inline
    def `wave-triangle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wave-triangle` = "wave-triangle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wave-triangle`]
    
    @scala.inline
    def waveform: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.waveform = "waveform".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.waveform]
    
    @scala.inline
    def `waveform-path`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`waveform-path` = "waveform-path".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`waveform-path`]
    
    @scala.inline
    def waze: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.waze = "waze".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.waze]
    
    @scala.inline
    def webcam: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.webcam = "webcam".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.webcam]
    
    @scala.inline
    def `webcam-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`webcam-slash` = "webcam-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`webcam-slash`]
    
    @scala.inline
    def weebly: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.weebly = "weebly".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.weebly]
    
    @scala.inline
    def weibo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.weibo = "weibo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.weibo]
    
    @scala.inline
    def weight: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.weight = "weight".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.weight]
    
    @scala.inline
    def `weight-hanging`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`weight-hanging` = "weight-hanging".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`weight-hanging`]
    
    @scala.inline
    def weixin: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.weixin = "weixin".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.weixin]
    
    @scala.inline
    def whale: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.whale = "whale".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.whale]
    
    @scala.inline
    def whatsapp: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.whatsapp = "whatsapp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.whatsapp]
    
    @scala.inline
    def `whatsapp-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`whatsapp-square` = "whatsapp-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`whatsapp-square`]
    
    @scala.inline
    def wheat: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wheat = "wheat".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wheat]
    
    @scala.inline
    def wheelchair: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wheelchair = "wheelchair".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wheelchair]
    
    @scala.inline
    def whistle: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.whistle = "whistle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.whistle]
    
    @scala.inline
    def whmcs: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.whmcs = "whmcs".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.whmcs]
    
    @scala.inline
    def wifi: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wifi = "wifi".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wifi]
    
    @scala.inline
    def `wifi-1`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wifi-1` = "wifi-1".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wifi-1`]
    
    @scala.inline
    def `wifi-2`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wifi-2` = "wifi-2".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wifi-2`]
    
    @scala.inline
    def `wifi-slash`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wifi-slash` = "wifi-slash".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wifi-slash`]
    
    @scala.inline
    def `wikipedia-w`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wikipedia-w` = "wikipedia-w".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wikipedia-w`]
    
    @scala.inline
    def wind: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wind = "wind".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wind]
    
    @scala.inline
    def `wind-turbine`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wind-turbine` = "wind-turbine".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wind-turbine`]
    
    @scala.inline
    def `wind-warning`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wind-warning` = "wind-warning".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wind-warning`]
    
    @scala.inline
    def window: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.window = "window".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.window]
    
    @scala.inline
    def `window-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-alt` = "window-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-alt`]
    
    @scala.inline
    def `window-close`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-close` = "window-close".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-close`]
    
    @scala.inline
    def `window-frame`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-frame` = "window-frame".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-frame`]
    
    @scala.inline
    def `window-frame-open`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-frame-open` = "window-frame-open".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-frame-open`]
    
    @scala.inline
    def `window-maximize`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-maximize` = "window-maximize".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-maximize`]
    
    @scala.inline
    def `window-minimize`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-minimize` = "window-minimize".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-minimize`]
    
    @scala.inline
    def `window-restore`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-restore` = "window-restore".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`window-restore`]
    
    @scala.inline
    def windows: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.windows = "windows".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.windows]
    
    @scala.inline
    def windsock: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.windsock = "windsock".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.windsock]
    
    @scala.inline
    def `wine-bottle`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wine-bottle` = "wine-bottle".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wine-bottle`]
    
    @scala.inline
    def `wine-glass`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wine-glass` = "wine-glass".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wine-glass`]
    
    @scala.inline
    def `wine-glass-alt`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wine-glass-alt` = "wine-glass-alt".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wine-glass-alt`]
    
    @scala.inline
    def wix: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wix = "wix".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wix]
    
    @scala.inline
    def `wizards-of-the-coast`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wizards-of-the-coast` = "wizards-of-the-coast".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wizards-of-the-coast`]
    
    @scala.inline
    def wodu: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wodu = "wodu".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wodu]
    
    @scala.inline
    def `wolf-pack-battalion`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wolf-pack-battalion` = "wolf-pack-battalion".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wolf-pack-battalion`]
    
    @scala.inline
    def `won-sign`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`won-sign` = "won-sign".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`won-sign`]
    
    @scala.inline
    def wordpress: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wordpress = "wordpress".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wordpress]
    
    @scala.inline
    def `wordpress-simple`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wordpress-simple` = "wordpress-simple".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`wordpress-simple`]
    
    @scala.inline
    def wpbeginner: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wpbeginner = "wpbeginner".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wpbeginner]
    
    @scala.inline
    def wpexplorer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wpexplorer = "wpexplorer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wpexplorer]
    
    @scala.inline
    def wpforms: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wpforms = "wpforms".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wpforms]
    
    @scala.inline
    def wpressr: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wpressr = "wpressr".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wpressr]
    
    @scala.inline
    def wreath: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wreath = "wreath".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wreath]
    
    @scala.inline
    def wrench: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wrench = "wrench".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.wrench]
    
    @scala.inline
    def `x-ray`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`x-ray` = "x-ray".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`x-ray`]
    
    @scala.inline
    def xbox: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.xbox = "xbox".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.xbox]
    
    @scala.inline
    def xing: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.xing = "xing".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.xing]
    
    @scala.inline
    def `xing-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`xing-square` = "xing-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`xing-square`]
    
    @scala.inline
    def `y-combinator`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`y-combinator` = "y-combinator".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`y-combinator`]
    
    @scala.inline
    def yahoo: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yahoo = "yahoo".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yahoo]
    
    @scala.inline
    def yammer: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yammer = "yammer".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yammer]
    
    @scala.inline
    def yandex: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yandex = "yandex".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yandex]
    
    @scala.inline
    def `yandex-international`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`yandex-international` = "yandex-international".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`yandex-international`]
    
    @scala.inline
    def yarn: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yarn = "yarn".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yarn]
    
    @scala.inline
    def yelp: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yelp = "yelp".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yelp]
    
    @scala.inline
    def `yen-sign`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`yen-sign` = "yen-sign".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`yen-sign`]
    
    @scala.inline
    def `yin-yang`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`yin-yang` = "yin-yang".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`yin-yang`]
    
    @scala.inline
    def yoast: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yoast = "yoast".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.yoast]
    
    @scala.inline
    def youtube: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.youtube = "youtube".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.youtube]
    
    @scala.inline
    def `youtube-square`: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`youtube-square` = "youtube-square".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.`youtube-square`]
    
    @scala.inline
    def zhihu: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.zhihu = "zhihu".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.zhihu]
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
    
    @scala.inline
    def fab: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fab = "fab".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fab]
    
    @scala.inline
    def fad: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fad = "fad".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fad]
    
    @scala.inline
    def fal: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fal = "fal".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fal]
    
    @scala.inline
    def far: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.far = "far".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.far]
    
    @scala.inline
    def fas: typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fas = "fas".asInstanceOf[typings.fortawesomeFontawesomeCommonTypes.fortawesomeFontawesomeCommonTypesStrings.fas]
  }
}
