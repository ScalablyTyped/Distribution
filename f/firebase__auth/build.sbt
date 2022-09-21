organization := "org.scalablytyped"
name := "firebase__auth"
version := "0.20.7-f3baef"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.7.33-70e6f2",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.6-47169f",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.3-442cc4",
  "org.scalablytyped" %%% "firebase__util" % "1.6.3-0d2002",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20220909Z-865474",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-6883ea")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
